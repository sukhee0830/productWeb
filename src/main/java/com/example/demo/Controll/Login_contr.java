package com.example.demo.Controll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.DTO.UpDB;
import com.example.demo.DTO.DBMapper;
import com.example.demo.DTO.UpBuild;



@Controller
public class Login_contr {
	
	@Autowired
	private DBMapper Ma;

	@GetMapping("/SignIn")
	public String signin() {
		return "Sign/SignIn_Page.html";
	}
	
	@GetMapping("/SignUp")
	public String signup() {
		return "Sign/SignUp_Page.html";
	}
	
	@PostMapping("/SignIn_Page")
	public String signupin(@RequestParam(required=false) String Id,
						   @RequestParam(required=false) String Name,
						   @RequestParam(required=false) String Pw1,
						   @RequestParam(required=false) String Maddr,
						   @RequestParam(required=false) String Saddr,
						   @RequestParam(required=false) String Paddr,
						   @RequestParam(required=false) String S1,
						   @RequestParam(required=false) String S2) {	
		UpDB info_up = new UpBuild().
				ID(Id).NAME(Name).
				PW(Pw1).MADDR(Maddr).
				SADDR(Saddr).
				PADDR(Paddr).
				S1(S1).
				S2(S2).
				Biluder();

		Ma.Insert(info_up.getId(), 
				  info_up.getName(), 
				  info_up.getPw(),
				  info_up.getMaddr(),
				  info_up.getSaddr(),
				  info_up.getPaddr(),
				  info_up.getS1(), 
				  info_up.getS2());
		return "Sign/SignIn_Page.html";
	}
}
