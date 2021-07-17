package Sistema.Produtos;

//import Sistema.Produtos.Produto;
import Sistema.Interfaces.Registravel;
import Sistema.Interfaces.Arquivavel;
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
        
        boolean check = false;
        
        for (Produto produto1 : produtos) {
            if (produto1.getClass().getName().equalsIgnoreCase(produto.getClass()
                .getName())) {
                if (produto1.getNome().equalsIgnoreCase(produto.getNome())) {
                    check = true;
                }
            }
        }
        return check;
    }
    

    @Override
    public void cadastrar(Produto produto) {
        try {
            if (verificarDuplicidade(produto)) {
                System.out.println("Produto já cadastrado");
                return;
            }
            // pegando dados da interfaceGrafica e colocando na List produtos
            this.produtos.add(produto);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
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

    
    
}
