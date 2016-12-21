package com.traveltainment.itea.bernat.staticinventoryloaderapp.controller;

import com.traveltainment.itea.bernat.staticinventoryloaderapp.domain.ContinentName;
import com.traveltainment.itea.bernat.staticinventoryloaderapp.repository.ContinentNameRepository;
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
public class ContinentNameController {
    @Autowired
    private ContinentNameRepository continentNameRepo;

    @RequestMapping(value={"/html/ContinentName/page/{page:\\d+}/size/{size:\\d+}"}, method={RequestMethod.GET})
    public ModelAndView findPagedHtml(@PathVariable int page, @PathVariable int size) {
        Page<ContinentName> propPage = this.continentNameRepo.findAll((Pageable)new PageRequest(page, size));
        return new ModelAndView("continentnamelist", "continentnames", (Object)propPage.getContent());
    }

    @RequestMapping(value={"/json/ContinentName/page/{page:\\d+}/size/{size:\\d+}"}, method={RequestMethod.GET}, produces={"application/json"})
    @ResponseBody
    public Page<ContinentName> findPagedJson(@PathVariable int page, @PathVariable int size) {
        Page<ContinentName> propPage = this.continentNameRepo.findAll((Pageable)new PageRequest(page, size));
        return propPage;
    }

    @RequestMapping(value={"/json/ContinentName/all/"}, method={RequestMethod.GET}, produces={"application/json"})
    @ResponseBody
    public List<ContinentName> findAllJson() {
        List<ContinentName> prop = this.continentNameRepo.findAll();
        return prop;
    }

    @RequestMapping(value={"/json/ContinentName/lang/{code:[a-z]{2}-[A-Z]{2}}/all/"}, method={RequestMethod.GET}, produces={"application/json"})
    @ResponseBody
    public List<ContinentName> findByLocaleLanguageJson(@PathVariable String code) {
        List<ContinentName> propName = this.continentNameRepo.findByLocaleLanguage(code);
        return new OrderByNameByLocale<ContinentName>().sort(propName, code);
    }
}

