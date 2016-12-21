package com.traveltainment.itea.bernat.staticinventoryloaderapp.domain;

import java.io.Serializable;
import java.util.Objects;

public class AreaPK
implements Serializable {
    private Integer region;
    private Integer id;

    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.region);
        hash = 29 * hash + Objects.hashCode(this.id);
        return hash;
    }

    public boolean equals(Object obj) {
        if (obj instanceof AreaPK) {
            AreaPK pk = (AreaPK)obj;
            if (!pk.getRegion().equals(this.region)) {
                return false;
            }
            return pk.getId().equals(this.id);
        }
        return false;
    }

    public Integer getRegion() {
        return this.region;
    }

    public void setRegion(Integer region) {
        this.region = region;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}

