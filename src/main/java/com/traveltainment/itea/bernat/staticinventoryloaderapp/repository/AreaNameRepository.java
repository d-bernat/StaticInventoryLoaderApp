package com.traveltainment.itea.bernat.staticinventoryloaderapp.repository;

import com.traveltainment.itea.bernat.staticinventoryloaderapp.domain.AreaName;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AreaNameRepository
extends JpaRepository<AreaName, Long> {
    public Page<AreaName> findAll(Pageable var1);

    public List<AreaName> findAll();

    public List<AreaName> findByLocaleLanguage(String var1);
}

