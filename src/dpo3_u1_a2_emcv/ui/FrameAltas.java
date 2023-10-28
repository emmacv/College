/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package dpo3_u1_a2_emcv.ui;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class FrameAltas extends javax.swing.JFrame {
    JFileChooser fc;
    FileNameExtensionFilter filter;

    /**
     * Constructor principal del la ventana de altas.
     */
    public FrameAltas() {
        initComponents();
        fc = new JFileChooser();
        fc.setFileFilter(new FileNameExtensionFilter(
            "Archivos de text", "txt"));
    }

    /**
     * Método que se encarga de inicializar los componentes de la ventana de altas.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        JLabelEmpleado = new javax.swing.JLabel();
        JTextField1Empleado = new javax.swing.JTextField();
        JLabelCapacitacion = new javax.swing.JLabel();
        JCheckBoxCapacitacion = new javax.swing.JCheckBox();
        JLabelPiso = new javax.swing.JLabel();
        JLabelEdificios = new javax.swing.JLabel();
        JTextFieldPiso = new javax.swing.JTextField();
        JTextField1Edificio = new javax.swing.JTextField();
        JButtonGuardar = new javax.swing.JButton();
        JButtonAbrir = new javax.swing.JButton();
        JButtonSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Altas");
        setBounds(new java.awt.Rectangle(0, 0, 300, 300));

        JLabelEmpleado.setText("Empleado");

        JTextField1Empleado.setToolTipText("");

        JLabelCapacitacion.setText("Capacitación");

        JLabelPiso.setText("Piso");

        JLabelEdificios.setText("Edificio");
        JLabelEdificios.setToolTipText("");

        JTextFieldPiso.setToolTipText("");

        JTextField1Edificio.setToolTipText("");

        JButtonGuardar.setText("Guardar");
        JButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonGuardarActionPerformed(evt);
            }
        });

        JButtonAbrir.setText("Abrir");
        JButtonAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonAbrirActionPerformed(evt);
            }
        });

        JButtonSalir.setText("Salir");
        JButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JLabelCapacitacion)
                        .addGap(18, 18, 18)
                        .addComponent(JCheckBoxCapacitacion))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(JLabelEdificios)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JTextField1Edificio, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(JLabelPiso)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JTextFieldPiso, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(JLabelEmpleado)
                            .addGap(31, 31, 31)
                            .addComponent(JTextField1Empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JButtonGuardar)
                    .addComponent(JButtonAbrir)
                    .addComponent(JButtonSalir))
                .addGap(45, 45, 45))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLabelEmpleado)
                            .addComponent(JTextField1Empleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLabelCapacitacion)
                            .addComponent(JCheckBoxCapacitacion))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLabelPiso)
                            .addComponent(JTextFieldPiso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLabelEdificios)
                            .addComponent(JTextField1Edificio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(JButtonGuardar)
                        .addGap(53, 53, 53)
                        .addComponent(JButtonAbrir)
                        .addGap(56, 56, 56)
                        .addComponent(JButtonSalir)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Listener que se encarga de cerrar la ventana de altas.
     * @param evt
     */
    private void JButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_JButtonSalirActionPerformed


    /**
     * Listener que se encarga de abrir un archivo de texto y mostrarlo en otra vista.
     * @param evt
     */
    private void JButtonAbrirActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_JButtonAbrirActionPerformed
        int value = fc.showOpenDialog(FrameAltas.this);

        if (value == JFileChooser.CANCEL_OPTION)
            return;

        int c;
        StringBuffer buffer = new StringBuffer();
        File file = fc.getSelectedFile();
        String fileName = file.getAbsolutePath();

        if (!fileName.endsWith(".txt")) {
            file = new File(fileName + ".txt");
            System.out.println(file.getAbsolutePath());
        }

        try (FileReader inputStream = new FileReader(file)) {
            while ((c = inputStream.read()) != -1) {
                buffer.append((char) c);
            }


            new FrameInformacion(buffer.toString()).setVisible(true);
        } catch (Exception e) {
            // TODO: handle exception
        }

    }// GEN-LAST:event_JButtonAbrirActionPerformed

    /**
     * Listener que se encarga de guardar un archivo de texto con la información de la ventana de altas. Cuando el fichero se ha guardado exitosamente, se muestra un mensaje de confirmación.
     * @param evt
     */
    private void JButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_JButtonGuardarActionPerformed
        int value = fc.showSaveDialog(FrameAltas.this);

        if (value == JFileChooser.CANCEL_OPTION)
            return;

        String fileName = fc.getSelectedFile().getAbsolutePath();
        String filePath = fileName + (fileName.endsWith(".txt") ? "" : ".txt");
        boolean append = false;

        File helper = new File(filePath);

        if (helper.exists()) {
            append = true;
        }

        try (FileWriter fr = new FileWriter(filePath, append)) {
            String buffer = "Empleado: " + JTextField1Empleado.getText() + "\n" + "Capacitación ?: "
                    + JCheckBoxCapacitacion.isSelected() + "\n" + "Piso: " + JTextFieldPiso.getText() + "\n"
                    + "Edificio: " + JTextField1Edificio.getText() + "\n";

            fr.write(buffer);

            JOptionPane.showMessageDialog(null, "Trabajador guardado en " + filePath, "Registro guardado", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }// GEN-LAST:event_JButtonGuardarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButtonAbrir;
    private javax.swing.JButton JButtonGuardar;
    private javax.swing.JButton JButtonSalir;
    private javax.swing.JCheckBox JCheckBoxCapacitacion;
    private javax.swing.JLabel JLabelCapacitacion;
    private javax.swing.JLabel JLabelEdificios;
    private javax.swing.JLabel JLabelEmpleado;
    private javax.swing.JLabel JLabelPiso;
    private javax.swing.JTextField JTextField1Edificio;
    private javax.swing.JTextField JTextField1Empleado;
    private javax.swing.JTextField JTextFieldPiso;
    // End of variables declaration//GEN-END:variables
}
