/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;

/**
 *
 * @author Daniel Santos Rodrigues
 */
public class Maquiagem extends CosmeticoNatura{

    public Maquiagem(String categoria, String marca, String tipo, double IDProduto, String nome, String publico, String genero, String modelo, String fabricante, int quantidade, Double precoVenda) {
        super(categoria, marca, tipo, IDProduto, nome, publico, genero, modelo, fabricante, quantidade, precoVenda);
    }
    // herança pobre até o momento
    
}
