package com.codeclan.gladiatorArena.GladiatorArena;

import com.codeclan.gladiatorArena.GladiatorArena.models.Gladiator;
import com.codeclan.gladiatorArena.GladiatorArena.models.Monster;
import com.codeclan.gladiatorArena.GladiatorArena.models.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MonsterTest {

    Monster monster;
    Gladiator gladiator1;
    Gladiator gladiator2;
    Weapon weapon1;
    Weapon weapon2;

    @Before
    public void setUp() {
        weapon1 = new Weapon("Sword of Beginning's", "sword", 10, 2);
        gladiator1 = new Gladiator("Craig", "of the Glen", "male", weapon1, 100, 47, 68);
        weapon2 = new Weapon("Mjölnir", "Hammer", 100,22);
        gladiator2 = new Gladiator("Thor", "God of Thunder", "male", weapon2, 1000, 57, 68);
        monster = new Monster("Jörmungandr","the World Serpent",1000, 200, 100);
    }

    @Test
    public void canAttack() {
        assertEquals(200, monster.attack());
    }

    @Test
    public void canTakeDamageFromGladiatorAttack() {
        monster.takeDamage(gladiator2.attack());
        assertEquals(943, monster.getHealth());
    }

    @Test
    public void cantOverHealFromGladiatorAttack() {
        monster.takeDamage(gladiator1.attack());
        assertEquals(1000, monster.getHealth());
    }
}
