package com.rhotiz.challenge.challenge.service;

import com.rhotiz.challenge.challenge.util.APIResponse;

import java.util.List;

public interface ListService {
    List<APIResponse> getResponse(String user, String url);
}
