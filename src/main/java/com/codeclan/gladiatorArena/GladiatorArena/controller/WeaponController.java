package com.codeclan.gladiatorArena.GladiatorArena.controller;

import com.codeclan.gladiatorArena.GladiatorArena.models.Weapon;
import com.codeclan.gladiatorArena.GladiatorArena.repository.Weapon.WeaponRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/weapons")
public class WeaponController {

    @Autowired
    WeaponRepository weaponRepository;

    @GetMapping
    public List<Weapon> getAllWeapons(){
        return weaponRepository.findAll();
    }

}
