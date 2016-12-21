package com.traveltainment.itea.bernat.staticinventoryloaderapp.controller;

import com.traveltainment.itea.bernat.staticinventoryloaderapp.domain.Country;
import com.traveltainment.itea.bernat.staticinventoryloaderapp.repository.CountryRepository;
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
public class CountryController {
    @Autowired
    private CountryRepository countryRepo;

    @RequestMapping(value={"/html/Country/page/{page:\\d+}/size/{size:\\d+}"}, method={RequestMethod.GET})
    public ModelAndView findPagedHtml(@PathVariable int page, @PathVariable int size) {
        Page<Country> propPage = this.countryRepo.findAll((Pageable)new PageRequest(page, size));
        return new ModelAndView("countrylist", "countries", (Object)propPage.getContent());
    }

    @RequestMapping(value={"/json/Country/page/{page:\\d+}/size/{size:\\d+}"}, method={RequestMethod.GET}, produces={"application/json"})
    @ResponseBody
    public Page<Country> findPagedJson(@PathVariable int page, @PathVariable int size) {
        Page<Country> propPage = this.countryRepo.findAll((Pageable)new PageRequest(page, size));
        return propPage;
    }

    @RequestMapping(value={"/json/Country/all/"}, method={RequestMethod.GET}, produces={"application/json"})
    @ResponseBody
    public List<Country> findAllJson() {
        List<Country> prop = this.countryRepo.findAll();
        return prop;
    }
}

