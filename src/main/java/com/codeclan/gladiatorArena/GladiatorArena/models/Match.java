package com.codeclan.gladiatorArena.GladiatorArena.models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Random;

@Entity
@Table(name = "matches")
public class Match {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @JsonIgnoreProperties("matches")
    @ManyToOne
    @JoinColumn(name = "gladiator_id", nullable = false)
    private Gladiator gladiator;

    @JsonIgnoreProperties("matches")
    @ManyToOne
    @JoinColumn(name = "monster_id", nullable = false)
    private Monster monster;

    public Match(String name, Gladiator gladiator, Monster monster) {
        this.name = name;
        this.gladiator = gladiator;
        this.monster = monster;
    }

    public Match() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gladiator getGladiator() {
        return gladiator;
    }

    public void setGladiator(Gladiator gladiator) {
        this.gladiator = gladiator;
    }

    public Monster getMonster() {
        return monster;
    }

    public void setMonster(Monster monster) {
        this.monster = monster;
    }

    public String decideWinner(Gladiator gladiator, Monster monster){

        String result = null;

        if(monster.getHealth() <= 0){
            result = gladiator.getName() + " " + gladiator.getTitle() + " has won the fight";
        }
        if(gladiator.getHealth() <=0){
            result = monster.getMonsterName() + " " + monster.getTitle() + " has destroy " + gladiator.getName() + " " + gladiator.getTitle();
        }

        return result;
    }

    public void combatantsBattle(Gladiator gladiator, Monster monster){

        Random diceRoll = new Random();

        int gladiatorNumber = diceRoll.nextInt((20 - 1) + 1);

        int monsterNumber = diceRoll.nextInt((20 - 1) + 1);

        if (gladiatorNumber >= 19){
            monster.takeDamage((int)Math.round(gladiator.attack() * 1.2));
        }

        if (gladiatorNumber >= 3){
            monster.takeDamage(gladiator.attack());
        }

        if (monsterNumber >= 19){
            gladiator.defend((int)Math.round(monster.attack() * 1.2));
        }

        if (monsterNumber >= 3){
            gladiator.defend(monster.attack());
        }

    }

    public void gladiatorHeals(Gladiator gladiator, Monster monster){

        Random diceRoll = new Random();

        int monsterNumber = diceRoll.nextInt((20 - 1) + 1);

        gladiator.heal();

        if (monsterNumber >=18){
            gladiator.takeDamage((int)Math.round(monster.attack() * 1.2));
        }

        if (monsterNumber >= 4){
            gladiator.takeDamage(monster.attack());
        }


    }
}
