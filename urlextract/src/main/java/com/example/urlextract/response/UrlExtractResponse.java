package com.example.urlextract.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Set;

public class UrlExtractResponse {

    @JsonProperty("exception")
    private boolean exception = false;

    @JsonProperty("message")
    private String message;

    @JsonProperty("total_links")
    private String totalLinks;

    @JsonProperty("total_images")
    private String totalImages;

    @JsonProperty("details")
    private Set<PageVO> pageVOList;

    public String getTotalLinks() {
        return totalLinks;
    }

    public void setTotalLinks(String totalLinks) {
        this.totalLinks = totalLinks;
    }

    public String getTotalImages() {
        return totalImages;
    }

    public void setTotalImages(String totalImages) {
        this.totalImages = totalImages;
    }

    public Set<PageVO> getPageVOList() {
        return pageVOList;
    }

    public void setPageVOList(Set<PageVO> pageVOList) {
        this.pageVOList = pageVOList;
    }

    public boolean isException() {
        return exception;
    }

    public void setException(boolean exception) {
        this.exception = exception;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
