package com.traveltainment.itea.bernat.staticinventoryloaderapp.controller;

import com.traveltainment.itea.bernat.staticinventoryloaderapp.domain.Property;
import com.traveltainment.itea.bernat.staticinventoryloaderapp.repository.PropertyRepository;
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
public class PropertyController {
    @Autowired
    private PropertyRepository propertyRepo;

    @RequestMapping(value={"/html/Property/page/{page:\\d+}/size/{size:\\d+}"}, method={RequestMethod.GET})
    public ModelAndView findAllHtml(@PathVariable int page, @PathVariable int size) {
        Page<Property> propPage = this.propertyRepo.findAll((Pageable)new PageRequest(page, size));
        return new ModelAndView("propertylist", "properties", (Object)propPage.getContent());
    }

    @RequestMapping(value={"/json/Property/page/{page:\\d+}/size/{size:\\d+}"}, method={RequestMethod.GET}, produces={"application/json"})
    @ResponseBody
    public Page<Property> findAllJson(@PathVariable int page, @PathVariable int size) {
        Page<Property> propPage = this.propertyRepo.findAll((Pageable)new PageRequest(page, size));
        return propPage;
    }
}

