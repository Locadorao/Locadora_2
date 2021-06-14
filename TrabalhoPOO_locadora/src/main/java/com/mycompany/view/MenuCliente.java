package com.mycompany.view;

import com.mycompany.dao.GenericDAO;
import com.mycompany.model.Alugar;
import com.mycompany.model.Carro;
import com.mycompany.model.Cliente;
import java.util.List;
import javax.swing.JOptionPane;

public class MenuCliente extends javax.swing.JFrame {

    private final GenericDAO<Alugar> alugarDAO;
    private final GenericDAO<Carro> carroDAO;
    private final GenericDAO<Cliente> clienteDAO;
    private Cliente cli;
    private Alugar alug;

    public MenuCliente() {
        initComponents();
        alugarDAO = new GenericDAO<>();
        carroDAO = new GenericDAO<>();
        clienteDAO = new GenericDAO<>();

    }

    public MenuCliente(Cliente log) {
        initComponents();
        cli = log;
        alugarDAO = new GenericDAO<>();
        carroDAO = new GenericDAO<>();
        clienteDAO = new GenericDAO<>();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_menu = new javax.swing.JLabel();
        btnEntregarCarro = new javax.swing.JButton();
        btnEditarPerfil = new javax.swing.JButton();
        btnAlugarCarro = new javax.swing.JButton();
        btnVerCarroAlugado = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Locadora Pão Duro");
        setResizable(false);

        jLabel_menu.setFont(new java.awt.Font("JetBrains Mono", 0, 18)); // NOI18N
        jLabel_menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/META-INF/page.png"))); // NOI18N
        jLabel_menu.setText("Menu do usuário");

        btnEntregarCarro.setFont(new java.awt.Font("JetBrains Mono", 0, 10)); // NOI18N
        btnEntregarCarro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/META-INF/car.png"))); // NOI18N
        btnEntregarCarro.setText("Entregar Carro");
        btnEntregarCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntregarCarroActionPerformed(evt);
            }
        });

        btnEditarPerfil.setFont(new java.awt.Font("JetBrains Mono", 0, 10)); // NOI18N
        btnEditarPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/META-INF/server_edit.png"))); // NOI18N
        btnEditarPerfil.setText("Editar Perfil");
        btnEditarPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarPerfilActionPerformed(evt);
            }
        });

        btnAlugarCarro.setFont(new java.awt.Font("JetBrains Mono", 0, 10)); // NOI18N
        btnAlugarCarro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/META-INF/car_add.png"))); // NOI18N
        btnAlugarCarro.setText("Alugar Carro");
        btnAlugarCarro.setMaximumSize(new java.awt.Dimension(135, 23));
        btnAlugarCarro.setMinimumSize(new java.awt.Dimension(135, 23));
        btnAlugarCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlugarCarroActionPerformed(evt);
            }
        });

        btnVerCarroAlugado.setFont(new java.awt.Font("JetBrains Mono", 0, 10)); // NOI18N
        btnVerCarroAlugado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/META-INF/car_1.png"))); // NOI18N
        btnVerCarroAlugado.setText("Meus carros");
        btnVerCarroAlugado.setToolTipText("");
        btnVerCarroAlugado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerCarroAlugadoActionPerformed(evt);
            }
        });

        btnVoltar.setFont(new java.awt.Font("JetBrains Mono", 0, 10)); // NOI18N
        btnVoltar.setText("Sair");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(81, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVerCarroAlugado, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlugarCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditarPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEntregarCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_menu))
                .addGap(95, 95, 95))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(jLabel_menu)
                .addGap(33, 33, 33)
                .addComponent(btnEntregarCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEditarPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAlugarCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnVerCarroAlugado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnEntregarCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntregarCarroActionPerformed
        alug = cli.encontrarAlugarPeloCliente(alugarDAO);
        if (alug != null) {
            int opcao;
            opcao = JOptionPane.showConfirmDialog(null, alug.getCarroid().toString() + "\nGOSTARIA DE DEVOLVER O CARRO?", "CARRO ALUGADO", JOptionPane.YES_NO_OPTION);
            if (opcao == 0) {
                try {
                    alugarDAO.remove(Alugar.class, alug.getId());
                } catch (Exception e) {
                    System.out.println("ERRO QUANDO REMOVE");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "NÃO EXISTE UM CARRO ALUGADO PARA DEVOLVER", "CARRO ALUGADO", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnEntregarCarroActionPerformed


    private void btnVerCarroAlugadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerCarroAlugadoActionPerformed
        alug = cli.encontrarAlugarPeloCliente(alugarDAO);
        if (alug != null)
            JOptionPane.showMessageDialog(null, alug.getCarroid().toString(), "CARRO ALUGADO", JOptionPane.INFORMATION_MESSAGE);
        else
            JOptionPane.showMessageDialog(null, "NÃO EXISTE UM CARRO ALUGADO", "CARRO ALUGADO", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_btnVerCarroAlugadoActionPerformed

    private void btnAlugarCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlugarCarroActionPerformed
        if (cli.encontrarAlugarPeloCliente(alugarDAO) != null) {
            JOptionPane.showMessageDialog(null, "USUÁRIO NÃO PODE ALUGAR MAIS DE UM CARRO\nTente novamente...", "CARRO ALUGADO", JOptionPane.WARNING_MESSAGE);
        } else {
            new AlugarCarro(cli).setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnAlugarCarroActionPerformed

    private void btnEditarPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarPerfilActionPerformed
        new EditarPerfilCliente(cli).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnEditarPerfilActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuCliente.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuCliente.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuCliente.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuCliente.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlugarCarro;
    private javax.swing.JButton btnEditarPerfil;
    private javax.swing.JButton btnEntregarCarro;
    private javax.swing.JButton btnVerCarroAlugado;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel_menu;
    // End of variables declaration//GEN-END:variables
}
