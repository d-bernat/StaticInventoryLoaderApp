package com.traveltainment.itea.bernat.staticinventoryloaderapp.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CountryView")
public class Country
implements Serializable {
    @Id
    @Column(columnDefinition="char(2)")
    private String id;
    @Column(columnDefinition="char(3)")
    private String alpha3;
    @Column(columnDefinition="smallint")
    private Short numeric;
    @Column(columnDefinition="char(2)")
    private String continent;
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
    @Column(columnDefinition="varchar(15)")
    private String contentReference;

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAlpha3() {
        return this.alpha3;
    }

    public void setAlpha3(String alpha3) {
        this.alpha3 = alpha3;
    }

    public Short getNumeric() {
        return this.numeric;
    }

    public void setNumeric(Short numeric) {
        this.numeric = numeric;
    }

    public String getContinent() {
        return this.continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
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

    public String getContentReference() {
        return this.contentReference;
    }

    public void setContentReference(String contentReference) {
        this.contentReference = contentReference;
    }
}

