package com.traveltainment.itea.bernat.staticinventoryloaderapp.controller;

import com.traveltainment.itea.bernat.staticinventoryloaderapp.domain.CountryName;
import com.traveltainment.itea.bernat.staticinventoryloaderapp.repository.CountryNameRepository;
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
public class CountryNameController {
    @Autowired
    private CountryNameRepository countryNameRepo;

    @RequestMapping(value={"/html/CountryName/page/{page:\\d+}/size/{size:\\d+}"}, method={RequestMethod.GET})
    public ModelAndView findPagedHtml(@PathVariable int page, @PathVariable int size) {
        Page<CountryName> propPage = this.countryNameRepo.findAll((Pageable)new PageRequest(page, size));
        return new ModelAndView("countrynamelist", "countrynames", (Object)propPage.getContent());
    }

    @RequestMapping(value={"/json/CountryName/page/{page:\\d+}/size/{size:\\d+}"}, method={RequestMethod.GET}, produces={"application/json"})
    @ResponseBody
    public Page<CountryName> findPagedJson(@PathVariable int page, @PathVariable int size) {
        Page<CountryName> propPage = this.countryNameRepo.findAll((Pageable)new PageRequest(page, size));
        return propPage;
    }

    @RequestMapping(value={"/json/CountryName/all/"}, method={RequestMethod.GET}, produces={"application/json"})
    @ResponseBody
    public List<CountryName> findAllJson() {
        List<CountryName> prop = this.countryNameRepo.findAll();
        return prop;
    }

    @RequestMapping(value={"/json/CountryName/lang/{code:[a-z]{2}-[A-Z]{2}}/all/"}, method={RequestMethod.GET}, produces={"application/json"})
    @ResponseBody
    public List<CountryName> findByLocaleLanguageJson(@PathVariable String code) {
        List<CountryName> propName = this.countryNameRepo.findByLocaleLanguage(code);
        return new OrderByNameByLocale<CountryName>().sort(propName, code);
    }
}

