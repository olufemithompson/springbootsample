package com.lqwd.coinproject.repository;

import java.util.List;

import com.lqwd.coinproject.model.Coin;

public interface CoinRepository extends BaseRepository<Coin, Long> {

	List<Coin> findCoinByName(String name);
}
