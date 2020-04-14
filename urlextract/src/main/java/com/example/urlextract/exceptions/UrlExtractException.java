package com.example.urlextract.exceptions;

public class UrlExtractException extends Exception {

    public UrlExtractException(String message) {
        super(message);
    }

    public UrlExtractException(String message, Throwable cause) {
        super(message, cause);
    }

    public UrlExtractException(Throwable cause) {
        super(cause);
    }
}
