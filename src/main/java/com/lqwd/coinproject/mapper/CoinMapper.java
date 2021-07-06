package com.lqwd.coinproject.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.lqwd.coinproject.dto.CoinDTO;
import com.lqwd.coinproject.model.Coin;

@Mapper(componentModel = "spring")
public interface CoinMapper {

	@Mapping(source = "name", target = "name")
	@Mapping(source = "id", target = "id")
	@Mapping(source = "price", target = "price")
	@Mapping(source = "createdAt", target = "createdAt")
	public Coin coinDTOToCoin(CoinDTO coinDTO);

	@Mapping(source = "name", target = "name")
	@Mapping(source = "id", target = "id")
	@Mapping(source = "price", target = "price")
	@Mapping(source = "createdAt", target = "createdAt")
	public CoinDTO coinTocoinDTO(Coin coin);

	public List<CoinDTO> coinsToCoinDTOs(List<Coin> coins);

}
