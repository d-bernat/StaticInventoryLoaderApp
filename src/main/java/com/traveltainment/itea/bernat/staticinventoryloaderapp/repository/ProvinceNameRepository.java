package com.traveltainment.itea.bernat.staticinventoryloaderapp.repository;

import com.traveltainment.itea.bernat.staticinventoryloaderapp.domain.ProvinceName;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProvinceNameRepository
extends JpaRepository<ProvinceName, Long> {
    public Page<ProvinceName> findAll(Pageable var1);

    public List<ProvinceName> findAll();

    public List<ProvinceName> findByLocaleLanguage(String var1);
}

