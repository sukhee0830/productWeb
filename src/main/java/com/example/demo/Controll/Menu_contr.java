package com.example.demo.Controll;

import com.example.demo.Utill.ProductOrder;
import com.example.demo.Utill.CookieUtill;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.DTO.AdminDB;
import com.example.demo.DTO.DBMapper;
import com.example.demo.DTO.textDB;
import com.example.demo.Utill.CookieUtill;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class Menu_contr {

    @Autowired
    private DBMapper Ma;

    @GetMapping("/service")
    public String Top_service(HttpServletRequest request,
                              HttpServletResponse response,
                              Model mo) {
        CookieUtill User = new CookieUtill();
        Cookie[] cookies = request.getCookies();
        String checkUser = User.matchUser(cookies);

        mo.addAttribute("info", checkUser);

        return User.matchSession(request, response, cookies, "/Menu/Top_Service.html");
    }

    @GetMapping("/Service")
    public String Top_service2(HttpServletRequest request,
                               HttpServletResponse response,
                               Model mo) {
        CookieUtill User = new CookieUtill();
        Cookie[] cookies = request.getCookies();
        String checkUser = User.matchUser(cookies);

        mo.addAttribute("info", checkUser);

        return User.matchSession(request, response, cookies, "/Menu/Top_Service.html");
    }

    @GetMapping("/Kind")
    public String Top_kind(HttpServletRequest request,
                           HttpServletResponse response,
                           Model mo) {
        CookieUtill User = new CookieUtill();
        Cookie[] cookies = request.getCookies();
        String checkUser = User.matchUser(cookies);

        mo.addAttribute("info", checkUser);

        return User.matchSession(request, response, cookies, "/Menu/Top_Kind.html");
    }

    @GetMapping("/Infor")
    public String Top_infor(HttpServletRequest request,
                            HttpServletResponse response,
                            Model mo) {
        CookieUtill User = new CookieUtill();
        Cookie[] cookies = request.getCookies();
        String checkUser = User.matchUser(cookies);

        mo.addAttribute("info", checkUser);

        return User.matchSession(request, response, cookies, "/Menu/Top_Infor.html");
    }

    @GetMapping("/Apply")
    public String Top_apply(HttpServletRequest request,
                            HttpServletResponse response,
                            Model mo) {
        CookieUtill User = new CookieUtill();
        Cookie[] cookies = request.getCookies();
        String checkUser = User.matchUser(cookies);

        mo.addAttribute("info", checkUser);

        return User.matchSession(request, response, cookies, "/Menu/Top_Apply.html");
    }

    @GetMapping("/Map")
    public String Top_map(HttpServletRequest request,
                          HttpServletResponse response,
                          Model mo) {
        CookieUtill User = new CookieUtill();
        Cookie[] cookies = request.getCookies();
        String checkUser = User.matchUser(cookies);

        mo.addAttribute("info", checkUser);

        return User.matchSession(request, response, cookies, "/Menu/Top_Map.html");
    }

    @GetMapping("/Electro")
    public String Product_Electro(HttpServletRequest request,
                                  HttpServletResponse response,
                                  Model mo) {
        CookieUtill User = new CookieUtill();
        Cookie[] cookies = request.getCookies();
        String checkUser = User.matchUser(cookies);

        mo.addAttribute("info", checkUser);
        mo.addAttribute("Display", Ma.DisplaySet().get(0));

        return User.matchSession(request, response, cookies, "/Product/Electro.html");
    }

    @GetMapping("/Chain")
    public String Product_Chain(HttpServletRequest request,
                                HttpServletResponse response,
                                Model mo) {
        CookieUtill User = new CookieUtill();
        Cookie[] cookies = request.getCookies();
        String checkUser = User.matchUser(cookies);

        mo.addAttribute("info", checkUser);
        mo.addAttribute("Display", Ma.DisplaySet().get(0));

        return User.matchSession(request, response, cookies, "/Product/Chain.html");
    }

    @GetMapping("/Mtb")
    public String Product_Mtb(HttpServletRequest request,
                              HttpServletResponse response,
                              Model mo) {
        CookieUtill User = new CookieUtill();
        Cookie[] cookies = request.getCookies();
        String checkUser = User.matchUser(cookies);

        mo.addAttribute("info", checkUser);
        mo.addAttribute("Display", Ma.DisplaySet().get(0));

        return User.matchSession(request, response, cookies, "/Product/Mtb.html");
    }

    @GetMapping("/Nomal")
    public String Product_Nomal(HttpServletRequest request,
                                HttpServletResponse response,
                                Model mo) {
        CookieUtill User = new CookieUtill();
        Cookie[] cookies = request.getCookies();
        String checkUser = User.matchUser(cookies);

        mo.addAttribute("info", checkUser);
        mo.addAttribute("Display", Ma.DisplaySet().get(0));

        return User.matchSession(request, response, cookies, "/Product/Nomal.html");
    }

    @GetMapping("/Nokick")
    public String Product_Nokick(HttpServletRequest request,
                                 HttpServletResponse response,
                                 Model mo) {
        CookieUtill User = new CookieUtill();
        Cookie[] cookies = request.getCookies();
        String checkUser = User.matchUser(cookies);

        mo.addAttribute("info", checkUser);
        mo.addAttribute("Display", Ma.DisplaySet().get(0));

        return User.matchSession(request, response, cookies, "/Product/Nokick.html");
    }

    @GetMapping("/Onkick")
    public String Product_Onkick(HttpServletRequest request,
                                 HttpServletResponse response,
                                 Model mo) {
        CookieUtill User = new CookieUtill();
        Cookie[] cookies = request.getCookies();
        String checkUser = User.matchUser(cookies);

        mo.addAttribute("info", checkUser);
        mo.addAttribute("Display", Ma.DisplaySet().get(0));

        return User.matchSession(request, response, cookies, "/Product/Onkick.html");
    }

    @GetMapping("/Nocar")
    public String Product_Nocar(HttpServletRequest request,
                                HttpServletResponse response,
                                Model mo) {
        CookieUtill User = new CookieUtill();
        Cookie[] cookies = request.getCookies();
        String checkUser = User.matchUser(cookies);

        mo.addAttribute("info", checkUser);
        mo.addAttribute("Display", Ma.DisplaySet().get(0));

        return User.matchSession(request, response, cookies, "/Product/Nocar.html");
    }

    @GetMapping("/Oncar")
    public String Product_Oncar(HttpServletRequest request,
                                HttpServletResponse response,
                                Model mo) {
        CookieUtill User = new CookieUtill();
        Cookie[] cookies = request.getCookies();
        String checkUser = User.matchUser(cookies);

        mo.addAttribute("info", checkUser);
        mo.addAttribute("Display", Ma.DisplaySet().get(0));

        return User.matchSession(request, response, cookies, "/Product/Oncar.html");
    }

    @GetMapping("/Free")
    public String menuFree(HttpServletRequest request,
                           HttpServletResponse response,
                           Model mo) {
        CookieUtill User = new CookieUtill();
        Cookie[] cookies = request.getCookies();
        String checkUser = User.matchUser(cookies);

        mo.addAttribute("info", checkUser);

        return User.matchSession(request, response, cookies, "/Menu/Free.html");
    }

    @GetMapping("/Sound")
    public String menuSound(HttpServletRequest request,
                            HttpServletResponse response,
                            Model mo) {
        CookieUtill User = new CookieUtill();
        Cookie[] cookies = request.getCookies();
        String checkUser = User.matchUser(cookies);

        mo.addAttribute("info", checkUser);
        mo.addAttribute("Display", Ma.DisplaySet().get(0));

        return User.matchSession(request, response, cookies, "/Menu/Sound.html");
    }

    @GetMapping("/shopping")
    public String shopping(@RequestParam(name="count") int count,
                           @RequestParam(name="productName") String productName,
                           HttpServletRequest request, HttpServletResponse response,
                           Model mo) {
        CookieUtill User = new CookieUtill();
        Cookie[] cookies = request.getCookies();
        String checkUser = User.matchUser(cookies);

        List<String> All_Data = new ArrayList<>();
        List<String> Data_img = new ArrayList<>();
        int Elect_value = 0;
        int Chain_value = 0;
        int MTB_value = 0;
        int Nomal_value = 0;
        int Nokick_value = 0;
        int Onkick_value = 0;
        int Nocar_value = 0;
        int Oncar_value = 0;

        switch (productName) {
            case "chain":
                Chain_value += count;
                All_Data.add("체인리스 자전거");
                Data_img.add("체인리스 자전거.jpg");
                break;
            case "electro":
                Elect_value += count;
                All_Data.add("전기 자전거");
                Data_img.add("전기 자전거.jpg");
                break;
            case "mtb":
                MTB_value += count;
                All_Data.add("MTB");
                Data_img.add("MTB.jpg");
                break;
            case "nomal":
                Nomal_value += count;
                All_Data.add("일반 자전거");
                Data_img.add("일반 자전거.jpg");
                break;
            case "nokick":
                Nokick_value += count;
                All_Data.add("[의자X] 전동 킥보드");
                Data_img.add("전동킥보드1.jpg");
                break;
            case "onkick":
                Onkick_value += count;
                All_Data.add("[의자O] 전동 킥보드");
                Data_img.add("전동킥보드2.jpg");
                break;
            case "nocar":
                Nocar_value += count;
                All_Data.add("[손잡이X] 전동 이륜평행차");
                Data_img.add("전동 이륜평행차2.png");
                break;
            case "oncar":
                Oncar_value += count;
                All_Data.add("[손잡이O] 전동 이륜평행차");
                Data_img.add("전동 이륜평행차1.png");
                break;
        }
        All_Data.add(Integer.toString(count));
        
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals("Bask_ELECT") && !productName.equals("electro")) {
                Elect_value += Integer.parseInt(cookie.getValue());
                if (Elect_value != 0) {
                    All_Data.add("전기 자전거");
                    Data_img.add("전기 자전거.jpg");
                    All_Data.add(Integer.toString(Elect_value));
                }
            }
            if (cookie.getName().equals("Bask_CHAIN") && !productName.equals("chain")) {
                Chain_value += Integer.parseInt(cookie.getValue());
                if (Chain_value != 0) {
                    All_Data.add("체인리스 자전거");
                    Data_img.add("체인리스 자전거.jpg");
                    All_Data.add(Integer.toString(Chain_value));
                }
            }
            if (cookie.getName().equals("Bask_MTB") && !productName.equals("mtb")) {
                MTB_value += Integer.parseInt(cookie.getValue());
                if (MTB_value != 0) {
                    All_Data.add("MTB");
                    Data_img.add("MTB.jpg");
                    All_Data.add(Integer.toString(MTB_value));
                }
            }
            if (cookie.getName().equals("Bask_NOMAL") && !productName.equals("nomal")) {
                Nomal_value += Integer.parseInt(cookie.getValue());
                if (Nomal_value != 0) {
                    All_Data.add("일반 자전거");
                    Data_img.add("일반 자전거.jpg");
                    All_Data.add(Integer.toString(Nomal_value));
                }
            }
            if (cookie.getName().equals("Bask_NOKICK") && !productName.equals("nokick")) {
                Nokick_value += Integer.parseInt(cookie.getValue());
                if (Nokick_value != 0) {
                    All_Data.add("[의자X] 전동 킥보드");
                    Data_img.add("전동킥보드1.jpg");
                    All_Data.add(Integer.toString(Nokick_value));
                }
            }
            if (cookie.getName().equals("Bask_ONKICK") && !productName.equals("onkick")) {
                Onkick_value += Integer.parseInt(cookie.getValue());
                if (Onkick_value != 0) {
                    All_Data.add("[의자O] 전동 킥보드");
                    Data_img.add("전동킥보드2.jpg");
                    All_Data.add(Integer.toString(Onkick_value));
                }
            }
            if (cookie.getName().equals("Bask_NOCAR") && !productName.equals("nocar")) {
                Nocar_value += Integer.parseInt(cookie.getValue());
                if (Nocar_value != 0) {
                    All_Data.add("[손잡이X] 전동 이륜평행차");
                    Data_img.add("전동 이륜평행차2.png");
                    All_Data.add(Integer.toString(Nocar_value));
                }
            }
            if (cookie.getName().equals("Bask_ONCAR") && !productName.equals("oncar")) {
                Oncar_value += Integer.parseInt(cookie.getValue());
                if (Oncar_value != 0) {
                    All_Data.add("[손잡이O] 전동 이륜평행차");
                    Data_img.add("전동 이륜평행차1.png");
                    All_Data.add(Integer.toString(Oncar_value));
                }
            }
        }

        mo.addAttribute("info", checkUser);
        mo.addAttribute("Display", Ma.DisplaySet().get(0));
        mo.addAttribute("data", All_Data);
        mo.addAttribute("img", Data_img);

        return User.matchSession(request, response, cookies, "/Product/Buy.html");
    }

    @GetMapping("/elect_basket")
    public String electbasket(@RequestParam(name="count") int count,
                              HttpServletRequest request,
                              HttpServletResponse response,
                              Model mo) {
        CookieUtill cookieUtill = new CookieUtill();
        Cookie[] cookies = request.getCookies();
        String checkUser = cookieUtill.matchUser(cookies);

        mo.addAttribute("info", checkUser);
        mo.addAttribute("Display", Ma.DisplaySet().get(0));

        String cookieName = "Bask_ELECT";
        int basketCount = cookieUtill.getBasketCount(request.getCookies(), cookieName);
        Cookie ID_Cookie = new Cookie(cookieName, String.valueOf(count + basketCount));

        ID_Cookie.setMaxAge(10000);
        response.addCookie(ID_Cookie);

        return cookieUtill.matchSession(request, response, cookies, "/Product/Electro.html");
    }

    @GetMapping("/chain_basket")
    public String chainbasket(@RequestParam int count,
                              HttpServletRequest request,
                              HttpServletResponse response,
                              Model mo) {
        CookieUtill cookieUtill = new CookieUtill();
        Cookie[] cookies = request.getCookies();
        String checkUser = cookieUtill.matchUser(cookies);

        mo.addAttribute("info", checkUser);
        mo.addAttribute("Display", Ma.DisplaySet().get(0));

        String cookieName = "Bask_CHAIN";
        int basketCount = cookieUtill.getBasketCount(request.getCookies(), cookieName);
        Cookie ID_Cookie = new Cookie(cookieName, String.valueOf(count + basketCount));
        ID_Cookie.setMaxAge(10000);
        response.addCookie(ID_Cookie);

        return cookieUtill.matchSession(request, response, cookies, "/Product/Chain.html");
    }

    @GetMapping("/mtb_basket")
    public String mtbbasket(@RequestParam int count,
                            HttpServletRequest request,
                            HttpServletResponse response,
                            Model mo) {
        CookieUtill cookieUtill = new CookieUtill();
        Cookie[] cookies = request.getCookies();
        String checkUser = cookieUtill.matchUser(cookies);

        mo.addAttribute("info", checkUser);
        mo.addAttribute("Display", Ma.DisplaySet().get(0));

        String cookieName = "Bask_MTB";
        int basketCount = cookieUtill.getBasketCount(request.getCookies(), cookieName);
        Cookie ID_Cookie = new Cookie(cookieName, String.valueOf(count + basketCount));
        ID_Cookie.setMaxAge(10000);
        response.addCookie(ID_Cookie);

        return cookieUtill.matchSession(request, response, cookies, "/Product/Mtb.html");
    }

    @GetMapping("/nomal_basket")
    public String nomalbasket(@RequestParam int count,
                              HttpServletRequest request,
                              HttpServletResponse response,
                              Model mo) {
        CookieUtill cookieUtill = new CookieUtill();
        Cookie[] cookies = request.getCookies();
        String checkUser = cookieUtill.matchUser(cookies);

        mo.addAttribute("info", checkUser);
        mo.addAttribute("Display", Ma.DisplaySet().get(0));

        String cookieName = "Bask_NOMAL";
        int basketCount = cookieUtill.getBasketCount(request.getCookies(), cookieName);
        Cookie ID_Cookie = new Cookie(cookieName, String.valueOf(count + basketCount));
        ID_Cookie.setMaxAge(10000);
        response.addCookie(ID_Cookie);

        return cookieUtill.matchSession(request, response, cookies, "/Product/Nomal.html");
    }

    @GetMapping("/nokick_basket")
    public String nokickbasket(@RequestParam int count,
                               HttpServletRequest request,
                               HttpServletResponse response,
                               Model mo) {
        CookieUtill cookieUtill = new CookieUtill();
        Cookie[] cookies = request.getCookies();
        String checkUser = cookieUtill.matchUser(cookies);

        mo.addAttribute("info", checkUser);
        mo.addAttribute("Display", Ma.DisplaySet().get(0));

        String cookieName = "Bask_NOKICK";
        int basketCount = cookieUtill.getBasketCount(request.getCookies(), cookieName);
        Cookie ID_Cookie = new Cookie(cookieName, String.valueOf(count + basketCount));
        ID_Cookie.setMaxAge(10000);
        response.addCookie(ID_Cookie);

        return cookieUtill.matchSession(request, response, cookies, "/Product/Nokick.html");
    }

    @GetMapping("/onkick_basket")
    public String onkickbasket(@RequestParam int count,
                               HttpServletRequest request,
                               HttpServletResponse response,
                               Model mo) {
        CookieUtill cookieUtill = new CookieUtill();
        Cookie[] cookies = request.getCookies();
        String checkUser = cookieUtill.matchUser(cookies);

        mo.addAttribute("info", checkUser);
        mo.addAttribute("Display", Ma.DisplaySet().get(0));

        String cookieName = "Bask_ONKICK";
        int basketCount = cookieUtill.getBasketCount(request.getCookies(), cookieName);
        Cookie ID_Cookie = new Cookie(cookieName, String.valueOf(count + basketCount));
        ID_Cookie.setMaxAge(10000);
        response.addCookie(ID_Cookie);

        return cookieUtill.matchSession(request, response, cookies, "/Product/Nocar.html");
    }

    @GetMapping("/nocar_basket")
    public String nocarbasket(@RequestParam int count,
                              HttpServletRequest request,
                              HttpServletResponse response,
                              Model mo) {
        CookieUtill cookieUtill = new CookieUtill();
        Cookie[] cookies = request.getCookies();
        String checkUser = cookieUtill.matchUser(cookies);

        mo.addAttribute("info", checkUser);
        mo.addAttribute("Display", Ma.DisplaySet().get(0));

        String cookieName = "Bask_NOCAR";
        int basketCount = cookieUtill.getBasketCount(request.getCookies(), cookieName);
        Cookie ID_Cookie = new Cookie(cookieName, String.valueOf(count + basketCount));
        ID_Cookie.setMaxAge(10000);
        response.addCookie(ID_Cookie);

        return cookieUtill.matchSession(request, response, cookies, "/Product/Nocar.html");
    }

    @GetMapping("/oncar_basket")
    public String oncarbasket(@RequestParam int count,
                              HttpServletRequest request,
                              HttpServletResponse response,
                              Model mo) {

        CookieUtill cookieUtill = new CookieUtill();
        Cookie[] cookies = request.getCookies();
        String checkUser = cookieUtill.matchUser(cookies);

        mo.addAttribute("info", checkUser);
        mo.addAttribute("Display", Ma.DisplaySet().get(0));

        String cookieName = "Bask_ONCAR";
        int basketCount = cookieUtill.getBasketCount(request.getCookies(), cookieName);
        Cookie ID_Cookie = new Cookie(cookieName, String.valueOf(count + basketCount));
        ID_Cookie.setMaxAge(10000);
        response.addCookie(ID_Cookie);

        return cookieUtill.matchSession(request, response, cookies, "/Product/Oncar.html");
    }

    @PostMapping("/Thanks")
    public String payTothanks(HttpServletRequest request,
                              HttpServletResponse response,
                              Model mo,
                              @RequestParam("productName") List<String> productNames,
                              @RequestParam("productOrderCount") List<Integer> productOrderCounts) {
        CookieUtill User = new CookieUtill();
        Cookie[] cookies = request.getCookies();
        String checkUser = User.matchUser(cookies);
        mo.addAttribute("info", checkUser);
        AdminDB productInfo = Ma.DisplaySet().get(0);
        
        List<ProductOrder> orders = new ArrayList<>();
        
        for (int i = 0; i < productNames.size(); i++) {
            orders.add(new ProductOrder(productNames.get(i), productOrderCounts.get(i)));
        }
        for (ProductOrder order : orders) {
            if("전기 자전거".equals(order.getProductName())) {
                Ma.updateElect(String.valueOf(Integer.parseInt(productInfo.getElect()) - order.getProductOrderCount()));
            } else if ("체인리스 전기 자전거".equals(order.getProductName())) {
                Ma.updateChain(String.valueOf(Integer.parseInt(productInfo.getChain()) - order.getProductOrderCount()));
            } else if ("MTB".equals(order.getProductName())) {
                Ma.updateMtb(String.valueOf(Integer.parseInt(productInfo.getMtb()) - order.getProductOrderCount()));
            } else if ("일반 자전거".equals(order.getProductName())) {
                Ma.updateNomal(String.valueOf(Integer.parseInt(productInfo.getNomal()) - order.getProductOrderCount()));
            } else if ("전동 킥보드[의자 X]".equals(order.getProductName())) {
                Ma.updateNokick(String.valueOf(Integer.parseInt(productInfo.getNokick()) - order.getProductOrderCount()));
            } else if ("전동 킥보드[의자 O]".equals(order.getProductName())) {
                Ma.updateOnkick(String.valueOf(Integer.parseInt(productInfo.getOnkick()) - order.getProductOrderCount()));
            } else if ("전동 이륜평행차[손잡이 X]".equals(order.getProductName())) {
                Ma.updateNocar(String.valueOf(Integer.parseInt(productInfo.getNocar()) - order.getProductOrderCount()));
            } else if ("전동 이륜평행차[손잡이 O]".equals(order.getProductName())) {
                Ma.updateOncar(String.valueOf(Integer.parseInt(productInfo.getOncar()) - order.getProductOrderCount()));
            }
        }
        return User.matchSession(request, response, cookies, "/Product/Thanks.html");
    }
    
    @GetMapping("/community")
    public String Commu(HttpServletRequest request,
                        HttpServletResponse response,
                        Model mo) {
        CookieUtill User = new CookieUtill();
        Cookie[] cookies = request.getCookies();
        String checkUser = User.matchUser(cookies);
        List<textDB> li = Ma.communityText();

        mo.addAttribute("info", checkUser);
        mo.addAttribute("titles", li);

        return User.matchSession(request, response, cookies, "/Menu/Community.html");
    }

    @GetMapping("/communityText")
    public String CommuText(HttpServletRequest request,
                            HttpServletResponse response,
                            Model mo) {
        CookieUtill User = new CookieUtill();
        Cookie[] cookies = request.getCookies();
        String checkUser = User.matchUser(cookies);
        mo.addAttribute("info", checkUser);

        return User.matchSession(request, response, cookies, "/Menu/CommunityText.html");
    }

    @GetMapping("/communitySend")
    public String userSend(HttpServletRequest request,
                           HttpServletResponse response,
                           @RequestParam(required = false, name = "userTitle") String userTitle,
                           @RequestParam(required = false, name = "userStory") String userStory,
                           Model mo) {
        CookieUtill User = new CookieUtill();
        Cookie[] cookies = request.getCookies();
        String userName = User.matchUser(cookies);
        Date currentDate = new Date();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String userDate = df.format(currentDate);

        mo.addAttribute("info", userName);

        Ma.userNotice(userName, userTitle, userStory, userDate);

        return User.matchSession(request, response, cookies, "/Menu/Commit.html");
    }

    @GetMapping("/CommunityDB{serial}")
    public String commuDB(@RequestParam(required = false, name = "serial") String userSerial,
                          HttpServletRequest request,
                          HttpServletResponse response,
                          Model mo) {
    	System.out.print(userSerial);
        CookieUtill User = new CookieUtill();
        Cookie[] cookies = request.getCookies();
        String checkUser = User.matchUser(cookies);
        List<textDB> li = Ma.userText(userSerial);

        mo.addAttribute("storys", li);
        mo.addAttribute("info", checkUser);

        return User.matchSession(request, response, cookies, "/Menu/CommunityDB.html");
    }
}
