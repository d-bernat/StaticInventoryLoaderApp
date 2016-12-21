package com.traveltainment.itea.bernat.staticinventoryloaderapp.controller;

import com.traveltainment.itea.bernat.staticinventoryloaderapp.domain.AreaName;
import com.traveltainment.itea.bernat.staticinventoryloaderapp.repository.AreaNameRepository;
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
public class AreaNameController {
    @Autowired
    private AreaNameRepository areaNameRepo;

    @RequestMapping(value={"/html/AreaName/page/{page:\\d+}/size/{size:\\d+}"}, method={RequestMethod.GET})
    public ModelAndView findPagedHtml(@PathVariable int page, @PathVariable int size) {
        Page<AreaName> propPage = this.areaNameRepo.findAll((Pageable)new PageRequest(page, size));
        return new ModelAndView("areanamelist", "areanames", (Object)propPage.getContent());
    }

    @RequestMapping(value={"/json/AreaName/page/{page:\\d+}/size/{size:\\d+}"}, method={RequestMethod.GET}, produces={"application/json"})
    @ResponseBody
    public Page<AreaName> findPagedJson(@PathVariable int page, @PathVariable int size) {
        Page<AreaName> propPage = this.areaNameRepo.findAll((Pageable)new PageRequest(page, size));
        return propPage;
    }

    @RequestMapping(value={"/json/AreaName/all/"}, method={RequestMethod.GET}, produces={"application/json"})
    @ResponseBody
    public List<AreaName> findAllJson() {
        List<AreaName> prop = this.areaNameRepo.findAll();
        return prop;
    }

    @RequestMapping(value={"/json/AreaName/lang/{code:[a-z]{2}-[A-Z]{2}}/all/"}, method={RequestMethod.GET}, produces={"application/json"})
    @ResponseBody
    public List<AreaName> findByLocaleLanguageJson(@PathVariable String code) {
        List<AreaName> propName = this.areaNameRepo.findByLocaleLanguage(code);
        return new OrderByNameByLocale<AreaName>().sort(propName, code);
    }
}

