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
public class Rosto extends CosmeticoNatura{
    private String fragancia, familiaOlfativa, tipoTratamento;

    
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

    public void setTipoTratamento(String tipoTratamento) {
        this.tipoTratamento = tipoTratamento;
    }

    public String getTipoTratamento() {
        return tipoTratamento;
    }
    
    
}
