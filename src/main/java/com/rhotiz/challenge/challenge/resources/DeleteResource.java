package com.rhotiz.challenge.challenge.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeleteResource {

    @RequestMapping(name = "/files", method = RequestMethod.DELETE)
    public String deleteMethod() {
        return "delete";
    }
}
