package com.codeclan.gladiatorArena.GladiatorArena.controller;

import com.codeclan.gladiatorArena.GladiatorArena.repository.Weapon.WeaponRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class WeaponController {

    @Autowired
    WeaponRepository weaponRepository;

}
