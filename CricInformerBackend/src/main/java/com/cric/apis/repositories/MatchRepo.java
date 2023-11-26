package com.cric.apis.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cric.apis.entities.Match;

@Repository
public interface MatchRepo extends JpaRepository<Match, Integer> {
	// match fetch karna chahta hu -->
	// provide kar de --> teamName
	Optional<Match> findByTeamHeading(String teamHeading);
}
