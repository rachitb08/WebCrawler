package com.example.urlextract.utils;

import java.net.URL;

public final class UrlExtractUtils {

    public static boolean isValidURL(URL url) {
        return url != null
                && ( url.getProtocol().startsWith("http") || url.getProtocol().startsWith("https") )
                && !url.getProtocol().endsWith("#");
    }
}
