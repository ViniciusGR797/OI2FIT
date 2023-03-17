package View;

import DAO.ColaboradorDAO;
import Model.Colaborador;
import javax.swing.JOptionPane;


public class JanEditarColaborador extends javax.swing.JFrame {

    Colaborador colab = new Colaborador();
    ColaboradorDAO daocolab = new ColaboradorDAO();
    
    public JanEditarColaborador(){
        initComponents(); 
    }
     
    public JanEditarColaborador(ColaboradorDAO a, String cpf) {
        initComponents();
        daocolab = a;
        if(daocolab.pesquisa(cpf)){
            colab.setId_colab(daocolab.getColaborador().getId_colab());
            tf_nomeP.setText(daocolab.getColaborador().getNome_colab());
            tf_login.setText(daocolab.getColaborador().getLogin_colab());
            tf_senha.setText(daocolab.getColaborador().getSenha_colab());
            tf_cpf.setText(daocolab.getColaborador().getCpf_colab());            
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tf_nomeP = new javax.swing.JTextField();
        tf_senha = new javax.swing.JTextField();
        tf_cpf = new javax.swing.JTextField();
        bt_salvar = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();
        tf_login = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lb_login1 = new javax.swing.JLabel();
        lb_senha1 = new javax.swing.JLabel();
        lb_cpf1 = new javax.swing.JLabel();
        lb_nome1 = new javax.swing.JLabel();
        lb_nome = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        tf_nomeP.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        tf_nomeP.setForeground(new java.awt.Color(204, 51, 0));
        getContentPane().add(tf_nomeP);
        tf_nomeP.setBounds(380, 120, 270, 30);

        tf_senha.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        tf_senha.setForeground(new java.awt.Color(204, 51, 0));
        getContentPane().add(tf_senha);
        tf_senha.setBounds(380, 200, 270, 30);

        tf_cpf.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        tf_cpf.setForeground(new java.awt.Color(204, 51, 0));
        getContentPane().add(tf_cpf);
        tf_cpf.setBounds(380, 240, 270, 30);

        bt_salvar.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        bt_salvar.setText("Gravar");
        bt_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_salvarActionPerformed(evt);
            }
        });
        getContentPane().add(bt_salvar);
        bt_salvar.setBounds(472, 290, 80, 30);

        btVoltar.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        btVoltar.setText("Fechar");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btVoltar);
        btVoltar.setBounds(562, 290, 80, 30);

        tf_login.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        tf_login.setForeground(new java.awt.Color(204, 51, 0));
        getContentPane().add(tf_login);
        tf_login.setBounds(380, 160, 270, 30);

        jPanel1.setBackground(new java.awt.Color(204, 51, 0));
        jPanel1.setForeground(new java.awt.Color(255, 102, 0));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Ebrima", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Oi2Fit");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(70, 150, 150, 63);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 290, 390);

        lb_login1.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        lb_login1.setForeground(new java.awt.Color(204, 51, 0));
        lb_login1.setText("Login:");
        getContentPane().add(lb_login1);
        lb_login1.setBounds(320, 200, 60, 30);

        lb_senha1.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        lb_senha1.setForeground(new java.awt.Color(204, 51, 0));
        lb_senha1.setText("Senha:");
        getContentPane().add(lb_senha1);
        lb_senha1.setBounds(320, 240, 60, 30);

        lb_cpf1.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        lb_cpf1.setForeground(new java.awt.Color(204, 51, 0));
        lb_cpf1.setText("CPF:");
        getContentPane().add(lb_cpf1);
        lb_cpf1.setBounds(320, 160, 60, 30);

        lb_nome1.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        lb_nome1.setForeground(new java.awt.Color(204, 51, 0));
        lb_nome1.setText("Nome:");
        getContentPane().add(lb_nome1);
        lb_nome1.setBounds(320, 120, 60, 30);

        lb_nome.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        lb_nome.setForeground(new java.awt.Color(204, 51, 0));
        lb_nome.setText("Editar Colaborador");
        getContentPane().add(lb_nome);
        lb_nome.setBounds(400, 60, 220, 30);

        setSize(new java.awt.Dimension(694, 376));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_salvarActionPerformed
        if (verificacampos()) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos", "Ok", JOptionPane.ERROR_MESSAGE);

        } else {
            colab.setNome_colab(tf_nomeP.getText());
            colab.setLogin_colab(tf_login.getText());
            colab.setSenha_colab(tf_senha.getText());
            colab.setCpf_colab(tf_cpf.getText());
            daocolab.editar(colab);
            System.out.println(colab.getNome_colab());
        }
    }//GEN-LAST:event_bt_salvarActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        dispose();
        ConsultarColaborador janconsultarcolaborador = new ConsultarColaborador();
        janconsultarcolaborador.setVisible(true);
        
    }//GEN-LAST:event_btVoltarActionPerformed
    
    private boolean verificacampos() {
        return (tf_nomeP.getText().equals("") || tf_login.getText().equals("") || tf_senha.getText().equals("") || tf_cpf.getText().equals(""));
    }
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> {
            new JanEditarColaborador().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btVoltar;
    private javax.swing.JButton bt_salvar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lb_cpf1;
    private javax.swing.JLabel lb_login1;
    private javax.swing.JLabel lb_nome;
    private javax.swing.JLabel lb_nome1;
    private javax.swing.JLabel lb_senha1;
    private javax.swing.JTextField tf_cpf;
    private javax.swing.JTextField tf_login;
    private javax.swing.JTextField tf_nomeP;
    private javax.swing.JTextField tf_senha;
    // End of variables declaration//GEN-END:variables
}
