package Sistema.Interfaces;

/**
 *
 * @author Alexandre Pereira Vieira
 */
public interface Arquivavel {
    public boolean arquivar(String nome);
    public boolean extrair(String nome);
    public boolean verificarExistencia(String nome);
}
