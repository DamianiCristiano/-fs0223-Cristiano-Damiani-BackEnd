package com.epicode.Spring.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.epicode.Spring.Service.MatchService;
import com.epicode.Spring.model.Match;
import com.epicode.Spring.model.Team;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/matches")
public class ControllerMatch {
    @Autowired
    private MatchService matchService;

    @GetMapping("/all")
    public ResponseEntity<List<Match>> getAllMatches() {
        List<Match> matches = matchService.getAllMatch();
        if (matches.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(matches);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Match> getMatchById(@PathVariable Long id) {
        Match match = matchService.getMatchById(id);
        if (match == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(match);
    }

    @GetMapping("/date/{date}")
    public ResponseEntity<List<Match>> getMatchesByDate(@PathVariable String date) {
        LocalDateTime dateTime = LocalDateTime.parse(date);
        List<Match> matches = matchService.getMatchByDate(dateTime);
        if (matches.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(matches);
    }

    @GetMapping("/day/{day}")
    public ResponseEntity<List<Match>> getMatchesByDayOfGames(@PathVariable Integer day) {
        List<Match> matches = matchService.getMatchBydayOfGames(day);
        if (matches.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(matches);
    }

    @GetMapping("/team")
    public ResponseEntity<List<Match>> getMatchesByTeam(@RequestParam(name = "teamId") Long teamId) {
        Team team = new Team();
        team.setId(teamId);
        List<Match> matches = matchService.getMatchByTeam(team);
        if (matches.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(matches);
    }
}
