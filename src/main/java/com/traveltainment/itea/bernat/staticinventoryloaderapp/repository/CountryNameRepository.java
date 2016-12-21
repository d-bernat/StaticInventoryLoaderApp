package com.traveltainment.itea.bernat.staticinventoryloaderapp.repository;

import com.traveltainment.itea.bernat.staticinventoryloaderapp.domain.CountryName;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryNameRepository
extends JpaRepository<CountryName, Long> {
    public Page<CountryName> findAll(Pageable var1);

    public List<CountryName> findAll();

    public List<CountryName> findByLocaleLanguage(String var1);
}

