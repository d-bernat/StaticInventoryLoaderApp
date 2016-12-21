/*
 * Decompiled with CFR 0_119.
 */
package com.traveltainment.itea.bernat.staticinventoryloaderapp.domain;

import java.io.Serializable;
import java.util.Objects;

public class ZonePK
implements Serializable {
    private Integer location;
    private Integer id;

    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.location);
        hash = 29 * hash + Objects.hashCode(this.id);
        return hash;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ZonePK) {
            ZonePK pk = (ZonePK)obj;
            if (!pk.getLocation().equals(this.location)) {
                return false;
            }
            return pk.getId().equals(this.id);
        }
        return false;
    }

    public Integer getLocation() {
        return this.location;
    }

    public void setLocation(Integer location) {
        this.location = location;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}

