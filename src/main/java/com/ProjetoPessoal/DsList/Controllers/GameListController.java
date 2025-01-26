package com.ProjetoPessoal.DsList.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ProjetoPessoal.DsList.DTO.GameListDTO;
import com.ProjetoPessoal.DsList.DTO.GameMinDTO;
import com.ProjetoPessoal.DsList.DTO.ReplacementDTO;
import com.ProjetoPessoal.DsList.Services.GameListService;
import com.ProjetoPessoal.DsList.Services.GameService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @Autowired GameService gameService;


    @GetMapping
    public List<GameListDTO> findAll(){
        List<GameListDTO> result = gameListService.findAll();
        return result;

    } 

    @GetMapping(value = "/{listId}/games")
    public List<GameMinDTO> findGames(@PathVariable Long listId){
        List<GameMinDTO> result = gameService.findGameByList(listId);
        return result;
    } 

    @PostMapping(value = "/{listId}/replacement")
    public void move(@PathVariable Long listId, @RequestBody ReplacementDTO body){
        gameListService.move(listId, body.getSourceIndex(), body.getDestinationIndex());
    
    } 
}
