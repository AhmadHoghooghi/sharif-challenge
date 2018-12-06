package com.rhotiz.challenge.challenge.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MKDIRResource {
    @RequestMapping(value = "/files/mkdir", method = RequestMethod.GET)
    public String mkdirMethod(){
        return "files/mkdir";
    }
}
