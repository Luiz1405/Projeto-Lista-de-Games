package com.ProjetoPessoal.DsList.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ProjetoPessoal.DsList.DTO.GameMinDTO;
import com.ProjetoPessoal.DsList.Entities.Games;
import com.ProjetoPessoal.DsList.Repositories.GameRepository;
import com.ProjetoPessoal.DsList.Services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameRepository gameRepository;

    @GetMapping
    public List<GameMinDTO> findAll(){

        List<Games> result = gameRepository.findAll();
        List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
        return dto;

    } 
    
}
