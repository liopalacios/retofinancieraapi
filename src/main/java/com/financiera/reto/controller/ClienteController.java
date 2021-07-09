package com.financiera.reto.controller;

import com.financiera.reto.entity.ClienteEntity;
import com.financiera.reto.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class ClienteController {
    @Autowired
    ClienteService clienteService;
    @GetMapping("/listClients")
    public ResponseEntity<?> list() {
        return new ResponseEntity<>(clienteService.findAllClients(), HttpStatus.OK) ;
    }
    @PostMapping("/saveClient")
    public ResponseEntity<?> save(@RequestBody ClienteEntity model) {
        System.out.print(model);
        return new ResponseEntity<>(clienteService.save(model), HttpStatus.OK) ;
    }
}
