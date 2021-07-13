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
public final class CorpoBanho extends CosmeticoNatura{
    
    private String fragancia;

    public CorpoBanho(String fragancia, String categoria, String marca, 
            String tipo, String familiaOlfativa, double IDProduto, String nome,
            int quantidade, Double precoVenda) {
        super(categoria, marca, tipo, familiaOlfativa, IDProduto, nome,
                quantidade, precoVenda);
        this.fragancia = fragancia;
    }

    

    
    public String getFragancia() {
        return fragancia;
    }

    public void setFragancia(String fragancia) {
        this.fragancia = fragancia;
    }
    
    
    
   
    
}
