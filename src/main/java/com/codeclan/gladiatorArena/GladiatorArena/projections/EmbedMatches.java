package com.codeclan.gladiatorArena.GladiatorArena.projections;

import com.codeclan.gladiatorArena.GladiatorArena.models.Match;
import com.codeclan.gladiatorArena.GladiatorArena.models.Monster;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedMatches", types = Monster.class)
public interface EmbedMatches {
    long getId();
    String getMonsterName();
    String getTitle();
    int getHealth();
    int getHealthCap();
    int getAttack();
    int getDefence();
    List<Match> getMatches();
}
