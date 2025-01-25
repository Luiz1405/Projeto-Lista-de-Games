package com.ProjetoPessoal.DsList.DTO;


import com.ProjetoPessoal.DsList.Entities.Games;



public class GameDTO {

    private Long id;
    private String titulo;
    private int ano;
    private String genero;
    private String plataforma;
    private double nota;
    private String imgUrl;
    private String pequena_descricao;
    private String longa_descricao;

    public GameDTO(){

    }

    public GameDTO(Games entity){

    this.id = entity.getId();
    this.titulo = entity.getTitulo();
    this.ano = entity.getAno();
    this.genero = entity.getGenero();
    this.plataforma = entity.getPlataforma();
    this.nota = entity.getNota();
    this.imgUrl = entity.getImgUrl();
    this.pequena_descricao = entity.getPequena_Descricao();
    this.longa_descricao = entity.getlonga_Descricao();
    
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getPequena_descricao() {
        return pequena_descricao;
    }

    public void setPequena_descricao(String pequena_descricao) {
        this.pequena_descricao = pequena_descricao;
    }

    public String getLonga_descricao() {
        return longa_descricao;
    }

    public void setLonga_descricao(String longa_descricao) {
        this.longa_descricao = longa_descricao;
    }

}
