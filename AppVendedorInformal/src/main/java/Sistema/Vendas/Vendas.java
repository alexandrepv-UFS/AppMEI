/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema.Vendas;

import Sistema.Clientes.Cliente;
import Sistema.Estoque.Estoque;
import Sistema.Produtos.Produto;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Alexandre
 */
public class Vendas {
    private double IDVenda;
    private Cliente cliente;
    private List<Produto> produto;
    private Estoque estoque;
    private Date dataCompra;
    private boolean consolidada;
    private boolean estornada;
    
    public Vendas() {
    }

    public Vendas(double IDVenda, Cliente cliente, List<Produto> produto,
            Estoque estoque, Date dataCompra) {
        this.IDVenda = IDVenda;
        this.cliente = cliente;
        this.produto = produto;
        this.estoque = estoque;
        this.dataCompra = dataCompra;
        this.consolidada = true;
        this.estornada = false;
    }
    
    
    public double getIDVenda() {
        return IDVenda;
    }

    public void setIDVenda(double IDVenda) {
        this.IDVenda = IDVenda;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Produto> getProduto() {
        return produto;
    }

    public void setProduto(List<Produto> produto) {
        this.produto = produto;
    }

    public Estoque getEstoque() {
        return estoque;
    }

    public void setEstoque(Estoque estoque) {
        this.estoque = estoque;
    }

    public Date getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(Date dataCompra) {
        this.dataCompra = dataCompra;
    }

    public boolean isConsolidada() {
        return consolidada;
    }

    public void setConsolidada(boolean consolidada) {
        this.consolidada = consolidada;
    }

    public boolean isEstornada() {
        return estornada;
    }

    public void setEstornada(boolean estornada) {
        this.estornada = estornada;
    }
    
    
}
