
package Sistema;

/**
 *
 * @author Alexandre Pereira Vieira
 */
public class Endereco {
    private String logradouro;
    private int numero;
    private String bairro;
    private Integer CEP;
    private String pontoRef;

    public Endereco() {
    }

    public Endereco(String logradouro, int numero, String bairro, Integer CEP, String pontoRef) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.CEP = CEP;
        this.pontoRef = pontoRef;
    }

    
    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    
    public Integer getCEP() {
        return CEP;
    }

    public void setCEP(Integer CEP) {
        this.CEP = CEP;
    }

    public String getPontoRef() {
        return pontoRef;
    }

    public void setPontoRef(String pontoRef) {
        this.pontoRef = pontoRef;
    }

    @Override
    public String toString() {
        return "Endereco{" + "logradouro=" + logradouro + ", numero=" + numero + ", bairro=" + bairro + ", CEP=" + CEP + ", pontoRef=" + pontoRef + '}';
    }

    
    
    
}
