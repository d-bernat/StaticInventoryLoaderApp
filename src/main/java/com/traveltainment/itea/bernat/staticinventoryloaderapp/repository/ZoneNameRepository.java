/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.traveltainment.itea.bernat.staticinventoryloaderapp.repository;

import com.traveltainment.itea.bernat.staticinventoryloaderapp.domain.ZoneName;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Bernat
 */
public interface ZoneNameRepository extends JpaRepository<ZoneName, Long>
{
    @Override
    Page<ZoneName> findAll(Pageable pageable);
    
    @Override
    List<ZoneName> findAll();
    
}
