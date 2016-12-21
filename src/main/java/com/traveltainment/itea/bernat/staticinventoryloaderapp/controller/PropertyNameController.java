/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.traveltainment.itea.bernat.staticinventoryloaderapp.controller;

import com.traveltainment.itea.bernat.staticinventoryloaderapp.domain.PropertyName;
import com.traveltainment.itea.bernat.staticinventoryloaderapp.repository.PropertyNameRepository;
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
public class PropertyNameController
{
    @RequestMapping(value = "/html/PropertyName/page/{page:\\d+}/size/{size:\\d+}", method = RequestMethod.GET)
    public ModelAndView findAllHtml(@PathVariable int page, @PathVariable int size)
    {
        Page<PropertyName> propPage = propertyNameRepo.findAll(new PageRequest(page, size));
        return new ModelAndView("propertynamelist", "propertynames", propPage.getContent());
    }

    @RequestMapping(value = "/json/PropertyName/page/{page:\\d+}/size/{size:\\d+}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    Page<PropertyName> findAllJson(@PathVariable int page, @PathVariable int size)
    {
        Page<PropertyName> propPage = propertyNameRepo.findAll(new PageRequest(page, size));
        return propPage;
    }

    @RequestMapping(value = "/html/PropertyName/lang/{code:[a-z]{2}-[A-Z]{2}}/page/{page:\\d+}/size/{size:\\d+}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ModelAndView findByLocaleLanguageHtml(@PathVariable String code, @PathVariable int page, @PathVariable int size)
    {
        Page<PropertyName> propPage = propertyNameRepo.findByLocaleLanguage(new PageRequest(page, size), code);
        return new ModelAndView("propertynamelist", "propertynames", propPage.getContent());
    }

    @RequestMapping(value = "/json/PropertyName/lang/{code:[a-z]{2}-[A-Z]{2}}/page/{page:\\d+}/size/{size:\\d+}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    Page<PropertyName> findByLocaleLanguageJson(@PathVariable String code, @PathVariable int page, @PathVariable int size)
    {
        Page<PropertyName> propPage = propertyNameRepo.findByLocaleLanguage(new PageRequest(page, size), code);
        return propPage;
    }

    @Autowired
    private PropertyNameRepository propertyNameRepo;

}
