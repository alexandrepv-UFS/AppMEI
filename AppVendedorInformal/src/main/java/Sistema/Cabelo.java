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
public final class Cabelo extends CosmeticoNatura{
    
    private String tipoCabelo;

    public Cabelo(String tipoCabelo, String categoria, String marca, 
            String tipo, String familiaOlfativa, int IDProduto, String nome,
            int quantidade, Double precoVenda) {
        super(categoria, marca, tipo, familiaOlfativa, IDProduto, nome, 
                quantidade, precoVenda);
        this.tipoCabelo = tipoCabelo;
    }

    public void setTipoCabelo(String tipoCabelo) {
        this.tipoCabelo = tipoCabelo;
    }

    public String getTipoCabelo() {
        return tipoCabelo;
    }
    
    
}
