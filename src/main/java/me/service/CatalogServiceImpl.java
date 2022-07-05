package me.service;

import lombok.extern.slf4j.Slf4j;
import me.jpa.CatalogEntity;
import me.jpa.CatalogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CatalogServiceImpl implements CatalogService {

    private CatalogRepository repository;
    private Environment env;

    @Autowired
    public CatalogServiceImpl(CatalogRepository repository, Environment env) {
        this.repository = repository;
        this.env = env;
    }

    @Override
    public Iterable<CatalogEntity> getAllCatalogs() {
        return repository.findAll();
    }

}
