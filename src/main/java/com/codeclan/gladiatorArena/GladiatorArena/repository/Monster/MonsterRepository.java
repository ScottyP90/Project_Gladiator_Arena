package com.codeclan.gladiatorArena.GladiatorArena.repository.Monster;

import com.codeclan.gladiatorArena.GladiatorArena.models.Monster;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MonsterRepository extends JpaRepository<Monster, Long> {
}
