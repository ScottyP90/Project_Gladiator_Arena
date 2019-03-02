package com.codeclan.gladiatorArena.GladiatorArena.controller;

import com.codeclan.gladiatorArena.GladiatorArena.models.Match;
import com.codeclan.gladiatorArena.GladiatorArena.repository.Match.MatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/matches")
public class MatchController {

    @Autowired
    MatchRepository matchRepository;

    @GetMapping
    public List<Match> getAllMatches(){
        return matchRepository.findAll();
    }
}
