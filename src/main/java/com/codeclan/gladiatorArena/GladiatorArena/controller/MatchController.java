package com.codeclan.gladiatorArena.GladiatorArena.controller;

import com.codeclan.gladiatorArena.GladiatorArena.repository.Match.MatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/match")
public class MatchController {

    @Autowired
    MatchRepository matchRepository;

}
