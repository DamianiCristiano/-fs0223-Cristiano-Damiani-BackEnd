package com.epicode.Spring.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.epicode.Spring.model.Match;
import com.epicode.Spring.model.Team;

public interface MatchRepository extends CrudRepository<Match, Long> {

	@Query("SELECT m FROM Match m WHERE m.date = ?1")
	List<Match> findMatchByDate(LocalDateTime date);
	
	@Query("SELECT m FROM Match m WHERE m.dayOfGames = ?1")
	List<Match> findMatchBydayOfGames(Integer dayOfGames);
	
	@Query("SELECT m FROM Match m WHERE m.teamR = ?1 OR m.teamB = ?1")
	List<Match> findMatchByTeam(Team team); 
	
}
