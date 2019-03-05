package com.codeclan.gladiatorArena.GladiatorArena.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Entity
@Table(name = "monsters")
public class Monster {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "monster_name")
    private String monsterName;

    @Column(name = "title")
    private String title;

    @Column(name = "health")
    private int health;

    @Column(name = "health_cap")
    private int healthCap;

    @Column(name = "attack")
    private int attack;

    @Column(name = "defence")
    private int defence;

    @JsonIgnoreProperties("gladiator")
    @OneToMany(mappedBy = "monster", fetch = FetchType.LAZY)
    private List<Match> matches;

    public Monster(String monsterName, String title, int health, int attack, int defence) {
        this.monsterName = monsterName;
        this.title = title;
        this.health = health;
        this.healthCap = health;
        this.attack = attack;
        this.defence = defence;
        this.matches = new ArrayList<Match>();
    }

    public Monster() {
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
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

    public List<Match> getMatches() {
        return matches;
    }

    public void setMatches(List<Match> matches) {
        this.matches = matches;
    }

    public int attack(){
        return this.attack;
    }

    public void takeDamage(int damage){
        int battleDamage = damage - this.defence;
        if(battleDamage < 0){
            battleDamage = 0;
        }
        this.health -= battleDamage;
    }

    public void resetStats(){
        this.health = healthCap;
    }

    public void monsterBattles(Gladiator gladiator){

        Random diceRoll = new Random();

        int gladiatorNumber = diceRoll.nextInt((20 - 1) + 1);

        if (gladiatorNumber >= 19){
            this.takeDamage((int)Math.round(gladiator.attack() * 1.2));
        }

        if (gladiatorNumber >= 3){
            this.takeDamage(gladiator.attack());
        }
    }
}
