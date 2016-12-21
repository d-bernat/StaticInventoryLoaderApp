package com.traveltainment.itea.bernat.staticinventoryloaderapp.repository;

import com.traveltainment.itea.bernat.staticinventoryloaderapp.domain.RegionName;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegionNameRepository
extends JpaRepository<RegionName, Long> {
    public Page<RegionName> findAll(Pageable var1);

    public List<RegionName> findAll();

    public List<RegionName> findByLocaleLanguage(String var1);
}

