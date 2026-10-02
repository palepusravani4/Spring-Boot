package com.example.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Movie {
	@Id
	private Integer no;
	private String hero;
	private String heroin;
	private Integer days;
	private Double budjet;

}
