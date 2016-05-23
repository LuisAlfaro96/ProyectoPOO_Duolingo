/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Coordinador;
import Modelo.Usuario;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;

/**
 *
 * @author keilor
 */
public class VentanaInicio extends javax.swing.JFrame {
    private Usuario usuarioActual;
    private Coordinador miCoordinador;
    public static VentanaInicio VI;
    
    public static VentanaInicio getInstance() { // Patron de diseño Singleton
        if (VI == null) {
            VI = new VentanaInicio();
        }
        return VI;
    }
    public VentanaInicio() {
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

        start_btn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        iniciarSesion_btn = new javax.swing.JButton();
        registrarse_btn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(550, 400));
        setPreferredSize(null);
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(null);

        start_btn.setFont(new java.awt.Font("Chiller", 0, 36)); // NOI18N
        start_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/start3232.png"))); // NOI18N
        start_btn.setBorder(null);
        start_btn.setBorderPainted(false);
        start_btn.setContentAreaFilled(false);
        start_btn.setFocusPainted(false);
        start_btn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        start_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                start_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                start_btnMouseExited(evt);
            }
        });
        start_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                start_btnActionPerformed(evt);
            }
        });
        getContentPane().add(start_btn);
        start_btn.setBounds(210, 150, 108, 73);

        jLabel1.setFont(new java.awt.Font("Chiller", 1, 48)); // NOI18N
        jLabel1.setForeground(Color.green);
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Empieza YA!");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(140, 90, 250, 56);

        iniciarSesion_btn.setBackground(new java.awt.Color(153, 255, 255));
        iniciarSesion_btn.setFont(new java.awt.Font("Chiller", 0, 18)); // NOI18N
        iniciarSesion_btn.setForeground(Color.green);
        iniciarSesion_btn.setText("Iniciar Sesion");
        iniciarSesion_btn.setBorderPainted(false);
        iniciarSesion_btn.setContentAreaFilled(false);
        iniciarSesion_btn.setFocusPainted(false);
        iniciarSesion_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                iniciarSesion_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                iniciarSesion_btnMouseExited(evt);
            }
        });
        getContentPane().add(iniciarSesion_btn);
        iniciarSesion_btn.setBounds(123, 230, 140, 34);

        registrarse_btn.setBackground(new java.awt.Color(153, 255, 255));
        registrarse_btn.setFont(new java.awt.Font("Chiller", 0, 18)); // NOI18N
        registrarse_btn.setForeground(Color.green);
        registrarse_btn.setText("Registrarse");
        registrarse_btn.setBorderPainted(false);
        registrarse_btn.setContentAreaFilled(false);
        registrarse_btn.setFocusPainted(false);
        registrarse_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                registrarse_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                registrarse_btnMouseExited(evt);
            }
        });
        registrarse_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarse_btnActionPerformed(evt);
            }
        });
        getContentPane().add(registrarse_btn);
        registrarse_btn.setBounds(280, 230, 130, 34);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/startBackground.gif"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 540, 370);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void start_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_start_btnMouseEntered
        ImageIcon ico = new ImageIcon("src/Imagenes/start6464.png");
        start_btn.setIcon(ico);
    }//GEN-LAST:event_start_btnMouseEntered

    private void start_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_start_btnMouseExited
        ImageIcon ico = new ImageIcon("src/Imagenes/start3232.png");
        start_btn.setIcon(ico);
    }//GEN-LAST:event_start_btnMouseExited

    private void iniciarSesion_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iniciarSesion_btnMouseEntered
        iniciarSesion_btn.setForeground(Color.blue);
        Font fn = new Font("Chiller", 0, 24);
        iniciarSesion_btn.setFont(fn);
    }//GEN-LAST:event_iniciarSesion_btnMouseEntered

    private void iniciarSesion_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iniciarSesion_btnMouseExited
        iniciarSesion_btn.setForeground(Color.green);
        Font fn = new Font("Chiller", 0, 18);
        iniciarSesion_btn.setFont(fn);
    }//GEN-LAST:event_iniciarSesion_btnMouseExited

    private void registrarse_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarse_btnMouseEntered
        registrarse_btn.setForeground(Color.blue);
        Font fn = new Font("Chiller", 0, 24);
        registrarse_btn.setFont(fn);
    }//GEN-LAST:event_registrarse_btnMouseEntered

    private void registrarse_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarse_btnMouseExited
        registrarse_btn.setForeground(Color.green);
        Font fn = new Font("Chiller", 0, 18);
        registrarse_btn.setFont(fn);
    }//GEN-LAST:event_registrarse_btnMouseExited

    private void start_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_start_btnActionPerformed
        usuarioActual = miCoordinador.getUsuarioActual();
    }//GEN-LAST:event_start_btnActionPerformed

    private void registrarse_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarse_btnActionPerformed
        VentanaRegistro registro = new VentanaRegistro();
        registro.setVisible(true);
        registro.setLocationRelativeTo(null);
        registro.setCoordinador(miCoordinador);
        dispose();
    }//GEN-LAST:event_registrarse_btnActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton iniciarSesion_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton registrarse_btn;
    private javax.swing.JButton start_btn;
    // End of variables declaration//GEN-END:variables

    public void setCoordinador(Coordinador CORE) {
        this.miCoordinador=CORE;
    }
}
