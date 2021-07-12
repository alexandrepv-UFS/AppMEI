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
public class CorpoBanho extends CosmeticoNatura{
    private String fragancia, familiaOlfativa;

    
    public CorpoBanho(String categoria, String marca, String tipo, String fragancia, String familiaOlfativa) {
        this.setCategoria(categoria);
        this.setMarca(marca);
        this.setTipo(tipo);
        this.setFragancia(fragancia);
        this.setFamiliaOlfativa(familiaOlfativa);        
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
    
    
}
