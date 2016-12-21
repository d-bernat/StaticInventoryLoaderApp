package com.traveltainment.itea.bernat.staticinventoryloaderapp.domain;

import com.traveltainment.itea.bernat.staticinventoryloaderapp.domain.ZonePK;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name="ZoneView")
@IdClass(value=ZonePK.class)
public class Zone
implements Serializable {
    @Id
    private Integer location;
    @Id
    private Integer id;
    @Column(name="type", columnDefinition="enum('city','location', 'lake', 'beach', 'isle', 'natur_park', 'town','village', 'suburb', 'metropilis', 'unknown', 'd_cruise', 'd_fly_drive', 'd_fly_stay', 'd_roulette','d_tour', 'd_backpacker', 'd_cruise_hotel', 'd_others')")
    private String type;
    @Column(name="geoAreaX1", columnDefinition="double")
    private Double geoAreaX1;
    @Column(name="geoAreaY1", columnDefinition="double")
    private Double geoAreaY1;
    @Column(name="geoAreaX2", columnDefinition="double")
    private Double geoAreaX2;
    @Column(name="geoAreaY2", columnDefinition="double")
    private Double geoAreaY2;
    @Column(name="geoCentroidX", columnDefinition="double")
    private Double geoCentroidX;
    @Column(name="geoCentroidY", columnDefinition="double")
    private Double geoCentroidY;

    public Integer getLocation() {
        return this.location;
    }

    public void setLocation(Integer location) {
        this.location = location;
    }

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

    public Double getGeoAreaX1() {
        return this.geoAreaX1;
    }

    public void setGeoAreaX1(Double geoAreaX1) {
        this.geoAreaX1 = geoAreaX1;
    }

    public Double getGeoAreaY1() {
        return this.geoAreaY1;
    }

    public void setGeoAreaY1(Double geoAreaY1) {
        this.geoAreaY1 = geoAreaY1;
    }

    public Double getGeoAreaX2() {
        return this.geoAreaX2;
    }

    public void setGeoAreaX2(Double geoAreaX2) {
        this.geoAreaX2 = geoAreaX2;
    }

    public Double getGeoAreaY2() {
        return this.geoAreaY2;
    }

    public void setGeoAreaY2(Double geoAreaY2) {
        this.geoAreaY2 = geoAreaY2;
    }

    public Double getGeoCentroidX() {
        return this.geoCentroidX;
    }

    public void setGeoCentroidX(Double geoCentroidX) {
        this.geoCentroidX = geoCentroidX;
    }

    public Double getGeoCentroidY() {
        return this.geoCentroidY;
    }

    public void setGeoCentroidY(Double geoCentroidY) {
        this.geoCentroidY = geoCentroidY;
    }
}

