package com.traveltainment.itea.bernat.staticinventoryloaderapp.controller;

import com.traveltainment.itea.bernat.staticinventoryloaderapp.domain.Zone;
import com.traveltainment.itea.bernat.staticinventoryloaderapp.repository.ZoneRepository;
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
public class ZoneController {
    @Autowired
    private ZoneRepository zoneRepo;

    @RequestMapping(value={"/html/Zone/page/{page:\\d+}/size/{size:\\d+}"}, method={RequestMethod.GET})
    public ModelAndView findPagedHtml(@PathVariable int page, @PathVariable int size) {
        Page<Zone> propPage = this.zoneRepo.findAll((Pageable)new PageRequest(page, size));
        return new ModelAndView("zonelist", "zones", (Object)propPage.getContent());
    }

    @RequestMapping(value={"/json/Zone/page/{page:\\d+}/size/{size:\\d+}"}, method={RequestMethod.GET}, produces={"application/json"})
    @ResponseBody
    public Page<Zone> findPagedJson(@PathVariable int page, @PathVariable int size) {
        Page<Zone> propPage = this.zoneRepo.findAll((Pageable)new PageRequest(page, size));
        return propPage;
    }

    @RequestMapping(value={"/json/Zone/all/"}, method={RequestMethod.GET}, produces={"application/json"})
    @ResponseBody
    public List<Zone> findAllJson() {
        List<Zone> prop = this.zoneRepo.findAll();
        return prop;
    }
}

