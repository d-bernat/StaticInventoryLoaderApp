package com.traveltainment.itea.bernat.staticinventoryloaderapp.repository;

import com.traveltainment.itea.bernat.staticinventoryloaderapp.domain.ContinentName;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContinentNameRepository
extends JpaRepository<ContinentName, Long> {
    public Page<ContinentName> findAll(Pageable var1);

    public List<ContinentName> findAll();

    public List<ContinentName> findByLocaleLanguage(String var1);
}

