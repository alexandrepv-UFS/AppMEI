/*
 * To change this license header, choose License Headers in Project Properties.
 * and open the template in the editor.
 */
package Sistema;

/**
 *
 * @author Daniel Santos Rodrigues
 */
public class Produto {
    private double IDProduto;
    private String nome, publico, genero, modelo, fabricante;
    private double precoVenda;
    private int quantidade;
    public Produto() {
        
    }
    
    public Produto(double IDProduto, String nome, String publico, String genero,
            String modelo, String fabricante, int quantidade,
            Double precoVenda) {
        
        this.IDProduto = IDProduto;
        this.nome = nome;
        this.publico = publico;
        this.genero = genero;
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.quantidade = quantidade;
        this.precoVenda = precoVenda;
        
    }
    
    public void entradaEstoque(double quantidade) {
        
    }
    
    public void saidaEstoque() {
        
    }
    
    public void operation3() {
        
    }

    
    public void setIDProduto(double IDProduto) {
        this.IDProduto = IDProduto;
    }

    public double getIDProduto() {
        return IDProduto;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setPublico(String publico) {
        this.publico = publico;
    }

    public String getPublico() {
        return publico;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getFabricante() {
        return fabricante;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }
    
    
    
}
