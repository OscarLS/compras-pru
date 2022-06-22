/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mx.tecnm.oaxaca.servicioweb.controller;

import edu.mx.tecnm.oaxaca.servicioweb.model.CompraModel;
import edu.mx.tecnm.oaxaca.servicioweb.service.CompraService;
import edu.mx.tecnm.oaxaca.servicioweb.utils.CustomResponse;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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
 * @author Oscar
 */
@RestController
@RequestMapping("/api/v1/compra")
@CrossOrigin(origins = "*")
public class CompraController {
    @Autowired
    private CompraService compraService;

    
    @PostMapping("/")
    public CustomResponse createCompra(@RequestBody CompraModel compra) {
        CustomResponse customResponse = new CustomResponse();
        compraService.createCompra(compra);
        return customResponse;
    }
    
    @GetMapping("/{idCompra}")
    public CustomResponse getCompra(@PathVariable Integer idCompra){
        CustomResponse customResponse = new CustomResponse();
        customResponse.setData(compraService.getCompra(idCompra));
        return customResponse;
    }
    
    @GetMapping("/compras")
    public CustomResponse getCompras(){
        CustomResponse customResponse = new CustomResponse();
        customResponse.setData(compraService.getCompras());
        return customResponse;
    }
    
    @PutMapping("/{idCompra}")
    public CustomResponse updateCompra(@RequestBody CompraModel compra,@PathVariable Integer idCompra){
        CustomResponse customResponse = new CustomResponse();
        compraService.updateCompra(compra, idCompra);
        return customResponse;
    }
    
    @DeleteMapping("/{idCompra}")
    public CustomResponse deleteCompra(@PathVariable Integer idCompra){
        CustomResponse customResponse = new CustomResponse();
        compraService.deleteCompra(idCompra);
        return customResponse;
    }
}
