package com.my.kmg_backend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HomeController {
	
	
	
	

	
	@GetMapping("/getUser/{userIdx}")
	public String addUser(
				@PathVariable("userIdx") int userIdx,
				Model model	
			) {
		
		
		  String idFromDB = "coding213";
		  String telFromDB = "010-9936-1422";
		  
		  
		  model.addAttribute("id", idFromDB);
		  model.addAttribute("tel", telFromDB);
		  
		  
		  
	      return "home";
	}
	
	
	
	
	
	
	
	
	@GetMapping("save")     //"매핑부분"?uid=ap002&upw=3
	@ResponseBody
	public String save(
			@RequestParam(value="uid")String id,
			@RequestParam(value="upw")String pw
			) {
		
		System.out.println(id);
		
		
		return "아이디:" +id;
	}
	
	
	
	
	@GetMapping("")
	@ResponseBody
	public String home() {
		return "data";
		
	}
	
	
}
