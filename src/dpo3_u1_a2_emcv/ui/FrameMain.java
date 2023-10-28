/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package dpo3_u1_a2_emcv.ui;

/**
 *
 * @author oblivion
 */
public class FrameMain extends javax.swing.JFrame {

    /**
     * Creates new form FrameMain
     */
    public FrameMain() {
        initComponents();
    }

    /**
     * Método que se encarga de inicializar los componentes de la ventana principal.
    */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        JMenuArchivo = new javax.swing.JMenu();
        JMenuItemAltas = new javax.swing.JMenuItem();
        JMenuAltas = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Control de personal");

        JMenuArchivo.setText("Ṕersonal");

        JMenuItemAltas.setText("Altas");
        JMenuItemAltas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuItemAltasActionPerformed(evt);
            }
        });
        JMenuArchivo.add(JMenuItemAltas);

        jMenuBar1.add(JMenuArchivo);

        JMenuAltas.setText("Salir");
        JMenuAltas.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                JMenuAltasMenuSelected(evt);
            }
        });
        jMenuBar1.add(JMenuAltas);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 395, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 46, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /*
     * Listener para el menú Altas.
     */
    private void JMenuItemAltasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuItemAltasActionPerformed
        openAltasFrame();
    }//GEN-LAST:event_JMenuItemAltasActionPerformed

    /*
     * Listener para terminar la aplicación.
     */
    private void JMenuAltasMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_JMenuAltasMenuSelected
        System.exit(0);
    }//GEN-LAST:event_JMenuAltasMenuSelected

    private void openAltasFrame() {
        new FrameAltas().setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu JMenuAltas;
    private javax.swing.JMenu JMenuArchivo;
    private javax.swing.JMenuItem JMenuItemAltas;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
