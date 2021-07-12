/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arquivos;

import Sistema.Cliente;
import Sistema.Vendas;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 *
 * @author Alexandre Pereira Vieira
 */
public class GravadorArquivo {
    
    private List registros;

    public GravadorArquivo() {
    }

    public GravadorArquivo(List registros) {
        this.registros = registros;
    }
    
    public List getRegistros() {
        return registros;
    }

    public void setRegistros(List registros) {
        this.registros = registros;
    }
    
    public void salvarClientes(List<Cliente> clientes) 
            throws FileNotFoundException, IOException{
        
        //Está apontando para o arquivo cliente2.txt para verificação de entrada
        //e saida. Quando estiver operacional mudar para "cliente.txt" para unificar a base
        try (BufferedWriter gravarArquivo = new BufferedWriter(new FileWriter("Base" 
                + File.separator +"Clientes" + File.separator + "Clientes2.txt"))){
            gravarArquivo.write("CPF;Nome;Apelido;Nome;Logradouro;Numero;"
                    + "Bairro;CEP;PontoReferencia;Telefone;Ativo;DataCadastro;"
                    + "Inativacao;Saldo;");
            gravarArquivo.newLine();
            //Varrendo a lista de clientes para gravar em disco
            for (Cliente cliente : clientes) {
                
                gravarArquivo.write(cliente.getCPF());
                gravarArquivo.write(";");
                gravarArquivo.write(cliente.getPseudonimo());
                gravarArquivo.write(";");
                gravarArquivo.write(cliente.getNome());
                gravarArquivo.write(";");
                gravarArquivo.write(cliente.getEndereco().getLogradouro());
                gravarArquivo.write(";");
                gravarArquivo.write(String.valueOf(cliente.getEndereco().getNumero()));
                gravarArquivo.write(";");
                gravarArquivo.write(cliente.getEndereco().getBairro());
                gravarArquivo.write(";");
                gravarArquivo.write(String.valueOf(cliente.getEndereco().getCEP()));
                gravarArquivo.write(";");
                gravarArquivo.write(cliente.getEndereco().getPontoRef());
                gravarArquivo.write(";");
                gravarArquivo.write(cliente.getTelefone());
                gravarArquivo.write(";");
                gravarArquivo.write(String.valueOf(cliente.isAtivo()));
                gravarArquivo.write(";");
                
                SimpleDateFormat fomato = new SimpleDateFormat("dd/MM/yyy");
                String dataFormatada = fomato.format(cliente.getDataCadastro());
                gravarArquivo.write(dataFormatada);
                gravarArquivo.write(";");
                dataFormatada = fomato.format(cliente.getInativacao());
                gravarArquivo.write(dataFormatada);
                gravarArquivo.write(";");
                gravarArquivo.write(String.valueOf(cliente.getSaldo()));
                gravarArquivo.write(";");
            }    
            gravarArquivo.close();
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    /*
    public void salvarVendas(List<Vendas> vendas) throws FileNotFoundException, 
            IOException{
        
        //Está apontando para o arquivo cliente2.txt para verificação de entrada
        //e saida. Quando estiver operacional mudar para "cliente.txt" para unificar a base
        try (BufferedWriter gravarArquivo = new BufferedWriter(new FileWriter(
                "Clientes" + File.separator + "Clientes2.txt"))){
            gravarArquivo.write("Nome;Apelido;Nome;Logradouro;Numero;Bairro;"
                    + "CEP;PontoReferencia;Telefone;Ativo;DataCadastro;"
                    + "Inativacao;Saldo;");
            gravarArquivo.newLine();
            //Varrendo a lista de clientes para gravar em disco
            for (Vendas Venda : vendas) {
                
                gravarArquivo.write(cliente.getCPF());
                gravarArquivo.write(";");
                gravarArquivo.write(cliente.getPseudonimo());
                gravarArquivo.write(";");
                gravarArquivo.write(cliente.getNome());
                gravarArquivo.write(";");
                gravarArquivo.write(cliente.getEndereco().getLogradouro());
                gravarArquivo.write(";");
                gravarArquivo.write(String.valueOf(cliente.getEndereco().getNumero()));
                gravarArquivo.write(";");
                gravarArquivo.write(cliente.getEndereco().getBairro());
                gravarArquivo.write(";");
                gravarArquivo.write(String.valueOf(cliente.getEndereco().getCEP()));
                gravarArquivo.write(";");
                gravarArquivo.write(cliente.getEndereco().getPontoRef());
                gravarArquivo.write(";");
                gravarArquivo.write(cliente.getTelefone());
                gravarArquivo.write(";");
                gravarArquivo.write(String.valueOf(cliente.isAtivo()));
                gravarArquivo.write(";");
                
                SimpleDateFormat fomato = new SimpleDateFormat("dd/MM/yyy");
                String dataFormatada = fomato.format(cliente.getDataCadastro());
                gravarArquivo.write(dataFormatada);
                gravarArquivo.write(";");
                dataFormatada = fomato.format(cliente.getInativacao());
                gravarArquivo.write(dataFormatada);
                gravarArquivo.write(";");
                gravarArquivo.write(String.valueOf(cliente.getSaldo()));
                gravarArquivo.write(";");
            }    
            gravarArquivo.close();
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    */
}
