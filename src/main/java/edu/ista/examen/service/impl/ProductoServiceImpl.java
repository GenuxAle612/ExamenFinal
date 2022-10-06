/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ista.examen.service.impl;

import edu.ista.examen.model.Producto;
import edu.ista.examen.repository.ProductoRepository;
import edu.ista.examen.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author Genesis
 */
@Service
public class ProductoServiceImpl extends GenericServiceImpl<Producto, Integer> implements ProductoService{
    
    @Autowired
    private ProductoRepository productoRepository;
    
    @Override
    public JpaRepository<Producto, Integer> jpaRepository() {
        return productoRepository;
    }
    
}
