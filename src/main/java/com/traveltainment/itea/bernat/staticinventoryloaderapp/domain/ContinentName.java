package com.traveltainment.itea.bernat.staticinventoryloaderapp.domain;

import com.traveltainment.itea.bernat.staticinventoryloaderapp.domain.ContinentNamePK;
import com.traveltainment.itea.bernat.staticinventoryloaderapp.domain.NamedInventory;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name="ContinentName")
@IdClass(value=ContinentNamePK.class)
public class ContinentName
implements Serializable,
NamedInventory {
    @Id
    @Column(columnDefinition="char(2)")
    private String sourceContinent;
    @Id
    @Column(columnDefinition="char(5)")
    private String localeLanguage;
    @Column(columnDefinition="varchar(128)")
    private String name;

    public String getSourceContinent() {
        return this.sourceContinent;
    }

    public void setSourceContinent(String sourceContinent) {
        this.sourceContinent = sourceContinent;
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

