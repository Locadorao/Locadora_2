package com.mycompany.view;

import com.mycompany.dao.GenericDAO;
import com.mycompany.model.Cliente;
import com.mycompany.model.Endereco;
import javax.swing.JOptionPane;

public class CadastrarUsuario extends javax.swing.JFrame {

    private final GenericDAO<Cliente> clienteDAO;
    private final GenericDAO<Endereco> enderecoDAO;
    private Cliente cli;


    public CadastrarUsuario() {
        initComponents();
        clienteDAO = new GenericDAO<>();
        enderecoDAO = new GenericDAO<>();
        cli = new Cliente();
        cli.setEnderecoid(null);
    }

    public CadastrarUsuario(Cliente log) {
        initComponents();
        clienteDAO = new GenericDAO<>();
        enderecoDAO = new GenericDAO<>();
        cli = log;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_cadastrarUsuario = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        txtTelefone = new javax.swing.JTextField();
        jLabel_nome = new javax.swing.JLabel();
        jLabel_email = new javax.swing.JLabel();
        jLabel_senha = new javax.swing.JLabel();
        jLabel_telefone = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        jLabel_Endereco = new javax.swing.JLabel();
        jLabel_Estado = new javax.swing.JLabel();
        jLabel_cidade = new javax.swing.JLabel();
        jLabel_rua = new javax.swing.JLabel();
        jComboBoxEstado = new javax.swing.JComboBox<>();
        txtCidade = new javax.swing.JTextField();
        txtRua = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Locadora Pão Duro");
        setResizable(false);

        jLabel_cadastrarUsuario.setFont(new java.awt.Font("JetBrains Mono", 0, 18)); // NOI18N
        jLabel_cadastrarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/META-INF/user.png"))); // NOI18N
        jLabel_cadastrarUsuario.setText("Cadastrar Usuário");
        jLabel_cadastrarUsuario.setAlignmentY(0.0F);

        txtNome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtNome.setToolTipText("");
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtEmail.setToolTipText("");
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        txtSenha.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });

        txtTelefone.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtTelefone.setToolTipText("");
        txtTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefoneActionPerformed(evt);
            }
        });

        jLabel_nome.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jLabel_nome.setText("Nome");

        jLabel_email.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jLabel_email.setText("Email");

        jLabel_senha.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jLabel_senha.setText("Senha");

        jLabel_telefone.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jLabel_telefone.setText("Telefone");

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

        jLabel_Endereco.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jLabel_Endereco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/META-INF/house.png"))); // NOI18N
        jLabel_Endereco.setText("Endereço");

        jLabel_Estado.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jLabel_Estado.setText("Estado");

        jLabel_cidade.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jLabel_cidade.setText("Cidade");

        jLabel_rua.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jLabel_rua.setText("Rua");

        jComboBoxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione o Estado", "Distrito Federal", "Goiás", "Minas Gerais", "Rio de Janeiro", "Rio Grande do Sul", "Santa Catarina", "São Paulo", " ", " " }));
        jComboBoxEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxEstadoActionPerformed(evt);
            }
        });

        txtCidade.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtCidade.setToolTipText("");
        txtCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCidadeActionPerformed(evt);
            }
        });

        txtRua.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtRua.setToolTipText("");
        txtRua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRuaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.CENTER, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_cadastrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel_telefone)
                            .addComponent(jLabel_Estado)
                            .addComponent(jLabel_cidade)
                            .addComponent(jLabel_rua)
                            .addComponent(jLabel_senha)
                            .addComponent(jLabel_email)
                            .addComponent(jLabel_nome))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                        .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel_Endereco, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 10, Short.MAX_VALUE)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(jLabel_cadastrarUsuario)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_email))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_senha))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_telefone))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_Endereco, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_Estado))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_cidade))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_rua)))
                    .addComponent(jLabel_nome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (!txtNome.getText().isEmpty()) {
            cli.setNome(txtNome.getText());
        } else {
            JOptionPane.showMessageDialog(null, "O NOME É OBRIGATÓRIO", "CADASTRAR CLIENTE", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (!txtEmail.getText().isEmpty()) {
            cli.setEmail(txtEmail.getText());
        } else {
            JOptionPane.showMessageDialog(null, "O EMAIL É OBRIGATÓRIO", "CADASTRAR CLIENTE", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (!txtSenha.getText().isEmpty()) {
            cli.setSenha(txtSenha.getText());
        } else {
            JOptionPane.showMessageDialog(null, "A SENHA É OBRIGATÓRIO", "CADASTRAR CLIENTE", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (!txtTelefone.getText().isEmpty()) {
            cli.setTelefone(txtTelefone.getText());
        } else {
            JOptionPane.showMessageDialog(null, "O TELEFONE É OBRIGATÓRIO", "CADASTRAR CLIENTE", JOptionPane.WARNING_MESSAGE);
            return;
        }

        Endereco end = new Endereco();// criar um objeto para colocar dentro do cliente

        if (jComboBoxEstado.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "O ESTADO É OBRIGATÓRIO", "CADASTRAR CLIENTE", JOptionPane.WARNING_MESSAGE);
            return;
        } else {
            end.setEstado(String.valueOf(jComboBoxEstado.getSelectedItem()));
        }
        if (!txtCidade.getText().isEmpty()) {
            end.setCidade(txtCidade.getText());
        } else {
            JOptionPane.showMessageDialog(null, "A CIDADE É OBRIGATÓRIO", "CADASTRAR CLIENTE", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (!txtRua.getText().isEmpty()) {
            end.setRua(txtRua.getText());
        } else {
            JOptionPane.showMessageDialog(null, "A RUA É OBRIGATÓRIO", "CADASTRAR CLIENTE", JOptionPane.WARNING_MESSAGE);
            return;
        }
        enderecoDAO.saveOrUpdate(end);
        cli.setEnderecoid(end);
        clienteDAO.saveOrUpdate(cli);
        JOptionPane.showMessageDialog(null, "CADASTRO REALIZADO COM SUCESSO", "CADASTRAR CLIENTE", JOptionPane.INFORMATION_MESSAGE);
        btnVoltarActionPerformed(null);
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void txtTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefoneActionPerformed

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void jComboBoxEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxEstadoActionPerformed

    private void txtCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCidadeActionPerformed

    private void txtRuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRuaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> jComboBoxEstado;
    private javax.swing.JLabel jLabel_Endereco;
    private javax.swing.JLabel jLabel_Estado;
    private javax.swing.JLabel jLabel_cadastrarUsuario;
    private javax.swing.JLabel jLabel_cidade;
    private javax.swing.JLabel jLabel_email;
    private javax.swing.JLabel jLabel_nome;
    private javax.swing.JLabel jLabel_rua;
    private javax.swing.JLabel jLabel_senha;
    private javax.swing.JLabel jLabel_telefone;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtRua;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
