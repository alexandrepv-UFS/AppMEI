package Sistema;

import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Alexandre Pereira Vieira
 */
public class RegistroCadastroProdutos implements Registravel, Arquivavel {
    
    private List<Produto> produtos;
    private List<Produto> produtosExcluidos;
    
    @Override
    public boolean verificarDuplicidade(Produto produto) {
        boolean duplo;
        duplo = false;
        for (Produto produto1 : produtos) {
            if (produto instanceof produto1) {
                if (duplo) {
                    
                }
            }
        }
        return;
    }
    

    @Override
    public void cadastrar(Produto produto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void excluir(Produto produto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

    @Override
    public boolean verificarDuplicidade(Produto produto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
