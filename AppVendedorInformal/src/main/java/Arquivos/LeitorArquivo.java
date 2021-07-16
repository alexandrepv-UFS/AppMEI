package Arquivos;

import Sistema.Clientes.Cliente;
import Sistema.Clientes.Endereco;
import Sistema.Produtos.Cabelo;
import Sistema.Produtos.Perfumaria;
import Sistema.Produtos.CorpoBanho;
import Sistema.Produtos.Produto;
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
                 //preenchendo variáveis contidas na classe mãe
                String[] cel = line.split(";");
                int IDProduto = Integer.parseInt(cel[0]);
                String nome = cel[1];
                int quantidade = Integer.parseInt(cel[2]);
                Double precoVenda = Double.parseDouble(cel[3]);
                //preenchendo variaveis de classes finais 
                String categoria = cel[4];
                String marca = cel[5];
                String tipo = cel[6];
                String fragancia = cel[7];
                String familiaOlfativa = cel[8];
                String tipoCabelo = cel[9];
                String tipoTratamento = cel[10];
                
                
                Produto pro = null;
                //escolhendo classe para instanciamento
                
                if (tipo.equalsIgnoreCase("perfumaria")) {
                    pro = new Perfumaria(fragancia, categoria, marca, tipo, 
                            familiaOlfativa, IDProduto, nome, quantidade,
                            precoVenda);
                }
                if (tipo.equalsIgnoreCase("corpoBanho")) {
                    pro = new CorpoBanho(fragancia, categoria, marca, tipo, 
                            familiaOlfativa, IDProduto, nome, quantidade,
                            precoVenda);
                }
                if (tipo.equalsIgnoreCase("cabelo")) {
                    pro = new Cabelo(tipoCabelo, categoria, marca, tipo,
                            familiaOlfativa,IDProduto, nome, quantidade,
                            precoVenda);
                }
                if (tipo.equalsIgnoreCase("rosto")) {
                    pro = new Cabelo(tipoTratamento, categoria, marca,
                            tipo,familiaOlfativa, IDProduto, nome,quantidade,
                            precoVenda);
                }
                
                 line = leitorBuf.readLine();
                //Produto pro = new Produto();
                ListaProdutos.add(pro);
                
             }    
            
        } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
        }
        
        return ListaProdutos;
    }
    
}
