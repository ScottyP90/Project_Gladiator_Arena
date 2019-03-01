package com.codeclan.gladiatorArena.GladiatorArena.models;

import java.util.ArrayList;

public class Weapon {

    private Long Id;

    private String weaponName;

    private String type;

    private int attack;

    private int defence;

    private ArrayList<Gladiator> gladiators;

    public Weapon(String weaponName, String type, int attack, int defence) {
        this.weaponName = weaponName;
        this.type = type;
        this.attack = attack;
        this.defence = defence;
        this.gladiators = new ArrayList<Gladiator>();
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public ArrayList<Gladiator> getGladiators() {
        return gladiators;
    }

    public void setGladiators(ArrayList<Gladiator> gladiators) {
        this.gladiators = gladiators;
    }
}
