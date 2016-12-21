package com.traveltainment.itea.bernat.staticinventoryloaderapp.controller;

import com.traveltainment.itea.bernat.staticinventoryloaderapp.domain.LocationName;
import com.traveltainment.itea.bernat.staticinventoryloaderapp.repository.LocationNameRepository;
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
public class LocationNameController {
    @Autowired
    private LocationNameRepository locationNameRepo;

    @RequestMapping(value={"/html/LocationName/page/{page:\\d+}/size/{size:\\d+}"}, method={RequestMethod.GET})
    public ModelAndView findPagedHtml(@PathVariable int page, @PathVariable int size) {
        Page<LocationName> propPage = this.locationNameRepo.findAll((Pageable)new PageRequest(page, size));
        return new ModelAndView("locationnamelist", "locationnames", (Object)propPage.getContent());
    }

    @RequestMapping(value={"/json/LocationName/page/{page:\\d+}/size/{size:\\d+}"}, method={RequestMethod.GET}, produces={"application/json"})
    @ResponseBody
    public Page<LocationName> findPagedJson(@PathVariable int page, @PathVariable int size) {
        Page<LocationName> propPage = this.locationNameRepo.findAll((Pageable)new PageRequest(page, size));
        return propPage;
    }

    @RequestMapping(value={"/json/LocationName/all/"}, method={RequestMethod.GET}, produces={"application/json"})
    @ResponseBody
    public List<LocationName> findAllJson() {
        List<LocationName> prop = this.locationNameRepo.findAll();
        return prop;
    }

    @RequestMapping(value={"/json/LocationName/lang/{code:[a-z]{2}-[A-Z]{2}}/all/"}, method={RequestMethod.GET}, produces={"application/json"})
    @ResponseBody
    public List<LocationName> findByLocaleLanguageJson(@PathVariable String code) {
        List<LocationName> propName = this.locationNameRepo.findByLocaleLanguage(code);
        return new OrderByNameByLocale<LocationName>().sort(propName, code);
    }
}

