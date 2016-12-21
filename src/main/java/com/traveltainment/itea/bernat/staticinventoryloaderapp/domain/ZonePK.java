/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.traveltainment.itea.bernat.staticinventoryloaderapp.domain;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Bernat
 */
public class ZonePK implements Serializable
{
    private Integer location;
    private Integer id;

    public ZonePK()
    {

    }

    @Override
    public int hashCode()
    {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.location);
        hash = 29 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj instanceof ZonePK)
        {
            ZonePK pk = (ZonePK) obj;

            if (!pk.getLocation().equals(location))
            {
                return false;
            }

            return pk.getId().equals(id);
        }

        return false;
    }

    public Integer getLocation()
    {
        return location;
    }

    public void setLocation(Integer location)
    {
        this.location = location;
    }

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

}
