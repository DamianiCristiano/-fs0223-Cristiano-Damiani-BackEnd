package com.epicode.Spring.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epicode.Spring.model.Match;
import com.epicode.Spring.model.Team;
import com.epicode.Spring.repository.MatchRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class MatchService {

	@Autowired MatchRepository matchRepo;
	
	public List<Match> getAllMatch() {
		return (List<Match>) matchRepo.findAll();
	}
	
	public Match getMatchById(Long id) {
		try {
			Optional<Match> match = matchRepo.findById(id);
			if(match.isEmpty()) {
				throw new EntityNotFoundException("Match not found with ID: " + id);
			} 
			return match.get();
		}
			catch (EntityNotFoundException e) {
		        System.err.println("Eccezione EntityNotFoundException gestita: " + e.getMessage());
		        return null;
		
			}
		}
	public  List<Match> getMatchByDate(LocalDateTime date) {
		try {
			List<Match> match = matchRepo.findMatchByDate(date);
			if(match.isEmpty()) {
				throw new EntityNotFoundException("Match not found with date: " + date);
			} 
			return match;
		} 	catch (EntityNotFoundException e) {
	        System.err.println("Eccezione EntityNotFoundException gestita: " + e.getMessage());
	        return null;
		}
	}
	
	public List<Match> getMatchBydayOfGames (Integer day) {
		try {
			List<Match> match = matchRepo.findMatchBydayOfGames(day);
			if(match.isEmpty()) {
				throw new EntityNotFoundException("Match not found with day: " + day);
			} return match;
		} catch (EntityNotFoundException e) {
	        System.err.println("Eccezione EntityNotFoundException gestita: " + e.getMessage());
	        return null; 
	        }
		}
	
	public List<Match> getMatchByTeam (Team team) {
		try {
			List<Match> match = matchRepo.findMatchByTeam(team);
			if(match.isEmpty()) {
				throw new EntityNotFoundException("Match not found with team: " + team);
			} return match;
		} catch (EntityNotFoundException e) {
	        System.err.println("Eccezione EntityNotFoundException gestita: " + e.getMessage());
	        return null; 
	        }
		}
	
}
