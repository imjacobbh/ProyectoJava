/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misclases;

import AppPackage.AnimationClass;
import controlMySQL.MySqlConn;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

/**
 *
 * @author MASTER
 */
public class JFramePrograma extends javax.swing.JFrame {

    Border borderSelected = javax.swing.BorderFactory.createLineBorder(new java.awt.Color(214, 173, 96), 3);
    AnimationClass animation = new AnimationClass();
    Slide slide = new Slide();
    boolean slided = false;
    MySqlConn conn;

    public JFramePrograma() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.jLabelOpcion.setText("Inicio");
        this.jPanel1.removeAll();
        this.jPanel1.add(this.JPanelInicio);
        this.jPanel1.repaint();
        this.jPanel1.revalidate();
    }
    public JFramePrograma(MySqlConn conn) {
        this.conn = conn;
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);

        this.jLabelOpcion.setText("Inicio");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelMenuBar = new javax.swing.JPanel();
        jPanelIconHome = new javax.swing.JPanel();
        jLabelHome = new javax.swing.JLabel();
        jPanelIconCheckIn = new javax.swing.JPanel();
        jLabelCheckIn = new javax.swing.JLabel();
        jPanelIconCheckOut = new javax.swing.JPanel();
        jLabelCheckOut = new javax.swing.JLabel();
        jPanelIconBuscar = new javax.swing.JPanel();
        jLabelBuscarIcon = new javax.swing.JLabel();
        jPanelIconUsuario = new javax.swing.JPanel();
        jLabelUsuarioIcon = new javax.swing.JLabel();
        jPanelIconSalir = new javax.swing.JPanel();
        jLabelSalir = new javax.swing.JLabel();
        jPanelBarra = new javax.swing.JPanel();
        jLabelOpcion = new javax.swing.JLabel();
        jLabelMenu = new javax.swing.JLabel();
        jPanelLabelsMenu = new javax.swing.JPanel();
        jLabelCheckInText = new javax.swing.JLabel();
        jLabelInicio = new javax.swing.JLabel();
        jLabelCheckOutText = new javax.swing.JLabel();
        jLabelConsultaText = new javax.swing.JLabel();
        jLabelUsuarioText = new javax.swing.JLabel();
        jLabelSalirText = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        JPanelRegistro = new JPanelRegistro(conn);
        JPanelInicio = new javax.swing.JPanel();
        JPanelSalidas = new javax.swing.JPanel();
        JPanelConsultas = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelMenuBar.setBackground(new java.awt.Color(244, 244, 244));
        jPanelMenuBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelIconHome.setBackground(new java.awt.Color(244, 244, 244));
        jPanelIconHome.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanelIconHomeMouseMoved(evt);
            }
        });
        jPanelIconHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelIconHomeMouseEntered(evt);
            }
        });
        jPanelIconHome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelHome.setBackground(new java.awt.Color(244, 244, 244));
        jLabelHome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home.png"))); // NOI18N
        jLabelHome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(214, 173, 96), 3));
        jLabelHome.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabelHome.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabelHomeMouseMoved(evt);
            }
        });
        jLabelHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelHomeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelHomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelHomeMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelHomeMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabelHomeMouseReleased(evt);
            }
        });
        jPanelIconHome.add(jLabelHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 45, 45));

        jPanelMenuBar.add(jPanelIconHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 45, 45));

        jPanelIconCheckIn.setBackground(new java.awt.Color(244, 244, 244));
        jPanelIconCheckIn.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanelIconCheckInMouseMoved(evt);
            }
        });
        jPanelIconCheckIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelIconCheckInMouseEntered(evt);
            }
        });
        jPanelIconCheckIn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelCheckIn.setBackground(new java.awt.Color(244, 244, 244));
        jLabelCheckIn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCheckIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/check-in.png"))); // NOI18N
        jLabelCheckIn.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabelCheckInMouseMoved(evt);
            }
        });
        jLabelCheckIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCheckInMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelCheckInMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelCheckInMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelCheckInMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabelCheckInMouseReleased(evt);
            }
        });
        jPanelIconCheckIn.add(jLabelCheckIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 45, 45));

        jPanelMenuBar.add(jPanelIconCheckIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 45, 45, 45));

        jPanelIconCheckOut.setBackground(new java.awt.Color(244, 244, 244));
        jPanelIconCheckOut.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanelIconCheckOutMouseMoved(evt);
            }
        });
        jPanelIconCheckOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelIconCheckOutMouseEntered(evt);
            }
        });
        jPanelIconCheckOut.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelCheckOut.setBackground(new java.awt.Color(244, 244, 244));
        jLabelCheckOut.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCheckOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/check-out.png"))); // NOI18N
        jLabelCheckOut.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabelCheckOutMouseMoved(evt);
            }
        });
        jLabelCheckOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCheckOutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelCheckOutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelCheckOutMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelCheckOutMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabelCheckOutMouseReleased(evt);
            }
        });
        jPanelIconCheckOut.add(jLabelCheckOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 45, 45));

        jPanelMenuBar.add(jPanelIconCheckOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 45, 45));

        jPanelIconBuscar.setBackground(new java.awt.Color(244, 244, 244));
        jPanelIconBuscar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanelIconBuscarMouseMoved(evt);
            }
        });
        jPanelIconBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelIconBuscarMouseEntered(evt);
            }
        });
        jPanelIconBuscar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelBuscarIcon.setBackground(new java.awt.Color(244, 244, 244));
        jLabelBuscarIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelBuscarIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconBuscar.png"))); // NOI18N
        jLabelBuscarIcon.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabelBuscarIconMouseMoved(evt);
            }
        });
        jLabelBuscarIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelBuscarIconMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelBuscarIconMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelBuscarIconMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelBuscarIconMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabelBuscarIconMouseReleased(evt);
            }
        });
        jPanelIconBuscar.add(jLabelBuscarIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 45, 45));

        jPanelMenuBar.add(jPanelIconBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 135, 45, 45));

        jPanelIconUsuario.setBackground(new java.awt.Color(244, 244, 244));
        jPanelIconUsuario.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanelIconUsuarioMouseMoved(evt);
            }
        });
        jPanelIconUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelIconUsuarioMouseEntered(evt);
            }
        });
        jPanelIconUsuario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelUsuarioIcon.setBackground(new java.awt.Color(244, 244, 244));
        jLabelUsuarioIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelUsuarioIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconMenuUser.png"))); // NOI18N
        jLabelUsuarioIcon.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabelUsuarioIconMouseMoved(evt);
            }
        });
        jLabelUsuarioIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelUsuarioIconMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelUsuarioIconMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelUsuarioIconMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelUsuarioIconMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabelUsuarioIconMouseReleased(evt);
            }
        });
        jPanelIconUsuario.add(jLabelUsuarioIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 45, 45));

        jPanelMenuBar.add(jPanelIconUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 600, 45, 45));

        jPanelIconSalir.setBackground(new java.awt.Color(244, 244, 244));
        jPanelIconSalir.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanelIconSalirMouseMoved(evt);
            }
        });
        jPanelIconSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelIconSalirMouseEntered(evt);
            }
        });
        jPanelIconSalir.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelSalir.setBackground(new java.awt.Color(244, 244, 244));
        jLabelSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/salirMenu.png"))); // NOI18N
        jLabelSalir.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabelSalirMouseMoved(evt);
            }
        });
        jLabelSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelSalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelSalirMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelSalirMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabelSalirMouseReleased(evt);
            }
        });
        jPanelIconSalir.add(jLabelSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 45, 45));

        jPanelMenuBar.add(jPanelIconSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 645, 45, 45));

        getContentPane().add(jPanelMenuBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 45, 45, 725));

        jPanelBarra.setBackground(new java.awt.Color(214, 173, 96));
        jPanelBarra.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelOpcion.setFont(new java.awt.Font("Decker", 1, 18)); // NOI18N
        jLabelOpcion.setForeground(new java.awt.Color(255, 255, 255));
        jPanelBarra.add(jLabelOpcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 260, 45));

        getContentPane().add(jPanelBarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 0, 1315, 45));

        jLabelMenu.setBackground(new java.awt.Color(244, 244, 244));
        jLabelMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/menuOff.png"))); // NOI18N
        jLabelMenu.setOpaque(true);
        jLabelMenu.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabelMenuMouseMoved(evt);
            }
        });
        jLabelMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMenuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelMenuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelMenuMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelMenuMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabelMenuMouseReleased(evt);
            }
        });
        getContentPane().add(jLabelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 45, 45));

        jPanelLabelsMenu.setBackground(new java.awt.Color(244, 244, 244));
        jPanelLabelsMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelCheckInText.setBackground(new java.awt.Color(244, 244, 244));
        jLabelCheckInText.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabelCheckInText.setText("Check in");
        jLabelCheckInText.setOpaque(true);
        jLabelCheckInText.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabelCheckInTextMouseMoved(evt);
            }
        });
        jLabelCheckInText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCheckInTextMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelCheckInTextMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelCheckInTextMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelCheckInTextMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabelCheckInTextMouseReleased(evt);
            }
        });
        jPanelLabelsMenu.add(jLabelCheckInText, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 45, 205, 45));

        jLabelInicio.setBackground(new java.awt.Color(244, 244, 244));
        jLabelInicio.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabelInicio.setText("Inicio");
        jLabelInicio.setOpaque(true);
        jLabelInicio.setPreferredSize(null);
        jLabelInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelInicioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelInicioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelInicioMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelInicioMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabelInicioMouseReleased(evt);
            }
        });
        jPanelLabelsMenu.add(jLabelInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 205, 45));

        jLabelCheckOutText.setBackground(new java.awt.Color(244, 244, 244));
        jLabelCheckOutText.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabelCheckOutText.setText("Check out");
        jLabelCheckOutText.setOpaque(true);
        jLabelCheckOutText.setPreferredSize(null);
        jLabelCheckOutText.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabelCheckOutTextMouseMoved(evt);
            }
        });
        jLabelCheckOutText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCheckOutTextMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelCheckOutTextMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelCheckOutTextMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelCheckOutTextMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabelCheckOutTextMouseReleased(evt);
            }
        });
        jPanelLabelsMenu.add(jLabelCheckOutText, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 205, 45));

        jLabelConsultaText.setBackground(new java.awt.Color(244, 244, 244));
        jLabelConsultaText.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabelConsultaText.setText("Consulta");
        jLabelConsultaText.setOpaque(true);
        jLabelConsultaText.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabelConsultaTextMouseMoved(evt);
            }
        });
        jLabelConsultaText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelConsultaTextMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelConsultaTextMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelConsultaTextMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelConsultaTextMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabelConsultaTextMouseReleased(evt);
            }
        });
        jPanelLabelsMenu.add(jLabelConsultaText, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 135, 205, 45));

        jLabelUsuarioText.setBackground(new java.awt.Color(244, 244, 244));
        jLabelUsuarioText.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabelUsuarioText.setText("Usuario");
        jLabelUsuarioText.setOpaque(true);
        jLabelUsuarioText.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabelUsuarioTextMouseMoved(evt);
            }
        });
        jLabelUsuarioText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelUsuarioTextMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelUsuarioTextMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelUsuarioTextMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelUsuarioTextMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabelUsuarioTextMouseReleased(evt);
            }
        });
        jPanelLabelsMenu.add(jLabelUsuarioText, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 600, 205, 45));

        jLabelSalirText.setBackground(new java.awt.Color(244, 244, 244));
        jLabelSalirText.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabelSalirText.setText("Salir");
        jLabelSalirText.setOpaque(true);
        jLabelSalirText.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabelSalirTextMouseMoved(evt);
            }
        });
        jLabelSalirText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelSalirTextMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelSalirTextMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelSalirTextMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelSalirTextMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabelSalirTextMouseReleased(evt);
            }
        });
        jPanelLabelsMenu.add(jLabelSalirText, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 645, 205, 45));

        getContentPane().add(jPanelLabelsMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(-205, 45, 205, 723));

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));
        jPanel1.setLayout(new java.awt.CardLayout());
        jPanel1.add(JPanelRegistro, "card4");

        JPanelInicio.setBackground(new java.awt.Color(255, 204, 204));
        JPanelInicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(JPanelInicio, "card5");

        JPanelSalidas.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.add(JPanelSalidas, "card3");

        JPanelConsultas.setBackground(new java.awt.Color(153, 51, 255));
        JPanelConsultas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(JPanelConsultas, "card2");

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 45, 1315, 725));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelHomeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelHomeMousePressed
        this.jPanelIconHome.setBackground(new Color(243, 243, 243));
        this.jLabelInicio.setBackground(this.jPanelIconHome.getBackground());
        cerrarMenu();

    }//GEN-LAST:event_jLabelHomeMousePressed

    private void jLabelHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelHomeMouseEntered
        this.jPanelIconHome.setBackground(new Color(196, 197, 197));
        this.jLabelInicio.setBackground(this.jPanelIconHome.getBackground());
    }//GEN-LAST:event_jLabelHomeMouseEntered

    private void jLabelHomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelHomeMouseExited
        this.jPanelIconHome.setBackground(new Color(244, 244, 244));
        this.jLabelInicio.setBackground(this.jPanelIconHome.getBackground());
    }//GEN-LAST:event_jLabelHomeMouseExited

    private void jLabelHomeMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelHomeMouseMoved
        this.jPanelIconHome.setBackground(new Color(196, 197, 197));
    }//GEN-LAST:event_jLabelHomeMouseMoved

    private void jLabelHomeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelHomeMouseReleased
        this.jPanelIconHome.setBackground(new Color(196, 197, 197));
        this.jLabelInicio.setBackground(this.jPanelIconHome.getBackground());
        this.jPanel1.removeAll();
        this.jPanel1.add(this.JPanelInicio);
        this.jPanel1.repaint();
        this.jPanel1.revalidate();
    }//GEN-LAST:event_jLabelHomeMouseReleased

    private void jLabelMenuMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMenuMouseMoved
        this.jLabelMenu.setBackground(new Color(196, 197, 197));
    }//GEN-LAST:event_jLabelMenuMouseMoved

    private void jLabelMenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMenuMouseEntered
        this.jLabelMenu.setBackground(new Color(196, 197, 197));
        this.jLabelMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/menuOn.png")));

    }//GEN-LAST:event_jLabelMenuMouseEntered

    private void jLabelMenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMenuMouseExited
        this.jLabelMenu.setBackground(new Color(244, 244, 244));
        this.jLabelMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/menuOff.png")));
    }//GEN-LAST:event_jLabelMenuMouseExited

    private void jLabelMenuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMenuMousePressed
        this.jLabelMenu.setBackground(new Color(243, 243, 243));
        cerrarMenu();
    }//GEN-LAST:event_jLabelMenuMousePressed

    private void jLabelMenuMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMenuMouseReleased
        this.jLabelMenu.setBackground(new Color(196, 197, 197));
    }//GEN-LAST:event_jLabelMenuMouseReleased

    private void jLabelCheckInMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCheckInMouseMoved
        this.jPanelIconCheckIn.setBackground(new Color(196, 197, 197));
        this.jLabelCheckInText.setBackground(this.jPanelIconCheckIn.getBackground());
    }//GEN-LAST:event_jLabelCheckInMouseMoved

    private void jLabelCheckInMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCheckInMouseEntered
        this.jPanelIconCheckIn.setBackground(new Color(196, 197, 197));
        this.jLabelCheckInText.setBackground(this.jPanelIconCheckIn.getBackground());
    }//GEN-LAST:event_jLabelCheckInMouseEntered

    private void jLabelCheckInMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCheckInMouseExited
        this.jPanelIconCheckIn.setBackground(new Color(244, 244, 244));
        this.jLabelCheckInText.setBackground(this.jPanelIconCheckIn.getBackground());
    }//GEN-LAST:event_jLabelCheckInMouseExited

    private void jLabelCheckInMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCheckInMousePressed
        this.jPanelIconCheckIn.setBackground(new Color(243, 243, 243));
        this.jLabelCheckInText.setBackground(this.jPanelIconCheckIn.getBackground());
        cerrarMenu();
    }//GEN-LAST:event_jLabelCheckInMousePressed

    private void jLabelCheckInMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCheckInMouseReleased
        this.jPanelIconCheckIn.setBackground(new Color(196, 197, 197));
        this.jLabelCheckInText.setBackground(this.jPanelIconCheckIn.getBackground());
        this.jPanel1.removeAll();
        this.jPanel1.add(this.JPanelRegistro);
        this.jPanel1.repaint();
        this.jPanel1.revalidate();
    }//GEN-LAST:event_jLabelCheckInMouseReleased

    private void jPanelIconHomeMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelIconHomeMouseMoved

    }//GEN-LAST:event_jPanelIconHomeMouseMoved

    private void jPanelIconHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelIconHomeMouseEntered

    }//GEN-LAST:event_jPanelIconHomeMouseEntered

    private void jPanelIconCheckInMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelIconCheckInMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanelIconCheckInMouseMoved

    private void jPanelIconCheckInMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelIconCheckInMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanelIconCheckInMouseEntered

    private void jLabelCheckOutMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCheckOutMouseMoved
        this.jPanelIconCheckOut.setBackground(new Color(196, 197, 197));
        this.jLabelCheckOutText.setBackground(this.jPanelIconCheckOut.getBackground());
    }//GEN-LAST:event_jLabelCheckOutMouseMoved

    private void jLabelCheckOutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCheckOutMouseEntered
        this.jPanelIconCheckOut.setBackground(new Color(196, 197, 197));
        this.jLabelCheckOutText.setBackground(this.jPanelIconCheckOut.getBackground());
    }//GEN-LAST:event_jLabelCheckOutMouseEntered

    private void jLabelCheckOutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCheckOutMouseExited
        this.jPanelIconCheckOut.setBackground(new Color(244, 244, 244));
        this.jLabelCheckOutText.setBackground(this.jPanelIconCheckOut.getBackground());
    }//GEN-LAST:event_jLabelCheckOutMouseExited

    private void jLabelCheckOutMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCheckOutMousePressed
        this.jPanelIconCheckOut.setBackground(new Color(243, 243, 243));
        this.jLabelCheckOutText.setBackground(this.jPanelIconCheckOut.getBackground());
        cerrarMenu();


    }//GEN-LAST:event_jLabelCheckOutMousePressed

    private void jLabelCheckOutMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCheckOutMouseReleased
        this.jPanelIconCheckOut.setBackground(new Color(196, 197, 197));
        this.jLabelCheckOutText.setBackground(this.jPanelIconCheckOut.getBackground());
        this.jPanel1.removeAll();
        this.jPanel1.add(this.JPanelSalidas);
        this.jPanel1.repaint();
        this.jPanel1.revalidate();
    }//GEN-LAST:event_jLabelCheckOutMouseReleased

    private void jPanelIconCheckOutMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelIconCheckOutMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanelIconCheckOutMouseMoved

    private void jPanelIconCheckOutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelIconCheckOutMouseEntered
        this.jPanelIconCheckIn.setBackground(new Color(196, 197, 197));
        this.jLabelCheckInText.setBackground(this.jPanelIconCheckIn.getBackground());
    }//GEN-LAST:event_jPanelIconCheckOutMouseEntered

    private void jLabelHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelHomeMouseClicked

        this.jLabelOpcion.setText("Inicio");
        slided = false;
        this.jLabelCheckOut.setBorder(null);
        this.jLabelHome.setBorder(this.borderSelected);
        this.jLabelCheckIn.setBorder(null);
        this.jLabelSalir.setBorder(null);
        this.jLabelBuscarIcon.setBorder(null);

    }//GEN-LAST:event_jLabelHomeMouseClicked

    private void jLabelCheckInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCheckInMouseClicked

        this.jLabelOpcion.setText("Check in");
        slided = false;
        this.jLabelCheckIn.setBorder(borderSelected);
        this.jLabelHome.setBorder(null);
        this.jLabelCheckOut.setBorder(null);
        this.jLabelSalir.setBorder(null);
        this.jLabelBuscarIcon.setBorder(null);
    }//GEN-LAST:event_jLabelCheckInMouseClicked

    private void jLabelCheckOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCheckOutMouseClicked

        this.jLabelOpcion.setText("Check out");
        slided = false;
        this.jLabelCheckOut.setBorder(borderSelected);
        this.jLabelHome.setBorder(null);
        this.jLabelCheckIn.setBorder(null);
        this.jLabelSalir.setBorder(null);
        this.jLabelBuscarIcon.setBorder(null);
    }//GEN-LAST:event_jLabelCheckOutMouseClicked

    private void jLabelMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMenuMouseClicked
        if (this.slided == false) {
            this.slide.jPanelXDerecha(-205, 45, 5, 5, this.jPanelLabelsMenu);
            this.slided = true;
        } else {
            this.slide.jPanelXIzquierda(45, -205, 5, 5, this.jPanelLabelsMenu);
           
            this.slided = false;
        }
        this.jLabelMenu.setFocusable(true);
        this.jLabelMenu.requestFocus();
    }//GEN-LAST:event_jLabelMenuMouseClicked
    private void cerrarMenu() {
        this.slide.jPanelXIzquierda(45, -205, 5, 5, this.jPanelLabelsMenu);
    }
    private void jLabelCheckOutTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCheckOutTextMouseClicked

        this.jLabelOpcion.setText("Check out");
        cerrarMenu();
        slided = false;
        this.jLabelCheckOut.setBorder(borderSelected);
        this.jLabelHome.setBorder(null);
        this.jLabelCheckIn.setBorder(null);
        this.jLabelSalir.setBorder(null);
        this.jLabelBuscarIcon.setBorder(null);

    }//GEN-LAST:event_jLabelCheckOutTextMouseClicked

    private void jLabelCheckOutTextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCheckOutTextMouseEntered
        this.jPanelIconCheckOut.setBackground(new Color(196, 197, 197));
        this.jLabelCheckOutText.setBackground(this.jPanelIconCheckOut.getBackground());
    }//GEN-LAST:event_jLabelCheckOutTextMouseEntered

    private void jLabelCheckOutTextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCheckOutTextMouseExited
        this.jPanelIconCheckOut.setBackground(new Color(244, 244, 244));
        this.jLabelCheckOutText.setBackground(this.jPanelIconCheckOut.getBackground());
    }//GEN-LAST:event_jLabelCheckOutTextMouseExited

    private void jLabelCheckOutTextMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCheckOutTextMousePressed
        this.jPanelIconCheckOut.setBackground(new Color(243, 243, 243));
        this.jLabelCheckOutText.setBackground(this.jPanelIconCheckOut.getBackground());

    }//GEN-LAST:event_jLabelCheckOutTextMousePressed

    private void jLabelCheckOutTextMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCheckOutTextMouseReleased
        this.jPanelIconCheckOut.setBackground(new Color(196, 197, 197));
        this.jLabelCheckOutText.setBackground(this.jPanelIconCheckOut.getBackground());
        this.jPanel1.removeAll();
        this.jPanel1.add(this.JPanelSalidas);
        this.jPanel1.repaint();
        this.jPanel1.revalidate();
    }//GEN-LAST:event_jLabelCheckOutTextMouseReleased

    private void jLabelCheckOutTextMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCheckOutTextMouseMoved
        this.jPanelIconCheckOut.setBackground(new Color(196, 197, 197));
        this.jLabelCheckOutText.setBackground(this.jPanelIconCheckOut.getBackground());
    }//GEN-LAST:event_jLabelCheckOutTextMouseMoved

    private void jLabelInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelInicioMouseClicked

        this.jLabelOpcion.setText("Inicio");
        slided = false;
        cerrarMenu();
        this.jLabelHome.setBorder(borderSelected);
        this.jLabelCheckOut.setBorder(null);
        this.jLabelCheckIn.setBorder(null);
        this.jLabelBuscarIcon.setBorder(null);
        this.jLabelSalir.setBorder(null);
    }//GEN-LAST:event_jLabelInicioMouseClicked

    private void jLabelInicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelInicioMouseEntered
        this.jPanelIconHome.setBackground(new Color(196, 197, 197));
        this.jLabelInicio.setBackground(this.jPanelIconHome.getBackground());
    }//GEN-LAST:event_jLabelInicioMouseEntered

    private void jLabelInicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelInicioMouseExited
        this.jPanelIconHome.setBackground(new Color(244, 244, 244));
        this.jLabelInicio.setBackground(this.jPanelIconHome.getBackground());
        this.jPanelIconCheckIn.setBackground(new Color(244, 244, 244));
        this.jLabelCheckInText.setBackground(this.jPanelIconCheckIn.getBackground());

    }//GEN-LAST:event_jLabelInicioMouseExited

    private void jLabelInicioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelInicioMousePressed
        this.jPanelIconHome.setBackground(new Color(243, 243, 243));
        this.jLabelInicio.setBackground(this.jPanelIconHome.getBackground());

    }//GEN-LAST:event_jLabelInicioMousePressed

    private void jLabelInicioMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelInicioMouseReleased
        this.jPanelIconHome.setBackground(new Color(196, 197, 197));
        this.jLabelInicio.setBackground(this.jPanelIconHome.getBackground());
        this.jPanel1.removeAll();
        this.jPanel1.add(this.JPanelInicio);
        this.jPanel1.repaint();
        this.jPanel1.revalidate();
    }//GEN-LAST:event_jLabelInicioMouseReleased

    private void jLabelCheckInTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCheckInTextMouseClicked
        // TODO add your handling code here:
        cerrarMenu();
        this.jLabelOpcion.setText("Check in");
        slided = false;
        this.jLabelCheckIn.setBorder(borderSelected);
        this.jLabelCheckOut.setBorder(null);
        this.jLabelHome.setBorder(null);
        this.jLabelSalir.setBorder(null);
        this.jLabelBuscarIcon.setBorder(null);
    }//GEN-LAST:event_jLabelCheckInTextMouseClicked

    private void jLabelCheckInTextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCheckInTextMouseEntered
        this.jPanelIconCheckIn.setBackground(new Color(196, 197, 197));
        this.jLabelCheckInText.setBackground(this.jPanelIconCheckIn.getBackground());
    }//GEN-LAST:event_jLabelCheckInTextMouseEntered

    private void jLabelCheckInTextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCheckInTextMouseExited
        this.jPanelIconCheckIn.setBackground(new Color(244, 244, 244));
        this.jLabelCheckInText.setBackground(this.jPanelIconCheckIn.getBackground());
    }//GEN-LAST:event_jLabelCheckInTextMouseExited

    private void jLabelCheckInTextMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCheckInTextMousePressed
        this.jPanelIconCheckIn.setBackground(new Color(243, 243, 243));
        this.jLabelCheckInText.setBackground(this.jPanelIconCheckIn.getBackground());
    }//GEN-LAST:event_jLabelCheckInTextMousePressed

    private void jLabelCheckInTextMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCheckInTextMouseReleased
        this.jPanelIconCheckIn.setBackground(new Color(196, 197, 197));
        this.jLabelCheckInText.setBackground(this.jPanelIconCheckIn.getBackground());
        this.jPanel1.removeAll();
        this.jPanel1.add(this.JPanelRegistro);
        this.jPanel1.repaint();
        this.jPanel1.revalidate();
    }//GEN-LAST:event_jLabelCheckInTextMouseReleased

    private void jLabelCheckInTextMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCheckInTextMouseMoved
        this.jPanelIconCheckIn.setBackground(new Color(196, 197, 197));
        this.jLabelCheckInText.setBackground(this.jPanelIconCheckIn.getBackground());
    }//GEN-LAST:event_jLabelCheckInTextMouseMoved

    private void jLabelBuscarIconMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBuscarIconMouseMoved
        this.jPanelIconBuscar.setBackground(new Color(196, 197, 197));
        this.jLabelBuscarIcon.setBackground(this.jPanelIconBuscar.getBackground());
    }//GEN-LAST:event_jLabelBuscarIconMouseMoved

    private void jLabelBuscarIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBuscarIconMouseClicked
        cerrarMenu();
        this.jLabelOpcion.setText("Consulta");
        slided = false;
        this.jLabelHome.setBorder(null);
        this.jLabelCheckOut.setBorder(null);
        this.jLabelCheckIn.setBorder(null);
        this.jLabelSalir.setBorder(null);
        this.jLabelBuscarIcon.setBorder(borderSelected);
    }//GEN-LAST:event_jLabelBuscarIconMouseClicked

    private void jLabelBuscarIconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBuscarIconMouseEntered
        this.jPanelIconBuscar.setBackground(new Color(196, 197, 197));
        this.jLabelConsultaText.setBackground(this.jPanelIconBuscar.getBackground());

    }//GEN-LAST:event_jLabelBuscarIconMouseEntered

    private void jLabelBuscarIconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBuscarIconMouseExited
        this.jPanelIconBuscar.setBackground(new Color(244, 244, 244));
        this.jLabelConsultaText.setBackground(this.jPanelIconBuscar.getBackground());

    }//GEN-LAST:event_jLabelBuscarIconMouseExited

    private void jLabelBuscarIconMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBuscarIconMousePressed
        this.jPanelIconBuscar.setBackground(new Color(243, 243, 243));
        this.jLabelConsultaText.setBackground(this.jPanelIconBuscar.getBackground());

    }//GEN-LAST:event_jLabelBuscarIconMousePressed

    private void jLabelBuscarIconMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBuscarIconMouseReleased
        this.jPanelIconBuscar.setBackground(new Color(196, 197, 197));
        this.jLabelConsultaText.setBackground(this.jPanelIconBuscar.getBackground());
        this.jPanel1.removeAll();
        this.jPanel1.add(this.JPanelConsultas);
        this.jPanel1.repaint();
        this.jPanel1.revalidate();
    }//GEN-LAST:event_jLabelBuscarIconMouseReleased

    private void jPanelIconBuscarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelIconBuscarMouseMoved
        this.jPanelIconBuscar.setBackground(new Color(196, 197, 197));
        this.jLabelBuscarIcon.setBackground(this.jLabelBuscarIcon.getBackground());
    }//GEN-LAST:event_jPanelIconBuscarMouseMoved

    private void jPanelIconBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelIconBuscarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanelIconBuscarMouseEntered

    private void jLabelUsuarioIconMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelUsuarioIconMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelUsuarioIconMouseMoved

    private void jLabelUsuarioIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelUsuarioIconMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelUsuarioIconMouseClicked

    private void jLabelUsuarioIconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelUsuarioIconMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelUsuarioIconMouseEntered

    private void jLabelUsuarioIconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelUsuarioIconMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelUsuarioIconMouseExited

    private void jLabelUsuarioIconMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelUsuarioIconMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelUsuarioIconMousePressed

    private void jLabelUsuarioIconMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelUsuarioIconMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelUsuarioIconMouseReleased

    private void jPanelIconUsuarioMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelIconUsuarioMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanelIconUsuarioMouseMoved

    private void jPanelIconUsuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelIconUsuarioMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanelIconUsuarioMouseEntered

    private void jLabelSalirMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSalirMouseMoved
        this.jPanelIconSalir.setBackground(new Color(196, 197, 197));
        this.jLabelSalirText.setBackground(this.jPanelIconSalir.getBackground());

    }//GEN-LAST:event_jLabelSalirMouseMoved

    private void jLabelSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSalirMouseClicked

        int dialog = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(null, "¿Desea salir del programa?", "Confirmar", dialog);
        if (result == 0) {
            System.exit(0);
        }
        cerrarMenu();
        //this.jLabelOpcion.setText("Check in");

        slided = false;

    }//GEN-LAST:event_jLabelSalirMouseClicked

    private void jLabelSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSalirMouseEntered
        this.jPanelIconSalir.setBackground(new Color(196, 197, 197));
        this.jLabelSalirText.setBackground(this.jPanelIconSalir.getBackground());


    }//GEN-LAST:event_jLabelSalirMouseEntered

    private void jLabelSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSalirMouseExited
        this.jPanelIconSalir.setBackground(new Color(244, 244, 244));
        this.jLabelSalirText.setBackground(this.jPanelIconSalir.getBackground());

    }//GEN-LAST:event_jLabelSalirMouseExited

    private void jLabelSalirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSalirMousePressed
        this.jPanelIconSalir.setBackground(new Color(243, 243, 243));
        this.jLabelSalirText.setBackground(this.jPanelIconSalir.getBackground());

    }//GEN-LAST:event_jLabelSalirMousePressed

    private void jLabelSalirMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSalirMouseReleased
        this.jPanelIconSalir.setBackground(new Color(196, 197, 197));
        this.jLabelSalirText.setBackground(this.jPanelIconSalir.getBackground());

    }//GEN-LAST:event_jLabelSalirMouseReleased

    private void jPanelIconSalirMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelIconSalirMouseMoved

    }//GEN-LAST:event_jPanelIconSalirMouseMoved

    private void jPanelIconSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelIconSalirMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanelIconSalirMouseEntered

    private void jLabelConsultaTextMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelConsultaTextMouseMoved
        this.jPanelIconBuscar.setBackground(new Color(196, 197, 197));
        this.jLabelConsultaText.setBackground(this.jPanelIconBuscar.getBackground());

    }//GEN-LAST:event_jLabelConsultaTextMouseMoved

    private void jLabelConsultaTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelConsultaTextMouseClicked
        cerrarMenu();
        this.jLabelOpcion.setText("Consulta");
        slided = false;
        this.jLabelHome.setBorder(null);
        this.jLabelCheckOut.setBorder(null);
        this.jLabelCheckIn.setBorder(null);
        this.jLabelSalir.setBorder(null);
        this.jLabelBuscarIcon.setBorder(borderSelected);
    }//GEN-LAST:event_jLabelConsultaTextMouseClicked

    private void jLabelConsultaTextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelConsultaTextMouseEntered
        this.jPanelIconBuscar.setBackground(new Color(196, 197, 197));
        this.jLabelConsultaText.setBackground(this.jPanelIconBuscar.getBackground());
    }//GEN-LAST:event_jLabelConsultaTextMouseEntered

    private void jLabelConsultaTextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelConsultaTextMouseExited
        this.jPanelIconBuscar.setBackground(new Color(244, 244, 244));
        this.jLabelConsultaText.setBackground(this.jPanelIconBuscar.getBackground());
    }//GEN-LAST:event_jLabelConsultaTextMouseExited

    private void jLabelConsultaTextMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelConsultaTextMousePressed
        this.jPanelIconBuscar.setBackground(new Color(243, 243, 243));
        this.jLabelConsultaText.setBackground(this.jPanelIconBuscar.getBackground());

    }//GEN-LAST:event_jLabelConsultaTextMousePressed

    private void jLabelConsultaTextMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelConsultaTextMouseReleased
        this.jPanelIconBuscar.setBackground(new Color(196, 197, 197));
        this.jLabelConsultaText.setBackground(this.jPanelIconBuscar.getBackground());
        this.jPanel1.removeAll();
        this.jPanel1.add(this.JPanelConsultas);
        this.jPanel1.repaint();
        this.jPanel1.revalidate();
    }//GEN-LAST:event_jLabelConsultaTextMouseReleased

    private void jLabelUsuarioTextMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelUsuarioTextMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelUsuarioTextMouseMoved

    private void jLabelUsuarioTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelUsuarioTextMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelUsuarioTextMouseClicked

    private void jLabelUsuarioTextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelUsuarioTextMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelUsuarioTextMouseEntered

    private void jLabelUsuarioTextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelUsuarioTextMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelUsuarioTextMouseExited

    private void jLabelUsuarioTextMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelUsuarioTextMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelUsuarioTextMousePressed

    private void jLabelUsuarioTextMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelUsuarioTextMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelUsuarioTextMouseReleased

    private void jLabelSalirTextMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSalirTextMouseMoved
        this.jPanelIconSalir.setBackground(new Color(196, 197, 197));
        this.jLabelSalirText.setBackground(this.jPanelIconSalir.getBackground());
    }//GEN-LAST:event_jLabelSalirTextMouseMoved

    private void jLabelSalirTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSalirTextMouseClicked

        int dialog = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(null, "¿Desea salir del programa?", "Confirmar", dialog);
        if (result == 0) {
            System.exit(0);
        }
        //this.jLabelOpcion.setText("Check in");
        slided = false;
        cerrarMenu();
    }//GEN-LAST:event_jLabelSalirTextMouseClicked

    private void jLabelSalirTextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSalirTextMouseEntered
        this.jPanelIconSalir.setBackground(new Color(196, 197, 197));
        this.jLabelSalirText.setBackground(this.jPanelIconSalir.getBackground());
    }//GEN-LAST:event_jLabelSalirTextMouseEntered

    private void jLabelSalirTextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSalirTextMouseExited
        this.jPanelIconSalir.setBackground(new Color(244, 244, 244));
        this.jLabelSalirText.setBackground(this.jPanelIconSalir.getBackground());
    }//GEN-LAST:event_jLabelSalirTextMouseExited

    private void jLabelSalirTextMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSalirTextMousePressed
        this.jPanelIconSalir.setBackground(new Color(243, 243, 243));
        this.jLabelSalirText.setBackground(this.jPanelIconSalir.getBackground());
    }//GEN-LAST:event_jLabelSalirTextMousePressed

    private void jLabelSalirTextMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSalirTextMouseReleased
        this.jPanelIconSalir.setBackground(new Color(196, 197, 197));
        this.jLabelSalirText.setBackground(this.jPanelIconSalir.getBackground());
    }//GEN-LAST:event_jLabelSalirTextMouseReleased

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
            java.util.logging.Logger.getLogger(JFramePrograma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFramePrograma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFramePrograma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFramePrograma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFramePrograma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanelConsultas;
    private javax.swing.JPanel JPanelInicio;
    private javax.swing.JPanel JPanelRegistro;
    private javax.swing.JPanel JPanelSalidas;
    private javax.swing.JLabel jLabelBuscarIcon;
    private javax.swing.JLabel jLabelCheckIn;
    private javax.swing.JLabel jLabelCheckInText;
    private javax.swing.JLabel jLabelCheckOut;
    private javax.swing.JLabel jLabelCheckOutText;
    private javax.swing.JLabel jLabelConsultaText;
    private javax.swing.JLabel jLabelHome;
    private javax.swing.JLabel jLabelInicio;
    private javax.swing.JLabel jLabelMenu;
    private javax.swing.JLabel jLabelOpcion;
    private javax.swing.JLabel jLabelSalir;
    private javax.swing.JLabel jLabelSalirText;
    private javax.swing.JLabel jLabelUsuarioIcon;
    private javax.swing.JLabel jLabelUsuarioText;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelBarra;
    private javax.swing.JPanel jPanelIconBuscar;
    private javax.swing.JPanel jPanelIconCheckIn;
    private javax.swing.JPanel jPanelIconCheckOut;
    private javax.swing.JPanel jPanelIconHome;
    private javax.swing.JPanel jPanelIconSalir;
    private javax.swing.JPanel jPanelIconUsuario;
    private javax.swing.JPanel jPanelLabelsMenu;
    private javax.swing.JPanel jPanelMenuBar;
    // End of variables declaration//GEN-END:variables
}
