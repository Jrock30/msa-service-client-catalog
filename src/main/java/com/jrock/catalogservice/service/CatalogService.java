package com.jrock.catalogservice.service;

import com.jrock.catalogservice.jpa.CatalogEntity;
import com.jrock.catalogservice.jpa.CatalogRepository;

public interface CatalogService {
    Iterable<CatalogEntity> getAllCatalogs();
}
