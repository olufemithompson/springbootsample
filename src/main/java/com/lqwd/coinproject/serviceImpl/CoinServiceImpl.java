package com.lqwd.coinproject.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lqwd.coinproject.dto.CoinDTO;
import com.lqwd.coinproject.exceptions.RecordNotFoundException;
import com.lqwd.coinproject.mapper.CoinMapper;
import com.lqwd.coinproject.model.Coin;
import com.lqwd.coinproject.repository.CoinRepository;
import com.lqwd.coinproject.service.CoinService;

@Service
public class CoinServiceImpl implements CoinService {

	@Autowired
	CoinRepository coinRepository;

	@Autowired
	CoinMapper coinMapper;

	@Override
	public CoinDTO createCoin(CoinDTO request) {
		request.setCreatedAt(new java.sql.Date(System.currentTimeMillis()));
		Coin coin = coinMapper.coinDTOToCoin(request);
		return coinMapper.coinTocoinDTO(coinRepository.save(coin));
	}

	@Override
	public CoinDTO updateCoin(Long id, CoinDTO request) {
		Coin coin = coinRepository.findById(id).orElseThrow(RecordNotFoundException::new);
		coin.setPrice(request.getPrice());
		return coinMapper.coinTocoinDTO(coinRepository.save(coin));
	}

	@Override
	public List<CoinDTO> list() {
		return coinMapper.coinsToCoinDTOs(coinRepository.findAll());
	}

	@Override
	public void deleteCoin(Long id) {
		if (coinRepository.existsById(id)) {
			coinRepository.deleteById(id);
		} else {
			throw new RecordNotFoundException();
		}
	}

	@Override
	public List<CoinDTO> search(String name) {
		return coinMapper.coinsToCoinDTOs(coinRepository.findCoinByName(name));
	}

}
