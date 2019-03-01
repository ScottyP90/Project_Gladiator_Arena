package com.codeclan.gladiatorArena.GladiatorArena.controller;

import com.codeclan.gladiatorArena.GladiatorArena.repository.Monster.MonsterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Monster")
public class MonsterController {

    @Autowired
    MonsterRepository monsterRepository;

}
