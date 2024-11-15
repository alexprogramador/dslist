package com.devesuperior1.dslist1.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devesuperior1.dslist1.dto.GameMinDTO;
import com.devesuperior1.dslist1.entities.Game;
import com.devesuperior1.dslist1.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired	
	private GameRepository gameRepository;

	public List<GameMinDTO> findAll(){
		List<Game> result = gameRepository.findAll();
		return result.stream().map(x -> new GameMinDTO(x)).toList();
		
	}

}
