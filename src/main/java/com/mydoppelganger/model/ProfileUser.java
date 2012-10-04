/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mydoppelganger.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 *
 * @author rjb41
 */
@Entity
@Table(name = "PROFILE_USER")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProfileUser.findAll", query = "SELECT p FROM ProfileUser p"),
    @NamedQuery(name = "ProfileUser.findByProfileId", query = "SELECT p FROM ProfileUser p WHERE p.profileId = :profileId"),
    @NamedQuery(name = "ProfileUser.findByUsername", query = "SELECT p FROM ProfileUser p WHERE p.username = :username"),
    @NamedQuery(name = "ProfileUser.findByPassword", query = "SELECT p FROM ProfileUser p WHERE p.password = :password")})
public class ProfileUser implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id @GeneratedValue(generator="foreign")
    @GenericGenerator(name="foreign", strategy = "foreign", parameters={ @Parameter(name="property", value="profile") })
    @Basic(optional = false)
    @Column(name = "PROFILE_ID")
    private Long profileId;
    @NotNull
    @Size(min=6)
    @Column(name = "USERNAME")
    private String username;
    @NotNull
    @Size(min=6)
    @Column(name = "PASSWORD")
    private String password;
    @JoinColumn(name = "PROFILE_ID", referencedColumnName = "ID", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Profile profile;

    public ProfileUser() {
    }

    public ProfileUser(Long profileId) {
        this.profileId = profileId;
    }

    public Long getProfileId() {
        return profileId;
    }

    public void setProfileId(Long profileId) {
        this.profileId = profileId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (profileId != null ? profileId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProfileUser)) {
            return false;
        }
        ProfileUser other = (ProfileUser) object;
        if ((this.profileId == null && other.profileId != null) || (this.profileId != null && !this.profileId.equals(other.profileId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mydoppelganger.model.ProfileUser[ profileId=" + profileId + " ]";
    }
    
}
