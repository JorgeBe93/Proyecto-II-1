/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * MenuAdminSist.java
 *
 * Created on 14/07/2015, 03:36:05 PM
 */

package view;

import javax.swing.JFrame;

/**
 *
 * @author Jorge
 */
public class MenuAdminSist extends javax.swing.JFrame {
    public static int opcion=0;

    /** Creates new form MenuAdminSist */
    public MenuAdminSist() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu_rol = new javax.swing.JMenu();
        mItem_crearR = new javax.swing.JMenuItem();
        mItem_editarR = new javax.swing.JMenuItem();
        mItem_eliminarR = new javax.swing.JMenuItem();
        mItem_buscarR = new javax.swing.JMenuItem();
        menu_usuario = new javax.swing.JMenu();
        menu_auditoria = new javax.swing.JMenu();
        menu_salir = new javax.swing.JMenu();

        jMenu1.setText("File");
        jMenuBar2.add(jMenu1);

        jMenu3.setText("Edit");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("File");
        jMenuBar3.add(jMenu4);

        jMenu5.setText("Edit");
        jMenuBar3.add(jMenu5);

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Menu Administrador del Sistema");

        jMenuBar1.setBackground(new java.awt.Color(211, 219, 227));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        menu_rol.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menu_rol.setText("Administrar Rol");
        menu_rol.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        menu_rol.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        mItem_crearR.setText("Crear Rol");
        mItem_crearR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItem_crearRActionPerformed(evt);
            }
        });
        menu_rol.add(mItem_crearR);

        mItem_editarR.setText("Editar Rol");
        mItem_editarR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItem_editarRActionPerformed(evt);
            }
        });
        menu_rol.add(mItem_editarR);

        mItem_eliminarR.setText("Eliminar Rol");
        mItem_eliminarR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItem_eliminarRActionPerformed(evt);
            }
        });
        menu_rol.add(mItem_eliminarR);

        mItem_buscarR.setText("Buscar Rol");
        mItem_buscarR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItem_buscarRActionPerformed(evt);
            }
        });
        menu_rol.add(mItem_buscarR);

        jMenuBar1.add(menu_rol);

        menu_usuario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menu_usuario.setText("Administrar Usuario");
        jMenuBar1.add(menu_usuario);

        menu_auditoria.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menu_auditoria.setText("Ver Auditoría de Sistema");
        menu_auditoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_auditoriaMouseClicked(evt);
            }
        });
        menu_auditoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_auditoriaActionPerformed(evt);
            }
        });
        jMenuBar1.add(menu_auditoria);

        menu_salir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menu_salir.setText("Salir");
        menu_salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_salirMouseClicked(evt);
            }
        });
        jMenuBar1.add(menu_salir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 286, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mItem_crearRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItem_crearRActionPerformed
        // TODO add your handling code here:
        String args[]=new String[1];
        args[0]="Crear Rol";
        RolCreate.main(args);
    }//GEN-LAST:event_mItem_crearRActionPerformed

    private void mItem_buscarRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItem_buscarRActionPerformed
        // TODO add your handling code here:
        opcion=3;
        String args[]=new String[1];
        args[0]="Buscar Rol";
        RolBuscar.main(args);
    }//GEN-LAST:event_mItem_buscarRActionPerformed

    private void mItem_eliminarRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItem_eliminarRActionPerformed
        // TODO add your handling code here:
        opcion=2;
         String args[]=new String[1];
        args[0]="Buscar Rol";
        RolBuscar.main(args);
    }//GEN-LAST:event_mItem_eliminarRActionPerformed

    private void mItem_editarRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItem_editarRActionPerformed
        // TODO add your handling code here:
        opcion=1;
         String args[]=new String[1];
        args[0]="Buscar Rol";
        RolBuscar.main(args);
    }//GEN-LAST:event_mItem_editarRActionPerformed

    private void menu_salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_salirMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        String args[]=new String[1];
        args[0]="Ingreso al sistema";
        LoginView.main(args);
    }//GEN-LAST:event_menu_salirMouseClicked

    private void menu_auditoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_auditoriaActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_menu_auditoriaActionPerformed

    private void menu_auditoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_auditoriaMouseClicked
        // TODO add your handling code here:
        String args[]=new String[1];
        args[0]="Auditoría de Sistema";
        VerAuditoriaSistema.main(args);
    }//GEN-LAST:event_menu_auditoriaMouseClicked

    /**
    * @param args the command line arguments
    */
    public static void main(final String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               JFrame frame= new MenuAdminSist();
               frame.setVisible(true);
               frame.setLocationRelativeTo(null);
               frame.setTitle(args[0]);
               frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem mItem_buscarR;
    private javax.swing.JMenuItem mItem_crearR;
    private javax.swing.JMenuItem mItem_editarR;
    private javax.swing.JMenuItem mItem_eliminarR;
    private javax.swing.JMenu menu_auditoria;
    private javax.swing.JMenu menu_rol;
    private javax.swing.JMenu menu_salir;
    private javax.swing.JMenu menu_usuario;
    // End of variables declaration//GEN-END:variables

}
