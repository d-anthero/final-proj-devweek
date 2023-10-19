package me.finalprojdevweek.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import me.finalprojdevweek.domain.model.Jogador;

public interface UserRepository extends JpaRepository<Jogador, Long> {
    
}
