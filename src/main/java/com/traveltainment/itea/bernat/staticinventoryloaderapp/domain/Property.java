/*
 * Decompiled with CFR 0_119.
 * 
 * Could not load the following classes:
 *  javax.persistence.Column
 *  javax.persistence.Entity
 *  javax.persistence.Id
 *  javax.persistence.Table
 */
package com.traveltainment.itea.bernat.staticinventoryloaderapp.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PropertyView")
public class Property
implements Serializable {
    @Id
    private Integer id;
    @Column(name="type", columnDefinition="char(20)", nullable=false, insertable=false, updatable=false)
    private String type;
    @Column(name="source", columnDefinition="enum('editorial','automatching')")
    private String source;
    @Column(name="location", nullable=false, insertable=false, updatable=false)
    private Integer location;
    @Column(name="zone", nullable=false, insertable=false, updatable=false)
    private Integer zone;
    @Column(name="standardCategory", columnDefinition="char(2)", nullable=true, insertable=false, updatable=false)
    private String standardCategory;
    @Column(name="geoLocationX", columnDefinition="double")
    private Double geoLocationX;
    @Column(name="geoLocationY", columnDefinition="double")
    private Double geoLocationY;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSource() {
        return this.source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Integer getLocation() {
        return this.location;
    }

    public void setLocation(Integer location) {
        this.location = location;
    }

    public Integer getZone() {
        return this.zone;
    }

    public void setZone(Integer zone) {
        this.zone = zone;
    }

    public String getStandardCategory() {
        return this.standardCategory;
    }

    public void setStandardCategory(String standardCategory) {
        this.standardCategory = standardCategory;
    }

    public Double getGeoLocationX() {
        return this.geoLocationX;
    }

    public void setGeoLocationX(Double geoLocationX) {
        this.geoLocationX = geoLocationX;
    }

    public Double getGeoLocationY() {
        return this.geoLocationY;
    }

    public void setGeoLocationY(Double geoLocationY) {
        this.geoLocationY = geoLocationY;
    }
}

