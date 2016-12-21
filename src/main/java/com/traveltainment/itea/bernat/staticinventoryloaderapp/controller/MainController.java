package com.traveltainment.itea.bernat.staticinventoryloaderapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @RequestMapping(value={"/"})
    @ResponseBody
    public String hello() {
        return "OK";
    }
}

