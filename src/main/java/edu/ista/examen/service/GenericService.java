/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ista.examen.service;

import java.io.Serializable;
import java.util.Optional;

/**
 *
 * @author Genesis
 */
public interface GenericService<T, ID> extends Serializable {
    //Crud
    //Save
    T save(T t);
    //Read

    Iterable<T> findAll();

    //Delete
    void deleteByID(ID id);
    
    //Read by ID
    Optional<T>findByID(ID Id);
}
