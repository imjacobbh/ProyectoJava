/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misclases;

import java.awt.Color;
import javax.swing.JOptionPane;
import AppPackage.AnimationClass;
import controlMySQL.MySqlConn;
import java.awt.Image;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Toolkit;
import java.io.File;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import org.apache.commons.codec.digest.DigestUtils;

/**
 *
 * @author MASTER
 */
public class LoginJFrame extends javax.swing.JFrame {

    ArrayList<String> imagenesGaleria = new ArrayList();
    int auxIterator = 1;
    AnimationClass animation = new AnimationClass();
    File dirMusic;
    boolean audioOn = true;
    long posicionClip;
    Clip clip;
    MySqlConn conn;

    public LoginJFrame(MySqlConn conn) {
        this.conn = conn;
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        // this.jLabel1.setIcon( setIcono("/images/JACOB_S_free-file.png",this.jLabel1));
        TextPrompt x = new TextPrompt("Ingrese un nombre de usuario", this.jTextFieldUsuario);
        for (int i = 0; i <= 12; i++) {
            imagenesGaleria.add("/images/galeria" + i + ".jpg");
        }
        try {
            dirMusic = new File("src/audio/audioLogin.wav");
            if (dirMusic.exists()) {
                AudioInputStream audio = AudioSystem.getAudioInputStream(dirMusic);
                clip = AudioSystem.getClip();
                clip.open(audio);
                clip.start();
                clip.loop(Clip.LOOP_CONTINUOUSLY);
            } else {
                JOptionPane.showMessageDialog(null, "El audio no fue encontrado");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public LoginJFrame() {

    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("images/iconoApp.png"));
        return retValue;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelCerrar = new javax.swing.JLabel();
        jLabelMinimizar = new javax.swing.JLabel();
        jPanel1 = new FondoPanel("/images/exterior.jpg");
        jPanelIngreso = new javax.swing.JPanel();
        jLabelIconPerfil = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jLabelUsuario1 = new javax.swing.JLabel();
        jPasswordFieldContraseña = new javax.swing.JPasswordField();
        jSeparatorContraseña = new javax.swing.JSeparator();
        jSeparatorUsuario = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelAudio = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabelMensajeLogin = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabelGaleria1 = new javax.swing.JLabel();
        jLabelGaleria2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setIconImage(getIconImage());
        setUndecorated(true);
        setResizable(false);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelCerrar.setBackground(new java.awt.Color(255, 255, 255));
        jLabelCerrar.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Multiply_32px.png"))); // NOI18N
        jLabelCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabelCerrar.setOpaque(true);
        jLabelCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelCerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelCerrarMouseExited(evt);
            }
        });
        getContentPane().add(jLabelCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, -24, 51, 24));

        jLabelMinimizar.setBackground(new java.awt.Color(255, 255, 255));
        jLabelMinimizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Expand_Arrow_32px.png"))); // NOI18N
        jLabelMinimizar.setOpaque(true);
        jLabelMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinimizarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelMinimizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelMinimizarMouseExited(evt);
            }
        });
        getContentPane().add(jLabelMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, -24, 51, 24));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1361, 768));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel1MouseMoved(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelIngreso.setBackground(new java.awt.Color(255, 255, 255));
        jPanelIngreso.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelIconPerfil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelIconPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconoUser.png"))); // NOI18N
        jLabelIconPerfil.setPreferredSize(new java.awt.Dimension(50, 50));
        jPanelIngreso.add(jLabelIconPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 360, 160));

        jLabelUsuario.setBackground(new java.awt.Color(255, 255, 255));
        jLabelUsuario.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabelUsuario.setForeground(new java.awt.Color(214, 173, 96));
        jLabelUsuario.setText("Contraseña:");
        jPanelIngreso.add(jLabelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 120, 30));

        jTextFieldUsuario.setFont(new java.awt.Font("Decker", 0, 16)); // NOI18N
        jTextFieldUsuario.setForeground(new java.awt.Color(155, 155, 155));
        jTextFieldUsuario.setBorder(null);
        jTextFieldUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldUsuarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldUsuarioFocusLost(evt);
            }
        });
        jTextFieldUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsuarioActionPerformed(evt);
            }
        });
        jPanelIngreso.add(jTextFieldUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 250, 30));

        jLabelUsuario1.setBackground(new java.awt.Color(255, 255, 255));
        jLabelUsuario1.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabelUsuario1.setForeground(new java.awt.Color(214, 173, 96));
        jLabelUsuario1.setText("Usuario:");
        jPanelIngreso.add(jLabelUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 120, 30));

        jPasswordFieldContraseña.setFont(new java.awt.Font("Decker", 0, 16)); // NOI18N
        jPasswordFieldContraseña.setForeground(new java.awt.Color(155, 155, 155));
        jPasswordFieldContraseña.setBorder(null);
        jPasswordFieldContraseña.setEchoChar('\u2022');
        jPasswordFieldContraseña.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordFieldContraseñaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordFieldContraseñaFocusLost(evt);
            }
        });
        jPasswordFieldContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldContraseñaActionPerformed(evt);
            }
        });
        jPanelIngreso.add(jPasswordFieldContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, 250, 30));

        jSeparatorContraseña.setBackground(new java.awt.Color(160, 160, 160));
        jSeparatorContraseña.setToolTipText("");
        jPanelIngreso.add(jSeparatorContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 280, 10));

        jSeparatorUsuario.setBackground(new java.awt.Color(160, 160, 160));
        jPanelIngreso.add(jSeparatorUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 280, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconInContraseña.png"))); // NOI18N
        jPanelIngreso.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 30, 30));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconoInUsuario.png"))); // NOI18N
        jPanelIngreso.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 30, 30));

        jLabelAudio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/slider_on.png"))); // NOI18N
        jLabelAudio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabelAudio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelAudioMouseClicked(evt);
            }
        });
        jPanelIngreso.add(jLabelAudio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 40, 40));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Decker", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boton_off.png"))); // NOI18N
        jButton1.setText("Iniciar");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.setFocusPainted(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boton_on.png"))); // NOI18N
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boton_on.png"))); // NOI18N
        jButton1.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boton_on.png"))); // NOI18N
        jButton1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boton_on.png"))); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanelIngreso.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 480, 130, 40));

        jLabel3.setFont(new java.awt.Font("Decker", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(214, 173, 96));
        jLabel3.setText("¿Eres administrador? ¡Inicia aquí!");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanelIngreso.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 540, 190, 20));

        jLabelMensajeLogin.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLabelMensajeLogin.setForeground(new java.awt.Color(255, 51, 51));
        jLabelMensajeLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanelIngreso.add(jLabelMensajeLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 360, 20));

        jPanel1.add(jPanelIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 80, 360, 600));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setOpaque(false);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/next.png"))); // NOI18N
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, 840, 70));

        jLabelGaleria1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelGaleria1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/galeria2.jpg"))); // NOI18N
        jPanel3.add(jLabelGaleria1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-840, 0, 840, 600));

        jLabelGaleria2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelGaleria2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/galeria0.jpg"))); // NOI18N
        jLabelGaleria2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelGaleria2MouseClicked(evt);
            }
        });
        jPanel3.add(jLabelGaleria2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 600));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 840, 600));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        for (double i = 0.0; i <= 1.0; i = i + 0.1) {
            String val = i + "";
            float f = Float.valueOf(val);
            this.setOpacity(f);
            try {
                Thread.sleep(20);
            } catch (Exception e) {

            }
        }
    }//GEN-LAST:event_formWindowOpened

    private void jLabelCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCerrarMouseClicked
        int dialog = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(null, "¿Desea salir del programa?", "Confirmar", dialog);
        if (result == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_jLabelCerrarMouseClicked

    private void jLabelCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCerrarMouseEntered
        this.jLabelCerrar.setBackground(Color.red);
    }//GEN-LAST:event_jLabelCerrarMouseEntered

    private void jLabelCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCerrarMouseExited
        this.jLabelCerrar.setBackground(Color.white);
    }//GEN-LAST:event_jLabelCerrarMouseExited

    private void jLabelMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinimizarMouseClicked
        this.setState(LoginJFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMinimizarMouseClicked

    private void jLabelMinimizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinimizarMouseEntered
        this.jLabelMinimizar.setBackground(new Color(204, 204, 204));
    }//GEN-LAST:event_jLabelMinimizarMouseEntered

    private void jLabelMinimizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinimizarMouseExited
        this.jLabelMinimizar.setBackground(Color.white);
    }//GEN-LAST:event_jLabelMinimizarMouseExited

    private void jPanel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseMoved
        Point punto = MouseInfo.getPointerInfo().getLocation();
        int x = punto.x;
        int y = punto.y;
        if (y < 24) {
            this.animation.jLabelYDown(-24, 0, 0, 16, this.jLabelCerrar);
            this.animation.jLabelYDown(-24, 0, 0, 24, this.jLabelMinimizar);
        }
        if (y > 24) {
            this.animation.jLabelYUp(this.jLabelCerrar.getY(), -24, 0, 24, this.jLabelCerrar);
            this.animation.jLabelYUp(this.jLabelMinimizar.getY(), -24, 0, 24, this.jLabelMinimizar);
        }
    }//GEN-LAST:event_jPanel1MouseMoved

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        Point punto = MouseInfo.getPointerInfo().getLocation();
        int x = punto.x;
        int y = punto.y;
        if (y < 24) {
            this.animation.jLabelYDown(-24, 0, 0, 16, this.jLabelCerrar);
            this.animation.jLabelYDown(-24, 0, 0, 24, this.jLabelMinimizar);
        }
        if (y > 24) {
            this.animation.jLabelYUp(this.jLabelCerrar.getY(), -24, 0, 24, this.jLabelCerrar);
            this.animation.jLabelYUp(this.jLabelMinimizar.getY(), -24, 0, 24, this.jLabelMinimizar);
        }
    }//GEN-LAST:event_formMouseMoved

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
       
        if (aux == false) {

            if (auxIterator != this.imagenesGaleria.size()) {
                this.jLabelGaleria1.setIcon(new javax.swing.ImageIcon(getClass().getResource(imagenesGaleria.get(auxIterator))));
                auxIterator++;
            } else {
                auxIterator = 0;
                this.jLabelGaleria1.setIcon(new javax.swing.ImageIcon(getClass().getResource(imagenesGaleria.get(auxIterator))));
            }
            aux = true;
            this.animation.jLabelXRight(-840, 0, 10, 5, this.jLabelGaleria1);
            this.animation.jLabelXRight(0, 840, 10, 5, this.jLabelGaleria2);
        } else {
            if (auxIterator != this.imagenesGaleria.size()) {
                this.jLabelGaleria2.setIcon(new javax.swing.ImageIcon(getClass().getResource(imagenesGaleria.get(auxIterator))));
                auxIterator++;
            } else {
                auxIterator = 0;
                this.jLabelGaleria2.setIcon(new javax.swing.ImageIcon(getClass().getResource(imagenesGaleria.get(auxIterator))));
                auxIterator++;
            }
            this.animation.jLabelXLeft(0, -840, 10, 5, this.jLabelGaleria1);
            this.animation.jLabelXLeft(840, 0, 10, 5, this.jLabelGaleria2);
            aux = false;
        }


    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabelGaleria2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelGaleria2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelGaleria2MouseClicked

    private void jTextFieldUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUsuarioActionPerformed

    private void jLabelAudioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAudioMouseClicked
        if (audioOn == true) {
            this.jLabelAudio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/slider_off.png")));
            audioOn = false;
            this.posicionClip = clip.getMicrosecondPosition();
            clip.stop();
        } else {
            this.jLabelAudio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/slider_on.png")));
            audioOn = true;
            clip.setMicrosecondPosition(posicionClip);
            clip.start();
        }
    }//GEN-LAST:event_jLabelAudioMouseClicked

    private void jTextFieldUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioFocusGained
        this.jSeparatorUsuario.setForeground(new Color(214, 173, 96));
        this.jSeparatorUsuario.setBackground(new Color(214, 173, 96));
        this.jLabelMensajeLogin.setText("");
    }//GEN-LAST:event_jTextFieldUsuarioFocusGained

    private void jPasswordFieldContraseñaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordFieldContraseñaFocusGained
        this.jSeparatorContraseña.setForeground(new Color(214, 173, 96));
        this.jSeparatorContraseña.setBackground(new Color(214, 173, 96));
        this.jLabelMensajeLogin.setText("");
    }//GEN-LAST:event_jPasswordFieldContraseñaFocusGained

    private void jPasswordFieldContraseñaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordFieldContraseñaFocusLost
        this.jSeparatorContraseña.setForeground(new Color(160, 160, 160));
        this.jSeparatorContraseña.setBackground(new Color(160, 160, 160));
    }//GEN-LAST:event_jPasswordFieldContraseñaFocusLost

    private void jTextFieldUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioFocusLost
        this.jSeparatorUsuario.setForeground(new Color(160, 160, 160));
        this.jSeparatorUsuario.setBackground(new Color(160, 160, 160));

    }//GEN-LAST:event_jTextFieldUsuarioFocusLost

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        iniciarSesion();
    }//GEN-LAST:event_jButton1ActionPerformed
    private void iniciarSesion(){
        if (this.jPasswordFieldContraseña.getPassword().length == 0 || this.jTextFieldUsuario.getText().trim().isEmpty()) {
            this.jLabelMensajeLogin.setText("Ningun campo debe estar vacio");
            this.jLabelMensajeLogin.setForeground(Color.red);
        } else {
            String cuenta, contraseña, query;
            cuenta = this.jTextFieldUsuario.getText().trim();
            query = "select * from usuarios where usuario = " + "'" + cuenta + "'";
            try{
            this.conn.Consult(query);
            }catch(java.lang.NullPointerException ex){
                this.jLabelMensajeLogin.setText("No se ha podido realizar conexion con la base de datos");
            }
            try {
                String contraseñaMySql = this.conn.rs.getString(2);
                char[] passwd = this.jPasswordFieldContraseña.getPassword();
                contraseña = new String(passwd);
                String contraseñaencriptada = DigestUtils.md5Hex(contraseña);
                if (contraseñaMySql.equals(contraseñaencriptada)) {
                    JOptionPane.showMessageDialog(null, "Bienvenido al sistema " + cuenta);
                    new JFramePrograma(conn,this.jTextFieldUsuario.getText().trim()).setVisible(true);
                    this.clip.stop();
                    this.dispose();
                } else {
                    this.jLabelMensajeLogin.setText("La contraseña no coincide");
                }

            } catch (SQLException ex) {
                  this.jLabelMensajeLogin.setText("No existe la cuenta con ese nombre");
            }
        }
    }
    private void jPasswordFieldContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldContraseñaActionPerformed
        iniciarSesion();
    }//GEN-LAST:event_jPasswordFieldContraseñaActionPerformed
    boolean aux = false;

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelAudio;
    private javax.swing.JLabel jLabelCerrar;
    private javax.swing.JLabel jLabelGaleria1;
    private javax.swing.JLabel jLabelGaleria2;
    private javax.swing.JLabel jLabelIconPerfil;
    private javax.swing.JLabel jLabelMensajeLogin;
    private javax.swing.JLabel jLabelMinimizar;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JLabel jLabelUsuario1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelIngreso;
    private javax.swing.JPasswordField jPasswordFieldContraseña;
    private javax.swing.JSeparator jSeparatorContraseña;
    private javax.swing.JSeparator jSeparatorUsuario;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables

    private Icon setIcono(String dir, JLabel x) {
        ImageIcon icon = new ImageIcon(getClass().getResource(dir));

        int ancho = x.getWidth();
        int alto = x.getHeight();

        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
        return icono;
    }
}
