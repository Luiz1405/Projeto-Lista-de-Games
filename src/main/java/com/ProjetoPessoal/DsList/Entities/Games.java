package com.ProjetoPessoal.DsList.Entities;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_game")
public class Games {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    @Column(name = "ano_lancamento")
    private String ano;
    private String genero;
    private String plataforma;
    private double nota;
    private String imgUrl;

    @Column(columnDefinition = "TEXT")
    private String pequena_descricao;

    @Column(columnDefinition = "TEXT")
    private String longa_descricao;


    public Games(){

    }

    public Games(Long id, String titulo, String genero, String ano, String plataforma, double nota, String imgUrl, String pequena_descricao, String longa_descricao){
        this.titulo = titulo;
        this.ano = ano;
        this.genero = genero;
        this.plataforma = plataforma;
        this.nota = nota;
        this.imgUrl = imgUrl;
        this.pequena_descricao = pequena_descricao;
        this.longa_descricao = longa_descricao;
    }

    public Long getId(){
        return id;
    }

    public void setId(Long novoId){
        this.id = novoId;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAno() {
        return ano;
    } 

    public void setAno(String ano) {
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

    public String getPequenaDescricao() {
        return pequena_descricao;
    }

    public void setPequenaDescricao(String pequenaDescricao) {
        this.pequena_descricao = pequenaDescricao;
    }

    public String getlongaDescricao() {
        return longa_descricao;
    }

    public void setlongaDescricao(String longaDescricao) {
        this.longa_descricao = longaDescricao;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Games other = (Games) obj;
        return Objects.equals(id, other.id);
    }

}
