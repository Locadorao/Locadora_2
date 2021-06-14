
package com.mycompany.view;

import com.mycompany.dao.GenericDAO;
import com.mycompany.model.Carro;
import javax.swing.JOptionPane;

public class CadastrarCarro extends javax.swing.JFrame {

    private final GenericDAO<Carro> carroDAO;

    public CadastrarCarro() {
        initComponents();
        carroDAO = new GenericDAO<>();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_locadora = new javax.swing.JLabel();
        jLabel_cadastrarCarro = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        txtAno = new javax.swing.JTextField();
        txtValor = new javax.swing.JTextField();
        txtDescricao = new javax.swing.JTextField();
        jLabel_modelo = new javax.swing.JLabel();
        jLabel_ano = new javax.swing.JLabel();
        jLabel_cor = new javax.swing.JLabel();
        jLabel_valor = new javax.swing.JLabel();
        jLabel_descricao = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        jComboBoxCor = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Locadora Pão Duro");
        setResizable(false);

        jLabel_locadora.setFont(new java.awt.Font("JetBrains Mono", 1, 18)); // NOI18N
        jLabel_locadora.setAlignmentY(0.0F);

        jLabel_cadastrarCarro.setFont(new java.awt.Font("JetBrains Mono", 0, 18)); // NOI18N
        jLabel_cadastrarCarro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/META-INF/car_add.png"))); // NOI18N
        jLabel_cadastrarCarro.setText("Cadastrar Carro");
        jLabel_cadastrarCarro.setAlignmentY(0.0F);

        txtModelo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtModelo.setToolTipText("");
        txtModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModeloActionPerformed(evt);
            }
        });

        txtAno.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtAno.setToolTipText("");
        txtAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnoActionPerformed(evt);
            }
        });

        txtValor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtValor.setToolTipText("");
        txtValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorActionPerformed(evt);
            }
        });

        txtDescricao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtDescricao.setToolTipText("");
        txtDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescricaoActionPerformed(evt);
            }
        });

        jLabel_modelo.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jLabel_modelo.setText("Modelo");

        jLabel_ano.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jLabel_ano.setText("Ano");

        jLabel_cor.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jLabel_cor.setText("Cor");

        jLabel_valor.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jLabel_valor.setText("Valor");

        jLabel_descricao.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jLabel_descricao.setText("Descrição");

        btnSalvar.setFont(new java.awt.Font("JetBrains Mono", 0, 10)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.setAlignmentY(0.0F);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnVoltar.setFont(new java.awt.Font("JetBrains Mono", 0, 10)); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.setAlignmentY(0.0F);
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        jComboBoxCor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione a Cor", "Branco", "Preto", "Cinza", "Vermelho" }));
        jComboBoxCor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_descricao, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel_valor, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel_cor, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel_ano, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel_modelo, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtDescricao)
                    .addComponent(txtValor)
                    .addComponent(jComboBoxCor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtAno)
                    .addComponent(txtModelo)
                    .addComponent(jLabel_cadastrarCarro)
                    .addComponent(jLabel_locadora))
                .addContainerGap(65, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel_locadora, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_cadastrarCarro)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_modelo))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_ano)
                    .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_cor)
                    .addComponent(jComboBoxCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_valor))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel_descricao))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        new MenuFuncionario().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        Carro car = new Carro();
        if (!txtModelo.getText().isEmpty()) {
            car.setModelo(txtModelo.getText());
        } else {
            JOptionPane.showMessageDialog(null, "O MODELO É OBRIGATÓRIO", "CADASTRAR CARRO", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (!txtAno.getText().isEmpty()) {
            car.setAno(txtAno.getText());
        } else {
            JOptionPane.showMessageDialog(null, "O ANO É OBRIGATÓRIO", "CADASTRAR CARRO", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (jComboBoxCor.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "A COR É OBRIGATÓRIO", "CADASTRAR CARRO", JOptionPane.WARNING_MESSAGE);
            return;
        } else {
            car.setCor(String.valueOf(jComboBoxCor.getSelectedItem()));
        }
        if (!txtValor.getText().isEmpty()) {
            car.setValor(Float.valueOf(txtValor.getText()));
        } else {
            JOptionPane.showMessageDialog(null, "O VALOR É OBRIGATÓRIO", "CADASTRAR CARRO", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (!txtDescricao.getText().isEmpty()) {
            car.setDescricao(txtDescricao.getText());
        } else {
            JOptionPane.showMessageDialog(null, "A DESCRIÇÃO É OBRIGATÓRIO", "CADASTRAR CARRO", JOptionPane.WARNING_MESSAGE);
            return;
        }
        car.setDisponibilidade(Short.valueOf("1"));
        carroDAO.saveOrUpdate(car);
        JOptionPane.showMessageDialog(null, "CARRO CADASTRADO COM SUCESSO!!!", "CADASTRAR CARRO", JOptionPane.INFORMATION_MESSAGE);
        btnVoltarActionPerformed(null);
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void txtValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorActionPerformed

    private void txtDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescricaoActionPerformed

    private void txtModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModeloActionPerformed

    private void txtAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnoActionPerformed

    private void jComboBoxCorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxCorActionPerformed

    public static void main(String args[]) {
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarCarro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> jComboBoxCor;
    private javax.swing.JLabel jLabel_ano;
    private javax.swing.JLabel jLabel_cadastrarCarro;
    private javax.swing.JLabel jLabel_cor;
    private javax.swing.JLabel jLabel_descricao;
    private javax.swing.JLabel jLabel_locadora;
    private javax.swing.JLabel jLabel_modelo;
    private javax.swing.JLabel jLabel_valor;
    private javax.swing.JTextField txtAno;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
