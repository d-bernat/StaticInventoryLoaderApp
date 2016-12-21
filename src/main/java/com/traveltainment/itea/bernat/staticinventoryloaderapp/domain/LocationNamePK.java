/*
 * Decompiled with CFR 0_119.
 */
package com.traveltainment.itea.bernat.staticinventoryloaderapp.domain;

import java.io.Serializable;
import java.util.Objects;

public class LocationNamePK
implements Serializable {
    private Integer sourceLocation;
    private String localeLanguage;

    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.sourceLocation);
        hash = 29 * hash + Objects.hashCode(this.localeLanguage);
        return hash;
    }

    public boolean equals(Object obj) {
        if (obj instanceof LocationNamePK) {
            LocationNamePK pk = (LocationNamePK)obj;
            if (!pk.getSourceLocation().equals(this.sourceLocation)) {
                return false;
            }
            return pk.getLocaleLanguage().equals(this.localeLanguage);
        }
        return false;
    }

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
}

