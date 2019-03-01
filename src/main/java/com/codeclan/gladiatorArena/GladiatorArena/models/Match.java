package com.codeclan.gladiatorArena.GladiatorArena.models;

import java.util.ArrayList;

public class Match {

    private Long id;

    private String name;

    private Gladiator gladiator;

    private Monster monster;

    public Match(String name, Gladiator gladiator, Monster monster) {
        this.name = name;
        this.gladiator = gladiator;
        this.monster = monster;
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
}
