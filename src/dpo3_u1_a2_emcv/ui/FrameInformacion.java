/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package dpo3_u1_a2_emcv.ui;

/**
 *
 * @author oblivion
 */
public class FrameInformacion extends javax.swing.JFrame {

    /**
     * Constructor de la ventana para mostrar la información de un empleado.
     */
    public FrameInformacion(String data) {
        initComponents();

        JTextAreaInformacion.setText(data);
    }

    /**
     * Método que se encarga de inicializar los componentes de la ventana de información.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        JTextAreaInformacion = new javax.swing.JTextArea();
        JButtonSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Información de empleado");

        JTextAreaInformacion.setEditable(false);
        JTextAreaInformacion.setColumns(20);
        JTextAreaInformacion.setRows(5);
        jScrollPane1.setViewportView(JTextAreaInformacion);

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
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(JButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(JButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Listener para el cerrar la ventana.
     * @param evt
     */
    private void JButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_JButtonSalirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButtonSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea JTextAreaInformacion;
    // End of variables declaration//GEN-END:variables
}
