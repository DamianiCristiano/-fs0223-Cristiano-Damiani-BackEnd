package com.epicode.Spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.epicode.Spring.Service.TeamService;
import com.epicode.Spring.model.Team;
import com.epicode.Spring.repository.TeamRepository;

@RestController
@RequestMapping ("/api/team")
public class ControllerTeam {

	@Autowired TeamRepository teamRepository;
	@Autowired TeamService teamService;

	    @GetMapping("/all")
	    public ResponseEntity<List<Team>> getAllTeams() {
	        List<Team> teams = teamService.getAllTeam();
	        return ResponseEntity.ok(teams);
	    }

	    @GetMapping("/{id}")
	    public ResponseEntity<Team> getTeamById(@PathVariable Long id) {
	        Team team = teamService.getTeamById(id);
	        if (team == null) {
	            return ResponseEntity.notFound().build();
	        }
	        return ResponseEntity.ok(team);
	    }

	    @GetMapping("/byNationality/{nat}")
	    public ResponseEntity<List<Team>> getTeamsByNationality(@PathVariable String nat) {
	        List<Team> teams = teamService.getTeamByNationality(nat);
	        if (teams == null) {
	            return ResponseEntity.notFound().build();
	        }
	        return ResponseEntity.ok(teams);
	    }

	    @GetMapping("/byLeague/{league}")
	    public ResponseEntity<List<Team>> getTeamsByLeague(@PathVariable String league) {
	        List<Team> teams = teamService.getTeamByLeague(league);
	        if (teams == null) {
	            return ResponseEntity.notFound().build();
	        }
	        return ResponseEntity.ok(teams);
	    }
	    
	    @GetMapping
	    public ResponseEntity<List<Team>> searchTeam(@RequestParam("searchTerm") String searchTerm) {
	        List<Team> teams = teamRepository.findByNameContaining(searchTerm);
	        return ResponseEntity.ok(teams);
	    }
	    
	    
}
	

