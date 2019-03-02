package com.codeclan.gladiatorArena.GladiatorArena.components;

import com.codeclan.gladiatorArena.GladiatorArena.models.Gladiator;
import com.codeclan.gladiatorArena.GladiatorArena.models.Match;
import com.codeclan.gladiatorArena.GladiatorArena.models.Monster;
import com.codeclan.gladiatorArena.GladiatorArena.models.Weapon;
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
        Weapon lightsaber = new Weapon("Lightsaber","laser sword",45,5);
        weaponRepository.save(lightsaber);

        Weapon mjolnir = new Weapon("Mjölnir", "Hammer", 150,20);
        weaponRepository.save(mjolnir);

        Weapon p90 = new Weapon("P90","Gun",90,0);
        weaponRepository.save(p90);

        Weapon swordOfSparda = new Weapon("The Sword Of Sparda","sword",110, 25);
        weaponRepository.save(swordOfSparda);

        Weapon longbow = new Weapon("Longbow", "bow",70,0);
        weaponRepository.save(longbow);

        Gladiator thor = new Gladiator("Thor", "God of Thunder", "male", mjolnir, 1000, 57, 68);
        gladiatorRepository.save(thor);

        Gladiator heracles = new Gladiator("Heracles", "the Wrathful","male", longbow,1000, 100, 90);
        gladiatorRepository.save(heracles);

        Gladiator dante = new Gladiator("Dante", "son of Sparda","male", swordOfSparda, 1500, 50, 72);
        gladiatorRepository.save(dante);

        Gladiator atalanta = new Gladiator("Atalanta", "the Hunter","female", longbow,1000,90,94);
        gladiatorRepository.save(atalanta);

        Gladiator ray = new Gladiator("Ray", "the Last Jedi", "female", lightsaber, 770, 107, 58);
        gladiatorRepository.save(ray);

        Monster jormungandr = new Monster("Jörmungandr","the World Serpent",2200, 200, 100);
        monsterRepository.save(jormungandr);

        Monster cerberus = new Monster("Cerberus","Hound of Hades",3333,333,33);
        monsterRepository.save(cerberus);

        Monster fenrir = new Monster("Fenrir", "the Great Wolf", 2500,200,90);
        monsterRepository.save(fenrir);

        Monster yukionna = new Monster("Yuki-onna", "Snow Woman",1000,107,50);
        monsterRepository.save(yukionna);

        Monster oni = new Monster("Red Oni","of the Mountains", 700,99,68);
        monsterRepository.save(oni);

        Monster goblin = new Monster("Goblin", "of the Code",400,50,20);
        monsterRepository.save(goblin);

        Match round1 = new Match("Showdown at Ragnarok", thor, jormungandr);
        matchRepository.save(round1);

        Match round2 = new Match("Battle a the Gates of Hades", heracles, cerberus);
        matchRepository.save(round2);

        Match round3 = new Match("Fight at the Temen-ni-gru", dante, cerberus);
        matchRepository.save(round3);

        Match round4 = new Match("Last Jedi vs Scrub Goblin", ray, goblin);
        matchRepository.save(round4);

        Match round5 = new Match("Hunting in a Snow Storm", atalanta, yukionna);
        matchRepository.save(round5);

        Match round6 = new Match("Showdown at Ragnarok Round 2", thor, fenrir);
        matchRepository.save(round6);
    }
}
