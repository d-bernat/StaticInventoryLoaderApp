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
import javax.persistence.Table;

/**
 *
 * @author Bernat
 */
@Entity
@Table
public class OrderedPropertyNameDEView implements Serializable
{
    @Id
    private Integer sourceProperty;
    
    @Column(columnDefinition = "varchar(128)")
    private String name;

    public Integer getSourceProperty()
    {
        return sourceProperty;
    }

    public void setSourceProperty(Integer sourceProperty)
    {
        this.sourceProperty = sourceProperty;
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
