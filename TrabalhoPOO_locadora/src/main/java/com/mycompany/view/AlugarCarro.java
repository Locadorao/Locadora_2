
package com.mycompany.view;

import com.mycompany.dao.GenericDAO;
import com.mycompany.model.Alugar;
import com.mycompany.model.Carro;
import com.mycompany.model.Cliente;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.List;

public class AlugarCarro extends javax.swing.JFrame {

    private final GenericDAO<Carro> carroDAO;
    private final GenericDAO<Alugar> alugarDAO;
    private Cliente cli;
    private List<Carro> carros;
    DefaultTableModel model = new DefaultTableModel();

    public AlugarCarro() {
        initComponents();
        carroDAO = new GenericDAO<>();
        alugarDAO = new GenericDAO<>();
        model.addColumn("modelo");
        model.addColumn("ano");
        model.addColumn("cor");
        model.addColumn("valor");
        model.addColumn("descricao");
        carros = carroDAO.list(Carro.class);//colocando os carros dentro da lista
    }

    public AlugarCarro(Cliente log) {
        initComponents();
        carroDAO = new GenericDAO<>();
        alugarDAO = new GenericDAO<>();
        model.addColumn("modelo");
        model.addColumn("ano");
        model.addColumn("cor");
        model.addColumn("valor");
        model.addColumn("descricao");
        cli = log;
        carros = carroDAO.list(Carro.class);//colocando os carros dentro da lista
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_alugarCarro = new javax.swing.JLabel();
        jScrollPane_alugarCarro = new javax.swing.JScrollPane();
        jTable_alugarCarro = new javax.swing.JTable();
        btnAtualizarListaCarros = new javax.swing.JButton();
        btnAlugarCarro = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Locadora Pão Duro");
        setResizable(false);

        jLabel_alugarCarro.setFont(new java.awt.Font("JetBrains Mono", 0, 18)); // NOI18N
        jLabel_alugarCarro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/META-INF/car_add.png"))); // NOI18N
        jLabel_alugarCarro.setText("Alugar Carro");

        jScrollPane_alugarCarro.setBackground(new java.awt.Color(204, 204, 204));

        jTable_alugarCarro.setFont(new java.awt.Font("Fira Code Retina", 0, 10)); // NOI18N
        jTable_alugarCarro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Modelo", "Ano", "Cor", "Valor Aluguel", "Descrição"
            }
        ));
        jTable_alugarCarro.setGridColor(new java.awt.Color(0, 0, 0));
        jScrollPane_alugarCarro.setViewportView(jTable_alugarCarro);

        btnAtualizarListaCarros.setText("Atualizar lista");
        btnAtualizarListaCarros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarListaCarrosActionPerformed(evt);
            }
        });

        btnAlugarCarro.setText("Alugar Carro");
        btnAlugarCarro.setAlignmentY(0.0F);
        btnAlugarCarro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAlugarCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlugarCarroActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jScrollPane_alugarCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_alugarCarro)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(148, 148, 148)))
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAlugarCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAtualizarListaCarros)
                .addGap(99, 99, 99))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel_alugarCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane_alugarCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAtualizarListaCarros)
                    .addComponent(btnAlugarCarro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btnVoltar)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        new MenuCliente(cli).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnAlugarCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlugarCarroActionPerformed
        int index = jTable_alugarCarro.getSelectedRow();
        if (index == -1) {
            JOptionPane.showMessageDialog(null, "NÃO FOI SELECIONADO UM CARRO\nTente novamente...", "CARRO ALUGADO", JOptionPane.WARNING_MESSAGE);
        } else {
            Carro car = new Carro();
            car = carros.get(index);
            String dias = JOptionPane.showInputDialog(null, "POR QUAL PERÍODO GOSTARIA DE ALUGAR? (EM DIAS)", "CARRO ALUGADO", JOptionPane.INFORMATION_MESSAGE);
            Alugar alug = new Alugar();
            alug.setTempoAlugado(Integer.valueOf(dias));
            car.setDisponibilidade(Short.valueOf("0"));
            alug.setCarroid(car);
            alug.setClienteid(cli);
            alugarDAO.saveOrUpdate(alug);
            JOptionPane.showMessageDialog(null, "ALUGADO COM SUCESSO!!!", "CARRO ALUGADO", JOptionPane.INFORMATION_MESSAGE);
            btnVoltarActionPerformed(null);
        }
    }//GEN-LAST:event_btnAlugarCarroActionPerformed

    private void btnAtualizarListaCarrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarListaCarrosActionPerformed
        atualizarListaCarro();
    }//GEN-LAST:event_btnAtualizarListaCarrosActionPerformed

    public void atualizarListaCarro() {
        //model.getDataVector().removeAllElements();
        if (carros.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Lista vazia");
        } else {
            for (Carro car : carros) {
                if (car.getDisponibilidade() == 1) { // carros disponíveis
                    model.addRow(new Object[]{car.getModelo(), car.getAno(), car.getCor(), car.getValor(), car.getDescricao()});
                }
            }
            jTable_alugarCarro.setModel(model);
        }
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AlugarCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlugarCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlugarCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlugarCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlugarCarro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlugarCarro;
    private javax.swing.JButton btnAtualizarListaCarros;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel_alugarCarro;
    private javax.swing.JScrollPane jScrollPane_alugarCarro;
    private javax.swing.JTable jTable_alugarCarro;
    // End of variables declaration//GEN-END:variables
}
