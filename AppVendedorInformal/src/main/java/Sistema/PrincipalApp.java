
package Sistema;

import Arquivos.LeitorArquivo;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import Arquivos.GravadorArquivo;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
/**
 *
 * @author Alexandre Pereira Vieira
 */
public class PrincipalApp {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     * @throws java.lang.NoSuchFieldException
     */
    public static void main(String[] args) throws IOException, NoSuchFieldException {
        
        //Objeto para ler arquivos txt
        LeitorArquivo lArq = new LeitorArquivo();
        String pasta = "Clientes";
        String path = "Clientes";
        String nome = "Clientes.txt";
        String lendo = "Clientes" + File.separator+ "Clientes.txt";
        String lendoProd = "Base"+File.separator+"Produtos"+File.separator+"Produtos.txt";
        lArq.criarDiretorio(pasta);
        lArq.criarArquivos(path, nome);
        
        //Objeto com os dados de todos os clientes
        List<Cliente> cadastrosClientes = new ArrayList<>(lArq.importarClientes(lendo));
        
        //Objeto para salvar dados em arquivos do tipo txt. Metodos para
        //clientes,produto e vendas
        GravadorArquivo save  = new GravadorArquivo();
        save.salvarClientes(cadastrosClientes);
        List<Produto> cadastroProdutos = new ArrayList<>(lArq.importarProdutos(lendoProd));
        save.salvarProdutos(cadastroProdutos);
        
        //imprimindo os campos dos objetos importados
        cadastroProdutos.forEach(cadastroProduto -> {
            System.out.println(cadastroProduto);
        });
        cadastrosClientes.forEach(cli -> {
            System.out.println(cli);
        });
        
    }
    
}
