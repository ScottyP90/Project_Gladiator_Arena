package com.codeclan.gladiatorArena.GladiatorArena.components;

import com.codeclan.gladiatorArena.GladiatorArena.repository.Gladiator.GladiatorRepository;
import com.codeclan.gladiatorArena.GladiatorArena.repository.Match.MatchRepository;
import com.codeclan.gladiatorArena.GladiatorArena.repository.Monster.MonsterRepository;
import com.codeclan.gladiatorArena.GladiatorArena.repository.Weapon.WeaponRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    GladiatorRepository gladiatorRepository;

    @Autowired
    MatchRepository matchRepository;

    @Autowired
    MonsterRepository monsterRepository;

    @Autowired
    WeaponRepository weaponRepository;

    public DataLoader() {

    }

    public void run(ApplicationArguments args){

    }

}
