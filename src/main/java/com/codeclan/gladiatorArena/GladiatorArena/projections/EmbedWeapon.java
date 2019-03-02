package com.codeclan.gladiatorArena.GladiatorArena.projections;

import com.codeclan.gladiatorArena.GladiatorArena.models.Gladiator;
import com.codeclan.gladiatorArena.GladiatorArena.models.Match;
import com.codeclan.gladiatorArena.GladiatorArena.models.Weapon;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedWeapon", types = Gladiator.class)
public interface EmbedWeapon {
    long getId();
    String getName();
    String getTitle();
    String getGender();
    Weapon getWeapon();
    int getHealth();
    int getHealthCap();
    int getStrength();
    int getDefence();
    int getHealingCap();
    List<Match> getMatches();
}
