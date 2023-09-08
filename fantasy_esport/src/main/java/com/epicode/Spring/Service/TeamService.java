package com.epicode.Spring.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epicode.Spring.model.Player;
import com.epicode.Spring.model.Team;
import com.epicode.Spring.repository.PlayerRepository;
import com.epicode.Spring.repository.TeamRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class TeamService {

	@Autowired PlayerRepository playerRepo;
	@Autowired TeamRepository teamRepo;
	
	public List<Team> getAllTeam() {
		return (List<Team>) teamRepo.findAll();
	}
	
	public Team getTeamById(Long id) {
		try {
			Optional<Team> team = teamRepo.findById(id);
			if(team.isEmpty()) {
				throw new EntityNotFoundException("Team not found with ID: " + id);
			}
			return team.get();
		} catch (EntityNotFoundException e) {
	        System.err.println("Eccezione EntityNotFoundException gestita: " + e.getMessage());
	        return null;
		}
	}
	
	public List<Team> getTeamByNationality(String nat) {
		try {
			List<Team> list = teamRepo.findTeamByNationality(nat);
			if(list.isEmpty()) {
				 throw new EntityNotFoundException("Team not found with nationality: " + nat);
			}
			return list;
		}  catch (EntityNotFoundException e) {
	        System.err.println("Eccezione EntityNotFoundException gestita: " + e.getMessage());
	        return null;
		}
	}
	
	public List<Team> getTeamByLeague(String league){
		try {
			List<Team> list = teamRepo.findTeamByLeague(league);
			if(list.isEmpty()) {
				throw new EntityNotFoundException("Team not found with league: " + league);
			}
			return list;
		} catch (EntityNotFoundException e) {
	        System.err.println("Eccezione EntityNotFoundException gestita: " + e.getMessage());
	        return null;
		}
	}
	
	
}
