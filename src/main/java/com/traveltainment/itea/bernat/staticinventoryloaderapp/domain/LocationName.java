/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.traveltainment.itea.bernat.staticinventoryloaderapp.domain;

import java.io.Serializable;
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
@IdClass(value = LocationNamePK.class)
public class LocationName implements Serializable
{
    @Id
    private Integer sourceLocation;
    
    @Id
    @Column(columnDefinition = "char(5)")
    private String localeLanguage;
    
    @Column(columnDefinition = "varchar(128)")
    private String name;

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

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    
}
