package guru.springframework.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({"", "/", "/index", "/index.html"})
    public String getIndexPage(){
        System.out.println("Ovo radi jako, jako dobro");
        return "index";
    }

}

