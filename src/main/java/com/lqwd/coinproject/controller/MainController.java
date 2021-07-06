package com.lqwd.coinproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lqwd.coinproject.dto.CoinDTO;
import com.lqwd.coinproject.service.CoinService;

@RestController
public class MainController {

	@Autowired
	CoinService coinService;

	@PostMapping("/add")
	public CoinDTO addCoin(@RequestBody CoinDTO request) {
		return coinService.createCoin(request);
	}

	@PutMapping("/edit/{id}")
	public CoinDTO updateCoin(@PathVariable Long id, @RequestBody CoinDTO request) {
		return coinService.updateCoin(id, request);
	}

	@DeleteMapping("/delete/{id}")
	public void deleteCoin(@PathVariable Long id) {
		coinService.deleteCoin(id);
	}

}
