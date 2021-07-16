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
