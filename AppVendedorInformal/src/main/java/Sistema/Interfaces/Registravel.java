package Sistema.Interfaces;

import Sistema.Produtos.Produto;

/**
 *
 * @author Alexandre Pereira Vieira
 */
public interface Registravel {
    public boolean verificarDuplicidade(Produto produto);
    public void cadastrar(Produto produto);
    public void excluir(Produto produto);
}
