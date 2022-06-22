/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mx.tecnm.oaxaca.servicioweb.implemet.service;

import edu.mx.tecnm.oaxaca.servicioweb.model.CompraModel;
import edu.mx.tecnm.oaxaca.servicioweb.repository.CompraRepository;
import edu.mx.tecnm.oaxaca.servicioweb.service.CompraService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Oscar
 */
@Service
public class CompraServiceImplement implements CompraService{
    @Autowired
    private CompraRepository compraRepository;

    @Override
    public void createCompra(CompraModel compra) {
        compraRepository.save(compra);
    }

    @Override
    public Optional<CompraModel> getCompra(Integer idCompra) {
        return compraRepository.findById(idCompra);
    }
    
    @Override
    public List<CompraModel> getCompras() {
        return compraRepository.findAll();
    }

    @Override
    public void updateCompra(CompraModel compraModel, Integer idCompra) {
        compraModel.setIdCompra(idCompra);
        compraRepository.save(compraModel);
    }

    @Override
    public void deleteCompra(Integer idCompra) {
       compraRepository.deleteById(idCompra);
    }
}
