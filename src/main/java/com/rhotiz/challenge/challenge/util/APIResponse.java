package com.rhotiz.challenge.challenge.util;

public class APIResponse {
    private String url;
    private long contentLength;
    private String sha1;
    private String contentType;

    public APIResponse(String url, long contentLength, String sha1, String contentType) {
        this.url = url;
        this.contentLength = contentLength;
        this.sha1 = sha1;
        this.contentType = contentType;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public long getContentLength() {
        return contentLength;
    }

    public void setContentLength(long contentLength) {
        this.contentLength = contentLength;
    }

    public String getSha1() {
        return sha1;
    }

    public void setSha1(String sha1) {
        this.sha1 = sha1;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }
}
