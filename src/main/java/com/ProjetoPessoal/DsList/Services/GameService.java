package com.ProjetoPessoal.DsList.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ProjetoPessoal.DsList.DTO.GameMinDTO;
import com.ProjetoPessoal.DsList.Entities.Games;
import com.ProjetoPessoal.DsList.Repositories.GameRepository;

@Service
public class GameService {

    @Autowired
    private GameRepository GameRepository;

    public List<GameMinDTO> findAll(){
        List<Games> result = GameRepository.findAll();
        List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
        return dto;
    }
}
