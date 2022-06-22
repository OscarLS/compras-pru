/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.mx.tecnm.oaxaca.servicioweb.service;

import edu.mx.tecnm.oaxaca.servicioweb.model.CompraModel;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Oscar
 */
public interface CompraService {
    public void createCompra(CompraModel compra);
    
    public Optional<CompraModel> getCompra(Integer idCompra);
    
    public List<CompraModel> getCompras();
    
    public void updateCompra(CompraModel compraModel,Integer idCompra);
    
    public void deleteCompra(Integer idCompra);
}
