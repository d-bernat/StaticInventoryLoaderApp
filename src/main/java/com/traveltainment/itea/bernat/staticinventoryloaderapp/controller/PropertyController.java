/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.traveltainment.itea.bernat.staticinventoryloaderapp.controller;

import com.traveltainment.itea.bernat.staticinventoryloaderapp.domain.Property;
import com.traveltainment.itea.bernat.staticinventoryloaderapp.repository.PropertyRepository;
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
public class PropertyController
{
    @RequestMapping(value = "/html/Property/page/{page:\\d+}/size/{size:\\d+}", method = RequestMethod.GET)
    public ModelAndView findAllHtml(@PathVariable int page, @PathVariable int size)
    {
        Page<Property> propPage = propertyRepo.findAll(new PageRequest(page, size));
        return new ModelAndView("propertylist", "properties", propPage.getContent());
    }

    @RequestMapping(value = "/json/Property/page/{page:\\d+}/size/{size:\\d+}",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    Page<Property> findAllJson(@PathVariable int page, @PathVariable int size)
    {
        Page<Property> propPage = propertyRepo.findAll(new PageRequest(page, size));
        return propPage;
    }
    
    @Autowired
    private PropertyRepository propertyRepo;

}
