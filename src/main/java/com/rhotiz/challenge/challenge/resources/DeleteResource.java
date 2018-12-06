package com.rhotiz.challenge.challenge.resources;

import com.rhotiz.challenge.challenge.service.DeleteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeleteResource {
    @Autowired
    private DeleteService deleteService;

    @RequestMapping(name = "/files", method = RequestMethod.DELETE)
    public void deleteMethod(@RequestBody String path) {
        deleteService.delete("",path);
    }


}
