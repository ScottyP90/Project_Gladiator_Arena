package com.codeclan.gladiatorArena.GladiatorArena.repository.Gladiator;

import com.codeclan.gladiatorArena.GladiatorArena.models.Gladiator;
import com.codeclan.gladiatorArena.GladiatorArena.projections.EmbedWeapon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedWeapon.class)
public interface GladiatorRepository extends JpaRepository<Gladiator, Long> {
}
