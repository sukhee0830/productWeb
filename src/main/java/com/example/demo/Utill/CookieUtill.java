package com.example.demo.Utill;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.ui.Model;

public class CookieUtill {

    public int getBasketCount(Cookie[] cookies, String cookieName) {
        if (cookies == null) {
            return 0;
        }
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals(cookieName)) {
                return Integer.parseInt(cookie.getValue());
            }
        }
        return 0;
    }

    public String matchUser(Cookie[] cookies) {
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("ID") || 
                	cookie.getName().equals("ADMIN")) {
                    return cookie.getValue();
                }
            }
        }
        return null;
    }
    public String matchSession(HttpServletRequest request, 
    						   HttpServletResponse response, 
    						   Cookie[] cookies, 
    						   String linkPage) {
        HttpSession session = request.getSession();
        String ID_Session = (String) session.getAttribute("ID");
        String ADMIN_Session = (String) session.getAttribute("ADMIN");
        CookieUtill cookieData = new CookieUtill();
        String User = cookieData.matchUser(cookies);

        if ((ID_Session != null && ID_Session.equals(User)) || 
        	(ADMIN_Session != null && ADMIN_Session.equals(User))) {
            return linkPage;
        } 
        else {
            session.invalidate();
            if(cookies != null) {
                for (Cookie cookie : cookies) {
                    cookie.setMaxAge(0);
                    response.addCookie(cookie);
                }
            }
            return "/Home/main.html";
        }
    }
}
