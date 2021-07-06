package com.lqwd.coinproject.dto;

import java.sql.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class CoinDTO {
	
	private Long id;
	
	private String name;

	private Double price;

	private Date createdAt;

}
