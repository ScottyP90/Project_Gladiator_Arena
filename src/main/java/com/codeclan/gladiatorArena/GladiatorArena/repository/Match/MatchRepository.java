package com.codeclan.gladiatorArena.GladiatorArena.repository.Match;

import com.codeclan.gladiatorArena.GladiatorArena.models.Match;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatchRepository extends JpaRepository<Match, Long> {
}
