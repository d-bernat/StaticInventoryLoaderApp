/*
 * Decompiled with CFR 0_119.
 */
package com.traveltainment.itea.bernat.staticinventoryloaderapp.domain;

import java.io.Serializable;
import java.util.Objects;

public class ProvincePK
implements Serializable {
    private String country;
    private String id;

    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.country);
        hash = 29 * hash + Objects.hashCode(this.id);
        return hash;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ProvincePK) {
            ProvincePK pk = (ProvincePK)obj;
            if (!pk.getCountry().equals(this.country)) {
                return false;
            }
            return pk.getId().equals(this.id);
        }
        return false;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

