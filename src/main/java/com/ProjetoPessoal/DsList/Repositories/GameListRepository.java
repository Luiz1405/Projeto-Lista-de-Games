package com.ProjetoPessoal.DsList.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ProjetoPessoal.DsList.Entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {
    
}
