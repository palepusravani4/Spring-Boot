package com.example.Controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class SeasonOperationsController {
    @Autowired
	private ISeasonFinderService service;
	@RequestMapping("/")
	public String showHome() {
		return "welcome";
	}
	@RequestMapping("/season")
	public String showSeason(Map<String,Object> map) {
		
		String msg=service.findSeason();
		map.put("resultmsg", msg);
		return "display";
	}
}

