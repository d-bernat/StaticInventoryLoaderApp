package com.traveltainment.itea.bernat.staticinventoryloaderapp.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name="RegionName")
@IdClass(value=RegionNamePK.class)
public class RegionName
implements Serializable,
NamedInventory {
    @Id
    private Integer sourceRegion;
    @Id
    @Column(columnDefinition="char(5)")
    private String localeLanguage;
    @Column(columnDefinition="varchar(128)")
    private String name;

    public Integer getSourceRegion() {
        return this.sourceRegion;
    }

    public void setSourceRegion(Integer sourceRegion) {
        this.sourceRegion = sourceRegion;
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

