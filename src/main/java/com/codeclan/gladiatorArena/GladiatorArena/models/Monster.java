package com.codeclan.gladiatorArena.GladiatorArena.models;

import java.util.ArrayList;

public class Monster {

    private Long id;

    private String monsterName;

    private String title;

    private int health;

    private int healthCap;

    private int attack;

    private int defence;

    private ArrayList<Match> matches;

    public Monster(String monsterName, String title, int health, int healthCap, int attack, int defence) {
        this.monsterName = monsterName;
        this.title = title;
        this.health = health;
        this.healthCap = healthCap;
        this.attack = attack;
        this.defence = defence;
        this.matches = new ArrayList<Match>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMonsterName() {
        return monsterName;
    }

    public void setMonsterName(String monsterName) {
        this.monsterName = monsterName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealthCap() {
        return healthCap;
    }

    public void setHealthCap(int healthCap) {
        this.healthCap = healthCap;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public ArrayList<Match> getMatches() {
        return matches;
    }

    public void setMatches(ArrayList<Match> matches) {
        this.matches = matches;
    }
}
