/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_FavioNataren_22141210;

import java.awt.Color;
import static java.awt.Color.white;
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
    public gui() {
        initComponents();
        bin.cargarArchivo();
        for (Carros car : bin.getcar()) {
                corredor.addItem(String.valueOf(car.getNumero()));
        }
    }

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
        comenzar = new javax.swing.JButton();
        pausar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        nompis = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        largo = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        identi = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        nom = new javax.swing.JTextField();
        usar = new javax.swing.JButton();
        reiniciar = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        guardar = new javax.swing.JButton();
        tipo = new javax.swing.JComboBox<>();
        agregar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        barrita.setBackground(new java.awt.Color(255, 255, 255));
        barrita.setMaximum(10);
        jPanel1.add(barrita, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 680, 80));

        tablita.setBackground(new java.awt.Color(204, 153, 255));
        tablita.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identificador", "Corredor", "Distancia"
            }
        ));
        tablita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablitaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablita);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 680, 360));

        jPanel1.add(corredor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 210, 30));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Largo:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, -1, -1));

        largot.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        largot.setForeground(new java.awt.Color(255, 255, 255));
        largot.setText("_______________");
        jPanel1.add(largot, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, -1, -1));

        pistat.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        pistat.setForeground(new java.awt.Color(255, 255, 255));
        pistat.setText("_______________");
        jPanel1.add(pistat, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Pista:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, -1));

        comenzar.setBackground(new java.awt.Color(102, 102, 102));
        comenzar.setText("Comenzar");
        comenzar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        comenzar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comenzarMouseClicked(evt);
            }
        });
        jPanel1.add(comenzar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 90, 40));

        pausar.setBackground(new java.awt.Color(102, 102, 102));
        pausar.setText("Pausar");
        pausar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
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

        usar.setBackground(new java.awt.Color(102, 102, 102));
        usar.setText("Usar Pista");
        usar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        usar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usarMouseClicked(evt);
            }
        });
        jPanel1.add(usar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 680, 200, 40));

        reiniciar.setBackground(new java.awt.Color(102, 102, 102));
        reiniciar.setText("Reiniciar");
        reiniciar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        reiniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reiniciarMouseClicked(evt);
            }
        });
        jPanel1.add(reiniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 730, 200, 40));

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
        jPanel1.add(guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 740, 170, 40));

        tipo.setBackground(new java.awt.Color(102, 102, 102));
        tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "McQueen", "Convertible", "Nascar" }));
        jPanel1.add(tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 690, 120, 30));

        agregar.setBackground(new java.awt.Color(102, 102, 102));
        agregar.setText("Agregar");
        agregar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agregarMouseClicked(evt);
            }
        });
        jPanel1.add(agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 550, 90, 30));
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
                JOptionPane.showMessageDialog(this, "Se agrego exitosamente");
                nom.setText("");
                identi.setText("");
                jButton5.setBackground(white);
            }else{
                JOptionPane.showMessageDialog(this, "No se puede tener un corredor con un identificador negativo");
            }
            
        }else{
            JOptionPane.showMessageDialog(this, "No Puede Tener 2 Corredores Con El Mismo Nombre");
        }
            
    }//GEN-LAST:event_guardarMouseClicked

    private void agregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarMouseClicked
        bin.cargarArchivo();
        DefaultTableModel modelo2=new DefaultTableModel() ;
        modelo2.addColumn("identificador");
        modelo2.addColumn("corredor");
        modelo2.addColumn("distancia");
        Object[] ob=new Object[3];
        Carros per = bin.car.get(corredor.getSelectedIndex());
        boolean pass=true;

            for (int i = 0; i < tablita.getRowCount(); i++) {
                int x=0;
                for (int j = 0; j < tablita.getColumnCount(); j++) {
                    if (x<3) {
                       ob[x]=tablita.getValueAt(i, j);  
                    }
                    x++;
                    
                }
                modelo2.addRow(ob);
            }
            ob[0]=per.getNumero();
            ob[1]=per.getNombre();
            ob[2]=0;
            modelo2.addRow(ob);
            tablita.setModel(modelo2);                        
        
    }//GEN-LAST:event_agregarMouseClicked

    private void usarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usarMouseClicked
        pistat.setText(nompis.getText());
        largot.setText(largo.getText());
    }//GEN-LAST:event_usarMouseClicked

    private void reiniciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reiniciarMouseClicked
        DefaultTableModel modelo2=new DefaultTableModel() ;
        modelo2.addColumn("identificador");
        modelo2.addColumn("corredor");
        modelo2.addColumn("distancia");
        tablita.setModel(modelo2);
    }//GEN-LAST:event_reiniciarMouseClicked

    private void comenzarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comenzarMouseClicked
        for (int i = 0; i < tablita.getRowCount(); i++) {
                tablita.getValueAt(i, 1);
                
        }
    }//GEN-LAST:event_comenzarMouseClicked

    private void tablitaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablitaMouseClicked
        System.out.println(tablita.getSelectedRow());
        hilo h=new hilo(barrita , tablita.getValueAt(tablita.getSelectedRow(), tablita.getSelectedColumn()));
        Thread proceso2 = new Thread(h);
        proceso2.start();

    }//GEN-LAST:event_tablitaMouseClicked

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
    private javax.swing.JButton agregar;
    private javax.swing.JProgressBar barrita;
    private javax.swing.JButton comenzar;
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
    private javax.swing.JButton reiniciar;
    private javax.swing.JTable tablita;
    private javax.swing.JComboBox<String> tipo;
    private javax.swing.JButton usar;
    // End of variables declaration//GEN-END:variables
}
