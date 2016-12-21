package com.traveltainment.itea.bernat.staticinventoryloaderapp.repository;

import com.traveltainment.itea.bernat.staticinventoryloaderapp.domain.LocationName;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationNameRepository
extends JpaRepository<LocationName, Long> {
    public Page<LocationName> findAll(Pageable var1);

    public List<LocationName> findAll();

    public List<LocationName> findByLocaleLanguage(String var1);
}

