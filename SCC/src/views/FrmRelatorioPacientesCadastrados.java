package views;

import control.ControlePaciente;
import domain.Paciente;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class FrmRelatorioPacientesCadastrados extends javax.swing.JFrame {
    
    private ControlePaciente controlePaciente;
    
    public FrmRelatorioPacientesCadastrados() {
        initComponents(); 
        controlePaciente = new ControlePaciente();
        this.setLocationRelativeTo(null);
        //estabelece o modelo especificado em propriedades do Jtable criado
        DefaultTableModel tabelaPacientes = (DefaultTableModel) jtRelatorioPacientes.getModel();
        ArrayList<Paciente> listaPaciente = new ArrayList<>();
        listaPaciente = controlePaciente.exibirPaciente();
        
        //percorre pelo arraylist e envia os dados de cada paciente para uma linha da tabela
        for (int i = 0; i < listaPaciente.size(); i++){
                    tabelaPacientes.addRow(new Object[] {listaPaciente.get(i).getcodPaciente(),
                                                         listaPaciente.get(i).getNome(),
                                                         listaPaciente.get(i).getCpf(),
                                                         listaPaciente.get(i).getDataNascimento(),
                                                         listaPaciente.get(i).getSexo(),
                                                         listaPaciente.get(i).getUf(),
                                                         listaPaciente.get(i).getCidade(),
                                                         listaPaciente.get(i).getBairro(),
                                                         listaPaciente.get(i).getRua(),
                                                         listaPaciente.get(i).getNumero(),
                                                         listaPaciente.get(i).getCep(),
                                                         listaPaciente.get(i).getTelefone(),
                                                         listaPaciente.get(i).getCelular(),
                                                         listaPaciente.get(i).getEmail()
                                                         });
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtRelatorioPacientes = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("RELATÓRIO DE PACIENTES CADASTRADOS");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jtRelatorioPacientes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtRelatorioPacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cód.", "Nome", "CPF", "Data Nascimento", "Sexo", "UF", "Cidade", "Bairro", "Rua", "Nº", "CEP", "Telefone", "Celular", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtRelatorioPacientes.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jtRelatorioPacientes.setRowHeight(20);
        jScrollPane1.setViewportView(jtRelatorioPacientes);
        if (jtRelatorioPacientes.getColumnModel().getColumnCount() > 0) {
            jtRelatorioPacientes.getColumnModel().getColumn(0).setMinWidth(80);
            jtRelatorioPacientes.getColumnModel().getColumn(1).setMinWidth(250);
            jtRelatorioPacientes.getColumnModel().getColumn(2).setMinWidth(125);
            jtRelatorioPacientes.getColumnModel().getColumn(3).setMinWidth(110);
            jtRelatorioPacientes.getColumnModel().getColumn(4).setMinWidth(75);
            jtRelatorioPacientes.getColumnModel().getColumn(5).setMinWidth(30);
            jtRelatorioPacientes.getColumnModel().getColumn(6).setMinWidth(200);
            jtRelatorioPacientes.getColumnModel().getColumn(7).setMinWidth(200);
            jtRelatorioPacientes.getColumnModel().getColumn(8).setMinWidth(200);
            jtRelatorioPacientes.getColumnModel().getColumn(9).setMinWidth(5);
            jtRelatorioPacientes.getColumnModel().getColumn(10).setMinWidth(100);
            jtRelatorioPacientes.getColumnModel().getColumn(11).setMinWidth(130);
            jtRelatorioPacientes.getColumnModel().getColumn(12).setMinWidth(130);
            jtRelatorioPacientes.getColumnModel().getColumn(13).setMinWidth(300);
        }

        jPanel1.setBackground(new java.awt.Color(51, 102, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Relatório de Pacientes Cadastrados");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(293, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(257, 257, 257))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        FrmTelaPrincipal telaPrincipal = new FrmTelaPrincipal();
        this.setLocationRelativeTo(null);
        telaPrincipal.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    /**
     * @param args the command line arguments
     */
    public void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmRelatorioPacientesCadastrados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmRelatorioPacientesCadastrados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmRelatorioPacientesCadastrados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmRelatorioPacientesCadastrados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new FrmRelatorioPacientesCadastrados().setVisible(true);                
            }
        });

    }  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtRelatorioPacientes;
    // End of variables declaration//GEN-END:variables

}
