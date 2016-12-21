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
@IdClass(value = PropertyNamePK.class)
public class PropertyName implements Serializable
{

    @Id
    private Integer sourceProperty;
    @Id
    @Column(name = "localeLanguage", columnDefinition = "char(5)")
    private String localeLanguage;
    @Column(name = "name", nullable = false, insertable = false, updatable = false)
    private String name;

    public Integer getSourceProperty()
    {
        return sourceProperty;
    }

// setters and getters
    public void setSourceProperty(Integer sourceProperty)
    {
        this.sourceProperty = sourceProperty;
    }

    public String getLocaleLanguage()
    {
        return localeLanguage;
    }

    public void setLocalLanguage(String localLanguage)
    {
        this.localeLanguage = localLanguage;
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
