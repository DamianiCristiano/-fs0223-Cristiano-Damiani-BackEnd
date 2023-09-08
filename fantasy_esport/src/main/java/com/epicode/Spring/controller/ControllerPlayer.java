package com.epicode.Spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.epicode.Spring.model.Player;
import com.epicode.Spring.repository.PlayerRepository;

@RestController
@RequestMapping ("/api/player")
public class ControllerPlayer {

	@Autowired PlayerRepository playerRepository;

    @GetMapping
    public ResponseEntity<List<Player>> searchPlayers(@RequestParam("searchTerm") String searchTerm) {
        List<Player> players = playerRepository.findByNicknameContaining(searchTerm);
        return ResponseEntity.ok(players);
    }
	
}
