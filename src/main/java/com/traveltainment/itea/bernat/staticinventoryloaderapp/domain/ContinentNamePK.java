package com.traveltainment.itea.bernat.staticinventoryloaderapp.domain;

import java.io.Serializable;
import java.util.Objects;

public class ContinentNamePK
implements Serializable {
    private String sourceContinent;
    private String localeLanguage;

    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.sourceContinent);
        hash = 29 * hash + Objects.hashCode(this.localeLanguage);
        return hash;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ContinentNamePK) {
            ContinentNamePK pk = (ContinentNamePK)obj;
            if (!pk.getSourceContinent().equals(this.sourceContinent)) {
                return false;
            }
            return pk.getLocaleLanguage().equals(this.localeLanguage);
        }
        return false;
    }

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
}

