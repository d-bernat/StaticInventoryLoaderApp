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
public class ProvinceNamePK implements Serializable
{
    private String sourceCountry;
    private String sourceProvince;
    private String localeLanguage;

    public ProvinceNamePK()
    {

    }

    @Override
    public int hashCode()
    {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.sourceCountry);
        hash = 29 * hash + Objects.hashCode(this.sourceProvince);
        hash = 29 * hash + Objects.hashCode(this.localeLanguage);
        return hash;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj instanceof PropertyNamePK)
        {
            PropertyNamePK pk = (PropertyNamePK) obj;

            if (!pk.getLocaleLanguage().equals(localeLanguage))
            {
                return false;
            }

            if (!pk.getLocaleLanguage().equals(sourceProvince))
            {
                return false;
            }
            
            return pk.getSourceProperty().equals(localeLanguage);
        }

        return false;
    }

    public String getSourceCountry()
    {
        return sourceCountry;
    }

    public void setSourceCountry(String sourceCountry)
    {
        this.sourceCountry = sourceCountry;
    }

    public String getSourceProvince()
    {
        return sourceProvince;
    }

    public void setSourceProvince(String sourceProvince)
    {
        this.sourceProvince = sourceProvince;
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
