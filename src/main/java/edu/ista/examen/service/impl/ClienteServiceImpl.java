/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ista.examen.service.impl;

import edu.ista.examen.model.Cliente;
import edu.ista.examen.repository.ClienteRepository;
import edu.ista.examen.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author Genesis
 */
@Service
public class ClienteServiceImpl extends GenericServiceImpl<Cliente, Integer> implements ClienteService{
    
    @Autowired
    private ClienteRepository clienteRepository;
    
    @Override
    public JpaRepository<Cliente, Integer> jpaRepository() {
        return clienteRepository;
    }
    
}
