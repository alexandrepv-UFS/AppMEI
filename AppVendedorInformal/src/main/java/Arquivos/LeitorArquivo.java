package Arquivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Alexandre Pereira Vieira
 */
public class LeitorArquivo {
    
    private File caminho;
    private File clientes;
    
    
    
    public File getCaminho() {
        return caminho;
    }

    public void setCaminho(File caminho) {
        this.caminho = caminho;
    }

    public File getClientes() {
        return clientes;
    }

    public void setClientes(File clientes) {
        this.clientes = clientes;
    }
    
    @Override
    public String toString() {
        return "LeitorArquivo{" + "caminho=" + caminho + ", clientes=" + clientes + '}';
    }
    
    public void criarDiretorio(String path) throws IOException{
        File file = new File(path);
        file.mkdir();
    }
    
    public void criarArquivos(String path, String nome) throws IOException{
        File file = new File(path,nome);
        file.createNewFile();
    }
    public void puxarDados(String path){
        try (BufferedReader leitorBuff = new BufferedReader(new FileReader(path))){
            String line = leitorBuff.readLine();
            while (line != null){
                System.out.println(line);
                line = leitorBuff.readLine();
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
            
    }
    
    
}
