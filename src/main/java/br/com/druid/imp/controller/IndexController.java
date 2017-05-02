package br.com.druid.imp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/upload")
    public String index() {
    	System.out.println("Agora vai");
        return "upload";
    }

}