package com.ityan.web;
import com.ityan.pojo.Hero;
import com.ityan.service.HeroService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.jws.WebParam;
import java.util.List;

@Controller
@Slf4j
public class MyController {
    //private static final Logger log = LoggerFactory.getLogger(MyController.class);
    @Autowired
    private HeroService heroService;

    @RequestMapping("/hello")
    public String hello(Model model){
        log.debug("hello info log-debug");
       log.info("hello info log-info");
       log.info("hello info log-info");
        List<Hero> allHero = heroService.getAllHero();
        System.out.println(allHero);

        Hero hero = new Hero();
        hero.setCust_name("ityan");
        hero.setCust_phone("123425345");
        hero.setEmail("123515@123.com");
        model.addAttribute("hero",hero);

        model.addAttribute("name","ityan");
        return "MyHello";
    }
}
