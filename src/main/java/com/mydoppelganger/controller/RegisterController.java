/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mydoppelganger.controller;

import com.mydoppelganger.model.Profile;
import com.mydoppelganger.service.ProfileService;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author rjb41
 */
@Controller
@RequestMapping("/register")
public class RegisterController {

    @Autowired
    private ProfileService profileService;

    @RequestMapping//(method = RequestMethod.GET)
    public String setupForm(ModelMap model) {
        model.put("profile", new Profile());

        return "registerProfile";
    }

    @RequestMapping(value = "/submitProfile", method = RequestMethod.POST)
    public ModelAndView submitDetails(@Valid Profile profile, BindingResult result) {
        String nextPage = "showProfile";
        if(result.hasErrors()) {
            nextPage = "registerProfile";
            
        } else {
            profileService.createProfile(profile);
        }
        ModelAndView mv = new ModelAndView(nextPage);
        mv.addObject("profile", profile);
        return mv;
    }
}
