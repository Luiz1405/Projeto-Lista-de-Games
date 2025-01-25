package com.ProjetoPessoal.DsList.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.ProjetoPessoal.DsList.DTO.GameListDTO;
import com.ProjetoPessoal.DsList.Entities.GameList;
import com.ProjetoPessoal.DsList.Repositories.GameListRepository;

@Service
public class GameListService {
    @Autowired
    private GameListRepository gameListRepository;
    
    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();
    }
}
