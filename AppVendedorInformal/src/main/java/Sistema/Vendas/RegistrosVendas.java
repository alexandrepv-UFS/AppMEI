/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema.Vendas;

import java.util.List;
/**
 *
 * @author Alexandre
 */
public class RegistrosVendas {
    
    private List<Vendas> registros;

    public RegistrosVendas(List<Vendas> registros) {
        this.registros = registros;
    }

    public RegistrosVendas() {
    }
    
    
    
    public List<Vendas> getRegistros() {
        return registros;
    }

    public void setRegistros(List<Vendas> registros) {
        this.registros = registros;
    }
    
    
    
}
