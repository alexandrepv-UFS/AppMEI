/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arquivos;

import Sistema.Produtos.Cabelo;
import Sistema.Clientes.Cliente;
import Sistema.Produtos.CorpoBanho;
import Sistema.Produtos.CosmeticoNatura;
import Sistema.Produtos.Produto;
import Sistema.Vendas.Vendas;
import Sistema.Produtos.Perfumaria;
import Sistema.Produtos.Rosto;
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
            
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public void salvarProdutos(List<Produto> produtos){
        String path = "Base" + File.separator + "Produtos" + File.separator 
                + "Produtos2.txt";
        try (BufferedWriter gravarProd = new BufferedWriter(new FileWriter(path))){
            gravarProd.write("IDProdutos;nome;quantidade;precoVenda;categoria;"
                    + "marca;tipo;fragancia;familiaOlfativa;tipoCabelo;"
                    + "tipoTratamento;");
            gravarProd.newLine();
            
            for (Produto produto : produtos) {
                gravarProd.write(String.valueOf(produto.getIDProduto()));
                gravarProd.write(";");
                gravarProd.write(produto.getNome());
                gravarProd.write(";");
                gravarProd.write(String.valueOf(produto.getQuantidade()));
                gravarProd.write(";");
                gravarProd.write(String.valueOf(produto.getPrecoVenda()));
                gravarProd.write(";");

                if (produto instanceof Perfumaria) {
                    gravarProd.write(((Perfumaria) produto).getCategoria());
                    gravarProd.write(";");
                    gravarProd.write(((Perfumaria) produto).getMarca());
                    gravarProd.write(";");
                    gravarProd.write(((Perfumaria) produto).getTipo());
                    gravarProd.write(";null;");
                    gravarProd.write(((Perfumaria) produto).getFamiliaOlfativa());
                    gravarProd.write(";null;null;");
                    
                }
                if (produto instanceof CorpoBanho) {
                    gravarProd.write(((CorpoBanho) produto).getCategoria());
                    gravarProd.write(";");
                    gravarProd.write(((CorpoBanho) produto).getMarca());
                    gravarProd.write(";");
                    gravarProd.write(((CorpoBanho) produto).getTipo());
                    gravarProd.write(";");
                    gravarProd.write(((CorpoBanho) produto).getFragancia());
                    gravarProd.write(";");
                    gravarProd.write(((CorpoBanho) produto).getFamiliaOlfativa());
                    gravarProd.write(";null;null;");
                }
                if (produto instanceof Cabelo) {
                    gravarProd.write(((Cabelo) produto).getCategoria());
                    gravarProd.write(";");
                    gravarProd.write(((Cabelo) produto).getMarca());
                    gravarProd.write(";");
                    gravarProd.write(((Cabelo) produto).getTipo());
                    gravarProd.write(";null;");
                    gravarProd.write(((Cabelo) produto).getFamiliaOlfativa());
                    gravarProd.write(";");
                    gravarProd.write(((Cabelo) produto).getTipoCabelo());
                    gravarProd.write(";null;");
                }
                if (produto instanceof Rosto) {
                    gravarProd.write(((Rosto) produto).getCategoria());
                    gravarProd.write(";");
                    gravarProd.write(((Rosto) produto).getMarca());
                    gravarProd.write(";");
                    gravarProd.write(((Rosto) produto).getTipo());
                    gravarProd.write(";null;");
                    gravarProd.write(((Rosto) produto).getFamiliaOlfativa());
                    gravarProd.write(";null;");
                    gravarProd.write(((Rosto) produto).getTipoTratamento());
                    gravarProd.write(";");
                }
                
                gravarProd.newLine();
            }
        } catch (Exception e) {
            e.getMessage();
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
