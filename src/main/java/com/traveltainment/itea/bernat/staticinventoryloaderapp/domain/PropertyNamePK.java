/*
 * Decompiled with CFR 0_119.
 */
package com.traveltainment.itea.bernat.staticinventoryloaderapp.domain;

import java.io.Serializable;
import java.util.Objects;

public class PropertyNamePK
implements Serializable {
    private Integer sourceProperty;
    private String localeLanguage;

    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.sourceProperty);
        hash = 29 * hash + Objects.hashCode(this.localeLanguage);
        return hash;
    }

    public boolean equals(Object obj) {
        if (obj instanceof PropertyNamePK) {
            PropertyNamePK pk = (PropertyNamePK)obj;
            if (!pk.getLocaleLanguage().equals(this.localeLanguage)) {
                return false;
            }
            return pk.getSourceProperty().equals(this.sourceProperty);
        }
        return false;
    }

    public Integer getSourceProperty() {
        return this.sourceProperty;
    }

    public void setSourceProperty(Integer sourceProperty) {
        this.sourceProperty = sourceProperty;
    }

    public String getLocaleLanguage() {
        return this.localeLanguage;
    }

    public void setLocaleLanguage(String localLanguage) {
        this.localeLanguage = localLanguage;
    }
}

