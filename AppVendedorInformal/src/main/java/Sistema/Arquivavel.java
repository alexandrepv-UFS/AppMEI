package Sistema;

/**
 *
 * @author Alexandre Pereira Vieira
 */
public interface Arquivavel {
    public void arquivar(long ID);
    public void extrair(long ID);
    public void verificarExistencia(String nome);
}
