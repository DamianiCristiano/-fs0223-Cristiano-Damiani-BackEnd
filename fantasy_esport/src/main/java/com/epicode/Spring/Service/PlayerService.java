package com.epicode.Spring.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epicode.Spring.model.Player;
import com.epicode.Spring.model.PlayerDto;
import com.epicode.Spring.repository.PlayerRepository;
import com.epicode.Spring.repository.TeamRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class PlayerService {

	@Autowired PlayerRepository playerRepo;
	@Autowired TeamRepository teamRepo;
	
	public List<Player> getAllPlayer() {
		return (List<Player>) playerRepo.findAll();
	}
	
	public Player getPlayerById(Long id) {
	    try {
	        Optional<Player> player = playerRepo.findById(id);
	        if (player.isEmpty()) {
	            throw new EntityNotFoundException("Player not found with ID: " + id);
	        }
	        return player.get();
	    } catch (EntityNotFoundException e) {
	        System.err.println("Eccezione EntityNotFoundException gestita: " + e.getMessage());
	        return null;
	    }
	}
	
	public List<Player> getPlayerByTeam(Long id) {
	    try {
	        List<Player> team = teamRepo.findPlayersByTeamId(id);
	        if (team.isEmpty()) {
	            throw new EntityNotFoundException("Team not found with ID: " + id);
	        }
	        return team;
	    } catch (EntityNotFoundException e) {
	        System.err.println("Eccezione EntityNotFoundException gestita: " + e.getMessage());
	        return null;
	    }
	}
	
	public List<Player> getPlayerByRole(String role) {
		try {
			List<Player> list = playerRepo.findPlayersByRole(role);
			if(list.isEmpty()) {
				 throw new EntityNotFoundException("Players not found with role: " + role);
			}
			return list;
		} catch (EntityNotFoundException e) {
	        System.err.println("Eccezione EntityNotFoundException gestita: " + e.getMessage());
	        return null;
		}
	}
	
	public List<Player> getPlayerByNationality(String nat) {
		try {
			List<Player> list = playerRepo.findPlayersByNationality(nat);
			if(list.isEmpty()) {
				 throw new EntityNotFoundException("Players not found with nationality: " + nat);
			}
			return list;
		}  catch (EntityNotFoundException e) {
	        System.err.println("Eccezione EntityNotFoundException gestita: " + e.getMessage());
	        return null;
		}
	}
	
	public Player createPlayer(PlayerDto player) {
		Player p = new Player();
		p.setNickname(player.getNickname());
		p.setTeam(teamRepo.findById(player.getTeam_id()).get());
		p.setNationality(player.getNationality());
		p.setRole(player.getRole());
        return playerRepo.save(p);
    }
	
	public void deletePlayer(Long id){
		playerRepo.deleteById(id);
	}
	
	public Player editPlayer(Player player) {
        // Verifica se il giocatore esiste nel database
		try {
        Optional<Player> existingPlayer = playerRepo.findById(player.getIdPlayer());
        System.out.println(existingPlayer);
        
            Player updatedPlayer = existingPlayer.get();
            updatedPlayer.setIdPlayer(player.getIdPlayer());
            updatedPlayer.setNickname(player.getNickname());
            updatedPlayer.setNationality(player.getNationality());
            updatedPlayer.setRole(player.getRole());
            updatedPlayer.setTeam(player.getTeam());

            // Salva le modifiche nel database
            return playerRepo.save(updatedPlayer);
		} catch (EntityNotFoundException e) {
			 System.err.println("Eccezione EntityNotFoundException gestita: " + e.getMessage());
		}
		return new Player();
       
    }
}
