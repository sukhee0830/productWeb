package com.example.demo.Controll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.DTO.AdminBuild;
import com.example.demo.DTO.AdminDB;
import com.example.demo.DTO.DBMapper;
import com.example.demo.Utill.CookieUtill;
import com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller
public class Admin_contr {
	
	@Autowired
	private DBMapper Ma;
	
	@GetMapping("/admin")
	public String admin_page(HttpServletRequest request, 
							 HttpServletResponse response, 
							 Model mo)
	{
		HttpSession session = request.getSession();
		String ID_Session = (String) session.getAttribute("ID");
		String ADMIN_Session = (String) session.getAttribute("ADMIN");
		
		Cookie[] cookies = request.getCookies();
        CookieUtill cookieData = new CookieUtill();
        String User = cookieData.matchUser(cookies);
        
		if(ADMIN_Session != null && ADMIN_Session.equals(User))
		{
			mo.addAttribute("Display", Ma.DisplaySet().get(0));
			return "/Admin/Admin_Page.html";
		}
		
		return "/Home/main.html";
	}
	
	@GetMapping("/update")
	public String admin_update(@RequestParam(required=false, name="elect") String elect,
							   @RequestParam(required=false, name="chain") String chain,
							   @RequestParam(required=false, name="mtb") String mtb,
							   @RequestParam(required=false, name="nomal") String nomal,
							   @RequestParam(required=false, name="nokick") String nokick,
							   @RequestParam(required=false, name="onkick") String onkick,
							   @RequestParam(required=false, name="nocar") String nocar,
							   @RequestParam(required=false, name="oncar") String oncar, 
							   Model mo)
	{
		AdminDB DB = new AdminBuild().
					 elect(elect).
					 chain(chain).
					 mtb(mtb).
					 nomal(nomal).
					 nokick(nokick).
					 onkick(onkick).
					 nocar(nocar).
					 oncar(oncar).
					 build();
		
		Ma.Update_Ad(elect, chain, mtb, nomal, nokick, onkick, nocar, oncar);
		
		mo.addAttribute("Display", Ma.DisplaySet().get(0));
		
		return "/Admin/Admin_Page.html";
	}
}
