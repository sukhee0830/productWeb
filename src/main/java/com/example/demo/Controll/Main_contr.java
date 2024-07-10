package com.example.demo.Controll;


import com.example.demo.DTO.UpDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.DTO.DBMapper;
import com.example.demo.Utill.CookieUtill;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller
public class Main_contr {

    @Autowired
    private DBMapper Ma;

    @GetMapping("/")
    public String home(HttpSession session,
    				   HttpServletResponse response,
    				   HttpServletRequest request,
    				   Model mo) {
		CookieUtill cookieUtill = new CookieUtill();
		Cookie[] cookies = request.getCookies();
		String checkUser = cookieUtill.matchUser(cookies);
		mo.addAttribute("info", checkUser);
        return cookieUtill.matchSession(request, response, cookies, "/Home/main.html");
    }
    @GetMapping("/logout")
    public String logout(HttpSession session,
    					 HttpServletResponse response,
    					 HttpServletRequest request) {
        session.invalidate();
        Cookie[] cookies = request.getCookies();
        for (Cookie cookie : cookies) {
        	if(cookie == null){
        		return "redirect:/";
        	}
            cookie.setMaxAge(0);
            response.addCookie(cookie);
        }
		return "redirect:/";
    }
    @GetMapping("/login_home")
    public String login_home2(HttpServletRequest request,
    						  HttpServletResponse response,
    						  Model mo) {
		CookieUtill cookieUtill = new CookieUtill();
		Cookie[] cookies = request.getCookies();
		String checkUser = cookieUtill.matchUser(cookies);
		mo.addAttribute("info", checkUser);
		return cookieUtill.matchSession(request, response, cookies, "/Home/main.html");
    }

    @PostMapping("/login_home")
    public String login_home_Post(@RequestParam(name = "id") String id,
                                  @RequestParam(name = "password") String pw,
                                  Model mo,
                                  HttpServletRequest request,
                                  HttpServletResponse response) {
    	String user_id = Ma.UserId(id);
		String user_pw = Ma.UserPw(id);
		
		if(id.equals(user_id) && pw.equals(user_pw)){
			if(id.equals("ADMIN") || id.equals("admin")){
				HttpSession session = request.getSession();
				session.setAttribute("ADMIN", id);
				Cookie ID_Cookie = new Cookie("ADMIN", id);
				ID_Cookie.setMaxAge(10000);
				response.addCookie(ID_Cookie);
				mo.addAttribute("Display", Ma.DisplaySet().get(0));
				mo.addAttribute("info", id);
				return "/Admin/Admin_Page.html";
			}
			mo.addAttribute("info", user_id);
			HttpSession session = request.getSession();
			session.setAttribute("ID", id);
			Cookie ID_Cookie = new Cookie("ID", id);
			ID_Cookie.setMaxAge(10000);
			response.addCookie(ID_Cookie);
			return "/Home/main.html";
		}
		mo.addAttribute("error", "아이디 또는 비밀번호가 올바르지 않습니다.");
		return "/Sign/SignIn_Page.html";
    }

    @GetMapping("/forgetPW")
    public String forgetpw() {
        return "/Sign/forgetPW.html";
    }

    
    
	@PostMapping("/findPW")
	public String findPW(@RequestParam(required=false, name="id") String id, 
						 Model mo)
	{
		
		if(Ma.UserId(id) != null)
		{
			String findPW = Ma.UserPw(id);
			
			mo.addAttribute("findPW", "해당하는 비밀번호는 : "+findPW);
			
			return "/Sign/SignIn_Page.html";
			
		}
		
		mo.addAttribute("error", "해당하신 아이디는 존재하지가 않습니다.");
		
		return "/Sign/forgetPW.html";
	}
	
	
	
}



