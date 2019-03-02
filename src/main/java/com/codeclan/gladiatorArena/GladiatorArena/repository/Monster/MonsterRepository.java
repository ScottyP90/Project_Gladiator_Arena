package com.codeclan.gladiatorArena.GladiatorArena.repository.Monster;

import com.codeclan.gladiatorArena.GladiatorArena.models.Monster;
import com.codeclan.gladiatorArena.GladiatorArena.projections.EmbedMatches;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedMatches.class)
public interface MonsterRepository extends JpaRepository<Monster, Long> {
}
