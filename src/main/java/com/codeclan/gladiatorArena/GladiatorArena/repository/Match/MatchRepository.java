package com.codeclan.gladiatorArena.GladiatorArena.repository.Match;

import com.codeclan.gladiatorArena.GladiatorArena.models.Match;
import com.codeclan.gladiatorArena.GladiatorArena.projections.EmbedFight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedFight.class)
public interface MatchRepository extends JpaRepository<Match, Long> {
}
