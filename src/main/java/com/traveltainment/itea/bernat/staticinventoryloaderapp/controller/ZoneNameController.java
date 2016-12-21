/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.traveltainment.itea.bernat.staticinventoryloaderapp.controller;

import com.traveltainment.itea.bernat.staticinventoryloaderapp.domain.ZoneName;
import com.traveltainment.itea.bernat.staticinventoryloaderapp.repository.ZoneNameRepository;
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
public class ZoneNameController
{
    @RequestMapping(value = "/html/ZoneName/page/{page:\\d+}/size/{size:\\d+}", method = RequestMethod.GET)
    public ModelAndView findPagedHtml(@PathVariable int page, @PathVariable int size)
    {
        Page<ZoneName> propPage = zoneNameRepo.findAll(new PageRequest(page, size));
        return new ModelAndView("zonenamelist", "zonenames", propPage.getContent());
    }

    @RequestMapping(value = "/json/ZoneName/page/{page:\\d+}/size/{size:\\d+}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    Page<ZoneName> findPagedJson(@PathVariable int page, @PathVariable int size)
    {
        Page<ZoneName> propPage = zoneNameRepo.findAll(new PageRequest(page, size));
        return propPage;
    }

    @RequestMapping(value = "/json/ZoneName/all/", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    List<ZoneName> findAllJson()
    {
        List<ZoneName> prop = zoneNameRepo.findAll();
        return prop;
    }
    
    @Autowired
    private ZoneNameRepository zoneNameRepo;
}
