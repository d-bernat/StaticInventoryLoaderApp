/*
 * Decompiled with CFR 0_119.
 */
package com.traveltainment.itea.bernat.staticinventoryloaderapp.domain;

import java.io.Serializable;
import java.util.Objects;

public class ZoneNamePK
implements Serializable {
    private Integer sourceLocation;
    private Integer sourceZone;
    private String localeLanguage;

    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.sourceLocation);
        hash = 29 * hash + Objects.hashCode(this.sourceZone);
        hash = 29 * hash + Objects.hashCode(this.localeLanguage);
        return hash;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ZoneNamePK) {
            ZoneNamePK pk = (ZoneNamePK)obj;
            if (!pk.getSourceLocation().equals(this.sourceLocation)) {
                return false;
            }
            if (!pk.getSourceZone().equals(this.sourceZone)) {
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
}

