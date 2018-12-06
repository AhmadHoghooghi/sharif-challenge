package com.rhotiz.challenge.challenge.resources;

import com.rhotiz.challenge.challenge.util.APIResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TestResource {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public List<APIResponse> testResource() {
        List<APIResponse> list = new ArrayList<>();
        list.add(new APIResponse("a", 12, "12345", "application-pdf"));
        list.add(new APIResponse("b", 12, "12345", "application-jpg"));

        return list;
    }
}
