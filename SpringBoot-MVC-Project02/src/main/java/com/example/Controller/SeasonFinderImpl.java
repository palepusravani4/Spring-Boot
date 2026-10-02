package com.example.Controller;

import java.time.LocalDate;

import org.springframework.stereotype.Service;
@Service("seasonservice")
public class SeasonFinderImpl implements ISeasonFinderService{

	@Override
	public String findSeason() {
		LocalDate ld=LocalDate.now();
		int month=ld.getMonthValue();
		if(month>=7&&month<=9) {
			return "rainy season";
			}
		else if(month>=3&&month<=6) {
			return "summer season";
		}
		else {
			
			return "winter season";
		}
	}
	

}
