package com.example.urlshortener.service;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UrlShortenerServiceTest {

    @Autowired
    private UrlShortenerService urlShortenerService;

    @Test
    public void testShortenUrl() {
        String originalUrl = "http://example.com";
        String shortUrl = urlShortenerService.shortenUrl(originalUrl);
        assertNotNull(shortUrl);
    }

    @Test
    public void testGetOriginalUrl() {
        String originalUrl = "http://example.com";
        String shortUrl = urlShortenerService.shortenUrl(originalUrl);
        String fetchedOriginalUrl = urlShortenerService.getOriginalUrl(shortUrl);
        assertEquals(originalUrl, fetchedOriginalUrl);
    }
}
