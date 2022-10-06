/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ista.examen.controller;

import edu.ista.examen.model.Cliente;
import edu.ista.examen.service.impl.ClienteServiceImpl;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Genesis
 */
@RestController
@RequestMapping("/api/cliente")
public class ClienteController {
    @Autowired
    public ClienteServiceImpl clienteServiceImpl;
    
    @PostMapping
    public ResponseEntity<?> create(@RequestBody Cliente cliente) {
        if (cliente.getDni().equals("") && cliente.getNombre().equals("") && cliente.getApellido().equals("") && cliente.getTelefono().equals("")) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Debe rellenar todos los campos");
        } else {
            return ResponseEntity.status(HttpStatus.CREATED).body(clienteServiceImpl.save(cliente));
        }
    }

    @GetMapping
    public List<Cliente> findAll() {
        return StreamSupport.stream(clienteServiceImpl.findAll().spliterator(), false).collect(Collectors.toList());
    }
    
    
    
}
