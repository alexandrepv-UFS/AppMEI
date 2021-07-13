/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;

/**
 *
 * @author Daniel Santos Rodrigues
 */
public abstract class CosmeticoNatura extends Produto{
    
    private String categoria, marca, tipo, familiaOlfativa;

    public CosmeticoNatura(String categoria, String marca, String tipo, String familiaOlfativa, double IDProduto, String nome, int quantidade, Double precoVenda) {
        super(IDProduto, nome, quantidade, precoVenda);
        this.categoria = categoria;
        this.marca = marca;
        this.tipo = tipo;
        this.familiaOlfativa = familiaOlfativa;
    }

    
    
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getFamiliaOlfativa() {
        return familiaOlfativa;
    }

    public void setFamiliaOlfativa(String familiaOlfativa) {
        this.familiaOlfativa = familiaOlfativa;
    }
    
    
}
