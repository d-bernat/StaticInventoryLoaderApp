package com.traveltainment.itea.bernat.staticinventoryloaderapp.controller;

import com.traveltainment.itea.bernat.staticinventoryloaderapp.domain.ZoneName;
import com.traveltainment.itea.bernat.staticinventoryloaderapp.repository.ZoneNameRepository;
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
public class ZoneNameController {
    @Autowired
    private ZoneNameRepository zoneNameRepo;

    @RequestMapping(value={"/html/ZoneName/page/{page:\\d+}/size/{size:\\d+}"}, method={RequestMethod.GET})
    public ModelAndView findPagedHtml(@PathVariable int page, @PathVariable int size) {
        Page<ZoneName> propPage = this.zoneNameRepo.findAll((Pageable)new PageRequest(page, size));
        return new ModelAndView("zonenamelist", "zonenames", (Object)propPage.getContent());
    }

    @RequestMapping(value={"/json/ZoneName/page/{page:\\d+}/size/{size:\\d+}"}, method={RequestMethod.GET}, produces={"application/json"})
    @ResponseBody
    public Page<ZoneName> findPagedJson(@PathVariable int page, @PathVariable int size) {
        Page<ZoneName> propPage = this.zoneNameRepo.findAll((Pageable)new PageRequest(page, size));
        return propPage;
    }

    @RequestMapping(value={"/json/ZoneName/all/"}, method={RequestMethod.GET}, produces={"application/json"})
    @ResponseBody
    public List<ZoneName> findAllJson() {
        List<ZoneName> prop = this.zoneNameRepo.findAll();
        return prop;
    }

    @RequestMapping(value={"/json/ZoneName/lang/{code:[a-z]{2}-[A-Z]{2}}/all/"}, method={RequestMethod.GET}, produces={"application/json"})
    @ResponseBody
    public List<ZoneName> findByLocaleLanguageJson(@PathVariable String code) {
        List<ZoneName> propName = this.zoneNameRepo.findByLocaleLanguage(code);
        return new OrderByNameByLocale<ZoneName>().sort(propName, code);
    }
}

