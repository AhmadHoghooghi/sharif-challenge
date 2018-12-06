package com.rhotiz.challenge.challenge.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;

@Service
public class DeleteServiceImpl implements DeleteService {

    @Autowired
    private DeleteService deleteService;

    @RequestMapping(value = "/files/{path}", method = RequestMethod.DELETE)
    public void delete(String user, @PathVariable String path) {
        String property = System.getProperty("user.home");
        String pathname = property +"\\"+ path;
        System.out.println(pathname);
        File file = new File(pathname);
        boolean deleted = file.delete();
        if (!deleted){
            throw new RuntimeException("File Not Found");
        }
    }
}
