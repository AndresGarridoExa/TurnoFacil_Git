import javax.swing.JLabel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author k12_a
 */
public class Ventana extends javax.swing.JFrame {

    public Ventana() {
        initComponents();
        setSize(800, 600);
    }
                
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        comboHorario = new javax.swing.JComboBox<>();
        comboMedico = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Medico:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(70, 40, 210, 60);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Horario:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(70, 150, 120, 60);

        jLabel3.setVisible(false);
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Turno guardado!");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(600, 40, 210, 60);
        
        jButton1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jButton1.setText("Pedir turno");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(340, 380, 120, 50);
     
        comboMedico.addItem("Juan Antonio Suarez, Medicina general");
        comboMedico.addItem("Luis Garcia, Odontologia");
        comboHorario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Lunes 18hs", "Martes 15hs", "Jueves 12hs", "Lunes 14hs", "Viernes 15hs" }));
        jPanel1.add(comboHorario);
        comboHorario.setBounds(260, 170, 510, 30);

        comboMedico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Luis Garcia, Odontologia", "Juan Antonio Suarez, Medicina general"}));
        jPanel1.add(comboMedico);
        comboMedico.setBounds(260, 60, 510, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 800, 600);

        pack();
    }// </editor-fold>                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        
    public void mostrarTxt() {
    	jLabel3.setVisible(true);
    }
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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
     
    }

    // Variables declaration - do not modify                     
    private javax.swing.JComboBox<String> comboHorario;
    private javax.swing.JComboBox<String> comboMedico;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration                   
}
