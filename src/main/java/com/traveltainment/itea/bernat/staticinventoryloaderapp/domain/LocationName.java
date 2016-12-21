package com.traveltainment.itea.bernat.staticinventoryloaderapp.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name="LocationName")
@IdClass(value=LocationNamePK.class)
public class LocationName
implements Serializable,
NamedInventory {
    @Id
    private Integer sourceLocation;
    @Id
    @Column(columnDefinition="char(5)")
    private String localeLanguage;
    @Column(columnDefinition="varchar(128)")
    private String name;

    public Integer getSourceLocation() {
        return this.sourceLocation;
    }

    public void setSourceLocation(Integer sourceLocation) {
        this.sourceLocation = sourceLocation;
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

