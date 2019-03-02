package com.codeclan.gladiatorArena.GladiatorArena.repository.Weapon;

import com.codeclan.gladiatorArena.GladiatorArena.models.Weapon;
import com.codeclan.gladiatorArena.GladiatorArena.projections.EmbedGladiator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedGladiator.class)
public interface WeaponRepository extends JpaRepository<Weapon, Long> {
}
