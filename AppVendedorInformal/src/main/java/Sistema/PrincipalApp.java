
package Sistema;

import Arquivos.LeitorArquivo;
import java.io.IOException;

/**
 *
 * @author alexa
 */
public class PrincipalApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        LeitorArquivo larq = new LeitorArquivo();
        String pasta = "Clientes";
        String path = "Clientes";
        String nome = "Clientes.txt";
        String lendo = "Clientes\\Clientes.txt";
        larq.criarDiretorio(pasta);
        larq.criarArquivos(path, nome);
        larq.puxarDados(lendo);
    }
    
}
