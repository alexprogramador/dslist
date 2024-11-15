package com.devesuperior1.dslist1.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devesuperior1.dslist1.dto.GameMinDTO;
import com.devesuperior1.dslist1.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {
	
	@Autowired
	private GameService gameService;
	
	@GetMapping
	public List<GameMinDTO> findAll(){
	List<GameMinDTO> result =  gameService.findAll();
	return result;

}
	
}

