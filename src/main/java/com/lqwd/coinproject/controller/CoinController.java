package com.lqwd.coinproject.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lqwd.coinproject.dto.CoinDTO;
import com.lqwd.coinproject.model.Coin;
import com.lqwd.coinproject.service.CoinService;


@RestController
public class CoinController {
	
	@Autowired
	CoinService coinService;
	
	
	@GetMapping("/coins/search")
	public List<CoinDTO> findBook(@RequestParam(name="query") String name) {
		return coinService.search(name);
	}
	

	@GetMapping("/coins")
	public List<CoinDTO> listCoins() {
	    return coinService.list();
	}
}
