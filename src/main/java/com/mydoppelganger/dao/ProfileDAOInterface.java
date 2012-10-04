/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mydoppelganger.dao;

import com.mydoppelganger.model.Profile;

/**
 *
 * @author Rob
 */
public interface ProfileDAOInterface extends DAOInterface {
    
    public void persist(Profile profile);
    public Profile findByUsername(String username);
    
}
