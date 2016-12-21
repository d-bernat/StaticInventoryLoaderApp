package com.traveltainment.itea.bernat.staticinventoryloaderapp.domain;

import com.traveltainment.itea.bernat.staticinventoryloaderapp.domain.NamedInventory;
import com.traveltainment.itea.bernat.staticinventoryloaderapp.domain.ZoneNamePK;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name="ZoneName")
@IdClass(value=ZoneNamePK.class)
public class ZoneName
implements Serializable,
NamedInventory {
    @Id
    private Integer sourceLocation;
    @Id
    private Integer sourceZone;
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

    public Integer getSourceZone() {
        return this.sourceZone;
    }

    public void setSourceZone(Integer sourceZone) {
        this.sourceZone = sourceZone;
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

