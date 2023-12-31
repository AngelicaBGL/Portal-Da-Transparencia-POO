package projeto;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author vitor
 */
public class MenuCadastroEmpresa extends javax.swing.JFrame {
 private static MenuCadastroEmpresa instancia;

    private MenuCadastroEmpresa() {
        initComponents();
        show();
    }

    public static MenuCadastroEmpresa getInstance() {
        if (instancia == null) {
            instancia = new MenuCadastroEmpresa();
       }
        return instancia;
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBairro = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jCidade = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jCargo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jSenha = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jCadastrar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jNumero = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jCNPJ = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jNome = new javax.swing.JTextField();
        jRua = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel1.setText("Menu Cadastro Empresa");

        jLabel2.setText("Nome da Empresa:");

        jLabel3.setText("Rua:");

        jSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSenhaActionPerformed(evt);
            }
        });

        jLabel4.setText("Numero:");

        jCadastrar.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jCadastrar.setText("Cadastrar");
        jCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCadastrarActionPerformed(evt);
            }
        });

        jLabel5.setText("Bairro:");

        jLabel6.setText("Cidade:");

        jLabel9.setText("CNPJ:");

        jLabel7.setText("Ramo de Atividade:");

        jCNPJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCNPJActionPerformed(evt);
            }
        });

        jLabel8.setText("Crie sua senha:");

        jNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jNome)
                    .addComponent(jCargo)
                    .addComponent(jSenha)
                    .addComponent(jCNPJ)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jBairro, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRua, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCidade, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                            .addComponent(jNumero))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(299, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(243, 243, 243))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(297, 297, 297))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(48, 48, 48)
                .addComponent(jCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSenhaActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jSenhaActionPerformed

    private void jCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCadastrarActionPerformed
        // TODO add your handling code here:
        String nome, rua, bairro, cidade, cargo, senha, documento;
        int numero;
        nome = jNome.getText();
        rua = jRua.getText();
        numero = Integer.parseInt(jNumero.getText());
        bairro = jBairro.getText();
        cidade = jCidade.getText();
        cargo = jCargo.getText();
        senha = jSenha.getText();
        documento = jCNPJ.getText();
        
        Endereco endereco = new Endereco(rua, bairro, numero, cidade);
        Empresa empresa = new Empresa(nome, endereco, documento, cargo, senha);
        Principal.cadastro.cadastrarEmpresa(empresa);

        CadastroSucesso aviso = new CadastroSucesso(null, true);
        aviso.show();

        dispose();
        instancia = null;

    }//GEN-LAST:event_jCadastrarActionPerformed

    private void jCNPJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCNPJActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCNPJActionPerformed

    private void jNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jNomeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jBairro;
    private javax.swing.JTextField jCNPJ;
    private javax.swing.JButton jCadastrar;
    private javax.swing.JTextField jCargo;
    private javax.swing.JTextField jCidade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jNome;
    private javax.swing.JTextField jNumero;
    private javax.swing.JTextField jRua;
    private javax.swing.JTextField jSenha;
    // End of variables declaration//GEN-END:variables
}
