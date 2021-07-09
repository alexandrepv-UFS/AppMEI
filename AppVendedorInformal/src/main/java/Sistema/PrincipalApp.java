
package Sistema;

import Arquivos.LeitorArquivo;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alexa
 */
public class PrincipalApp {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        LeitorArquivo larq = new LeitorArquivo();
        String pasta = "Clientes";
        String path = "Clientes";
        String nome = "Clientes.txt";
        String lendo = "Clientes" + File.separator+ "Clientes.txt";
        larq.criarDiretorio(pasta);
        larq.criarArquivos(path, nome);
        List<Cliente> cadClientes = new ArrayList<>(larq.importarDados(lendo));
        cadClientes.forEach(cli -> {
            System.out.println(cli);
        });
        
    }
    
}
