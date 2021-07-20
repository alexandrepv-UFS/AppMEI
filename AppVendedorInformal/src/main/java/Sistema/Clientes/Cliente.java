package Sistema.Clientes;

import Sistema.Interfaces.Arquivavel;
import java.util.Date;

/**
 *
 * @author Alexandre Pereira Vieira
 */
public class Cliente implements Arquivavel {
    
    private String pseudonimo;
    private String nome;
    private Endereco endereco;
    private String telefone;
    private String CPF;
    private boolean ativo;
    private Date dataCadastro;
    private Date inativacao;
    private double saldo;

    public Cliente() {
    }

    
    
    public Cliente(String pseudonimo, String nome, Endereco endereco, String telefone, String CPF, boolean ativo, Date dataCadastro, Date inativacao, double saldo) {
        this.pseudonimo = pseudonimo;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.CPF = CPF;
        this.ativo = ativo;
        this.dataCadastro = dataCadastro;
        this.inativacao = inativacao;
        this.saldo = saldo;
    }

    public String getPseudonimo() {
        return pseudonimo;
    }

    public void setPseudonimo(String pseudonimo) {
        this.pseudonimo = pseudonimo;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCPF() {
        return CPF;
    }

    public void setID(String CPF) {
        this.CPF = CPF;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Date getInativacao() {
        return inativacao;
    }

    public void setInativacao(Date inativacao) {
        this.inativacao = inativacao;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cliente{" + "pseudonimo=" + pseudonimo + ", nome=" + nome + ", endereco=" + endereco + ", telefone=" + telefone + ", CPF=" + CPF + ", ativo=" + ativo + ", dataCadastro=" + dataCadastro + ", inativacao=" + inativacao + ", saldo=" + saldo + '}';
    }

    @Override
    public boolean arquivar(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean extrair(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean verificarExistencia(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
