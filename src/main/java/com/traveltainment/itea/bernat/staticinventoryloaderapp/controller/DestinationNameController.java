package com.traveltainment.itea.bernat.staticinventoryloaderapp.controller;

import com.traveltainment.itea.bernat.staticinventoryloaderapp.domain.DestinationName;
import com.traveltainment.itea.bernat.staticinventoryloaderapp.repository.DestinationNameRepository;
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
public class DestinationNameController {
    @Autowired
    private DestinationNameRepository destNameRepo;

    @RequestMapping(value={"/html/DestinationName/page/{page:\\d+}/size/{size:\\d+}"}, method={RequestMethod.GET})
    public ModelAndView findPagedHtml(@PathVariable int page, @PathVariable int size) {
        Page<DestinationName> propPage = this.destNameRepo.findAll((Pageable)new PageRequest(page, size));
        return new ModelAndView("destinationnamelist", "destinationnames", (Object)propPage.getContent());
    }

    @RequestMapping(value={"/json/DestinationName/page/{page:\\d+}/size/{size:\\d+}"}, method={RequestMethod.GET}, produces={"application/json"})
    @ResponseBody
    public Page<DestinationName> findPagedJson(@PathVariable int page, @PathVariable int size) {
        Page<DestinationName> propPage = this.destNameRepo.findAll((Pageable)new PageRequest(page, size));
        return propPage;
    }

    @RequestMapping(value={"/json/DestinationName/all/"}, method={RequestMethod.GET}, produces={"application/json"})
    @ResponseBody
    public List<DestinationName> findAllJson() {
        List<DestinationName> prop = this.destNameRepo.findAll();
        return prop;
    }

    @RequestMapping(value={"/json/DestinationName/lang/{code:[a-z]{2}-[A-Z]{2}}/all/"}, method={RequestMethod.GET}, produces={"application/json"})
    @ResponseBody
    public List<DestinationName> findByLocaleLanguageJson(@PathVariable String code) {
        List<DestinationName> propName = this.destNameRepo.findByLocaleLanguage(code);
        return new OrderByNameByLocale<DestinationName>().sort(propName, code);
    }
}

