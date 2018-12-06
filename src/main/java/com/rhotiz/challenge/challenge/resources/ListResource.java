package com.rhotiz.challenge.challenge.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ListResource {
    @RequestMapping(value = "/files/list", method = RequestMethod.GET)
    public String listMethod(){
        return "files/list";
    }
}