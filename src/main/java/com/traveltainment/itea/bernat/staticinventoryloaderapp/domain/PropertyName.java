package com.traveltainment.itea.bernat.staticinventoryloaderapp.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name="PropertyName")
@IdClass(value=PropertyNamePK.class)
public class PropertyName
implements Serializable,
NamedInventory {
    @Id
    private Integer sourceProperty;
    @Id
    @Column(name="localeLanguage", columnDefinition="char(5)")
    private String localeLanguage;
    @Column(name="name", nullable=false, insertable=false, updatable=false)
    private String name;

    public Integer getSourceProperty() {
        return this.sourceProperty;
    }

    public void setSourceProperty(Integer sourceProperty) {
        this.sourceProperty = sourceProperty;
    }

    public String getLocaleLanguage() {
        return this.localeLanguage;
    }

    public void setLocalLanguage(String localLanguage) {
        this.localeLanguage = localLanguage;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

