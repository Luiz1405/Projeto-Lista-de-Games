package com.ProjetoPessoal.DsList.DTO;

import com.ProjetoPessoal.DsList.Entities.GameList;

public class GameListDTO {
    
    private Long id;
    private String nome;

    public GameListDTO(){

    }

    public GameListDTO(GameList list){
        id = list.getId();
        nome = list.getNome();
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
}
