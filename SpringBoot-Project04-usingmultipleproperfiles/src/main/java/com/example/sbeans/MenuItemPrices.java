package com.example.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;
@Component("m")
@Data
public class MenuItemPrices {
	@Value("${menu.dprice}")
	private float dosaprice;
	@Value("${menu.iprice}")
	private float idlyprice;
	@Value("${menu.pprice}")
	private float pohaprice;
	@Value("${menu.vprice}")
	private float vadaprice;

}
