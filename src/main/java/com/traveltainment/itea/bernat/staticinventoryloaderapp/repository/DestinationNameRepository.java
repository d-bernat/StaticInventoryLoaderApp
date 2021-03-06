package com.traveltainment.itea.bernat.staticinventoryloaderapp.repository;

import com.traveltainment.itea.bernat.staticinventoryloaderapp.domain.DestinationName;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DestinationNameRepository
extends JpaRepository<DestinationName, Long> {
    public Page<DestinationName> findAll(Pageable var1);

    public List<DestinationName> findAll();

    public List<DestinationName> findByLocaleLanguage(String var1);
}

