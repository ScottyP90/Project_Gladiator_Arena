package com.codeclan.gladiatorArena.GladiatorArena.controller;

import com.codeclan.gladiatorArena.GladiatorArena.repository.Gladiator.GladiatorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/game")
public class GladiatorController {

    @Autowired
    GladiatorRepository gladiatorRepository;

}
