package com.financiera.reto.controller;

import com.financiera.reto.service.VentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class VentaController {
    @Autowired
    VentaService ventaService;
    @RequestMapping("/listSales")
    public ResponseEntity<?> listSales() {
        return new ResponseEntity<>(ventaService.findAll(), HttpStatus.OK) ;
    }
    @RequestMapping("/listSalesByDate")
    public ResponseEntity<?> listSalesByDate(
            @RequestParam(name = "desde", required = true) String desde,
            @RequestParam(name = "hastA", required = true) String hasta
    ) {
        return new ResponseEntity<>(ventaService.findByDate(desde,hasta), HttpStatus.OK) ;
    }
    @RequestMapping("/listSalesById/{id}")
    public ResponseEntity<?> listSalesByDate(
            @PathVariable Integer id
            ) {
        return new ResponseEntity<>(ventaService.findById(id), HttpStatus.OK) ;
    }

}
