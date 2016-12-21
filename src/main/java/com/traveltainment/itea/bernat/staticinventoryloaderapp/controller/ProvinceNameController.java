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

import com.traveltainment.itea.bernat.staticinventoryloaderapp.domain.ProvinceName;
import com.traveltainment.itea.bernat.staticinventoryloaderapp.repository.ProvinceNameRepository;
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
public class ProvinceNameController {
    @Autowired
    private ProvinceNameRepository provinceNameRepo;

    @RequestMapping(value={"/html/ProvinceName/page/{page:\\d+}/size/{size:\\d+}"}, method={RequestMethod.GET})
    public ModelAndView findPagedHtml(@PathVariable int page, @PathVariable int size) {
        Page<ProvinceName> propPage = this.provinceNameRepo.findAll((Pageable)new PageRequest(page, size));
        return new ModelAndView("provincenamelist", "provincenames", (Object)propPage.getContent());
    }

    @RequestMapping(value={"/json/ProvinceName/page/{page:\\d+}/size/{size:\\d+}"}, method={RequestMethod.GET}, produces={"application/json"})
    @ResponseBody
    public Page<ProvinceName> findPagedJson(@PathVariable int page, @PathVariable int size) {
        Page<ProvinceName> propPage = this.provinceNameRepo.findAll((Pageable)new PageRequest(page, size));
        return propPage;
    }

    @RequestMapping(value={"/json/ProvinceName/all/"}, method={RequestMethod.GET}, produces={"application/json"})
    @ResponseBody
    public List<ProvinceName> findAllJson() {
        List<ProvinceName> prop = this.provinceNameRepo.findAll();
        return prop;
    }

    @RequestMapping(value={"/json/ProvinceName/lang/{code:[a-z]{2}-[A-Z]{2}}/all/"}, method={RequestMethod.GET}, produces={"application/json"})
    @ResponseBody
    public List<ProvinceName> findByLocaleLanguageJson(@PathVariable String code) {
        List<ProvinceName> propName = this.provinceNameRepo.findByLocaleLanguage(code);
        return new OrderByNameByLocale<ProvinceName>().sort(propName, code);
    }
}

