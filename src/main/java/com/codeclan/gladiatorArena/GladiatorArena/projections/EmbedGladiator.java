package com.codeclan.gladiatorArena.GladiatorArena.projections;

import com.codeclan.gladiatorArena.GladiatorArena.models.Gladiator;
import com.codeclan.gladiatorArena.GladiatorArena.models.Weapon;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedGladiator",types = Weapon.class)
public interface EmbedGladiator {
    long getId();
    String getWeaponName();
    String getType();
    int getAttack();
    int getDefence();
    List<Gladiator> getGladiators();
}
