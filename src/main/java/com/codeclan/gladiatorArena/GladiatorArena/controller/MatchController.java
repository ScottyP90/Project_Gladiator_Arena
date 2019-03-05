package com.codeclan.gladiatorArena.GladiatorArena.controller;

import com.codeclan.gladiatorArena.GladiatorArena.models.Gladiator;
import com.codeclan.gladiatorArena.GladiatorArena.models.Match;
import com.codeclan.gladiatorArena.GladiatorArena.models.Monster;
import com.codeclan.gladiatorArena.GladiatorArena.repository.Gladiator.GladiatorRepository;
import com.codeclan.gladiatorArena.GladiatorArena.repository.Match.MatchRepository;
import com.codeclan.gladiatorArena.GladiatorArena.repository.Monster.MonsterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/matches")
public class MatchController {

    @Autowired
    MatchRepository matchRepository;

    @Autowired
    GladiatorRepository gladiatorRepository;

    @Autowired
    MonsterRepository monsterRepository;

    @GetMapping
    public List<Match> getAllMatches(){
        return matchRepository.findAll();
    }

    @PatchMapping(value = "/fight/{gladiatorId}/vs/{monsterId}/match/{matchId}")
    public void uppdateCurrentMatch(@PathVariable long gladiatorId, @PathVariable long monsterId, @PathVariable long matchId){
        Gladiator gladiator = gladiatorRepository.getOne(gladiatorId);
        Monster monster = monsterRepository.getOne(monsterId);
        Match match = matchRepository.getOne(matchId);
        match.combatantsBattle(gladiator,monster);
        matchRepository.save(match);
    }

    @PatchMapping(value = "/heal/{gladiatorId}/vs/{monsterId}/match/{matchId}")
    public void uppdateHealGladiator(@PathVariable long gladiatorId, @PathVariable long monsterId, @PathVariable long matchId){
        Gladiator gladiator = gladiatorRepository.getOne(gladiatorId);
        Monster monster = monsterRepository.getOne(monsterId);
        Match match = matchRepository.getOne(matchId);
        match.gladiatorHeals(gladiator,monster);
        matchRepository.save(match);
    }

    @PatchMapping(value = "/reset/{gladiatorId}/vs/{monsterId}/match/{matchId}")
    public void uppdateResetStats(@PathVariable long gladiatorId, @PathVariable long monsterId, @PathVariable long matchId){
        Gladiator gladiator = gladiatorRepository.getOne(gladiatorId);
        Monster monster = monsterRepository.getOne(monsterId);
        Match match = matchRepository.getOne(matchId);
        match.restoreStats(gladiator,monster);
        matchRepository.save(match);
    }


}
