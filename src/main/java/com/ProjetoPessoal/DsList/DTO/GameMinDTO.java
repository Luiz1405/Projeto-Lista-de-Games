package com.ProjetoPessoal.DsList.DTO;

import com.ProjetoPessoal.DsList.Entities.Games;
import com.ProjetoPessoal.DsList.Projections.GameMinProjections;

public class GameMinDTO {

    private Long id;
    private String titulo;
    private Integer ano;
    private String imgUrl;
    private String pequena_descricao;

    public GameMinDTO(){
        
    }

    public GameMinDTO(Games entity) {
        id = entity.getId();
        titulo = entity.getTitulo();
        ano = entity.getAno();
        imgUrl = entity.getImgUrl();
        pequena_descricao = entity.getPequena_Descricao();
    }

    public GameMinDTO(GameMinProjections projection) {
        id = projection.getId();
        titulo = projection.getTitulo();
        ano = projection.getAno();
        imgUrl = projection.getImgUrl();
        pequena_descricao = projection.getPequena_descricao();
    }

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public Integer getAno() {
        return ano;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getPequena_descricao() {
        return pequena_descricao;
    }
    
}
