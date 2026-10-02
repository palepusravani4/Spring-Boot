package com.example.Controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//@Controller
//public class ShowHomeController {
//	@RequestMapping("/welcome")
//	/*public String showHome(Map<String,Object> map) {
//		System.out.println(map.getClass());
//		map.put("sysDate", new Date());
//		map.put("age", new Random().nextInt(100));
//		
//		
//		
//		return "welcome";
//	}*/
//	/*public String process(Model model) {
//		model.addAttribute("sysDate", new Date());
//		model.addAttribute("age", new Random().nextInt(100));
//	
//	return "welcome";
//	}*/
//	
// /*public Model process()	{
//		Model model=new BindingAwareModelMap();
//		model.addAttribute("sysDate", new Date());
//		model.addAttribute("age", new Random().nextInt(100));
//	   return model;
//	}*/
//	
//	/*public Map<String,Object> process(){
//		Map<String,Object> map=new HashMap();
//		map.put("sysDate", new Date());
//		map.put("age", new Random().nextInt(100));
//		
//		return map;
//		
//	}*/
//	public ModelAndView process() {
//		ModelAndView mv=new ModelAndView();
//		mv.addObject("sysDate", new Date());
//		mv.addObject("age", new Random().nextInt(100));
//		mv.setViewName("home");
//		return mv;
//	}
//	
//
//}
