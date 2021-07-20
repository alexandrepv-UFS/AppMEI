/*
 * To change this license header, choose License Headers in Project Properties.
 * and open the template in the editor.
 */
package Sistema.Produtos;

/**
 *
 * @author Daniel Santos Rodrigues
 */
public abstract class Produto  {
    private int IDProduto;
    private String nome;
    private double precoVenda;
    private int quantidade;
    
    public Produto() {
        
    }
    
    public Produto(int IDProduto, String nome, int quantidade,
            Double precoVenda) {
        
        this.IDProduto = IDProduto;
        this.nome = nome;
        this.quantidade = quantidade;
        this.precoVenda = precoVenda;
    }
    
    public void entradaEstoque(int quantidade) {
        
    }
    
    public void saidaEstoque() {
        
    }
    
    public void operation3() {
        
    }

    
    public void setIDProduto(int IDProduto) {
        this.IDProduto = IDProduto;
    }

    public int getIDProduto() {
        return IDProduto;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    @Override
    public String toString() {
        return "Produto{" + "IDProduto=" + IDProduto + ", nome=" + nome + ", precoVenda=" + precoVenda + ", quantidade=" + quantidade + '}';
    }

    public abstract void arquivar(long ID);
    public abstract void extrair(long ID);
    public abstract void verificarExistencia(String nome);
    
}
