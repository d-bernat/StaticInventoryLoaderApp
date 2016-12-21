/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.traveltainment.itea.bernat.staticinventoryloaderapp.repository;

import com.traveltainment.itea.bernat.staticinventoryloaderapp.domain.PropertyName;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Bernat
 */
public interface PropertyNameRepository extends JpaRepository<PropertyName, Long>
{
    @Override
    Page<PropertyName> findAll(Pageable pageable);

    
    Page<PropertyName> findByLocaleLanguage(Pageable pageable, String code);
}
