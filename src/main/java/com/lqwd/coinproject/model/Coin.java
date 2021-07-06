package com.lqwd.coinproject.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "Book")
public class Coin {

	@Id
	@GeneratedValue
	private Long id;

	private String name;

	private Double price;

	private Date createdAt;

}
