/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mydoppelganger.service;

import com.mydoppelganger.dao.ProfileDAOInterface;
import com.mydoppelganger.model.Profile;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.GrantedAuthorityImpl;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 *
 * @author Rob
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private ProfileDAOInterface profileDao;

    @Transactional(readOnly = true)
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException, DataAccessException {
        Profile profile = profileDao.findByUsername(username);
        User user = null;
        if (profile != null && profile.getProfileUser() != null) {
            String password = profile.getProfileUser().getPassword();
            List<GrantedAuthority> authorisation = new ArrayList<GrantedAuthority>();
            authorisation.add(new GrantedAuthorityImpl("ROLE_USER"));
            user = new User(username, password, true, true, true, true, authorisation);
        } else {
            throw new UsernameNotFoundException("user not found");

        }

        return user;
    }
}
