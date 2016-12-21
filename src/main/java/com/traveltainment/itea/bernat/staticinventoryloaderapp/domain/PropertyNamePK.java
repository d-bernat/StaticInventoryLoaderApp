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
public class PropertyNamePK implements Serializable
{
    private Integer sourceProperty;
    private String localeLanguage;

    public PropertyNamePK()
    {

    }

    @Override
    public int hashCode()
    {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.sourceProperty);
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

            return pk.getSourceProperty().equals(sourceProperty);
        }

        return false;
    }

    public Integer getSourceProperty()
    {
        return sourceProperty;
    }

    public void setSourceProperty(Integer sourceProperty)
    {
        this.sourceProperty = sourceProperty;
    }

    public String getLocaleLanguage()
    {
        return localeLanguage;
    }

    public void setLocaleLanguage(String localLanguage)
    {
        this.localeLanguage = localLanguage;
    }
}
