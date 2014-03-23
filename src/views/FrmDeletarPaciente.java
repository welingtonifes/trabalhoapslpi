package views;

import control.ControlePaciente;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

public class FrmDeletarPaciente extends javax.swing.JFrame {

    /**
     * Creates new form FrmDeletarPaciente
     */
    MaskFormatter formatoCpf;
    public FrmDeletarPaciente() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlDeletarPaciente = new javax.swing.JLabel();
        jbExcluirPaciente = new javax.swing.JButton();
        jbCancelarExclusaoPaciente = new javax.swing.JButton();
        try{
            formatoCpf = new MaskFormatter("###.###.###-##");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao setar a maskara" + e);
        }
        jtfExcluirPacienteCpf = new JFormattedTextField(formatoCpf);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jlDeletarPaciente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jlDeletarPaciente.setText("INFORME O CPF DO PACIENTE QUE DESEJA EXCLUIR:");

        jbExcluirPaciente.setText("EXCLUIR");
        jbExcluirPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirPacienteActionPerformed(evt);
            }
        });

        jbCancelarExclusaoPaciente.setText("CANCELAR");
        jbCancelarExclusaoPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarExclusaoPacienteActionPerformed(evt);
            }
        });

        jtfExcluirPacienteCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfExcluirPacienteCpfActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlDeletarPaciente)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jbExcluirPaciente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbCancelarExclusaoPaciente)
                .addGap(46, 46, 46))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jtfExcluirPacienteCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jlDeletarPaciente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfExcluirPacienteCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbExcluirPaciente)
                    .addComponent(jbCancelarExclusaoPaciente))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbExcluirPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirPacienteActionPerformed
        // TODO add your handling code here:
        if(!(this.jtfExcluirPacienteCpf.getText().matches("^\\d{3}\\x2E\\d{3}\\x2E\\d{3}\\x2D\\d{2}$"))){    
            JOptionPane.showMessageDialog(this, "Informe um cpf válido!");
            jtfExcluirPacienteCpf.setText("");
            jtfExcluirPacienteCpf.requestFocus();
        }
        else{                   
            ControlePaciente.remover(this.jtfExcluirPacienteCpf.getText());
            this.dispose();
        }
    }//GEN-LAST:event_jbExcluirPacienteActionPerformed

    private void jtfExcluirPacienteCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfExcluirPacienteCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfExcluirPacienteCpfActionPerformed

    private void jbCancelarExclusaoPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarExclusaoPacienteActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbCancelarExclusaoPacienteActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        FrmTelaPrincipal telaPrincipal = new FrmTelaPrincipal();
        this.setLocationRelativeTo(null);
        telaPrincipal.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(FrmDeletarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmDeletarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmDeletarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmDeletarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmDeletarPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbCancelarExclusaoPaciente;
    private javax.swing.JButton jbExcluirPaciente;
    private javax.swing.JLabel jlDeletarPaciente;
    private javax.swing.JTextField jtfExcluirPacienteCpf;
    // End of variables declaration//GEN-END:variables
}
