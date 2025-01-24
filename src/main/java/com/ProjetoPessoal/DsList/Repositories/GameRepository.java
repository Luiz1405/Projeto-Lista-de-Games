package com.ProjetoPessoal.DsList.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ProjetoPessoal.DsList.Entities.Games;

public interface GameRepository extends JpaRepository<Games, Long> {



}
