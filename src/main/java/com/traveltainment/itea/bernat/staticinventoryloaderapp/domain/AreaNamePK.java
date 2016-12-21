package com.traveltainment.itea.bernat.staticinventoryloaderapp.domain;

import java.io.Serializable;
import java.util.Objects;

public class AreaNamePK
implements Serializable {
    private Integer sourceRegion;
    private Integer sourceArea;
    private String localeLanguage;

    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.sourceRegion);
        hash = 29 * hash + Objects.hashCode(this.sourceArea);
        hash = 29 * hash + Objects.hashCode(this.localeLanguage);
        return hash;
    }

    public boolean equals(Object obj) {
        if (obj instanceof AreaNamePK) {
            AreaNamePK pk = (AreaNamePK)obj;
            if (!pk.getSourceRegion().equals(this.sourceRegion)) {
                return false;
            }
            if (!pk.getSourceArea().equals(this.sourceArea)) {
                return false;
            }
            return pk.getLocaleLanguage().equals(this.localeLanguage);
        }
        return false;
    }

    public Integer getSourceRegion() {
        return this.sourceRegion;
    }

    public void setSourceRegion(Integer sourceRegion) {
        this.sourceRegion = sourceRegion;
    }

    public Integer getSourceArea() {
        return this.sourceArea;
    }

    public void setSourceArea(Integer sourceArea) {
        this.sourceArea = sourceArea;
    }

    public String getLocaleLanguage() {
        return this.localeLanguage;
    }

    public void setLocaleLanguage(String localeLanguage) {
        this.localeLanguage = localeLanguage;
    }
}

