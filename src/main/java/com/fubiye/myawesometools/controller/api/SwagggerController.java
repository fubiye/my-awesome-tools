package com.fubiye.myawesometools.controller.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/apis")
public class SwagggerController {

    @RequestMapping("")
    public String apis(){
        return "redirect:/swagger-ui.html";
    }

}
