package com.traveltainment.itea.bernat.staticinventoryloaderapp.controller;

import com.traveltainment.itea.bernat.staticinventoryloaderapp.domain.Area;
import com.traveltainment.itea.bernat.staticinventoryloaderapp.repository.AreaRepository;
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
public class AreaController {
    @Autowired
    private AreaRepository areaRepo;

    @RequestMapping(value={"/html/Area/page/{page:\\d+}/size/{size:\\d+}"}, method={RequestMethod.GET})
    public ModelAndView findPagedHtml(@PathVariable int page, @PathVariable int size) {
        Page<Area> propPage = this.areaRepo.findAll((Pageable)new PageRequest(page, size));
        return new ModelAndView("arealist", "areas", (Object)propPage.getContent());
    }

    @RequestMapping(value={"/json/Area/page/{page:\\d+}/size/{size:\\d+}"}, method={RequestMethod.GET}, produces={"application/json"})
    @ResponseBody
    public Page<Area> findPagedJson(@PathVariable int page, @PathVariable int size) {
        Page<Area> propPage = this.areaRepo.findAll((Pageable)new PageRequest(page, size));
        return propPage;
    }

    @RequestMapping(value={"/json/Area/all/"}, method={RequestMethod.GET}, produces={"application/json"})
    @ResponseBody
    public List<Area> findAllJson() {
        List<Area> prop = this.areaRepo.findAll();
        return prop;
    }
}

