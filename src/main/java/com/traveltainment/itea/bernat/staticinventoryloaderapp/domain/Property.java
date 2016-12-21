/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.traveltainment.itea.bernat.staticinventoryloaderapp.domain;

//import com.vividsolutions.jts.geom.Geometry;
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
@Table(name = "PropertyView")
public class Property implements Serializable
{
    @Id
    private Integer id;

    @Column(name = "type", columnDefinition = "char(20)", nullable = false, insertable = false, updatable = false)
    private String type;

    @Column(name = "source", columnDefinition = "enum('editorial','automatching')")
    private String source;

    @Column(name = "location", nullable = false, insertable = false, updatable = false)
    private Integer location;

    @Column(name = "zone", nullable = false, insertable = false, updatable = false)
    private Integer zone;

    @Column(name = "standardCategory", columnDefinition = "char(2)", nullable = true, insertable = false, updatable = false)
    private String standardCategory;

    @Column(name = "geoLocationX", columnDefinition = "double")
    private Double geoLocationX;

    @Column(name = "geoLocationY", columnDefinition = "double")
    private Double geoLocationY;

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public String getSource()
    {
        return source;
    }

    public void setSource(String source)
    {
        this.source = source;
    }

    public Integer getLocation()
    {
        return location;
    }

    public void setLocation(Integer location)
    {
        this.location = location;
    }

    public Integer getZone()
    {
        return zone;
    }

    public void setZone(Integer zone)
    {
        this.zone = zone;
    }

    public String getStandardCategory()
    {
        return standardCategory;
    }

    public void setStandardCategory(String standardCategory)
    {
        this.standardCategory = standardCategory;
    }

    public Double getGeoLocationX()
    {
        return geoLocationX;
    }

    public void setGeoLocationX(Double geoLocationX)
    {
        this.geoLocationX = geoLocationX;
    }

    public Double getGeoLocationY()
    {
        return geoLocationY;
    }

    public void setGeoLocationY(Double geoLocationY)
    {
        this.geoLocationY = geoLocationY;
    }
    

}
