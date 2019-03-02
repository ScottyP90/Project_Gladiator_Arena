package com.codeclan.gladiatorArena.GladiatorArena.projections;

import com.codeclan.gladiatorArena.GladiatorArena.models.Gladiator;
import com.codeclan.gladiatorArena.GladiatorArena.models.Match;
import com.codeclan.gladiatorArena.GladiatorArena.models.Monster;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "embedFight", types = Match.class)
public interface EmbedFight {
    long getId();
    String getName();
    Gladiator getGladiator();
    Monster getMonster();
}
