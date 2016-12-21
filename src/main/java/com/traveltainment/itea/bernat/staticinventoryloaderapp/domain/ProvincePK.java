/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.traveltainment.itea.bernat.staticinventoryloaderapp.domain;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Bernat
 */
public class ProvincePK implements Serializable
{
    private String country;
    private String id;

    public ProvincePK()
    {

    }

    @Override
    public int hashCode()
    {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.country);
        hash = 29 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj instanceof ProvincePK)
        {
            ProvincePK pk = (ProvincePK) obj;

            if (!pk.getCountry().equals(country))
            {
                return false;
            }

            return pk.getId().equals(id);
        }

        return false;
    }

    public String getCountry()
    {
        return country;
    }

    public void setCountry(String country)
    {
        this.country = country;
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }


    
}
