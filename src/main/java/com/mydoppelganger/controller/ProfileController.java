/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mydoppelganger.controller;

import com.mydoppelganger.model.Profile;
import com.mydoppelganger.service.ProfileService;
import java.security.Principal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Rob
 */
@Controller
@RequestMapping("/profile")
public class ProfileController {

    @Autowired
    private ProfileService profileService;

   @RequestMapping(value="/showProfile")
    public ModelAndView showProfile(Principal principal) {
        String name = principal.getName();
        Profile profile = profileService.loadProfile(name);
        ModelAndView mv = new ModelAndView("showProfile");
        mv.addObject("profile", profile);
        
        return mv;
    }



    public ProfileService getProfileService() {
        return profileService;
    }

    public void setProfileService(ProfileService profileService) {
        this.profileService = profileService;
    }
}
