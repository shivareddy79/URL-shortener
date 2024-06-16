package com.example.urlshortener.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.urlshortener.model.UrlMapping;

public interface UrlMappingRepository extends JpaRepository<UrlMapping, Long> {
    UrlMapping findByShortUrl(String shortUrl);
}
