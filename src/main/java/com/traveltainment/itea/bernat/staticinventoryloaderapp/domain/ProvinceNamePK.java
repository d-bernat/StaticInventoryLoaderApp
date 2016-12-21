/*
 * Decompiled with CFR 0_119.
 */
package com.traveltainment.itea.bernat.staticinventoryloaderapp.domain;

import com.traveltainment.itea.bernat.staticinventoryloaderapp.domain.PropertyNamePK;
import java.io.Serializable;
import java.util.Objects;

public class ProvinceNamePK
implements Serializable {
    private String sourceCountry;
    private String sourceProvince;
    private String localeLanguage;

    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.sourceCountry);
        hash = 29 * hash + Objects.hashCode(this.sourceProvince);
        hash = 29 * hash + Objects.hashCode(this.localeLanguage);
        return hash;
    }

    public boolean equals(Object obj) {
        if (obj instanceof PropertyNamePK) {
            PropertyNamePK pk = (PropertyNamePK)obj;
            if (!pk.getLocaleLanguage().equals(this.localeLanguage)) {
                return false;
            }
            if (!pk.getLocaleLanguage().equals(this.sourceProvince)) {
                return false;
            }
            return pk.getSourceProperty().equals(this.localeLanguage);
        }
        return false;
    }

    public String getSourceCountry() {
        return this.sourceCountry;
    }

    public void setSourceCountry(String sourceCountry) {
        this.sourceCountry = sourceCountry;
    }

    public String getSourceProvince() {
        return this.sourceProvince;
    }

    public void setSourceProvince(String sourceProvince) {
        this.sourceProvince = sourceProvince;
    }

    public String getLocaleLanguage() {
        return this.localeLanguage;
    }

    public void setLocaleLanguage(String localeLanguage) {
        this.localeLanguage = localeLanguage;
    }
}

