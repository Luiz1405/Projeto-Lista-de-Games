package com.ProjetoPessoal.DsList.Entities;

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
    
    @Column(name = "game_ano")
    private String ano;
    private String genero;
    private String plataforma;
    private double nota;
    private String imgUrl;
    private String pequenaDescricao;
    private String longaDescricao;


    public Games(){

    }

    public Games(Long id, String titulo, String genero, String plataforma, double nota, String imgUrl, String pequenaDescricao, String longaDescricao){
        this.titulo = titulo;
        this.genero = genero;
        this.plataforma = plataforma;
        this.nota = nota;
        this.imgUrl = imgUrl;
        this.pequenaDescricao = pequenaDescricao;
        this.longaDescricao = longaDescricao;
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
        return pequenaDescricao;
    }

    public void setPequenaDescricao(String pequenaDescricao) {
        this.pequenaDescricao = pequenaDescricao;
    }

    public String getLongaDescricao() {
        return longaDescricao;
    }

    public void setLongaDescricao(String longaDescricao) {
        this.longaDescricao = longaDescricao;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
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
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

}
