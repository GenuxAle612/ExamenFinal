/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ista.examen.service.impl;

import edu.ista.examen.service.GenericService;
import java.io.Serializable;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author Genesis
 */
@Service
public abstract class GenericServiceImpl <T, ID extends Serializable> implements GenericService<T, ID>{
    
    @Autowired
    public abstract JpaRepository<T, ID> jpaRepository();
    
    @Override
    public T save(T t) {
        return jpaRepository().save(t);
    }

    @Override
    public Iterable<T> findAll() {
        return jpaRepository().findAll();
    }

    @Override
    public void deleteByID(ID id) {
        jpaRepository().deleteById(id);
    }

    @Override
    public Optional<T> findByID(ID Id) {
        return jpaRepository().findById(Id);
    }
    
}
