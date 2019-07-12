package com.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/showForm")
    public String showForm(Model theModel){
        User user = new User();
        theModel.addAttribute("user",user);

        return "user-form";
    }
    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute("user") User theUser){
        System.out.println("the user : " + theUser.getFirstName()+ "  " + theUser.getLastName()
                            + " " + theUser.getLanguage());

        return "user-result";
    }

}
