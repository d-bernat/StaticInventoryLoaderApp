/*
 * Decompiled with CFR 0_119.
 * 
 * Could not load the following classes:
 *  org.springframework.data.domain.Page
 *  org.springframework.data.domain.Pageable
 *  org.springframework.data.jpa.repository.JpaRepository
 */
package com.traveltainment.itea.bernat.staticinventoryloaderapp.repository;

import com.traveltainment.itea.bernat.staticinventoryloaderapp.domain.PropertyName;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PropertyNameRepository
extends JpaRepository<PropertyName, Long> {
    public Page<PropertyName> findAll(Pageable var1);

    public Page<PropertyName> findByLocaleLanguage(Pageable var1, String var2);

    public List<PropertyName> findByLocaleLanguage(String var1);
}

