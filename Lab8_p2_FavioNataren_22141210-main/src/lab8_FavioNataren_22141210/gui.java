/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_FavioNataren_22141210;

import java.awt.Color;
import static java.awt.Color.white;
import java.util.ArrayList;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author favio
 */
public class gui extends javax.swing.JFrame {
Color col=white;
bina bin = new bina("./carros.cbm");
ArrayList <Carros> carr=new ArrayList();
    public gui() {
        initComponents();
        bin.cargarArchivo();
        for (Carros car : bin.getcar()) {
                corredor.addItem(String.valueOf(car.getNumero()));
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

        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        barrita = new javax.swing.JProgressBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablita = new javax.swing.JTable();
        corredor = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        largot = new javax.swing.JLabel();
        pistat = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Comenzar = new javax.swing.JButton();
        pausar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        nompis = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        largo = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        identi = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        nom = new javax.swing.JTextField();
        Pista = new javax.swing.JButton();
        Reset = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        guardar = new javax.swing.JButton();
        tipo = new javax.swing.JComboBox<>();
        Agregar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        barrita.setBackground(new java.awt.Color(102, 102, 102));
        barrita.setMaximum(1000);
        jPanel1.add(barrita, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 680, 80));

        tablita.setBackground(new java.awt.Color(204, 153, 255));
        tablita.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identificador", "Corredor", "Distancia"
            }
        ));
        jScrollPane1.setViewportView(tablita);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 680, 360));

        jPanel1.add(corredor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 210, 30));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Longitud");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, -1, -1));

        largot.setFont(new java.awt.Font("Roboto", 3, 18)); // NOI18N
        largot.setForeground(new java.awt.Color(255, 255, 255));
        largot.setText("____________");
        jPanel1.add(largot, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, 140, -1));

        pistat.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        pistat.setForeground(new java.awt.Color(255, 255, 255));
        pistat.setText("_______________");
        jPanel1.add(pistat, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, -1, -1));

        jLabel7.setFont(new java.awt.Font("Roboto", 3, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Pista:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, -1));

        Comenzar.setBackground(new java.awt.Color(102, 102, 102));
        Comenzar.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        Comenzar.setText("Comenzar");
        Comenzar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Comenzar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ComenzarMouseClicked(evt);
            }
        });
        Comenzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComenzarActionPerformed(evt);
            }
        });
        jPanel1.add(Comenzar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 90, 40));

        pausar.setBackground(new java.awt.Color(102, 102, 102));
        pausar.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        pausar.setText("Pausar");
        pausar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pausar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pausarMouseClicked(evt);
            }
        });
        pausar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pausarActionPerformed(evt);
            }
        });
        jPanel1.add(pausar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 90, 40));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Nombre Pista");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 570, -1, -1));
        jPanel1.add(nompis, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 560, 200, 30));

        jLabel11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Largo");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 640, -1, -1));
        jPanel1.add(largo, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 630, 200, 30));

        jLabel12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Numero Identificador");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 610, -1, -1));
        jPanel1.add(identi, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 600, 170, 30));

        jLabel13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Nombre Corredor");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 650, -1, -1));
        jPanel1.add(nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 650, 170, 30));

        Pista.setBackground(new java.awt.Color(102, 102, 102));
        Pista.setText("Usar Pista");
        Pista.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Pista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PistaMouseClicked(evt);
            }
        });
        Pista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PistaActionPerformed(evt);
            }
        });
        jPanel1.add(Pista, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 680, 200, 40));

        Reset.setBackground(new java.awt.Color(102, 102, 102));
        Reset.setText("Reiniciar");
        Reset.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Reset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ResetMouseClicked(evt);
            }
        });
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });
        jPanel1.add(Reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 730, 200, 40));

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Color");
        jButton5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.setBorderPainted(false);
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 690, 170, 40));

        guardar.setBackground(new java.awt.Color(102, 102, 102));
        guardar.setText("Guardar");
        guardar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guardarMouseClicked(evt);
            }
        });
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });
        jPanel1.add(guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 740, 170, 40));

        tipo.setBackground(new java.awt.Color(102, 102, 102));
        tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "McQueen", "Convertible", "Nascar" }));
        jPanel1.add(tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 690, 120, 30));

        Agregar.setBackground(new java.awt.Color(102, 102, 102));
        Agregar.setText("Agregar");
        Agregar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AgregarMouseClicked(evt);
            }
        });
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });
        jPanel1.add(Agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 550, 90, 30));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 790));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 350, 790));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        col=JColorChooser.showDialog(this, "elija un color", col);
        jButton5.setBackground(col);
    }//GEN-LAST:event_jButton5MouseClicked

    private void guardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarMouseClicked
        boolean pass=true;
        for (Carros car : bin.getcar()) {
            if (Integer.parseInt(identi.getText())==car.getNumero()) {
                pass=false;
                break;
            }
        }
        if (pass ) {
            if (Integer.parseInt(identi.getText())>-1) {
                bin.cargarArchivo();
                bin.setcar(new Carros(nom.getText(),col,Integer.parseInt(identi.getText()),tipo.getSelectedIndex()));
                bin.escribirArchivo2();
                corredor.removeAllItems();
                for (Carros car : bin.getcar()) {
                    corredor.addItem(String.valueOf(car.getNumero()));
                }
                JOptionPane.showMessageDialog(this, "Agregado Exitosamente");
                nom.setText("");
                identi.setText("");
                jButton5.setBackground(white);
            }else{
                JOptionPane.showMessageDialog(this, "No Puede Tener un Corredor Con un identificador negativo");
            }
            
        }else{
            JOptionPane.showMessageDialog(this, "No Puede Tener 2 Corredores Con El Misomo Nombre");
        }
            
    }//GEN-LAST:event_guardarMouseClicked

    private void AgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarMouseClicked
        bin.cargarArchivo();
        carr.add(bin.car.get(corredor.getSelectedIndex()));
        DefaultTableModel modelo2=new DefaultTableModel() ;
        modelo2.addColumn("Identificador");
        modelo2.addColumn("Corredor");
        modelo2.addColumn("Distancia");
        Object[] ob=new Object[3];
        Carros per = bin.car.get(corredor.getSelectedIndex());
        boolean pass=true;
            for (int i = 0; i < tablita.getRowCount(); i++) {
                int t=0;
                for (int j = 0; j < tablita.getColumnCount(); j++) {
                    if (t<3) {
                       ob[t]=tablita.getValueAt(i, j);  
                    }
                    t++;
                    
                }
                modelo2.addRow(ob);
            }
            ob[0]=per.getNumero();
            ob[1]=per.getNombre();
            ob[2]=per.getDistancia();
            modelo2.addRow(ob);
            tablita.setModel(modelo2);
            //JOptionPane.showMessageDialog(this, "No Puede volver a agregar a un corredor que ya participa");
                 
            
        
    }//GEN-LAST:event_AgregarMouseClicked

    private void PistaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PistaMouseClicked
        pistat.setText(nompis.getText());
        largot.setText(largo.getText());
        JOptionPane.showMessageDialog(this, "Pista Agregada");
        nompis.setText("");
        largo.setText("");
    }//GEN-LAST:event_PistaMouseClicked

    private void ResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResetMouseClicked
        DefaultTableModel modelo2=new DefaultTableModel() ;
        modelo2.addColumn("Identificador");
        modelo2.addColumn("Corredor");
        modelo2.addColumn("Distancia");
        tablita.setModel(modelo2);
        carr.removeAll(carr);
    }//GEN-LAST:event_ResetMouseClicked

    private void ComenzarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ComenzarMouseClicked
        try {
            barrita.setMaximum(Integer.valueOf(largot.getText()));
            hilo h=new hilo(barrita ,carr,Integer.valueOf(largot.getText()),tablita);
            Thread proceso2 = new Thread(h);
            proceso2.start();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Por Favor Asegurece que haya Ingresado un largo a la pista ");
        }
        
    }//GEN-LAST:event_ComenzarMouseClicked

    private void pausarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pausarMouseClicked
    }//GEN-LAST:event_pausarMouseClicked

    private void pausarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pausarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pausarActionPerformed

    private void ComenzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComenzarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComenzarActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ResetActionPerformed

    private void PistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PistaActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_guardarActionPerformed

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AgregarActionPerformed

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
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar;
    private javax.swing.JButton Comenzar;
    private javax.swing.JButton Pista;
    private javax.swing.JButton Reset;
    private javax.swing.JProgressBar barrita;
    private javax.swing.JComboBox<String> corredor;
    private javax.swing.JButton guardar;
    private javax.swing.JTextField identi;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField largo;
    private javax.swing.JLabel largot;
    private javax.swing.JTextField nom;
    private javax.swing.JTextField nompis;
    private javax.swing.JButton pausar;
    private javax.swing.JLabel pistat;
    private javax.swing.JTable tablita;
    private javax.swing.JComboBox<String> tipo;
    // End of variables declaration//GEN-END:variables
}
