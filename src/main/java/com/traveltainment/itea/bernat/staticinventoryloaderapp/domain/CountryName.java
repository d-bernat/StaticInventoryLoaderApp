/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.traveltainment.itea.bernat.staticinventoryloaderapp.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

/**
 *
 * @author Bernat
 */
@Entity
@Table
@IdClass(value = CountryNamePK.class)
public class CountryName
{
    @Id
    @Column(columnDefinition = "char(2)")
    private String sourceCountry;

    @Id
    @Column(columnDefinition = "char(5)")
    private String localeLanguage;
    
    @Column(columnDefinition = "varchar(128)")
    private String name;

    public String getSourceCountry()
    {
        return sourceCountry;
    }

    public void setSourceCountry(String sourceCountry)
    {
        this.sourceCountry = sourceCountry;
    }

    public String getLocaleLanguage()
    {
        return localeLanguage;
    }

    public void setLocaleLanguage(String localeLanguage)
    {
        this.localeLanguage = localeLanguage;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    
}
