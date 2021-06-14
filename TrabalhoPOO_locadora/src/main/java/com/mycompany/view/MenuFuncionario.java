package com.mycompany.view;

import com.mycompany.dao.GenericDAO;
import com.mycompany.model.Carro;
import com.mycompany.model.Funcionario;
import java.util.List;
import javax.swing.JOptionPane;

public class MenuFuncionario extends javax.swing.JFrame {

    private Funcionario fun;
    private final GenericDAO<Carro> carroDAO;
    private List<Carro> carros;

    public MenuFuncionario() {
        initComponents();
        carroDAO = new GenericDAO<>();
        carros = carroDAO.list(Carro.class);//colocando os carros dentro da lista
    }

    public MenuFuncionario(Funcionario log) {
        initComponents();
        fun = log;
        carroDAO = new GenericDAO<>();
        carros = carroDAO.list(Carro.class);//colocando os carros dentro da lista
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_menu = new javax.swing.JLabel();
        btnCadastrarCarro = new javax.swing.JButton();
        btnEditarPerfil = new javax.swing.JButton();
        btnEditarCarro = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Locadora Pão Duro");
        setResizable(false);

        jLabel_menu.setFont(new java.awt.Font("JetBrains Mono", 0, 18)); // NOI18N
        jLabel_menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/META-INF/page.png"))); // NOI18N
        jLabel_menu.setText("Menu do usuário");

        btnCadastrarCarro.setFont(new java.awt.Font("JetBrains Mono", 0, 10)); // NOI18N
        btnCadastrarCarro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/META-INF/car_add.png"))); // NOI18N
        btnCadastrarCarro.setText("Cadastrar Carro");
        btnCadastrarCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarCarroActionPerformed(evt);
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

        btnEditarCarro.setFont(new java.awt.Font("JetBrains Mono", 0, 10)); // NOI18N
        btnEditarCarro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/META-INF/vcard_edit.png"))); // NOI18N
        btnEditarCarro.setText("Editar Carros");
        btnEditarCarro.setMaximumSize(new java.awt.Dimension(135, 23));
        btnEditarCarro.setMinimumSize(new java.awt.Dimension(135, 23));
        btnEditarCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarCarroActionPerformed(evt);
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
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditarCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditarPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastrarCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_menu))
                .addGap(73, 73, 73))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel_menu)
                .addGap(28, 28, 28)
                .addComponent(btnCadastrarCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEditarPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEditarCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnCadastrarCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarCarroActionPerformed
        new CadastrarCarro().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCadastrarCarroActionPerformed

    private void btnEditarCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarCarroActionPerformed
        new ListarCarros().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnEditarCarroActionPerformed

    private void btnEditarPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarPerfilActionPerformed
        new EditarPerfilFuncionario(fun).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnEditarPerfilActionPerformed

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarCarro;
    private javax.swing.JButton btnEditarCarro;
    private javax.swing.JButton btnEditarPerfil;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel_menu;
    // End of variables declaration//GEN-END:variables
}
