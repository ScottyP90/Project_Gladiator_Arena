package com.codeclan.gladiatorArena.GladiatorArena.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "gladiators")
public class Gladiator {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "title")
    private String title;

    @Column(name = "gender")
    private String gender;

    @JsonIgnoreProperties("gladiators")
    @ManyToOne
    @JoinColumn(name = "weapon_id", nullable = false)
    private Weapon weapon;

    @Column(name = "health")
    private int health;

    @Column(name = "health_cap")
    private int healthCap;

    @Column(name = "strength")
    private int strength;

    @Column(name = "defence")
    private int defence;

    @Column(name = "healing_cap")
    private int healingCap;

    @JsonIgnoreProperties("monsters")
    @OneToMany(mappedBy = "gladiator", fetch = FetchType.LAZY)
    private List<Match> matches;

    public Gladiator(String name, String title, String gender, Weapon weapon, int health, int strength, int defence) {
        this.name = name;
        this.title = title;
        this.gender = gender;
        this.weapon = weapon;
        this.health = health;
        this.healthCap = health;
        this.strength = strength;
        this.defence = defence;
        this.healingCap = 3;
        this.matches = new ArrayList<Match>();
    }

    public Gladiator() {
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

    public List<Match> getMatches() {
        return matches;
    }

    public void setMatches(List<Match> matches) {
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

    public void resetStats(){
        this.healingCap = 3;
        this.health = this.healthCap;
    }

    public void defend(int damage){
        int totalDamage = damage - (this.defence + this.weapon.getDefence());
        if(totalDamage < 0){
            totalDamage = 0;
        }
        this.takeDamage(totalDamage);
    }

    public void heal(){
        if(this.healingCap > 0){
            int totalHeal = (int) Math.round(this.healthCap / 1.2);
            if((totalHeal + this.health)> this.healthCap){
                this.recoverHealth(this.healthCap - this.health);
                this.healingCap -= 1;
            }else{
                this.recoverHealth(totalHeal);
                this.healingCap -= 1;
            }
        }
    }
}
