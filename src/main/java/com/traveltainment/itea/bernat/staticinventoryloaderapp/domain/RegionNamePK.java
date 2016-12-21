package com.traveltainment.itea.bernat.staticinventoryloaderapp.domain;

import java.io.Serializable;
import java.util.Objects;

public class RegionNamePK
implements Serializable {
    private Integer sourceRegion;
    private String localeLanguage;

    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.sourceRegion);
        hash = 29 * hash + Objects.hashCode(this.localeLanguage);
        return hash;
    }

    public boolean equals(Object obj) {
        if (obj instanceof RegionNamePK) {
            RegionNamePK pk = (RegionNamePK)obj;
            if (!pk.getSourceRegion().equals(this.sourceRegion)) {
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

    public String getLocaleLanguage() {
        return this.localeLanguage;
    }

    public void setLocaleLanguage(String localeLanguage) {
        this.localeLanguage = localeLanguage;
    }
}

