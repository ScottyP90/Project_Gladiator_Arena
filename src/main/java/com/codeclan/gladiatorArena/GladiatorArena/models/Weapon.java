package com.codeclan.gladiatorArena.GladiatorArena.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "weapons")
public class Weapon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "weapon_name")
    private String weaponName;

    @Column(name = "type")
    private String type;

    @Column(name = "attack")
    private int attack;

    @Column(name = "defence")
    private int defence;

    @JsonIgnoreProperties("matches")
    @OneToMany(mappedBy = "weapon", fetch = FetchType.LAZY)
    private List<Gladiator> gladiators;

    public Weapon(String weaponName, String type, int attack, int defence) {
        this.weaponName = weaponName;
        this.type = type;
        this.attack = attack;
        this.defence = defence;
        this.gladiators = new ArrayList<Gladiator>();
    }

    public Weapon() {
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

    public List<Gladiator> getGladiators() {
        return gladiators;
    }

    public void setGladiators(List<Gladiator> gladiators) {
        this.gladiators = gladiators;
    }
}
