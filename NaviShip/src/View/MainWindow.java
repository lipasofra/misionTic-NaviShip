/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controllers.ClickEvent;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.parser.ParseException;

/**
 *
 * @author lipasofray camilo
 */
public class MainWindow extends javax.swing.JFrame {

  /**
   * Creates new form MainWindow
   */
  public MainWindow() {
    initComponents();
    this.setLocationRelativeTo(null);
  }

  /**
   * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    imageNaviShip = new javax.swing.JLabel();
    labelNameNaviship = new javax.swing.JLabel();
    labelServicio = new javax.swing.JLabel();
    jSeparator1 = new javax.swing.JSeparator();
    labelSeleccionarInfo = new javax.swing.JLabel();
    listaDeTablas = new javax.swing.JComboBox<>();
    panelAcciones = new javax.swing.JPanel();
    btnAgregar = new javax.swing.JButton();
    btnEditar = new javax.swing.JButton();
    btnEliminar = new javax.swing.JButton();
    panelTabla = new javax.swing.JPanel();
    jScrollPane1 = new javax.swing.JScrollPane();
    tablaInfo = new javax.swing.JTable();
    jButton1 = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("Alquiler de barcos - NaviShip");
    setForeground(java.awt.Color.white);
    setLocation(new java.awt.Point(0, 0));
    setName("MainFrame"); // NOI18N
    setResizable(false);
    setSize(new java.awt.Dimension(0, 0));

    imageNaviShip.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/iconNaviShip.png"))); // NOI18N
    //<div>Iconos dise??ados por <a href="https://www.freepik.com" title="Freepik">Freepik</a> from <a href="https://www.flaticon.es/" title="Flaticon">www.flaticon.es</a></div>

    labelNameNaviship.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
    labelNameNaviship.setText("NaviShip");

    labelServicio.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
    labelServicio.setText("Servicio de alquiler de barcos");

    jSeparator1.setToolTipText("");

    labelSeleccionarInfo.setText("Seleccione la informaci??n que desea ver");

    listaDeTablas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguna", "Barcos de motor", "Barcos de vela", "Propietarios" }));
    listaDeTablas.setSelectedItem("Ninguna");
    listaDeTablas.addItemListener(new java.awt.event.ItemListener() {
      public void itemStateChanged(java.awt.event.ItemEvent evt) {
        listaDeTablasItemStateChanged(evt);
      }
    });

    panelAcciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones sobre la tabla"));
    panelAcciones.setToolTipText("");

    btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/agregar-archivo.png"))); // NOI18N
    //<div>Iconos dise??ados por <a href="https://www.flaticon.es/autores/kiranshastry" title="Kiranshastry">Kiranshastry</a> from <a href="https://www.flaticon.es/" title="Flaticon">www.flaticon.es</a></div>
    btnAgregar.setText("Agregar nueva info");
    btnAgregar.setBorderPainted(false);
    btnAgregar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    btnAgregar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
    btnAgregar.setIconTextGap(10);
    btnAgregar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnAgregarActionPerformed(evt);
      }
    });

    btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/editar.png"))); // NOI18N
    //<div>Iconos dise??ados por <a href="https://www.freepik.com" title="Freepik">Freepik</a> from <a href="https://www.flaticon.es/" title="Flaticon">www.flaticon.es</a></div>
    btnEditar.setText("Editar informaci??n");
    btnEditar.setBorderPainted(false);
    btnEditar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    btnEditar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
    btnEditar.setIconTextGap(10);
    btnEditar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnEditarActionPerformed(evt);
      }
    });

    btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/eliminar.png"))); // NOI18N
    //<div>Iconos dise??ados por <a href="https://www.flaticon.es/autores/kiranshastry" title="Kiranshastry">Kiranshastry</a> from <a href="https://www.flaticon.es/" title="Flaticon">www.flaticon.es</a></div>
    btnEliminar.setText("Eliminar informaci??n");
    btnEliminar.setBorderPainted(false);
    btnEliminar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    btnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
    btnEliminar.setIconTextGap(10);
    btnEliminar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnEliminarActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout panelAccionesLayout = new javax.swing.GroupLayout(panelAcciones);
    panelAcciones.setLayout(panelAccionesLayout);
    panelAccionesLayout.setHorizontalGroup(
      panelAccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(panelAccionesLayout.createSequentialGroup()
        .addContainerGap()
        .addGroup(panelAccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    panelAccionesLayout.setVerticalGroup(
      panelAccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(panelAccionesLayout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(btnAgregar)
        .addGap(18, 18, 18)
        .addComponent(btnEditar)
        .addGap(18, 18, 18)
        .addComponent(btnEliminar)
        .addContainerGap())
    );

    panelTabla.setBorder(javax.swing.BorderFactory.createTitledBorder("Informaci??n"));

    tablaInfo.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
    tablaInfo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    tablaInfo.setFillsViewportHeight(true);
    tablaInfo.setRowHeight(25);
    tablaInfo.setRowSelectionAllowed(false);
    tablaInfo.getTableHeader().setReorderingAllowed(false);
    jScrollPane1.setViewportView(tablaInfo);

    javax.swing.GroupLayout panelTablaLayout = new javax.swing.GroupLayout(panelTabla);
    panelTabla.setLayout(panelTablaLayout);
    panelTablaLayout.setHorizontalGroup(
      panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(panelTablaLayout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
        .addContainerGap())
    );
    panelTablaLayout.setVerticalGroup(
      panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(panelTablaLayout.createSequentialGroup()
        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
        .addContainerGap())
    );

    jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/images/actualizar.png"))); // NOI18N
    jButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
    jButton1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton1ActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jSeparator1)
          .addGroup(layout.createSequentialGroup()
            .addComponent(imageNaviShip)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(labelNameNaviship, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(labelServicio))
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(layout.createSequentialGroup()
                .addComponent(listaDeTablas, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1))
              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addComponent(labelSeleccionarInfo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelAcciones, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGap(13, 13, 13)
            .addComponent(panelTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGap(23, 23, 23)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(labelNameNaviship)
              .addComponent(labelServicio)))
          .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(imageNaviShip)))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addGroup(layout.createSequentialGroup()
            .addComponent(labelSeleccionarInfo)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(listaDeTablas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jButton1))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
            .addComponent(panelAcciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addComponent(panelTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
    try {
//      this.setVisible(false);
      AgregarInfoDeMotor agregarDeMotorView = new AgregarInfoDeMotor(new MainWindow(), true);
      agregarDeMotorView.setVisible(true);
    } catch (SQLException | IOException | ParseException ex) {
      Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
    }
  }//GEN-LAST:event_btnAgregarActionPerformed

  private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
    try {
//      this.setEnabled(false);
      EditarInfoDeMotor editarDeMotorView = new EditarInfoDeMotor(new MainWindow(), true);
      editarDeMotorView.setVisible(true);
    } catch (SQLException | IOException | ParseException | java.text.ParseException ex) {
      Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
    }
  }//GEN-LAST:event_btnEditarActionPerformed

  private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
//    this.setEnabled(false);
    EliminarInfoDeMotor eliminarDeMotorView = new EliminarInfoDeMotor(new MainWindow(), true);
    eliminarDeMotorView.setVisible(true);
  }//GEN-LAST:event_btnEliminarActionPerformed

  private void listaDeTablasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_listaDeTablasItemStateChanged
    String tablaSelect = (String) getListaDeTablas().getSelectedItem();
    ClickEvent clickEvent = new ClickEvent();
    try {
      clickEvent.setTablaInfo(tablaSelect, getTablaInfo());
    } catch (SQLException | IOException | ParseException | java.text.ParseException ex) {
      Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
    }

  }//GEN-LAST:event_listaDeTablasItemStateChanged

  private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    String tablaSelect = (String) getListaDeTablas().getSelectedItem();
    ClickEvent clickEvent = new ClickEvent();
    try {
      clickEvent.setTablaInfo(tablaSelect, getTablaInfo());
    } catch (SQLException | IOException | ParseException | java.text.ParseException ex) {
      Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
    }
  }//GEN-LAST:event_jButton1ActionPerformed

  /**
   * @param args the command line arguments
   */
//  public static void main(String args[]) {
//    /* Set the Nimbus look and feel */
//    //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//    /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//     */
//    try {
//      for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//        if ("Windows".equals(info.getName())) {
//          javax.swing.UIManager.setLookAndFeel(info.getClassName());
//          break;
//        }
//      }
//    } catch (ClassNotFoundException ex) {
//      java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//    } catch (InstantiationException ex) {
//      java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//    } catch (IllegalAccessException ex) {
//      java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//      java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//    }
//    //</editor-fold>
//
//    /* Create and display the form */
//    java.awt.EventQueue.invokeLater(new Runnable() {
//      public void run() {
//        
//        new MainWindow().setVisible(true);
//      }
//    });
//  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnAgregar;
  private javax.swing.JButton btnEditar;
  private javax.swing.JButton btnEliminar;
  private javax.swing.JLabel imageNaviShip;
  private javax.swing.JButton jButton1;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JSeparator jSeparator1;
  private javax.swing.JLabel labelNameNaviship;
  private javax.swing.JLabel labelSeleccionarInfo;
  private javax.swing.JLabel labelServicio;
  private javax.swing.JComboBox<String> listaDeTablas;
  private javax.swing.JPanel panelAcciones;
  private javax.swing.JPanel panelTabla;
  private javax.swing.JTable tablaInfo;
  // End of variables declaration//GEN-END:variables

  /**
   * @return the tablaInfo
   */
  public javax.swing.JTable getTablaInfo() {
    return tablaInfo;
  }

  /**
   * @return the listaDeTablas
   */
  public javax.swing.JComboBox<String> getListaDeTablas() {
    return listaDeTablas;
  }

}
