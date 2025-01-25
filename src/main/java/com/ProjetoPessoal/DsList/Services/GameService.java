package com.ProjetoPessoal.DsList.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.ProjetoPessoal.DsList.DTO.GameDTO;
import com.ProjetoPessoal.DsList.DTO.GameMinDTO;
import com.ProjetoPessoal.DsList.Entities.Games;
import com.ProjetoPessoal.DsList.Projections.GameMinProjections;
import com.ProjetoPessoal.DsList.Repositories.GameRepository;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public GameDTO findById(@PathVariable Long id){
        Games result = gameRepository.findById(id).get();
        return new GameDTO(result);
        
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll(){
        List<Games> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }
    
    @Transactional(readOnly = true)
    public List<GameMinDTO> findGameByList(Long listId){
        List<GameMinProjections> games = gameRepository.searchByList(listId);
        return games.stream().map(x -> new GameMinDTO(x)).toList();
    }
}
