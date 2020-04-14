package com.example.urlextract.controller;

import com.example.urlextract.response.UrlExtractResponse;
import com.example.urlextract.service.UrlExtractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.net.URL;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class UrlExtract {

    @Autowired
    private UrlExtractService urlExtractService;

    private static final int MAX_DEPTH = 3;

    @GetMapping("/extractUrl")
    public UrlExtractResponse extractUrls(@RequestParam("url") URL url
            , @RequestParam("depth") Optional<Integer> maxDepth) {
        return urlExtractService.extractLinks(url, maxDepth.orElse(MAX_DEPTH));
    }

}
