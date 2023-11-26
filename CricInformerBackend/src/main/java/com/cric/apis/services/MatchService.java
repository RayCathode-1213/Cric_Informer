package com.cric.apis.services;

import java.util.List;

import com.cric.apis.entities.Match;

public interface MatchService {
	// get all matches
	List<Match> getAllMatches();

	// get live matches
	List<Match> getLiveMatches();

	// get cwc2023 point table
	List<List<String>> getpointTable();
}
