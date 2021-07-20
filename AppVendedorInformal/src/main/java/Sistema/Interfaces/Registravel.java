package Sistema.Interfaces;

import Sistema.Produtos.Produto;

/**
 *
 * @author Alexandre Pereira Vieira
 */
public interface Registravel {
    public boolean verificarDuplicidade(Produto produto);
    public boolean cadastrar(Produto produto);
    public boolean excluir(Produto produto);
}
