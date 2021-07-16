package Sistema.Clientes;

import Sistema.Clientes.Cliente;
import Sistema.Produtos.Produto;
import Sistema.Interfaces.Registravel;
import Sistema.Interfaces.Imprimivel;
import java.util.List;

/**
 *
 * @author Alexandre P Vieira
 */
public class RegistroCadastroClientes implements Imprimivel,Registravel {
    
    private List<Cliente> registroClientes;
    private List<Cliente> registroClientesExcluidos;
    
    @Override
    public void imprimir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void imprimirFiltro(String selecionado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean verificarDuplicidade(Produto produto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void cadastrar(Produto produto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void excluir(Produto produto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
}
