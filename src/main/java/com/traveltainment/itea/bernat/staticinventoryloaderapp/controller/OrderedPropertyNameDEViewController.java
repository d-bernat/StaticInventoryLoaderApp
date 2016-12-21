/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.traveltainment.itea.bernat.staticinventoryloaderapp.controller;

import com.traveltainment.itea.bernat.staticinventoryloaderapp.domain.OrderedPropertyNameDEView;
import com.traveltainment.itea.bernat.staticinventoryloaderapp.domain.Province;
import com.traveltainment.itea.bernat.staticinventoryloaderapp.repository.OrderedPropertyNameDEViewRepository;
import com.traveltainment.itea.bernat.staticinventoryloaderapp.repository.ProvinceRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Bernat
 */
@Controller
public class OrderedPropertyNameDEViewController
{
    @RequestMapping(value = "/json/OrderedPropertyNameDEView/all/", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    List<OrderedPropertyNameDEView> findAllJson()
    {
        List<OrderedPropertyNameDEView> prop = pnRepo.findAll();
        return prop;
    }
    
    @Autowired
    private OrderedPropertyNameDEViewRepository pnRepo;    
}
