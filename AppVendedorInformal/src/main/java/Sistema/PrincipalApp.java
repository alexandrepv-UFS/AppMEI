
package Sistema;

import Arquivos.LeitorArquivo;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import Arquivos.GravadorArquivo;
/**
 *
 * @author Alexandre Pereira Vieira
 */
public class PrincipalApp {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException, NoSuchFieldException {
        // TODO code application logic here
        //Objeto para ler arquivos txt
        LeitorArquivo larq = new LeitorArquivo();
        String pasta = "Clientes";
        String path = "Clientes";
        String nome = "Clientes.txt";
        String lendo = "Clientes" + File.separator+ "Clientes.txt";
        larq.criarDiretorio(pasta);
        larq.criarArquivos(path, nome);
        //Objeto com os dados de todos os clientes
        List<Cliente> cadastrosClientes = new ArrayList<>(larq.importarClientes(lendo));
        //Objeto para salvar dados em arquivos do tipo txt
        GravadorArquivo save  = new GravadorArquivo(cadastrosClientes);
        save.salvarClientes(cadastrosClientes);
        
        cadastrosClientes.forEach(cli -> {
            System.out.println(cli);
        });
        
    }
    
}
