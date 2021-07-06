package com.lqwd.coinproject.service;

import java.util.List;

import com.lqwd.coinproject.dto.CoinDTO;
import com.lqwd.coinproject.model.Coin;

public interface CoinService {
	public CoinDTO createCoin(CoinDTO book);
	public CoinDTO updateCoin(Long id, CoinDTO book);
	public void deleteCoin(Long id);
	public List<CoinDTO> list();
	public List<CoinDTO> search(String name);
}
