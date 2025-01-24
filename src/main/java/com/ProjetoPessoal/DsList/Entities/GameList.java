package com.ProjetoPessoal.DsList.Entities;

import java.util.Objects;

import com.ProjetoPessoal.DsList.DTO.GameMinDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_game_list")
public class GameList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    public GameList(){

    }

    public GameList(Long id, String nome){
        this.id = id;
        this.nome = nome;
    }

    public Long getId(){
        return id;
    }

    public void setId(Long novoId){
        this.id = novoId;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String novoNome){
        this.nome = novoNome;
    }

    @Override
      public int hashCode(){
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
        GameList other = (GameList) obj;
        return Objects.equals(id, other.id);
    }

}
