package com.epicode.Spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.epicode.Spring.Service.PlayerService;
import com.epicode.Spring.model.Player;
import com.epicode.Spring.repository.PlayerRepository;

@RestController
@RequestMapping ("/api/players")
public class ControllerPlayer {


	    @Autowired
	    private PlayerService playerService;

	    @GetMapping("/all")
	    public ResponseEntity<List<Player>> getAllPlayers() {
	        List<Player> players = playerService.getAllPlayer();
	        return ResponseEntity.ok(players);
	    }

	    @GetMapping("/{id}")
	    public ResponseEntity<Player> getPlayerById(@PathVariable Long id) {
	        Player player = playerService.getPlayerById(id);
	        if (player != null) {
	            return ResponseEntity.ok(player);
	        } else {
	            return ResponseEntity.notFound().build();
	        }
	    }

	    @GetMapping("/byTeam/{teamId}")
	    public ResponseEntity<List<Player>> getPlayersByTeam(@PathVariable Long teamId) {
	        List<Player> players = playerService.getPlayerByTeam(teamId);
	        if (!players.isEmpty()) {
	            return ResponseEntity.ok(players);
	        } else {
	            return ResponseEntity.notFound().build();
	        }
	    }

	    @GetMapping("/byRole/{role}")
	    public ResponseEntity<List<Player>> getPlayersByRole(@PathVariable String role) {
	        List<Player> players = playerService.getPlayerByRole(role);
	        if (!players.isEmpty()) {
	            return ResponseEntity.ok(players);
	        } else {
	            return ResponseEntity.notFound().build();
	        }
	    }

	    @GetMapping("/byNationality/{nationality}")
	    public ResponseEntity<List<Player>> getPlayersByNationality(@PathVariable String nationality) {
	        List<Player> players = playerService.getPlayerByNationality(nationality);
	        if (!players.isEmpty()) {
	            return ResponseEntity.ok(players);
	        } else {
	            return ResponseEntity.notFound().build();
	        }
	    }
	    
	    @PostMapping("/create")
	    @CrossOrigin(origins = "http://localhost:4200")
	    public ResponseEntity<Player> createPlayer(@RequestBody Player player) {
	        Player createdPlayer = playerService.createPlayer(player);
	        System.out.println(player);
	        return new ResponseEntity<>(createdPlayer, HttpStatus.CREATED);
	    }
	    
}
	
