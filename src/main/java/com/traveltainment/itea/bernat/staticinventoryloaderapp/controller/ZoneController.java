/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.traveltainment.itea.bernat.staticinventoryloaderapp.controller;

import com.traveltainment.itea.bernat.staticinventoryloaderapp.domain.Zone;
import com.traveltainment.itea.bernat.staticinventoryloaderapp.repository.ZoneRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Bernat
 */
@Controller
public class ZoneController
{
    @RequestMapping(value = "/html/Zone/page/{page:\\d+}/size/{size:\\d+}", method = RequestMethod.GET)
    public ModelAndView findPagedHtml(@PathVariable int page, @PathVariable int size)
    {
        Page<Zone> propPage = zoneRepo.findAll(new PageRequest(page, size));
        return new ModelAndView("zonelist", "zones", propPage.getContent());
    }

    @RequestMapping(value = "/json/Zone/page/{page:\\d+}/size/{size:\\d+}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    Page<Zone> findPagedJson(@PathVariable int page, @PathVariable int size)
    {
        Page<Zone> propPage = zoneRepo.findAll(new PageRequest(page, size));
        return propPage;
    }

    @RequestMapping(value = "/json/Zone/all/", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    List<Zone> findAllJson()
    {
        List<Zone> prop = zoneRepo.findAll();
        return prop;
    }
    
    @Autowired
    private ZoneRepository zoneRepo;
}
