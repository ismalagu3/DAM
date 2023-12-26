package ventana;

import java.awt.Color;

/**
 *
 * @author ismal
 */
public class Reserva extends javax.swing.JFrame {

    public Reserva() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        nombre = new javax.swing.JTextField();
        telefono = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        fecha = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        panelTipo = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tipoReserva = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        nPersonas = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        tipoCocina = new javax.swing.JComboBox<>();
        panelJornadas = new javax.swing.JPanel();
        textJornadas = new javax.swing.JLabel();
        jornadasCongreso = new javax.swing.JTextField();
        textHabitaciones = new javax.swing.JLabel();
        nHabitaciones = new javax.swing.JTextField();
        reservaHabitaciones = new javax.swing.JCheckBox();
        jSeparator3 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Salón Habana");

        nombre.setText("Nombre");
        nombre.setToolTipText("Nombre");
        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });

        telefono.setText("Teléfono");
        telefono.setToolTipText("Teléfono");
        telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonoActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        fecha.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1703434920000L), new java.util.Date(1703434920000L), new java.util.Date(1704126120000L), java.util.Calendar.DAY_OF_MONTH));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel1.setText("Fecha");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        panelTipo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel2.setText("Tipo:");

        tipoReserva.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Banquete", "Jornada ", "Congreso" }));
        tipoReserva.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                tipoReservaItemStateChanged(evt);
            }
        });
        tipoReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoReservaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelTipoLayout = new javax.swing.GroupLayout(panelTipo);
        panelTipo.setLayout(panelTipoLayout);
        panelTipoLayout.setHorizontalGroup(
            panelTipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTipoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(tipoReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        panelTipoLayout.setVerticalGroup(
            panelTipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTipoLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(panelTipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tipoReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel3.setText("Personas:");

        nPersonas.setText("Nº Personas");
        nPersonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nPersonasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(nPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel4.setText("Tipo de cocina:");

        tipoCocina.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bufé", "Carta", "Pedir cita con el Chef", "No precisa" }));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(tipoCocina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tipoCocina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        panelJornadas.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        textJornadas.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        textJornadas.setText("Nº jornadas del congreso:");
        textJornadas.setEnabled(false);

        jornadasCongreso.setText("Nº Personas");
        jornadasCongreso.setEnabled(false);
        jornadasCongreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jornadasCongresoActionPerformed(evt);
            }
        });

        textHabitaciones.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        textHabitaciones.setText("Nº Habitaciones");
        textHabitaciones.setEnabled(false);

        nHabitaciones.setText("Nº Habitaciones");
        nHabitaciones.setEnabled(false);
        nHabitaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nHabitacionesActionPerformed(evt);
            }
        });

        reservaHabitaciones.setText("Reserva Habitaciones");
        reservaHabitaciones.setEnabled(false);
        reservaHabitaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservaHabitacionesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelJornadasLayout = new javax.swing.GroupLayout(panelJornadas);
        panelJornadas.setLayout(panelJornadasLayout);
        panelJornadasLayout.setHorizontalGroup(
            panelJornadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelJornadasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelJornadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelJornadasLayout.createSequentialGroup()
                        .addComponent(textHabitaciones)
                        .addGap(18, 18, 18)
                        .addComponent(nHabitaciones))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelJornadasLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(reservaHabitaciones)
                        .addGap(48, 48, 48))
                    .addGroup(panelJornadasLayout.createSequentialGroup()
                        .addComponent(textJornadas)
                        .addGap(18, 18, 18)
                        .addComponent(jornadasCongreso))
                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        panelJornadasLayout.setVerticalGroup(
            panelJornadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelJornadasLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(panelJornadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textJornadas, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jornadasCongreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(reservaHabitaciones)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelJornadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textHabitaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nHabitaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        jButton1.setText("Ver Reserva");
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
                .addGap(107, 107, 107)
                .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(161, 161, 161))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator2)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(158, Short.MAX_VALUE)
                        .addComponent(panelTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 169, Short.MAX_VALUE)
                        .addComponent(panelJornadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(358, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap(351, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelJornadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(panelTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefonoActionPerformed

    private void nPersonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nPersonasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nPersonasActionPerformed

    private void jornadasCongresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jornadasCongresoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jornadasCongresoActionPerformed

    private void tipoReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoReservaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoReservaActionPerformed

    private void tipoReservaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_tipoReservaItemStateChanged
        String tipo = (String) tipoReserva.getSelectedItem();

        if (tipo == "Congreso"){
            jornadasCongreso.setEnabled(true);
            textJornadas.setEnabled(true);
            reservaHabitaciones.setEnabled(true);
            reservaHabitaciones.setSelected(false);
        } else{
            jornadasCongreso.setEnabled(false);
            textJornadas.setEnabled(false);
            textHabitaciones.setEnabled(false);
            nHabitaciones.setEnabled(false);
            reservaHabitaciones.setEnabled(false);
            reservaHabitaciones.setSelected(false);
        }
    }//GEN-LAST:event_tipoReservaItemStateChanged

    private void nHabitacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nHabitacionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nHabitacionesActionPerformed

    private void reservaHabitacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservaHabitacionesActionPerformed
        if(reservaHabitaciones.isSelected()){
            textHabitaciones.setEnabled(true);
            nHabitaciones.setEnabled(true);
        } else{
            textHabitaciones.setEnabled(false);
            nHabitaciones.setEnabled(false);
        }
    }//GEN-LAST:event_reservaHabitacionesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dialogo verReserva = new dialogo (this, true);
        verReserva.setDatos("Nombre: " + nombre.getText(), 1);
        verReserva.setDatos("Teléfono: " + telefono.getText(), 2);
        verReserva.setDatos("Fecha: " + fecha.getValue(), 3);
        verReserva.setDatos("Tipo de Cocina: " + tipoCocina.getSelectedItem(), 4);
        verReserva.setDatos("Nº Personas: " + nPersonas.getText(), 5);
        verReserva.setDatos("Tipo de Reserva: " + tipoReserva.getSelectedItem(), 6);
        verReserva.setDatos("Nº Jornadas: " + jornadasCongreso.getText(), 7);
        verReserva.setDatos("Nº Habitaciones: " + nHabitaciones.getText(), 8);
        verReserva.setVisible(true);
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Reserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }     

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reserva().setVisible(true);
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner fecha;
    private javax.swing.JButton jButton1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jornadasCongreso;
    private javax.swing.JTextField nHabitaciones;
    private javax.swing.JTextField nPersonas;
    private javax.swing.JTextField nombre;
    private javax.swing.JPanel panelJornadas;
    private javax.swing.JPanel panelTipo;
    private javax.swing.JCheckBox reservaHabitaciones;
    private javax.swing.JTextField telefono;
    private javax.swing.JLabel textHabitaciones;
    private javax.swing.JLabel textJornadas;
    private javax.swing.JComboBox<String> tipoCocina;
    private javax.swing.JComboBox<String> tipoReserva;
    // End of variables declaration//GEN-END:variables
}
