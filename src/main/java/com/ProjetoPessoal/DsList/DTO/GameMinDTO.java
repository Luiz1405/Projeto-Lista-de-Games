package com.ProjetoPessoal.DsList.DTO;

import com.ProjetoPessoal.DsList.Entities.Games;

public class GameMinDTO {

    private Long id;
    private String titulo;
    private String ano;
    private String imgUrl;
    private String pequena_descricao;

    public GameMinDTO(){
        
    }

    public GameMinDTO(Games entity) {
        id = entity.getId();
        titulo = entity.getTitulo();
        ano = entity.getAno();
        imgUrl = entity.getImgUrl();
        pequena_descricao = entity.getPequenaDescricao();
    }

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAno() {
        return ano;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getPequena_descricao() {
        return pequena_descricao;
    }
    
}
