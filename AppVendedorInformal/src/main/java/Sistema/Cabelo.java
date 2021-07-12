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

    
    public Cabelo(String categoria, String marca, String tipo, String fragancia
            , String familiaOlfativa, String tipoCabelo) {
        this.setCategoria(categoria);
        this.setMarca(marca);
        this.setTipo(tipo);
        this.setFragancia(fragancia);
        this.setFamiliaOlfativa(familiaOlfativa);
        this.setTipoCabelo(tipoCabelo);
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
