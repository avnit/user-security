package com.asbsolutionsusers.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

public interface CustomerRepository <T, ID extends Serializable>
        extends JpaSpecificationExecutor<T>, JpaRepository<T, ID> {

}