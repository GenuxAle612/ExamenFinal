/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ista.examen.service.impl;

import edu.ista.examen.model.Factura;
import edu.ista.examen.repository.FacturaRepository;
import edu.ista.examen.service.FacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author Genesis
 */
@Service
public class FacturaServiceImpl extends GenericServiceImpl<Factura, Integer> implements FacturaService{
    
    @Autowired
    private FacturaRepository facturaRepository;
    
    @Override
    public JpaRepository<Factura, Integer> jpaRepository() {
        return facturaRepository;
    }
    
}
