/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misclases;

import controlMySQL.MySqlConn;
import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.apache.fontbox.ttf.OTFParser;
import org.apache.fontbox.ttf.OpenTypeFont;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.font.PDTrueTypeFont;
import org.apache.pdfbox.pdmodel.font.PDType0Font;

public class JPanelSalida extends javax.swing.JPanel {

    MySqlConn conn;
    float total = 0;
    float habSencilla, habDoble, habSuite, costoPersonaExtra, servHab, servBar, servNin, servSPA, servTinto;
    String nombre, ciudad, tipo;
    int personasExtra, ocupantes, tipoHabitacion;
    long totalDias;
    java.util.Date fechaIn, fechaOut;

    public JPanelSalida(MySqlConn conn) {
        this.conn = conn;

        initComponents();
        this.jPanelNoRegistro.setVisible(false);
        this.jPanel1.setVisible(false);

    }

    public JPanelSalida() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelHeader = new javax.swing.JLabel();
        jLabelHabitacionBaja = new javax.swing.JLabel();
        jTextFieldNNumHab = new javax.swing.JTextField();
        jSeparatorNombre = new javax.swing.JSeparator();
        jButtonBuscar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabelNombreConf = new javax.swing.JLabel();
        jLabelNombreConfU = new javax.swing.JLabel();
        jLabelCiudadConf = new javax.swing.JLabel();
        jLabelCiudadConfU = new javax.swing.JLabel();
        jLabelFechaIngConf1 = new javax.swing.JLabel();
        jLabelFechaIngConfU = new javax.swing.JLabel();
        jLabelFechaSalConf = new javax.swing.JLabel();
        jLabelFechaSalConfU = new javax.swing.JLabel();
        jLabelTipo = new javax.swing.JLabel();
        jLabelTipoU = new javax.swing.JLabel();
        jLabelLimite = new javax.swing.JLabel();
        jLabelTipoD1 = new javax.swing.JLabel();
        jLabelTotalOcupantes = new javax.swing.JLabel();
        jLabelTipoD2 = new javax.swing.JLabel();
        jLabelOcupantes = new javax.swing.JLabel();
        jLabelLimiteT = new javax.swing.JLabel();
        jCheckBoxExtraConf = new javax.swing.JCheckBox();
        jCheckBoxDosExtraConf = new javax.swing.JCheckBox();
        jSeparatorCiudadOrig3 = new javax.swing.JSeparator();
        jLabelFechaSalConf1 = new javax.swing.JLabel();
        jCheckBoxServBar = new javax.swing.JCheckBox();
        jCheckBoxServCuarto = new javax.swing.JCheckBox();
        jCheckBoxServSPA = new javax.swing.JCheckBox();
        jCheckBoxServNin = new javax.swing.JCheckBox();
        jCheckBoxServTint = new javax.swing.JCheckBox();
        jLabelFechaSalConf2 = new javax.swing.JLabel();
        jLabelTotalSinExtras = new javax.swing.JLabel();
        jLabelDias = new javax.swing.JLabel();
        jLabelDiasU = new javax.swing.JLabel();
        jButtonBaja = new javax.swing.JButton();
        jPanelNoRegistro = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelHeader.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/headerSalida.png"))); // NOI18N
        add(jLabelHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 145));

        jLabelHabitacionBaja.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabelHabitacionBaja.setForeground(new java.awt.Color(51, 51, 51));
        jLabelHabitacionBaja.setText("Numero de habitación:");
        add(jLabelHabitacionBaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, 200, 30));

        jTextFieldNNumHab.setFont(new java.awt.Font("Decker", 0, 17)); // NOI18N
        jTextFieldNNumHab.setForeground(new java.awt.Color(51, 51, 51));
        jTextFieldNNumHab.setBorder(null);
        jTextFieldNNumHab.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextFieldNNumHab.setSelectionColor(new java.awt.Color(214, 173, 96));
        jTextFieldNNumHab.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldNNumHabFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldNNumHabFocusLost(evt);
            }
        });
        jTextFieldNNumHab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNNumHabActionPerformed(evt);
            }
        });
        add(jTextFieldNNumHab, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 190, 80, 30));

        jSeparatorNombre.setBackground(new java.awt.Color(160, 160, 160));
        add(jSeparatorNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 220, 80, 10));

        jButtonBuscar.setBackground(new java.awt.Color(214, 173, 96));
        jButtonBuscar.setFont(new java.awt.Font("Decker", 1, 18)); // NOI18N
        jButtonBuscar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBuscar.setText("buscar");
        jButtonBuscar.setBorder(null);
        jButtonBuscar.setDefaultCapable(false);
        jButtonBuscar.setFocusPainted(false);
        jButtonBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButtonBuscar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButtonBuscarMouseMoved(evt);
            }
        });
        jButtonBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonBuscarMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButtonBuscarMouseReleased(evt);
            }
        });
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });
        add(jButtonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 190, 80, 30));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelNombreConf.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabelNombreConf.setForeground(new java.awt.Color(51, 51, 51));
        jLabelNombreConf.setText("Nombre del huésped: ");
        jPanel1.add(jLabelNombreConf, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 260, 40));

        jLabelNombreConfU.setFont(new java.awt.Font("Decker", 1, 18)); // NOI18N
        jLabelNombreConfU.setForeground(new java.awt.Color(102, 102, 102));
        jLabelNombreConfU.setText("JACOB IGNACIO BONILLA HUERTA");
        jPanel1.add(jLabelNombreConfU, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 490, 40));

        jLabelCiudadConf.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabelCiudadConf.setForeground(new java.awt.Color(51, 51, 51));
        jLabelCiudadConf.setText("Ciudad de origen:");
        jPanel1.add(jLabelCiudadConf, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 260, 40));

        jLabelCiudadConfU.setFont(new java.awt.Font("Decker", 1, 18)); // NOI18N
        jLabelCiudadConfU.setForeground(new java.awt.Color(102, 102, 102));
        jLabelCiudadConfU.setText("GFG");
        jPanel1.add(jLabelCiudadConfU, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 470, 40));

        jLabelFechaIngConf1.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabelFechaIngConf1.setForeground(new java.awt.Color(51, 51, 51));
        jLabelFechaIngConf1.setText("Fecha de ingreso:");
        jPanel1.add(jLabelFechaIngConf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 260, 40));

        jLabelFechaIngConfU.setFont(new java.awt.Font("Decker", 1, 18)); // NOI18N
        jLabelFechaIngConfU.setForeground(new java.awt.Color(102, 102, 102));
        jLabelFechaIngConfU.setText("Fecha de ingreso:");
        jPanel1.add(jLabelFechaIngConfU, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 440, 40));

        jLabelFechaSalConf.setFont(new java.awt.Font("Decker", 1, 18)); // NOI18N
        jLabelFechaSalConf.setForeground(new java.awt.Color(51, 51, 51));
        jLabelFechaSalConf.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelFechaSalConf.setText("CARGOS EXTRA");
        jPanel1.add(jLabelFechaSalConf, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, 265, 40));

        jLabelFechaSalConfU.setFont(new java.awt.Font("Decker", 1, 18)); // NOI18N
        jLabelFechaSalConfU.setForeground(new java.awt.Color(102, 102, 102));
        jLabelFechaSalConfU.setText("Fecha de salida:");
        jPanel1.add(jLabelFechaSalConfU, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 410, 40));

        jLabelTipo.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabelTipo.setForeground(new java.awt.Color(51, 51, 51));
        jLabelTipo.setText("Tipo de habitación:");
        jPanel1.add(jLabelTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 50, 210, 40));

        jLabelTipoU.setFont(new java.awt.Font("Decker", 1, 18)); // NOI18N
        jLabelTipoU.setForeground(new java.awt.Color(102, 102, 102));
        jLabelTipoU.setText("Sencilla");
        jPanel1.add(jLabelTipoU, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 50, 80, 40));

        jLabelLimite.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabelLimite.setForeground(new java.awt.Color(51, 51, 51));
        jLabelLimite.setText("Limite:");
        jPanel1.add(jLabelLimite, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 50, 60, 40));

        jLabelTipoD1.setFont(new java.awt.Font("Decker", 1, 18)); // NOI18N
        jLabelTipoD1.setForeground(new java.awt.Color(102, 102, 102));
        jLabelTipoD1.setText("huésped");
        jPanel1.add(jLabelTipoD1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 50, 120, 40));

        jLabelTotalOcupantes.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabelTotalOcupantes.setForeground(new java.awt.Color(51, 51, 51));
        jLabelTotalOcupantes.setText("Total de ocupantes de la habitación:");
        jPanel1.add(jLabelTotalOcupantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 90, 310, 40));

        jLabelTipoD2.setFont(new java.awt.Font("Decker", 1, 18)); // NOI18N
        jLabelTipoD2.setForeground(new java.awt.Color(102, 102, 102));
        jLabelTipoD2.setText("huésped");
        jPanel1.add(jLabelTipoD2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 90, 120, 40));

        jLabelOcupantes.setFont(new java.awt.Font("Decker", 1, 18)); // NOI18N
        jLabelOcupantes.setForeground(new java.awt.Color(102, 102, 102));
        jLabelOcupantes.setText("2");
        jPanel1.add(jLabelOcupantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 90, 20, 40));

        jLabelLimiteT.setFont(new java.awt.Font("Decker", 1, 18)); // NOI18N
        jLabelLimiteT.setForeground(new java.awt.Color(102, 102, 102));
        jLabelLimiteT.setText("2");
        jPanel1.add(jLabelLimiteT, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 50, 20, 40));

        jCheckBoxExtraConf.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBoxExtraConf.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jCheckBoxExtraConf.setText("1 persona extra");
        jCheckBoxExtraConf.setEnabled(false);
        jPanel1.add(jCheckBoxExtraConf, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, -1, 30));

        jCheckBoxDosExtraConf.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBoxDosExtraConf.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jCheckBoxDosExtraConf.setText("2 personas extra");
        jCheckBoxDosExtraConf.setEnabled(false);
        jPanel1.add(jCheckBoxDosExtraConf, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, -1, 30));

        jSeparatorCiudadOrig3.setBackground(new java.awt.Color(214, 173, 96));
        jSeparatorCiudadOrig3.setForeground(new java.awt.Color(214, 173, 96));
        jPanel1.add(jSeparatorCiudadOrig3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 215, 615, 10));

        jLabelFechaSalConf1.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabelFechaSalConf1.setForeground(new java.awt.Color(51, 51, 51));
        jLabelFechaSalConf1.setText("Total sin cargos extra:");
        jPanel1.add(jLabelFechaSalConf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 140, 260, 40));

        jCheckBoxServBar.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBoxServBar.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jCheckBoxServBar.setForeground(new java.awt.Color(51, 51, 51));
        jCheckBoxServBar.setText("Servicio de bar");
        jPanel1.add(jCheckBoxServBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, -1, 30));

        jCheckBoxServCuarto.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBoxServCuarto.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jCheckBoxServCuarto.setForeground(new java.awt.Color(51, 51, 51));
        jCheckBoxServCuarto.setText("Servicio al cuarto");
        jPanel1.add(jCheckBoxServCuarto, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, -1, 30));

        jCheckBoxServSPA.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBoxServSPA.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jCheckBoxServSPA.setForeground(new java.awt.Color(51, 51, 51));
        jCheckBoxServSPA.setText("Servicio de SPA");
        jCheckBoxServSPA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxServSPAActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBoxServSPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 320, -1, 30));

        jCheckBoxServNin.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBoxServNin.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jCheckBoxServNin.setForeground(new java.awt.Color(51, 51, 51));
        jCheckBoxServNin.setText("Servicio de niñera");
        jCheckBoxServNin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxServNinActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBoxServNin, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 270, -1, 30));

        jCheckBoxServTint.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBoxServTint.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jCheckBoxServTint.setForeground(new java.awt.Color(51, 51, 51));
        jCheckBoxServTint.setText("Servicio de tintorería");
        jPanel1.add(jCheckBoxServTint, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 270, -1, 30));

        jLabelFechaSalConf2.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabelFechaSalConf2.setForeground(new java.awt.Color(51, 51, 51));
        jLabelFechaSalConf2.setText("Fecha de salida:");
        jPanel1.add(jLabelFechaSalConf2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 260, 40));

        jLabelTotalSinExtras.setFont(new java.awt.Font("Decker", 1, 18)); // NOI18N
        jLabelTotalSinExtras.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.add(jLabelTotalSinExtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 140, 200, 40));

        jLabelDias.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabelDias.setForeground(new java.awt.Color(51, 51, 51));
        jLabelDias.setText("Total días:");
        jPanel1.add(jLabelDias, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 20, 100, 40));

        jLabelDiasU.setFont(new java.awt.Font("Decker", 1, 18)); // NOI18N
        jLabelDiasU.setForeground(new java.awt.Color(102, 102, 102));
        jLabelDiasU.setText("12");
        jPanel1.add(jLabelDiasU, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 20, 100, 40));

        jButtonBaja.setBackground(new java.awt.Color(214, 173, 96));
        jButtonBaja.setFont(new java.awt.Font("Decker", 1, 18)); // NOI18N
        jButtonBaja.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBaja.setText("Realizar check out");
        jButtonBaja.setBorder(null);
        jButtonBaja.setDefaultCapable(false);
        jButtonBaja.setFocusPainted(false);
        jButtonBaja.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButtonBaja.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButtonBajaMouseMoved(evt);
            }
        });
        jButtonBaja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonBajaMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButtonBajaMouseReleased(evt);
            }
        });
        jButtonBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBajaActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonBaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 360, 170, 40));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 1195, 440));

        jPanelNoRegistro.setBackground(new java.awt.Color(255, 255, 255));
        jPanelNoRegistro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Registro no encontrado.png"))); // NOI18N
        jPanelNoRegistro.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 440));

        add(jPanelNoRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 1195, 440));
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNNumHabFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldNNumHabFocusGained
        this.jSeparatorNombre.setForeground(new Color(214, 173, 96));
        this.jSeparatorNombre.setBackground(new Color(214, 173, 96));
        this.jPanelNoRegistro.setVisible(false);
        this.jPanel1.setVisible(false);
    }//GEN-LAST:event_jTextFieldNNumHabFocusGained

    private void jTextFieldNNumHabFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldNNumHabFocusLost
        this.jSeparatorNombre.setForeground(new Color(160, 160, 160));
        this.jSeparatorNombre.setBackground(new Color(160, 160, 160));
    }//GEN-LAST:event_jTextFieldNNumHabFocusLost

    private void jTextFieldNNumHabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNNumHabActionPerformed
        baja();
    }//GEN-LAST:event_jTextFieldNNumHabActionPerformed

    private void jButtonBuscarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonBuscarMouseMoved
        this.jButtonBuscar.setBackground(new Color(198, 150, 61));
    }//GEN-LAST:event_jButtonBuscarMouseMoved

    private void jButtonBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonBuscarMouseExited
        this.jButtonBuscar.setBackground(new Color(214, 173, 96));
    }//GEN-LAST:event_jButtonBuscarMouseExited

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        this.jButtonBuscar.setBackground(new Color(214, 173, 96));
        baja();
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void baja() {
        total = 0;
        this.jCheckBoxExtraConf.setSelected(false);
        this.jCheckBoxDosExtraConf.setSelected(false);

        //String query = "SELECT * FROM `registro` WHERE numHabitacion = '" + this.jTextFieldNNumHab + "'";
        String query1 = "SELECT * FROM `costos` WHERE habSuite = '" + 1400.5 + "'";
        this.conn.Consult(query1);
        try {
            if (this.conn.rs.getRow() == 0) {
                this.jPanel1.setVisible(false);
                this.jPanelNoRegistro.setVisible(false);
                JOptionPane.showMessageDialog(null, "No existen datos sobre el costo de los servicios extra", "Error", JOptionPane.WARNING_MESSAGE);
            } else {
                habSencilla = this.conn.rs.getFloat("habSencilla");
                habDoble = this.conn.rs.getFloat("habDoble");
                habSuite = this.conn.rs.getFloat("habSuite");
                costoPersonaExtra = this.conn.rs.getFloat("costoPersonExtra");
                servHab = this.conn.rs.getFloat("servicioHabitacion");
                servBar = this.conn.rs.getFloat("servicioBar");
                servNin = this.conn.rs.getFloat("servicioNinera");
                servSPA = this.conn.rs.getFloat("servicioSPA");
                servTinto = this.conn.rs.getFloat("servicioTintoreria");

                String query = "SELECT * FROM `registro` WHERE numHabitacion = '" + this.jTextFieldNNumHab.getText().trim() + "'";
                this.conn.Consult(query);
                if (this.conn.rs.getRow() == 0) {
                    this.jPanel1.setVisible(false);
                    this.jPanelNoRegistro.setVisible(true);
                    return;
                }
                this.jPanelNoRegistro.setVisible(false);

                nombre = this.conn.rs.getString("nomCliente");
                ciudad = this.conn.rs.getString("CiudadCliente");
                fechaIn = this.conn.rs.getDate("fechaIn");
                fechaOut = this.conn.rs.getDate("fechaOut");
                tipoHabitacion = this.conn.rs.getInt("tipoHabitacion");
                ocupantes = this.conn.rs.getInt("ocupantes");
                personasExtra = this.conn.rs.getInt("personasExtra");
                this.jLabelNombreConfU.setText(nombre);
                this.jLabelCiudadConfU.setText(ciudad);
                DateFormat formateadorFechaCompleta = DateFormat.getDateInstance(DateFormat.FULL);
                this.jLabelFechaIngConfU.setText(formateadorFechaCompleta.format(fechaIn));
                this.jLabelFechaSalConfU.setText(formateadorFechaCompleta.format(fechaOut));
                totalDias = restarFechas(fechaIn, fechaOut);
                if (tipoHabitacion == 1) {
                    this.jLabelTipoU.setText("sencilla");
                    total += habSencilla * totalDias;
                    tipo = "sencilla";

                }
                if (tipoHabitacion == 2) {
                    this.jLabelTipoU.setText("doble");
                    total += habDoble * totalDias;
                    tipo = "doble";
                }
                if (tipoHabitacion == 3) {
                    this.jLabelTipoU.setText("suite");
                    total += habSuite * totalDias;
                    tipo = "suite";
                }

                this.jLabelDiasU.setText("" + totalDias + " días");
                this.jLabelTotalSinExtras.setText("$" + total);
                this.jLabelLimiteT.setText("" + tipoHabitacion);
                this.jLabelOcupantes.setText("" + ocupantes);
                if (personasExtra == 1) {
                    this.jCheckBoxExtraConf.setSelected(true);
                    this.jCheckBoxDosExtraConf.setSelected(false);
                }
                if (personasExtra == 2) {
                    this.jCheckBoxDosExtraConf.setSelected(true);
                    this.jCheckBoxExtraConf.setSelected(false);
                }
                total += costoPersonaExtra * personasExtra * this.totalDias;

                this.jPanel1.setVisible(true);
            }
        } catch (SQLException ex) {
            Logger.getLogger(JPanelSalida.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public long restarFechas(java.util.Date Date1, java.util.Date Date2) {
        long diff = Date2.getTime() - Date1.getTime();

        TimeUnit time = TimeUnit.DAYS;
        long diffrence = time.convert(diff, TimeUnit.MILLISECONDS);
        return diffrence;
    }
    private void jButtonBuscarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonBuscarMouseReleased
        this.jButtonBuscar.setBackground(new Color(198, 150, 61));
    }//GEN-LAST:event_jButtonBuscarMouseReleased

    private void jCheckBoxServSPAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxServSPAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxServSPAActionPerformed

    private void jCheckBoxServNinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxServNinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxServNinActionPerformed

    private void jButtonBajaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonBajaMouseMoved
        this.jButtonBaja.setBackground(new Color(198, 150, 61));
    }//GEN-LAST:event_jButtonBajaMouseMoved

    private void jButtonBajaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonBajaMouseExited
        this.jButtonBaja.setBackground(new Color(214, 173, 96));
    }//GEN-LAST:event_jButtonBajaMouseExited

    private void jButtonBajaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonBajaMouseReleased
        this.jButtonBaja.setBackground(new Color(198, 150, 61));
    }//GEN-LAST:event_jButtonBajaMouseReleased

    private void jButtonBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBajaActionPerformed
        this.jButtonBuscar.setBackground(new Color(214, 173, 96));
        int dialog = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(null, "¿Desea hacer la baja del huesped " + this.nombre + " \nque se encuentra en la habitación " + this.jTextFieldNNumHab.getText() + "?", "Confirmar", dialog);
        if (result != 0) {
            return;
        }
        try {
            File file = new File("src/recibos/reciboHotelPlantilla.pdf");
            File fontNombre = new File("src/fonts/GlacialIndifference-Regular.otf");
            File fontNombreBold = new File("src/fonts/GlacialIndifference-Bold.otf");
            OTFParser otfParser = new OTFParser();
            OpenTypeFont otfB = otfParser.parse(fontNombreBold);

            PDDocument doc = PDDocument.load(file);

            PDPage page = doc.getPage(0);
            page.setMediaBox(PDRectangle.LETTER);
            page.setRotation(0);
            //cargamos nuestra fuente

            OpenTypeFont otf = otfParser.parse(fontNombre);
            PDFont font = PDType0Font.load(doc, otf, false);
            PDFont fontB = PDType0Font.load(doc, otfB, false);
            int fontSize = 11;
            //abrimos modo append
            PDPageContentStream contentStream = new PDPageContentStream(doc, page, PDPageContentStream.AppendMode.APPEND, true, true);
            this.insertarLinea(nombre.toUpperCase(), contentStream, 96, 575, font, fontSize, page, Color.BLACK);
            this.insertarLinea(ciudad.toUpperCase(), contentStream, 96, 527, font, fontSize, page, Color.BLACK);
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
            String date = sdf.format(fechaIn);
            this.insertarLinea(date.toUpperCase(), contentStream, 150, 479, font, fontSize, page, Color.BLACK);
            date = sdf.format(fechaOut);
            this.insertarLinea(date.toUpperCase(), contentStream, 402, 479, font, fontSize, page, Color.BLACK);
            date = sdf.format(new java.util.Date());
            this.insertarLinea(date.toUpperCase(), contentStream, 456, 612, font, fontSize, page, Color.BLACK);
            //  this.jLabelFecha.setText(date);
            String hab = "Habitacion " + this.tipo;
            this.insertarLinea(hab.toUpperCase(), contentStream, 96, 413, font, fontSize, page, Color.BLACK);
            switch (tipoHabitacion) {
                case 1:
                    this.insertarLinea("$" + habSencilla, contentStream, 390, 413, font, fontSize, page, Color.BLACK);
                    this.insertarLinea("$" + (habSencilla * totalDias) + "", contentStream, 485, 413, font, fontSize, page, Color.BLACK);
                    this.insertarLinea("$" + habSencilla * totalDias, contentStream, 485, 162, font, fontSize, page, Color.BLACK);

                    break;
                case 2:
                    this.insertarLinea("$" + habDoble, contentStream, 390, 413, font, fontSize, page, Color.BLACK);
                    this.insertarLinea(("$" + habDoble * totalDias) + "", contentStream, 485, 413, font, fontSize, page, Color.BLACK);
                    this.insertarLinea("$" + habDoble * totalDias, contentStream, 485, 162, font, fontSize, page, Color.BLACK);
                    break;
                case 3:
                    this.insertarLinea("$" + habSuite, contentStream, 390, 413, font, fontSize, page, Color.BLACK);
                    this.insertarLinea(("$" + habSuite * totalDias) + "", contentStream, 485, 413, font, fontSize, page, Color.BLACK);
                    this.insertarLinea("$" + habSuite * totalDias, contentStream, 485, 162, font, fontSize, page, Color.BLACK);
                    break;
            }

            this.insertarLinea(totalDias + "", contentStream, 322, 413, font, fontSize, page, Color.BLACK);

            int y = 330;
            if (personasExtra > 0) {
                //nombre del servicio
                this.insertarLinea("Persona Extra".toUpperCase(), contentStream, 96, y, font, fontSize, page, Color.BLACK);
                //cantidad
                this.insertarLinea(personasExtra + "", contentStream, 322, y, font, fontSize, page, Color.BLACK);
                //precio unitario
                this.insertarLinea("$" + costoPersonaExtra + "*", contentStream, 390, y, font, fontSize, page, Color.BLACK);
                //total
                this.insertarLinea("$" + personasExtra * this.costoPersonaExtra * this.totalDias, contentStream, 485, y, font, fontSize, page, Color.BLACK);
                y -= 25;
                this.insertarLinea("* Precio por día".toUpperCase(), contentStream, 96, 182, font, 9, page, Color.BLACK);

            }
            if (this.jCheckBoxServBar.isSelected()) {
                this.total += servBar;
                //nombre del servicio
                this.insertarLinea("Servicio bar".toUpperCase(), contentStream, 96, y, font, fontSize, page, Color.BLACK);
                //cantidad
                this.insertarLinea(1 + "", contentStream, 322, y, font, fontSize, page, Color.BLACK);
                //precio unitario
                this.insertarLinea("$" + servBar, contentStream, 390, y, font, fontSize, page, Color.BLACK);
                //total
                this.insertarLinea("$" + 1 * this.servBar, contentStream, 485, y, font, fontSize, page, Color.BLACK);
                y -= 25;
            }

            if (this.jCheckBoxServNin.isSelected()) {
                this.total += servNin;

                //nombre del servicio
                this.insertarLinea("Servicio niñera".toUpperCase(), contentStream, 96, y, font, fontSize, page, Color.BLACK);
                //cantidad
                this.insertarLinea(1 + "", contentStream, 322, y, font, fontSize, page, Color.BLACK);
                //precio unitario
                this.insertarLinea("$" + servNin, contentStream, 390, y, font, fontSize, page, Color.BLACK);
                //total
                this.insertarLinea("$" + 1 * this.servNin, contentStream, 485, y, font, fontSize, page, Color.BLACK);
                y -= 25;
            }
            if (this.jCheckBoxServSPA.isSelected()) {
                this.total += servSPA;
                //nombre del servicio
                this.insertarLinea("Servicio SPA".toUpperCase(), contentStream, 96, y, font, fontSize, page, Color.BLACK);
                //cantidad
                this.insertarLinea(1 + "", contentStream, 322, y, font, fontSize, page, Color.BLACK);
                //precio unitario
                this.insertarLinea("$" + servSPA, contentStream, 390, y, font, fontSize, page, Color.BLACK);
                //total
                this.insertarLinea("$" + 1 * this.servSPA, contentStream, 485, y, font, fontSize, page, Color.BLACK);
                y -= 25;
            }
            if (this.jCheckBoxServCuarto.isSelected()) {
                this.total += servHab;
                //nombre del servicio
                this.insertarLinea("Servicio a la habitacion".toUpperCase(), contentStream, 96, y, font, fontSize, page, Color.BLACK);
                //cantidad
                this.insertarLinea(1 + "", contentStream, 322, y, font, fontSize, page, Color.BLACK);
                //precio unitario
                this.insertarLinea("$" + servHab, contentStream, 390, y, font, fontSize, page, Color.BLACK);
                //total
                this.insertarLinea("$" + 1 * this.servHab, contentStream, 485, y, font, fontSize, page, Color.BLACK);
                y -= 25;
            }
            if (this.jCheckBoxServTint.isSelected()) {
                this.total += this.servTinto;
                //nombre del servicio
                this.insertarLinea("Servicio tintorería".toUpperCase(), contentStream, 96, y, font, fontSize, page, Color.BLACK);
                //cantidad
                this.insertarLinea(1 + "", contentStream, 322, y, font, fontSize, page, Color.BLACK);
                //precio unitario
                this.insertarLinea("$" + servTinto, contentStream, 390, y, font, fontSize, page, Color.BLACK);
                //total
                this.insertarLinea("$" + 1 * this.servTinto, contentStream, 485, y, font, fontSize, page, Color.BLACK);
                y -= 25;
            }
            DecimalFormat formato1 = new DecimalFormat("#.00");
            this.insertarLinea("$" + formato1.format(total), contentStream, 485, 136, fontB, fontSize, page, Color.BLACK);
            //Saving the document
            contentStream.close();
            String nombrePDF = "src/recibos/" + this.jTextFieldNNumHab.getText() + "_" + nombre.replace(" ", "_").toLowerCase();
            File prueba = new File(nombrePDF+".pdf");
            int i = 1;//auxiliar para que no existan archivos duplicados
            
            while (prueba.exists()) {
                nombrePDF = "src/recibos/" + this.jTextFieldNNumHab.getText() + "_" + nombre.replace(" ", "_").toLowerCase()+i;
                prueba = new File(nombrePDF +".pdf");
                i++;
            }
            doc.save(nombrePDF +".pdf");

            //Closing the document  
            doc.close();
            String query = "Update habitacion set estado = 0 WHERE numero = " + this.jTextFieldNNumHab.getText().trim();
            int j = this.conn.Update(query);
            if (j > 0) {
                JOptionPane.showMessageDialog(null, "BAJA REALIZADA");
                query = "delete from registro where numHabitacion  =" + this.jTextFieldNNumHab.getText().trim();
                j = this.conn.Update(query);
                if (j > 0) {
                    JOptionPane.showMessageDialog(null, "La salida de la habitación " + this.jTextFieldNNumHab.getText() + " ha sido completada.", "Check out completado", JOptionPane.INFORMATION_MESSAGE);
                    query = "SELECT total from ingresos";
                    this.conn.Consult(query);
                    try {
                        float totalT = this.conn.rs.getFloat("total") + total;
                        query = "Update ingresos set total = " + totalT;
                        j = this.conn.Update(query);
                        if (j == 0) {
                            JOptionPane.showMessageDialog(null, "La salida se realizó con exito, pero no se pudo registrar en los ingresos del hotel", "Error en actualización de ingresos", JOptionPane.INFORMATION_MESSAGE);

                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(JPanelSalida.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "La salida de la habitación " + this.jTextFieldNNumHab.getText() + " no ha sido completada.", "Error en check out", JOptionPane.INFORMATION_MESSAGE);
                    query = "Update habitacion set estado = 1 WHERE numero = " + this.jTextFieldNNumHab.getText().trim();
                    j = this.conn.Update(query);
                }
            } else {

                JOptionPane.showMessageDialog(null, "La salida no se pudo concretar");
            }

            this.jPanel1.setVisible(false);
            this.jTextFieldNNumHab.setText("");
            this.jLabelCiudadConfU.setText("");
            this.jLabelFechaIngConfU.setText("");
            this.jLabelFechaSalConfU.setText("");
            this.jLabelDiasU.setText("");
            this.jLabelTipoU.setText("");
            this.jLabelLimiteT.setText("");
            this.jLabelOcupantes.setText("");
            this.jLabelTotalSinExtras.setText("");
            this.jCheckBoxDosExtraConf.setSelected(false);
            this.jCheckBoxExtraConf.setSelected(false);
            this.jCheckBoxServBar.setSelected(false);
            this.jCheckBoxServCuarto.setSelected(false);
            this.jCheckBoxServNin.setSelected(false);
            this.jCheckBoxServSPA.setSelected(false);
            this.jCheckBoxServTint.setSelected(false);
        } catch (IOException ex) {
            Logger.getLogger(JPanelSalida.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonBajaActionPerformed
    private void insertarLinea(String cad, PDPageContentStream contentStream, float x, float y, PDFont font, int fontSize, PDPage page, Color color) {
        try {
            contentStream.beginText();
            contentStream.setFont(font, fontSize);
            contentStream.newLineAtOffset(x, y);
            contentStream.setNonStrokingColor(color);
            contentStream.showText(cad);
            contentStream.endText();
        } catch (IOException ex) {
            Logger.getLogger(JPanelSalida.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBaja;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JCheckBox jCheckBoxDosExtraConf;
    private javax.swing.JCheckBox jCheckBoxExtraConf;
    private javax.swing.JCheckBox jCheckBoxServBar;
    private javax.swing.JCheckBox jCheckBoxServCuarto;
    private javax.swing.JCheckBox jCheckBoxServNin;
    private javax.swing.JCheckBox jCheckBoxServSPA;
    private javax.swing.JCheckBox jCheckBoxServTint;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCiudadConf;
    private javax.swing.JLabel jLabelCiudadConfU;
    private javax.swing.JLabel jLabelDias;
    private javax.swing.JLabel jLabelDiasU;
    private javax.swing.JLabel jLabelFechaIngConf1;
    private javax.swing.JLabel jLabelFechaIngConfU;
    private javax.swing.JLabel jLabelFechaSalConf;
    private javax.swing.JLabel jLabelFechaSalConf1;
    private javax.swing.JLabel jLabelFechaSalConf2;
    private javax.swing.JLabel jLabelFechaSalConfU;
    private javax.swing.JLabel jLabelHabitacionBaja;
    private javax.swing.JLabel jLabelHeader;
    private javax.swing.JLabel jLabelLimite;
    private javax.swing.JLabel jLabelLimiteT;
    private javax.swing.JLabel jLabelNombreConf;
    private javax.swing.JLabel jLabelNombreConfU;
    private javax.swing.JLabel jLabelOcupantes;
    private javax.swing.JLabel jLabelTipo;
    private javax.swing.JLabel jLabelTipoD1;
    private javax.swing.JLabel jLabelTipoD2;
    private javax.swing.JLabel jLabelTipoU;
    private javax.swing.JLabel jLabelTotalOcupantes;
    private javax.swing.JLabel jLabelTotalSinExtras;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelNoRegistro;
    private javax.swing.JSeparator jSeparatorCiudadOrig3;
    private javax.swing.JSeparator jSeparatorNombre;
    private javax.swing.JTextField jTextFieldNNumHab;
    // End of variables declaration//GEN-END:variables
}
