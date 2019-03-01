package com.codeclan.gladiatorArena.GladiatorArena;

import com.codeclan.gladiatorArena.GladiatorArena.models.Gladiator;
import com.codeclan.gladiatorArena.GladiatorArena.models.Monster;
import com.codeclan.gladiatorArena.GladiatorArena.models.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GladiatorTest {

    Weapon weapon;
    Gladiator gladiator;
    Monster monster1;
    Monster monster2;

    @Before
    public void setUp() {
        weapon = new Weapon("Sword of Beginning's", "sword", 10, 2);
        gladiator = new Gladiator("Craig", "of the Glen", "male", weapon, 100, 57, 68);
        monster1 = new Monster("Smog","the Red Dragon",100, 100, 50);
        monster2 = new Monster("Golem","",100, 20, 50);
    }

    @Test
    public void canGladiatorAttack() {
        assertEquals(67, gladiator.attack());
    }

    @Test
    public void canHealGladiator() {
        gladiator.recoverHealth(-99);
        gladiator.heal();
        assertEquals(84, gladiator.getHealth());
        assertEquals(2, gladiator.getHealingCap());
    }

    @Test
    public void cantOverHealGladiator() {
        gladiator.recoverHealth(-10);
        gladiator.heal();
        assertEquals(100, gladiator.getHealth());
        assertEquals(2, gladiator.getHealingCap());
    }

    @Test
    public void canDefendFromMonster() {
        gladiator.defend(monster1.attack());
        assertEquals(70, gladiator.getHealth());
    }

    @Test
    public void cantBeHealedByMonsterAttack() {
        gladiator.defend(monster2.attack());
        assertEquals(100, gladiator.getHealth());
    }

    @Test
    public void canResetGladiator() {
        gladiator.recoverHealth(-99);
        gladiator.heal();
        gladiator.resetStats();
        assertEquals(100, gladiator.getHealth());
        assertEquals(3, gladiator.getHealingCap());
    }
}
