package com.rhotiz.challenge.challenge.resources;

import com.rhotiz.challenge.challenge.service.ListService;
import com.rhotiz.challenge.challenge.util.APIResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ListResource {

    @Autowired
    private ListService listService;


    @RequestMapping(value = "/files/list", method = RequestMethod.GET)
    public List<APIResponse> listMethod() {
        String property = System.getProperty("user.home");
        return listService.getResponse("", property + "/files-test");
    }


}