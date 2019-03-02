package com.codeclan.gladiatorArena.GladiatorArena.controller;

import com.codeclan.gladiatorArena.GladiatorArena.models.Gladiator;
import com.codeclan.gladiatorArena.GladiatorArena.repository.Gladiator.GladiatorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/gladiators")
public class GladiatorController {

    @Autowired
    GladiatorRepository gladiatorRepository;

    @GetMapping
    public List<Gladiator> getAllGladiators(){
        return gladiatorRepository.findAll();
    }
}
