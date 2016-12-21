package com.traveltainment.itea.bernat.staticinventoryloaderapp.domain;

import com.traveltainment.itea.bernat.staticinventoryloaderapp.domain.AreaNamePK;
import com.traveltainment.itea.bernat.staticinventoryloaderapp.domain.NamedInventory;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name="AreaName")
@IdClass(value=AreaNamePK.class)
public class AreaName
implements Serializable,
NamedInventory {
    @Id
    private Integer sourceRegion;
    @Id
    private Integer sourceArea;
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

    public Integer getSourceArea() {
        return this.sourceArea;
    }

    public void setSourceArea(Integer sourceArea) {
        this.sourceArea = sourceArea;
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

