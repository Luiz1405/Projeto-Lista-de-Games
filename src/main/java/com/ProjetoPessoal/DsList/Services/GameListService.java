package com.ProjetoPessoal.DsList.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.ProjetoPessoal.DsList.DTO.GameListDTO;
import com.ProjetoPessoal.DsList.Entities.GameList;
import com.ProjetoPessoal.DsList.Projections.GameMinProjections;
import com.ProjetoPessoal.DsList.Repositories.GameListRepository;
import com.ProjetoPessoal.DsList.Repositories.GameRepository;

@Service
public class GameListService {
    @Autowired
    private GameListRepository gameListRepository;

    @Autowired
    private GameRepository gameRepository;
    
    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();
    }

    @Transactional
    public void move(Long listId, int sourceIndex, int destinationIndex){

        List<GameMinProjections> list =  gameRepository.searchByList(listId);

        GameMinProjections obj = list.remove(sourceIndex);
        list.add(destinationIndex, obj);

        int min = sourceIndex < destinationIndex ? sourceIndex : destinationIndex;
        int max = sourceIndex < destinationIndex ? destinationIndex : sourceIndex;

        for(int i = min; i <= max; i++){
            gameListRepository.updateBelongingPosition(listId, list.get(i).getId(), i);
        }

    }
}
