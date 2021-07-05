package Sistema;

import java.util.Date;

/**
 *
 * @author Alexandre Pereira Vieira
 */
public class Cliente {
    
    private String pseudonimo;
    private String nome;
    private Endereco endereco;
    private String telefone;
    private double CPF;
    private boolean ativo;
    private Date dataCadastro;
    private Date inativacao;
    private float saldo;

    public Cliente() {
    }

    
    
    public Cliente(String pseudonimo, String nome, Endereco endereco, String telefone, double CPF, boolean ativo, Date dataCadastro, Date inativacao, float saldo) {
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

    public double getCPF() {
        return CPF;
    }

    public void setID(double CPF) {
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

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    
}
