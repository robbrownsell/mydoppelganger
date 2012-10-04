/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mydoppelganger.service;

import com.mydoppelganger.dao.ProfileDAOInterface;
import com.mydoppelganger.model.Profile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Rob
 */
@Service
public class ProfileService {

    @Autowired
    private ProfileDAOInterface profileDao;

    public Profile loadProfile(String username) {
        return profileDao.findByUsername(username);
    }

    public void createProfile(Profile profile) {
        profile.getProfileUser().setProfile(profile);
        profileDao.persist(profile);
    }
}
