package com.financiera.reto.controller;

import com.financiera.reto.entity.ClienteEntity;
import com.financiera.reto.entity.ProductoEntity;
import com.financiera.reto.service.ProductoService;
import com.financiera.reto.service.VentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class ProductosController {
    @Autowired
    ProductoService productoService;

    @RequestMapping("/listProducts")
    public ResponseEntity<?> list() {
        return new ResponseEntity<>(productoService.findAll(), HttpStatus.OK) ;
    }

    @PostMapping("/saveProduct")
    public ResponseEntity<?> save(@RequestBody ProductoEntity model) {
        return new ResponseEntity<>(productoService.save(model), HttpStatus.OK) ;
    }
    @DeleteMapping("/deleteProduct/{id}")
    public ResponseEntity<?> delete(@PathVariable Integer id) {
        return new ResponseEntity<>(productoService.delete(id), HttpStatus.OK) ;
    }
}
