/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceGrafica;


import Sistema.Produtos.Produto;
import Sistema.Produtos.Cabelo;
import Sistema.Produtos.CorpoBanho;
import Sistema.Produtos.Perfumaria;
import Sistema.Produtos.Rosto;
import java.util.logging.Level;
import java.util.logging.Logger;
import Sistema.Produtos.RegistroCadastroProdutos;
import java.beans.PropertyVetoException;

/**
 *
 * @author Alexandre
 * @author Daniel
 */
public class PICadastroProdutos extends javax.swing.JInternalFrame {

    /**
     * Creates new form CadastroProdutos
     */
    private RegistroCadastroProdutos cadastroProdutos;
    public PICadastroProdutos(RegistroCadastroProdutos cadastroProd) {
        initComponents();
        cadastroProdutos = new Sistema.Produtos.RegistroCadastroProdutos();
        this.cadastroProdutos = cadastroProd;
    }
    
    public void limpar(){
        cbxTipo.setSelectedIndex(0);
        txtCategoria.setText("");
        txtNome.setText("");
        txtCategoria.setText("");
        txtFamiliaOlfativa.setText("");
        txtFragancia.setText("");
        txtMarca.setText("");
        txtPrecoVenda.setText("");
        txtTipoCabelo.setText("");
        
    }    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLbNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLbTelefone = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtPrecoVenda = new javax.swing.JFormattedTextField();
        cbxTipo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtCategoria = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        txtFamiliaOlfativa = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtFragancia = new javax.swing.JTextField();
        txtTipoCabelo = new javax.swing.JTextField();
        txtTipoTratamento = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);
        setTitle("Cadastro de Produtos");

        jLbNome.setText("Nome");

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        jLbTelefone.setText("Preço de Venda");

        jLabel1.setText("ID");

        txtPrecoVenda.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));

        cbxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Cabelo", "Corpo Banho", "Perfumaria", "Rosto" }));
        cbxTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTipoActionPerformed(evt);
            }
        });

        jLabel2.setText("Categoria");

        jLabel3.setText("Tipo");

        jLabel4.setText("Marca:");

        jLabel5.setText("Familia Olfativa:");

        jLabel6.setText("Fragância:");

        jLabel7.setText("Tipo de Cabelo:");

        jLabel8.setText("Tipo de Tratamento:");

        txtFragancia.setEnabled(false);
        txtFragancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFraganciaActionPerformed(evt);
            }
        });

        txtTipoCabelo.setEnabled(false);
        txtTipoCabelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipoCabeloActionPerformed(evt);
            }
        });

        txtTipoTratamento.setEnabled(false);

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLbNome)
                        .addGap(32, 32, 32)
                        .addComponent(txtNome)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtFamiliaOlfativa, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                                            .addComponent(txtMarca)
                                            .addComponent(txtFragancia))))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLbTelefone)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPrecoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTipoCabelo, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                    .addComponent(txtTipoTratamento))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 83, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCadastrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLimpar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSair)
                .addGap(8, 8, 8))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLbNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLbTelefone)
                    .addComponent(txtPrecoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFamiliaOlfativa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtFragancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtTipoCabelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtTipoTratamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar)
                    .addComponent(btnSair)
                    .addComponent(btnLimpar))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        
        
    }//GEN-LAST:event_txtNomeActionPerformed

    private void cbxTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTipoActionPerformed
        // TODO add your handling code here:
        if(cbxTipo.getSelectedItem() == "Perfumaria" || cbxTipo.getSelectedItem() == "Corpo Banho") {
            txtFragancia.setEnabled(true);
        }
        else {
            txtFragancia.setEnabled(false);
        }
        
        if(cbxTipo.getSelectedItem() == "Cabelo") {
            txtTipoCabelo.setEnabled(true);
        }
        else {
            txtTipoCabelo.setEnabled(false);
        }
        
        if(cbxTipo.getSelectedItem() == "Rosto") {
            txtTipoTratamento.setEnabled(true);
        }
        else {
            txtTipoTratamento.setEnabled(false);
        }
    }//GEN-LAST:event_cbxTipoActionPerformed

    private void txtTipoCabeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoCabeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoCabeloActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        try {
            // TODO add your handling code here:
            this.setClosed(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(PICadastroClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        //RegistroCadastroProdutos cadastroProdutos = new RegistroCadastroProdutos();
        Produto novoProduto;
        novoProduto = null;
        /**começando
         * Double.parseDouble(txtPrecoVenda.getText())
        */
        
                
        if(cbxTipo.getSelectedItem() == "Cabelo") {
            novoProduto = new Cabelo(txtTipoCabelo.getText(), txtCategoria.getText(), txtMarca.getText(), cbxTipo.getSelectedItem().toString(),
                    txtFamiliaOlfativa.getText(), 1, txtNome.getText(), 2,Double.parseDouble(txtPrecoVenda.getText().replace(".","").replace(",","."))  );
            
            cadastroProdutos.cadastrar(novoProduto);
            cadastroProdutos.arquivar(novoProduto.getNome());
        }
        else if(cbxTipo.getSelectedItem() == "Corpo Banho") {
            novoProduto = new CorpoBanho(txtFragancia.getText(), txtCategoria.getText(), txtMarca.getText(), cbxTipo.getSelectedItem().toString()
                    , txtFamiliaOlfativa.getText(), 2, txtNome.getText(), 3,Double.parseDouble(txtPrecoVenda.getText().replace(".","").replace(",",".")) );
            
            cadastroProdutos.cadastrar(novoProduto);
        }
        else if(cbxTipo.getSelectedItem() == "Perfumaria") {
            novoProduto = new Perfumaria(txtFragancia.getText(), txtCategoria.getText(), txtMarca.getText(), cbxTipo.getSelectedItem().toString(),
                    txtFamiliaOlfativa.getText(), 3, txtNome.getText(), 4, Double.parseDouble(txtPrecoVenda.getText().replace(".","").replace(",",".")) );
            
            cadastroProdutos.cadastrar(novoProduto);
        }
        else if(cbxTipo.getSelectedItem() == "Rosto") {
            novoProduto = new Rosto(txtTipoTratamento.getText(), txtCategoria.getText(), txtMarca.getText(), cbxTipo.getSelectedItem().toString(),
                    txtFamiliaOlfativa.getText(), 4, txtNome.getText(), 5, Double.parseDouble(txtPrecoVenda.getText().replace(".","").replace(",",".")) );
            
            cadastroProdutos.cadastrar(novoProduto);
        }
        //Verificando 
        
        cadastroProdutos.arquivar(novoProduto.getNome());
        this.limpar();
        System.out.println(cadastroProdutos.toString());
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void txtFraganciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFraganciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFraganciaActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        this.limpar();
    }//GEN-LAST:event_btnLimparActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSair;
    private javax.swing.JComboBox<String> cbxTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLbNome;
    private javax.swing.JLabel jLbTelefone;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextField txtFamiliaOlfativa;
    private javax.swing.JTextField txtFragancia;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtNome;
    private javax.swing.JFormattedTextField txtPrecoVenda;
    private javax.swing.JTextField txtTipoCabelo;
    private javax.swing.JTextField txtTipoTratamento;
    // End of variables declaration//GEN-END:variables
}
