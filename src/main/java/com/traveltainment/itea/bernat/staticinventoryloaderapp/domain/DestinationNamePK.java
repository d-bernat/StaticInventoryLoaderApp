package com.traveltainment.itea.bernat.staticinventoryloaderapp.domain;

import java.io.Serializable;
import java.util.Objects;

public class DestinationNamePK
implements Serializable {
    private Integer sourceDestination;
    private String localeLanguage;

    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.sourceDestination);
        hash = 29 * hash + Objects.hashCode(this.localeLanguage);
        return hash;
    }

    public boolean equals(Object obj) {
        if (obj instanceof DestinationNamePK) {
            DestinationNamePK pk = (DestinationNamePK)obj;
            if (!pk.getSourceDestination().equals(this.sourceDestination)) {
                return false;
            }
            return pk.getLocaleLanguage().equals(this.localeLanguage);
        }
        return false;
    }

    public Integer getSourceDestination() {
        return this.sourceDestination;
    }

    public void setSourceDestination(Integer sourceDestination) {
        this.sourceDestination = sourceDestination;
    }

    public String getLocaleLanguage() {
        return this.localeLanguage;
    }

    public void setLocaleLanguage(String localeLanguage) {
        this.localeLanguage = localeLanguage;
    }
}

