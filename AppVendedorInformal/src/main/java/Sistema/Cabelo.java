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
public class Cabelo extends CosmeticoNatura{
    private String fragancia, familiaOlfativa, tipoCabelo;

    public Cabelo(String fragancia, String familiaOlfativa, String tipoCabelo, String categoria, String marca, String tipo, double IDProduto, String nome, String publico, String genero, String modelo, String fabricante, int quantidade, Double precoVenda) {
        super(categoria, marca, tipo, IDProduto, nome, publico, genero, modelo, fabricante, quantidade, precoVenda);
        this.fragancia = fragancia;
        this.familiaOlfativa = familiaOlfativa;
        this.tipoCabelo = tipoCabelo;
    }

    public void setFragancia(String fragancia) {
        this.fragancia = fragancia;
    }

    public String getFragancia() {
        return fragancia;
    }

    public void setFamiliaOlfativa(String familiaOlfativa) {
        this.familiaOlfativa = familiaOlfativa;
    }

    public String getFamiliaOlfativa() {
        return familiaOlfativa;
    }

    public void setTipoCabelo(String tipoCabelo) {
        this.tipoCabelo = tipoCabelo;
    }

    public String getTipoCabelo() {
        return tipoCabelo;
    }
    
    
}
