/*
 * Decompiled with CFR 0_119.
 * 
 * Could not load the following classes:
 *  javax.persistence.Column
 *  javax.persistence.Entity
 *  javax.persistence.Id
 *  javax.persistence.IdClass
 *  javax.persistence.Table
 */
package com.traveltainment.itea.bernat.staticinventoryloaderapp.domain;

import com.traveltainment.itea.bernat.staticinventoryloaderapp.domain.CountryNamePK;
import com.traveltainment.itea.bernat.staticinventoryloaderapp.domain.NamedInventory;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name="CountryName")
@IdClass(value=CountryNamePK.class)
public class CountryName
implements Serializable,
NamedInventory {
    @Id
    @Column(columnDefinition="char(2)")
    private String sourceCountry;
    @Id
    @Column(columnDefinition="char(5)")
    private String localeLanguage;
    @Column(columnDefinition="varchar(128)")
    private String name;

    public String getSourceCountry() {
        return this.sourceCountry;
    }

    public void setSourceCountry(String sourceCountry) {
        this.sourceCountry = sourceCountry;
    }

    public String getLocaleLanguage() {
        return this.localeLanguage;
    }

    public void setLocaleLanguage(String localeLanguage) {
        this.localeLanguage = localeLanguage;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

