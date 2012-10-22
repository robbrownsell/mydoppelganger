/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mydoppelganger.controller;
// Hello
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Rob
 */
@Controller
public class LoginController {

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView login(ModelMap model) {

        return new ModelAndView("login");

    }

    @RequestMapping(value = "/loginfailed")
    public String loginerror(ModelMap model) {

        model.addAttribute("error", "true");
        return "login";

    }

    @RequestMapping(value = "/logout")
    public String logout(ModelMap model) {

        return "login";

    }
}
