/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sankar.SpringData;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author girija
 */
//@Document(collection = "domain")
@Entity
//@ConfigurationProperties(prefix="spring.secondDatasource")
public class Domain {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

//    @Indexed(unique = true)
    @Column
    private String domain;
    @Column
    private boolean displayAds;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public boolean isDisplayAds() {
        return displayAds;
    }

    public void setDisplayAds(boolean displayAds) {
        this.displayAds = displayAds;
    }

    @Override
    public String toString() {
        return "Domain{" + "id=" + id + ", domain=" + domain + ", displayAds=" + displayAds + '}';
    }

}
