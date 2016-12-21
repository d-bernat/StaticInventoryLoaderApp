package com.traveltainment.itea.bernat.staticinventoryloaderapp.controller;

import com.traveltainment.itea.bernat.staticinventoryloaderapp.domain.PropertyName;
import com.traveltainment.itea.bernat.staticinventoryloaderapp.repository.PropertyNameRepository;
import com.traveltainment.itea.bernat.staticinventoryloaderapp.utility.OrderByNameByLocale;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PropertyNameController {
    @Autowired
    private PropertyNameRepository propertyNameRepo;

    @RequestMapping(value={"/html/PropertyName/page/{page:\\d+}/size/{size:\\d+}"}, method={RequestMethod.GET})
    public ModelAndView findAllHtml(@PathVariable int page, @PathVariable int size) {
        Page<PropertyName> propPage = this.propertyNameRepo.findAll((Pageable)new PageRequest(page, size));
        return new ModelAndView("propertynamelist", "propertynames", (Object)propPage.getContent());
    }

    @RequestMapping(value={"/json/PropertyName/page/{page:\\d+}/size/{size:\\d+}"}, method={RequestMethod.GET}, produces={"application/json"})
    @ResponseBody
    public Page<PropertyName> findAllJson(@PathVariable int page, @PathVariable int size) {
        Page<PropertyName> propPage = this.propertyNameRepo.findAll((Pageable)new PageRequest(page, size));
        return propPage;
    }

    @RequestMapping(value={"/html/PropertyName/lang/{code:[a-z]{2}-[A-Z]{2}}/page/{page:\\d+}/size/{size:\\d+}"}, method={RequestMethod.GET}, produces={"application/json"})
    public ModelAndView findByLocaleLanguageHtml(@PathVariable String code, @PathVariable int page, @PathVariable int size) {
        Page<PropertyName> propPage = this.propertyNameRepo.findByLocaleLanguage((Pageable)new PageRequest(page, size), code);
        return new ModelAndView("propertynamelist", "propertynames", (Object)propPage.getContent());
    }

    @RequestMapping(value={"/json/PropertyName/lang/{code:[a-z]{2}-[A-Z]{2}}/page/{page:\\d+}/size/{size:\\d+}"}, method={RequestMethod.GET}, produces={"application/json"})
    @ResponseBody
    public Page<PropertyName> findByLocaleLanguageJson(@PathVariable String code, @PathVariable int page, @PathVariable int size) {
        Page<PropertyName> propPage = this.propertyNameRepo.findByLocaleLanguage((Pageable)new PageRequest(page, size), code);
        return propPage;
    }

    @RequestMapping(value={"/json/PropertyName/lang/{code:[a-z]{2}-[A-Z]{2}}/all/"}, method={RequestMethod.GET}, produces={"application/json"})
    @ResponseBody
    public List<PropertyName> findByLocaleLanguageJson(@PathVariable String code) {
        List<PropertyName> propName = this.propertyNameRepo.findByLocaleLanguage(code);
        return new OrderByNameByLocale<PropertyName>().sort(propName, code);
    }
}

