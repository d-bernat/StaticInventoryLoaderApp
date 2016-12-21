/*
 * Decompiled with CFR 0_119.
 * 
 * Could not load the following classes:
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.data.domain.Page
 *  org.springframework.data.domain.PageRequest
 *  org.springframework.data.domain.Pageable
 *  org.springframework.stereotype.Controller
 *  org.springframework.web.bind.annotation.PathVariable
 *  org.springframework.web.bind.annotation.RequestMapping
 *  org.springframework.web.bind.annotation.RequestMethod
 *  org.springframework.web.bind.annotation.ResponseBody
 *  org.springframework.web.servlet.ModelAndView
 */
package com.traveltainment.itea.bernat.staticinventoryloaderapp.controller;

import com.traveltainment.itea.bernat.staticinventoryloaderapp.domain.RegionName;
import com.traveltainment.itea.bernat.staticinventoryloaderapp.repository.RegionNameRepository;
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
public class RegionNameController {
    @Autowired
    private RegionNameRepository regionNameRepo;

    @RequestMapping(value={"/html/RegionName/page/{page:\\d+}/size/{size:\\d+}"}, method={RequestMethod.GET})
    public ModelAndView findPagedHtml(@PathVariable int page, @PathVariable int size) {
        Page<RegionName> propPage = this.regionNameRepo.findAll((Pageable)new PageRequest(page, size));
        return new ModelAndView("regionnamelist", "regionnames", (Object)propPage.getContent());
    }

    @RequestMapping(value={"/json/RegionName/page/{page:\\d+}/size/{size:\\d+}"}, method={RequestMethod.GET}, produces={"application/json"})
    @ResponseBody
    public Page<RegionName> findPagedJson(@PathVariable int page, @PathVariable int size) {
        Page<RegionName> propPage = this.regionNameRepo.findAll((Pageable)new PageRequest(page, size));
        return propPage;
    }

    @RequestMapping(value={"/json/RegionName/all/"}, method={RequestMethod.GET}, produces={"application/json"})
    @ResponseBody
    public List<RegionName> findAllJson() {
        List<RegionName> prop = this.regionNameRepo.findAll();
        return prop;
    }

    @RequestMapping(value={"/json/RegionName/lang/{code:[a-z]{2}-[A-Z]{2}}/all/"}, method={RequestMethod.GET}, produces={"application/json"})
    @ResponseBody
    public List<RegionName> findByLocaleLanguageJson(@PathVariable String code) {
        List<RegionName> propName = this.regionNameRepo.findByLocaleLanguage(code);
        return new OrderByNameByLocale<RegionName>().sort(propName, code);
    }
}

