package Sistema.Produtos;

/**
 *
 * @author Daniel Santos Rodrigues
 * @author Alexandre Pereira Vieira
 */
public final class Rosto extends CosmeticoNatura{
    
    private String tipoTratamento;

    public Rosto(String tipoTratamento, String categoria, String marca, 
            String tipo, String familiaOlfativa, int IDProduto, String nome,
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
