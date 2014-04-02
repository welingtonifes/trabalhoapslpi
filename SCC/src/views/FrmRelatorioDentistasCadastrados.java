package views;

import control.ControleDentista;
import domain.Dentista;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class FrmRelatorioDentistasCadastrados extends javax.swing.JFrame {
    
    private ControleDentista controleDentista;
    
    public FrmRelatorioDentistasCadastrados() {
        initComponents(); 
        controleDentista = new ControleDentista();
        this.setLocationRelativeTo(null);
        //estabelece o modelo especificado em propriedades do Jtable criado
        DefaultTableModel tabelaDentistas = (DefaultTableModel) jtRelatorioDentistas.getModel();
        ArrayList<Dentista> listaDentista = new ArrayList<>();
        listaDentista = controleDentista.exibirDentista();
        
        //percorre pelo arraylist e envia os dados de cada dentista para uma linha da tabela
        for (int i = 0; i < listaDentista.size(); i++){
                    tabelaDentistas.addRow(new Object[] {listaDentista.get(i).getCodDentista(),
                                                         listaDentista.get(i).getNome(),
                                                         listaDentista.get(i).getCpf(),
                                                         listaDentista.get(i).getDataNascimento(),
                                                         listaDentista.get(i).getSexo(),
                                                         listaDentista.get(i).getUf(),
                                                         listaDentista.get(i).getCidade(),
                                                         listaDentista.get(i).getBairro(),
                                                         listaDentista.get(i).getRua(),
                                                         listaDentista.get(i).getNumero(),
                                                         listaDentista.get(i).getCep(),
                                                         listaDentista.get(i).getTelefone(),
                                                         listaDentista.get(i).getCelular(),
                                                         listaDentista.get(i).getEmail()
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
        jtRelatorioDentistas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("RELATÓRIO DE DENTISTAS CADASTRADOS");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jtRelatorioDentistas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtRelatorioDentistas.setModel(new javax.swing.table.DefaultTableModel(
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
        jtRelatorioDentistas.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jtRelatorioDentistas.setRowHeight(20);
        jScrollPane1.setViewportView(jtRelatorioDentistas);
        if (jtRelatorioDentistas.getColumnModel().getColumnCount() > 0) {
            jtRelatorioDentistas.getColumnModel().getColumn(0).setMinWidth(80);
            jtRelatorioDentistas.getColumnModel().getColumn(1).setMinWidth(350);
            jtRelatorioDentistas.getColumnModel().getColumn(2).setMinWidth(150);
            jtRelatorioDentistas.getColumnModel().getColumn(3).setMinWidth(60);
            jtRelatorioDentistas.getColumnModel().getColumn(4).setMinWidth(100);
            jtRelatorioDentistas.getColumnModel().getColumn(5).setMinWidth(100);
            jtRelatorioDentistas.getColumnModel().getColumn(6).setMinWidth(150);
            jtRelatorioDentistas.getColumnModel().getColumn(7).setMinWidth(250);
            jtRelatorioDentistas.getColumnModel().getColumn(8).setMinWidth(30);
            jtRelatorioDentistas.getColumnModel().getColumn(9).setMinWidth(5);
            jtRelatorioDentistas.getColumnModel().getColumn(10).setMinWidth(100);
            jtRelatorioDentistas.getColumnModel().getColumn(11).setMinWidth(130);
            jtRelatorioDentistas.getColumnModel().getColumn(12).setMinWidth(130);
            jtRelatorioDentistas.getColumnModel().getColumn(13).setMinWidth(300);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 827, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
            java.util.logging.Logger.getLogger(FrmRelatorioDentistasCadastrados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmRelatorioDentistasCadastrados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmRelatorioDentistasCadastrados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmRelatorioDentistasCadastrados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new FrmRelatorioDentistasCadastrados().setVisible(true);                
            }
        });

    }  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtRelatorioDentistas;
    // End of variables declaration//GEN-END:variables

}