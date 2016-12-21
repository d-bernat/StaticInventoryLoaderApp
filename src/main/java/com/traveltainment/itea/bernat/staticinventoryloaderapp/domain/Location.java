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
@Table(name = "LocationView")
public class Location implements Serializable
{
    @Id
    private Integer id;
    
    @Column(name = "iata", columnDefinition = "char(3)", nullable = true)
    private String iata;
    
    @Column(name = "type", columnDefinition = "enum('city','location', 'lake', 'beach', 'isle', 'natur_park', 'town','village', 'suburb', 'metropilis', 'unknown', 'd_cruise', 'd_fly_drive', 'd_fly_stay', 'd_roulette','d_tour', 'd_backpacker', 'd_cruise_hotel', 'd_others')")
    private String type;
    
    @Column(name = "region", nullable = false, insertable = false, updatable = false)
    private Integer region;

    @Column(name = "area", nullable = false, insertable = false, updatable = false)
    private Integer area;

    @Column(name = "country", columnDefinition = "char(2)",nullable = false, insertable = false, updatable = false)
    private String country;
    
    @Column(name = "province", columnDefinition = "varchar(3)",nullable = false, insertable = false, updatable = false)
    private String province;

    @Column(name = "localTime", columnDefinition = "char(30)",nullable = false, insertable = false, updatable = false)
    private String localTime;
    
    @Column(name = "geoAreaX1", columnDefinition = "double")
    private Double geoAreaX1;

    @Column(name = "geoAreaY1", columnDefinition = "double")
    private Double geoAreaY1;

    @Column(name = "geoAreaX2", columnDefinition = "double")
    private Double geoAreaX2;

    @Column(name = "geoAreaY2", columnDefinition = "double")
    private Double geoAreaY2;
    
    @Column(name = "geoCentroidX", columnDefinition = "double")
    private Double geoCentroidX;

    @Column(name = "geoCentroidY", columnDefinition = "double")
    private Double geoCentroidY;
    
    @Column(name = "source", columnDefinition = "enum('editorial','automatching')")
    private String source;

    @Column(name = "contentReference", columnDefinition = "varchar(15)",nullable = false, insertable = false, updatable = false)
    private String contentReference;

    @Column(nullable = true, insertable = false, updatable = false)
    private Integer referenceLocation;

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public String getIata()
    {
        return iata;
    }

    public void setIata(String iata)
    {
        this.iata = iata;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public Integer getRegion()
    {
        return region;
    }

    public void setRegion(Integer region)
    {
        this.region = region;
    }

    public Integer getArea()
    {
        return area;
    }

    public void setArea(Integer area)
    {
        this.area = area;
    }

    public String getCountry()
    {
        return country;
    }

    public void setCountry(String country)
    {
        this.country = country;
    }

    public String getProvince()
    {
        return province;
    }

    public void setProvince(String province)
    {
        this.province = province;
    }

    public String getLocalTime()
    {
        return localTime;
    }

    public void setLocalTime(String localTime)
    {
        this.localTime = localTime;
    }

    public Double getGeoAreaX1()
    {
        return geoAreaX1;
    }

    public void setGeoAreaX1(Double geoAreaX1)
    {
        this.geoAreaX1 = geoAreaX1;
    }

    public Double getGeoAreaY1()
    {
        return geoAreaY1;
    }

    public void setGeoAreaY1(Double geoAreaY1)
    {
        this.geoAreaY1 = geoAreaY1;
    }

    public Double getGeoAreaX2()
    {
        return geoAreaX2;
    }

    public void setGeoAreaX2(Double geoAreaX2)
    {
        this.geoAreaX2 = geoAreaX2;
    }

    public Double getGeoAreaY2()
    {
        return geoAreaY2;
    }

    public void setGeoAreaY2(Double geoAreaY2)
    {
        this.geoAreaY2 = geoAreaY2;
    }

    public Double getGeoCentroidX()
    {
        return geoCentroidX;
    }

    public void setGeoCentroidX(Double geoCentroidX)
    {
        this.geoCentroidX = geoCentroidX;
    }

    public Double getGeoCentroidY()
    {
        return geoCentroidY;
    }

    public void setGeoCentroidY(Double geoCentroidY)
    {
        this.geoCentroidY = geoCentroidY;
    }

    public String getSource()
    {
        return source;
    }

    public void setSource(String source)
    {
        this.source = source;
    }

    public String getContentReference()
    {
        return contentReference;
    }

    public void setContentReference(String contentReference)
    {
        this.contentReference = contentReference;
    }

    public Integer getReferenceLocation()
    {
        return referenceLocation;
    }

    public void setReferenceLocation(Integer referenceLocation)
    {
        this.referenceLocation = referenceLocation;
    }

    
}
