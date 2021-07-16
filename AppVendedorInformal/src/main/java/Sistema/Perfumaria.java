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
public final class Perfumaria extends CosmeticoNatura{
    
    private String fragancia;

    public Perfumaria(String fragancia, String categoria, String marca, 
            String tipo, String familiaOlfativa, int IDProduto, String nome,
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

    @Override
    public String toString() {
        return super.toString() + "ID " +this.getIDProduto()+ "Perfumaria{" + "fragancia=" + fragancia + '}';
    }

    @Override
    public void arquivar(long ID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void extrair(long ID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void verificarExistencia(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    

    

    
    
    
    
    
}
