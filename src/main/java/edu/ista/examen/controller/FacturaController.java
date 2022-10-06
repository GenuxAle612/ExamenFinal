/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ista.examen.controller;

import edu.ista.examen.service.impl.FacturaServiceImpl;
import edu.ista.examen.service.impl.ClienteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Genesis
 */
@RestController
@RequestMapping("/api/factura")
public class FacturaController {
    
    @Autowired
    public FacturaServiceImpl facturaServiceImpl;
    @Autowired
    public ClienteServiceImpl clienteServiceImpl;
    
}
