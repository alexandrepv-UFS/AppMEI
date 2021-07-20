package Sistema.Produtos;

//import Sistema.Produtos.Produto;
import Arquivos.GravadorArquivo;
import Sistema.Interfaces.Registravel;
import Sistema.Interfaces.Arquivavel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alexandre Pereira Vieira
 */
public class RegistroCadastroProdutos implements Registravel, Arquivavel {
    
    private List<Produto> produtos;
    private List<Produto> produtosExcluidos;

    public RegistroCadastroProdutos() {
        produtos = new ArrayList();
        produtosExcluidos = new ArrayList();
    }
    
    
    
    public RegistroCadastroProdutos(List<Produto> produtos) {
        produtos = new ArrayList();
        produtosExcluidos = new ArrayList();
        this.iniciar(produtos);
    }
    
    
    
    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public List<Produto> getProdutosExcluidos() {
        return produtosExcluidos;
    }

    public void setProdutosExcluidos(List<Produto> produtosExcluidos) {
        this.produtosExcluidos = produtosExcluidos;
    }

    @Override
    public String toString() {
        return "RegistroCadastroProdutos{" + "produtos=" + produtos + ", produtosExcluidos=" + produtosExcluidos + '}';
    }
    
    
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
    

    public boolean cadastrar(Produto produto) {
        try {
            if (verificarDuplicidade(produto)) {
                System.out.println("Produto já cadastrado");
                return false;
            }
            // pegando dados da interfaceGrafica e colocando na List produtos
            this.produtos.add(produto);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    public boolean excluir(Produto produto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean arquivar(String nome) {
        try {
            for (Produto produto : produtos) {
                if (produto.getNome().equalsIgnoreCase(nome)) {
                    return false;
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        GravadorArquivo gravar = new GravadorArquivo();
        gravar.salvarProdutos(produtos);
        return true;
    }

    public boolean extrair(String nome) {
        try {
           for (Produto produto : produtos) {
                if (produto.getNome().equalsIgnoreCase(nome)) {
                    this.produtosExcluidos.add(produto);
                    this.produtos.remove(produto);
                    return true;
                }
            } 
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    
    public boolean verificarExistencia(String nome) {
        try {
            for (Produto produto : this.produtos) {
                if (produto.getNome().equalsIgnoreCase(nome)) {
                  return true;  
                }
            }
            for (Produto produto : this.produtos) {
                if (produto.getNome().equalsIgnoreCase(nome)) {
                  return true;  
                }
            }
            
        } catch (Exception e) {
            e.getMessage();
        }
        return false;
    }

    public void iniciar(List<Produto> produtosJuntos){
        for (Produto produtosJunto : produtosJuntos) {
            if (produtosJunto.getQuantidade() == 0) {
                this.produtosExcluidos.add(produtosJunto);
            } else {
                this.produtos.add(produtosJunto);
            }
        }
    }

    @Override
    public boolean verificarDuplicidade() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean cadastrar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean excluir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean arquivar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean extrair() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean verificarExistencia() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
