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
public final class Rosto extends CosmeticoNatura{
    
    private String tipoTratamento;

    public Rosto(String tipoTratamento, String categoria, String marca, 
            String tipo, String familiaOlfativa, double IDProduto, String nome,
            int quantidade, Double precoVenda) {
        super(categoria, marca, tipo, familiaOlfativa, IDProduto, nome,
                quantidade, precoVenda);
        this.tipoTratamento = tipoTratamento;
    }

    public void setTipoTratamento(String tipoTratamento) {
        this.tipoTratamento = tipoTratamento;
    }

    public String getTipoTratamento() {
        return tipoTratamento;
    }
    
    
}
