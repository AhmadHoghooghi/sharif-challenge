package com.rhotiz.challenge.challenge.service;

import com.rhotiz.challenge.challenge.util.APIResponse;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Service
public class ListServiceImpl implements ListService {

    private List<APIResponse> responses = new ArrayList<>();

    @Override
    public List<APIResponse> getResponse(String user, String url) {

        //String stringPath="./src/main/resources/files-test/0";

        Path path = new File(url).toPath();
        try {
            Files.walk(path)
                    .sorted(Comparator.reverseOrder())
                    .map(Path::toFile)
                    .forEach(this::addToResponseList);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return responses;
    }

    private void addToResponseList(File file){

        if (!file.isDirectory()) {
            APIResponse response = new APIResponse(file.getPath(), file.length(), "", getContentType(file.getPath()));
            responses.add(response);
        }

    }

    private String getContentType(String path) {
        int lastDotIndex = path.lastIndexOf(".");
        String format = path.substring(lastDotIndex);
        String contentType = "";
        switch (format){
            case ".txt":
                contentType = "TEXT";
                break;
            case ".jpg":
                contentType = "PHOTO";
                break;
        }
        return contentType;
    }
}
