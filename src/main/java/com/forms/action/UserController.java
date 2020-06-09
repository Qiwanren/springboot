package com.forms.action;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/index")
    public ModelAndView index(){

        ModelAndView mv = new ModelAndView("index");

        return mv;
    }

}
