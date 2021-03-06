package com.traveltainment.itea.bernat.staticinventoryloaderapp.repository;

import com.traveltainment.itea.bernat.staticinventoryloaderapp.domain.ZoneName;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ZoneNameRepository
extends JpaRepository<ZoneName, Long> {
    public Page<ZoneName> findAll(Pageable var1);

    public List<ZoneName> findAll();

    public List<ZoneName> findByLocaleLanguage(String var1);
}

