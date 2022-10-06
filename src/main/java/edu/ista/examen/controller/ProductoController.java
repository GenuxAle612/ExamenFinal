/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ista.examen.controller;

import edu.ista.examen.model.Factura;
import edu.ista.examen.model.Producto;
import edu.ista.examen.service.impl.FacturaServiceImpl;
import edu.ista.examen.service.impl.ProductoServiceImpl;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Genesis
 */
@RestController
@RequestMapping("/api/producto")
public class ProductoController {
     @Autowired
    public ProductoServiceImpl productoServiceImpl;
    @Autowired
    public FacturaServiceImpl facturaServiceImpl;
    
    private Optional<Producto> estudianteOptional;
    private Optional<Factura> cursoOptional;
    
    @PostMapping
    public ResponseEntity<?> create(@RequestBody Producto producto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(productoServiceImpl.save(producto));    
    }
    
    @GetMapping
    public List<Producto> findAll(){
        return StreamSupport.stream(productoServiceImpl.findAll().spliterator(), false).collect(Collectors.toList());
    }
    /*
    @PutMapping("/{idProducto}")
    public ResponseEntity<?> update (@PathVariable Integer idProducto, @RequestBody Producto producto){
        productoOptional = productoServiceImpl.findByID(idProducto);
        if (productoOptional.isPresent()){
            productoOptional.get().setCodigo(producto.getCodigo());
            productoOptional.get().setProducto(producto.getProducto());
            productoOptional.get().setCantidad(producto.getCantidad());
            productoOptional.get().setPrecio(producto.getPrecio());
            return ResponseEntity.status(HttpStatus.CREATED).body(productoServiceImpl.save(estudianteOptional.get()));
        }else{
            return ResponseEntity.notFound().build();
        }
    }
    
    //@DeleteMapping
    
    private ResponseEntity<Producto> getEstudianteResponseEntity(@PathVariable int idEstudiante, @PathVariable int idcurso){
        estudianteOptional = productoServiceImpl.findByID(idEstudiante);
        cursoOptional = facturaServiceImpl.findByID(idcurso);
        if (estudianteOptional.isPresent()){
            cursoOptional = facturaServiceImpl.findByID(idcurso);
            estudianteOptional.get().setCurso(new Curso (cursoOptional.get().getIdcurso(),
            cursoOptional.get().getParalelo(),
            cursoOptional.get().getGrado(),
            cursoOptional.get().getSeccion())
            );
            return ResponseEntity.status(HttpStatus.CREATED).body(productoServiceImpl.save(estudianteOptional.get()));
        }else{
            return ResponseEntity.notFound().build();
        }      
    }
    
    @PutMapping("/{idProducto}/{idFactura}")
    public ResponseEntity<Producto> asignar(@PathVariable int idProducto, @PathVariable int id) {
        return getProductoResponseEntity(idProducto, id);
    }

    @DeleteMapping("/{idProducto}")
    public ResponseEntity<?> delete(@PathVariable Integer idEstudiante) {
        estudianteOptional = productoServiceImpl.findByID(idEstudiante);
        if (estudianteOptional.isPresent()) {
            productoServiceImpl.deleteByID(idEstudiante);
            return ResponseEntity.status(HttpStatus.CREATED).body("ESTUDIANTE ELIMINADO SATISFATORIAMENTE");
        } else {
            return ResponseEntity.status(HttpStatus.CREATED).body("ESTUDIANTE no ELIMINADO SATISFATORIAMENTE");
        }
    }
 */
}
