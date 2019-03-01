package com.codeclan.gladiatorArena.GladiatorArena;

import com.codeclan.gladiatorArena.GladiatorArena.models.Gladiator;
import com.codeclan.gladiatorArena.GladiatorArena.models.Match;
import com.codeclan.gladiatorArena.GladiatorArena.models.Monster;
import com.codeclan.gladiatorArena.GladiatorArena.models.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MatchTest {

    Match match;
    Monster monster;
    Weapon weapon;
    Gladiator gladiator;

    @Before
    public void setUp() {
        weapon = new Weapon("Mjölnir", "Hammer", 100,22);
        gladiator = new Gladiator("Thor", "God of Thunder", "male", weapon, 1000, 57, 68);
        monster = new Monster("Jörmungandr","the World Serpent",1000, 200, 100);
        match = new Match("Ragnorok Smackdown", gladiator, monster);
    }

    @Test
    public void canDoBattle() {
        match.combatantsBattle(gladiator,monster);
        assertEquals(890, gladiator.getHealth());
        assertEquals(943, monster.getHealth());

    }
}
