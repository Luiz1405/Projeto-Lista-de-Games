package com.ProjetoPessoal.DsList.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ProjetoPessoal.DsList.Entities.Games;
import com.ProjetoPessoal.DsList.Projections.GameMinProjections;

public interface GameRepository extends JpaRepository<Games, Long> {

    @Query(nativeQuery = true, value = """
	SELECT tb_game.id, 
    tb_game.titulo, 
    tb_game.ano,
    tb_game.img_url AS imgUrl, 
	tb_game.pequena_descricao,
    tb_belonging.posicao
	FROM tb_game
	INNER JOIN tb_belonging ON tb_game.id = tb_belonging.game_id
	WHERE tb_belonging.list_id = :listId
	ORDER BY tb_belonging.posicao
		""")
    List<GameMinProjections> searchByList(Long listId);

}
