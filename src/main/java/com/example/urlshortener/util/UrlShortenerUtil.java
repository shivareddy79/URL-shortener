package com.example.urlshortener.util;

public class UrlShortenerUtil {
    public static String generateShortUrl(String originalUrl) {
        return Integer.toHexString(originalUrl.hashCode());
    }
}
