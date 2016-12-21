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
public class LocationNamePK implements Serializable
{
    private Integer sourceLocation;
    private String localeLanguage;

    public LocationNamePK()
    {

    }

    @Override
    public int hashCode()
    {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.sourceLocation);
        hash = 29 * hash + Objects.hashCode(this.localeLanguage);
        return hash;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj instanceof LocationNamePK)
        {
            LocationNamePK pk = (LocationNamePK) obj;

            if (!pk.getSourceLocation().equals(sourceLocation))
            {
                return false;
            }

            return pk.getLocaleLanguage().equals(localeLanguage);
        }

        return false;
    }

    public Integer getSourceLocation()
    {
        return sourceLocation;
    }

    public void setSourceLocation(Integer sourceLocation)
    {
        this.sourceLocation = sourceLocation;
    }

    public String getLocaleLanguage()
    {
        return localeLanguage;
    }

    public void setLocaleLanguage(String localeLanguage)
    {
        this.localeLanguage = localeLanguage;
    }


}
