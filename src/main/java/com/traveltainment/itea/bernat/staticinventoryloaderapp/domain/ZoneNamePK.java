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
public class ZoneNamePK implements Serializable
{
    private Integer sourceLocation;
    private Integer sourceZone;
    private String  localeLanguage;

    public ZoneNamePK()
    {

    }

    @Override
    public int hashCode()
    {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.sourceLocation);
        hash = 29 * hash + Objects.hashCode(this.sourceZone);
        hash = 29 * hash + Objects.hashCode(this.localeLanguage);
        return hash;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj instanceof ZoneNamePK)
        {
            ZoneNamePK pk = (ZoneNamePK) obj;

            if (!pk.getSourceLocation().equals(sourceLocation))
            {
                return false;
            }

            if (!pk.getSourceZone().equals(sourceZone))
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

    public Integer getSourceZone()
    {
        return sourceZone;
    }

    public void setSourceZone(Integer sourceZone)
    {
        this.sourceZone = sourceZone;
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

