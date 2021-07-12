/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;

import java.util.List;

/**
 *
 * @author Alexandre
 */
public class Estoque {
    private int IDEstoque;
    private String nome;
    private List<Produto> produtos;
    private int capacidade;

    public Estoque() {
    }

    public Estoque(int IDEstoque, String nome, List<Produto> podutos, int capacidade) {
        this.IDEstoque = IDEstoque;
        this.nome = nome;
        this.produtos = podutos;
        this.capacidade = capacidade;
    }
    
    
    
    public int getIDEstoque() {
        return IDEstoque;
    }

    public void setIDEstoque(int IDEstoque) {
        this.IDEstoque = IDEstoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setPodutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
    
    
}
