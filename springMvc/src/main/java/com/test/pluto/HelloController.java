package com.test.pluto;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("")

public class HelloController {
    @RequestMapping(method= RequestMethod.GET)
    public String printHello(ModelMap model){
        model.addAttribute("message","hello spring mvc");
        return "hello";
    }
}
