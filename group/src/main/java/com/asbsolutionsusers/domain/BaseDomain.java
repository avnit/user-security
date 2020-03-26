package com.asbsolutionsusers.domain;

import com.asbsolutionsusers.repo.CustomRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.xml.transform.Transformer;
import java.io.Serializable;

public abstract class BaseDomain<T, ID extends Serializable> {
    protected final Transformer transformer;

    @Autowired
    public BaseDomain(CustomRepository repository, Transformer transformer) {
        this.transformer = transformer;
    }

}
