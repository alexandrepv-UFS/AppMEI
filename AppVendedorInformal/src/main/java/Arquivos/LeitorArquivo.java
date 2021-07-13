package Arquivos;

import Sistema.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
    public List importarClientes(String path){
        
        List<Cliente> ListaClientes = new ArrayList<Cliente>(); 
        
        try (BufferedReader leitorBuff = new BufferedReader(new FileReader(path))){
            
            String line = leitorBuff.readLine();
            line = leitorBuff.readLine();
            while (line != null){
                
                String[] celulas = line.split(";");
                String CPF = celulas[0];
                String apelido = celulas[1];
                String nome = celulas[2];
                Endereco endereco = new Endereco();
                endereco.setLogradouro(celulas[3]);
                endereco.setNumero(Integer.parseInt(celulas[4]));
                endereco.setBairro(celulas[5]);
                endereco.setCEP(Integer.parseInt(celulas[6]));
                endereco.setPontoRef(celulas[7]);
                String telefone = celulas[8];
                boolean ativo = Boolean.parseBoolean(celulas[9]);
                
                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                
                Date dataCadastro = formato.parse(celulas[10]);
                Date inativacao = formato.parse(celulas[11]);
                
                
                double saldo = Double.parseDouble(celulas[12]);
                line = leitorBuff.readLine();
                
                Cliente cli = new Cliente(apelido,nome,endereco,telefone,CPF,ativo,dataCadastro, inativacao, saldo);
                ListaClientes.add(cli);
            }
            
            leitorBuff.close();
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
           return ListaClientes; 
    }
    
    public List importarProdutos(String path){
    
        List<Produto> ListaProdutos = new ArrayList<>();
        
        try (BufferedReader leitorBuf = new BufferedReader(new FileReader(path))){
            
            String line = leitorBuf.readLine();
            line = leitorBuf.readLine();
            
             while (line != null){
                 //preenchendo variáveis da classe static
                String[] cel = line.split(";");
                Double IDProduto = Double.parseDouble(cel[0]);
                String nome = cel[1];
                String publico = cel[2];
                String genero = cel[3];
                String modelo = cel[4];
                String fabricante = cel[5];
                int quantidade = Integer.parseInt(cel[6]);
                Double precoVenda = Double.parseDouble(cel[7]);
                //preenchendo variaveis de classes finais 
                String categoria = cel[8];
                String marca = cel[9];
                String tipo = cel[10];
                String fragancia = cel[11];
                String familiaOlfativa = cel[12];
                String tipoCabelo = cel[13];
                String tipoTratamento = cel[14];
                String tamanho = cel[15];
                String cor = cel[16];
                
                Produto pro = null;
                //escolhendo classe para instanciamento
                if (fabricante.equalsIgnoreCase("diamantes")){
                    pro = new Lingerie(tamanho, cor,IDProduto, nome, 
                             publico, genero, modelo, fabricante, quantidade, 
                             precoVenda);
                }
                if (modelo.equalsIgnoreCase("perfumaria")) {
                    pro = new Perfumaria(fragancia, familiaOlfativa,
                     categoria, marca, tipo,IDProduto, nome, publico, genero,
                     modelo, fabricante, quantidade, precoVenda);
                }
                if (modelo.equalsIgnoreCase("corpoBanho")) {
                    pro = new CorpoBanho(fragancia, familiaOlfativa,
                     categoria, marca, tipo,IDProduto, nome, publico, genero,
                     modelo, fabricante, quantidade, precoVenda);
                }
                if (modelo.equalsIgnoreCase("cabelo")) {
                    pro = new Cabelo(fragancia, familiaOlfativa,
                             tipoCabelo, categoria, marca, tipo,IDProduto, nome,
                             publico, genero, modelo, fabricante, quantidade,
                             precoVenda);
                }
                if (modelo.equalsIgnoreCase("rosto")) {
                    pro = new Cabelo(fragancia, familiaOlfativa,
                             tipoTratamento, categoria, marca, tipo,IDProduto, nome,
                             publico, genero, modelo, fabricante, quantidade,
                             precoVenda);
                }
                if (modelo.equalsIgnoreCase("maquiagem")) {
                    pro = new Maquiagem( categoria, marca, tipo,
                             IDProduto, nome, publico, genero, modelo,
                             fabricante, quantidade, precoVenda);
                }
                 line = leitorBuff.readLine();
                //Produto pro = new Produto();
                ListaProdutos.add(pro);
                
             }    
            
        } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
        }
        
        return ListaProdutos;
    }
    
}
