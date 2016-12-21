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
@Table(name = "ProvinceView")
@IdClass(value = ProvincePK.class)
public class Province implements Serializable
{
    @Id
    @Column(columnDefinition = "char(2)")
    private String country;
    
    @Id
    @Column(columnDefinition = "varchar(3)")
    private String id;
    
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

    public String getCountry()
    {
        return country;
    }

    public void setCountry(String country)
    {
        this.country = country;
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
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
}
