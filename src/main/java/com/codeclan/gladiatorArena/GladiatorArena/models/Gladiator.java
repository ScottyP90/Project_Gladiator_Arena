package com.codeclan.gladiatorArena.GladiatorArena.models;

import java.util.ArrayList;

public class Gladiator {

    private Long id;

    private String name;

    private String title;

    private String gender;

    private Weapon weapon;

    private int health;

    private int healthCap;

    private int strength;

    private int defence;

    private int healingCap;

    private ArrayList<Match> matches;

    public Gladiator(String name, String title, String gender, Weapon weapon, int health, int strength, int defence) {
        this.name = name;
        this.title = title;
        this.gender = gender;
        this.weapon = weapon;
        this.health = health;
        this.healthCap = health + 20;
        this.strength = strength;
        this.defence = defence;
        this.healingCap = 3;
        this.matches = new ArrayList<Match>();
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
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

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public int getHealingCap() {
        return healingCap;
    }

    public void setHealingCap(int healingCap) {
        this.healingCap = healingCap;
    }

    public ArrayList<Match> getMatches() {
        return matches;
    }

    public void setMatches(ArrayList<Match> matches) {
        this.matches = matches;
    }

    public int attack(){
        return this.strength + this.weapon.getAttack();
    }

    public void takeDamage(int damage){
        this.health -= damage;
    }

    public void recoverHealth(int heal){
        this.health += heal;
    }

    public void defend(Monster monster){
        int totalDamage = monster.getAttack() - (this.defence + this.weapon.getDefence());
        if(totalDamage < 0){
            totalDamage = 0;
        }
        this.takeDamage(totalDamage);
    }

    public void heal(){
        int totalHeal = (int) Math.round(this.healthCap / 1.2);
        if((totalHeal + this.health)> this.healthCap){
            this.recoverHealth(this.healthCap - this.health);
        }else{
            this.recoverHealth(totalHeal);
        }
    }
}
