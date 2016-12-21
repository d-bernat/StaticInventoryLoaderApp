package com.traveltainment.itea.bernat.staticinventoryloaderapp.repository;

import com.traveltainment.itea.bernat.staticinventoryloaderapp.domain.Continent;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContinentRepository
extends JpaRepository<Continent, Long> {
    public Page<Continent> findAll(Pageable var1);

    public List<Continent> findAll();
}

