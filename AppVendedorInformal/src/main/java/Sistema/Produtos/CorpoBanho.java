package Sistema.Produtos;

/**
 *
 * @author Daniel Santos Rodrigues
 * @author Alexandre Pereira Vieira
 */
public final class CorpoBanho extends CosmeticoNatura{
    
    private String fragancia;

    public CorpoBanho(String fragancia, String categoria, String marca, 
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
