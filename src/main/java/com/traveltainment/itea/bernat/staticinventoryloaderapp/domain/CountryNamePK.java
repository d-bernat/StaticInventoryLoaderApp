package com.traveltainment.itea.bernat.staticinventoryloaderapp.domain;

import java.io.Serializable;
import java.util.Objects;

public class CountryNamePK
implements Serializable {
    private String sourceCountry;
    private String localeLanguage;

    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.sourceCountry);
        hash = 29 * hash + Objects.hashCode(this.localeLanguage);
        return hash;
    }

    public boolean equals(Object obj) {
        if (obj instanceof CountryNamePK) {
            CountryNamePK pk = (CountryNamePK)obj;
            if (!pk.getSourceCountry().equals(this.sourceCountry)) {
                return false;
            }
            return pk.getLocaleLanguage().equals(this.localeLanguage);
        }
        return false;
    }

    public String getSourceCountry() {
        return this.sourceCountry;
    }

    public void setSourceCountry(String sourceCountry) {
        this.sourceCountry = sourceCountry;
    }

    public String getLocaleLanguage() {
        return this.localeLanguage;
    }

    public void setLocaleLanguage(String localeLanguage) {
        this.localeLanguage = localeLanguage;
    }
}

