package com.traveltainment.itea.bernat.staticinventoryloaderapp.controller;

import com.traveltainment.itea.bernat.staticinventoryloaderapp.domain.Location;
import com.traveltainment.itea.bernat.staticinventoryloaderapp.repository.LocationRepository;
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
public class LocationController {
    @Autowired
    private LocationRepository locationRepo;

    @RequestMapping(value={"/html/Location/page/{page:\\d+}/size/{size:\\d+}"}, method={RequestMethod.GET})
    public ModelAndView findPagedHtml(@PathVariable int page, @PathVariable int size) {
        Page<Location> propPage = this.locationRepo.findAll((Pageable)new PageRequest(page, size));
        return new ModelAndView("locationlist", "locations", (Object)propPage.getContent());
    }

    @RequestMapping(value={"/json/Location/page/{page:\\d+}/size/{size:\\d+}"}, method={RequestMethod.GET}, produces={"application/json"})
    @ResponseBody
    public Page<Location> findPagedJson(@PathVariable int page, @PathVariable int size) {
        Page<Location> propPage = this.locationRepo.findAll((Pageable)new PageRequest(page, size));
        return propPage;
    }

    @RequestMapping(value={"/json/Location/all/"}, method={RequestMethod.GET}, produces={"application/json"})
    @ResponseBody
    public List<Location> findAllJson() {
        List<Location> prop = this.locationRepo.findAll();
        return prop;
    }
}

