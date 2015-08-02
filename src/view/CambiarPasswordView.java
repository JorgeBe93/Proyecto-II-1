/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * CambiarPasswordView.java
 *
 * Created on 21/07/2015, 05:33:20 PM
 */

package view;

import bean.Usuario;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Jorge
 */
public class CambiarPasswordView extends javax.swing.JFrame {
     List<Usuario> u;
    private int limite=45;

    /** Creates new form CambiarPasswordView */
    public CambiarPasswordView() {
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

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("proyectoPU").createEntityManager();
        query = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT u FROM Usuario u");
        list = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(query.getResultList());
        jPanel1 = new javax.swing.JPanel();
        lbl_nueva2 = new javax.swing.JLabel();
        tf_actual = new javax.swing.JPasswordField();
        lbl_nueva = new javax.swing.JLabel();
        btn_cancelar = new javax.swing.JButton();
        btn_cambiar = new javax.swing.JButton();
        tf_nueva2 = new javax.swing.JPasswordField();
        tf_nueva = new javax.swing.JPasswordField();
        lbl_actual = new javax.swing.JLabel();
        tf_resultado = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cambiar Contraseña");

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        lbl_nueva2.setText("Vuelva a escribir la contraseña:");

        tf_actual.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf_actualFocusLost(evt);
            }
        });
        tf_actual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_actualKeyTyped(evt);
            }
        });

        lbl_nueva.setText("Nueva contraseña:");

        btn_cancelar.setText("Cancelar");

        btn_cambiar.setText("Cambiar");
        btn_cambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cambiarActionPerformed(evt);
            }
        });

        tf_nueva2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_nueva2KeyTyped(evt);
            }
        });

        tf_nueva.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_nuevaKeyTyped(evt);
            }
        });

        lbl_actual.setText("Contraseña Actual:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_cambiar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbl_nueva)
                        .addComponent(lbl_nueva2)
                        .addComponent(lbl_actual)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_nueva2)
                            .addComponent(tf_nueva)
                            .addComponent(tf_actual, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                            .addComponent(tf_resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(btn_cancelar)
                        .addGap(84, 84, 84))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_actual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_actual))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_nueva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_nueva))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nueva2)
                    .addComponent(tf_nueva2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(tf_resultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cancelar)
                    .addComponent(btn_cambiar))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_actualKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_actualKeyTyped
        // TODO add your handling code here:
         if(tf_actual.getText().length()==limite){
            getToolkit().beep();
            evt.consume(); //se le ignora

        }
    }//GEN-LAST:event_tf_actualKeyTyped

    private void tf_actualFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_actualFocusLost
        // TODO add your handling code here:
         if(tf_actual.getText().length()==0){
            JOptionPane.showMessageDialog(null,"No ha ingresado su contraseña actual", "Error",JOptionPane.ERROR_MESSAGE);
            return;

        }else{
              query = entityManager.createNamedQuery( "Usuario.findByPassword");
              query.setParameter("password",tf_actual.getText());
              u = query.getResultList();
          
              if(u.size()==0){
                  JOptionPane.showMessageDialog(null,"La contraseña no pertenece a ningún usuario", "Error",JOptionPane.ERROR_MESSAGE);
                  tf_actual.setText(null);
                  return;
              }
             else{
                  tf_actual.setEnabled(false);
             }
        }
    }//GEN-LAST:event_tf_actualFocusLost

    private void tf_nuevaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_nuevaKeyTyped
        // TODO add your handling code here:
         if(tf_actual.getText().length()==limite){
            getToolkit().beep();
            evt.consume(); //se le ignora

        }
    }//GEN-LAST:event_tf_nuevaKeyTyped

    private void tf_nueva2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_nueva2KeyTyped
        // TODO add your handling code here:
         if(tf_actual.getText().length()==limite){
            getToolkit().beep();
            evt.consume(); //se le ignora

        }
    }//GEN-LAST:event_tf_nueva2KeyTyped

    private void btn_cambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cambiarActionPerformed
        // TODO add your handling code here:
        if(tf_nueva.getText().length()==0 || tf_nueva2.getText().length()==0){
             JOptionPane.showMessageDialog(null,"No ha ingresado valor para la nueva contraseña", "Error",JOptionPane.ERROR_MESSAGE);
             return;
        }
        if(tf_nueva.getText().equals(tf_nueva2.getText())){
          entityManager.getTransaction().begin();
           Usuario usu=new Usuario();
           usu.setCodigoEmpleado(u.get(0).getCodigoEmpleado());
           usu.setPassword(tf_nueva.getText());
           entityManager.merge(usu);
           entityManager.getTransaction().commit();
           entityManager.close();
            JOptionPane.showMessageDialog(null,"Modificación Exitosa", "Aviso",JOptionPane.INFORMATION_MESSAGE);
            this.setVisible(false);
        }
        else{
             JOptionPane.showMessageDialog(null,"Las Contraseñas no coiciden", "Error",JOptionPane.ERROR_MESSAGE);
             return;
        }
    }//GEN-LAST:event_btn_cambiarActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame frame=new CambiarPasswordView();
                frame.setVisible(true);
                frame.setTitle("Cambiar Contraseña");
                frame.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cambiar;
    private javax.swing.JButton btn_cancelar;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_actual;
    private javax.swing.JLabel lbl_nueva;
    private javax.swing.JLabel lbl_nueva2;
    private java.util.List<bean.Usuario> list;
    private javax.persistence.Query query;
    private javax.swing.JPasswordField tf_actual;
    private javax.swing.JPasswordField tf_nueva;
    private javax.swing.JPasswordField tf_nueva2;
    private javax.swing.JTextField tf_resultado;
    // End of variables declaration//GEN-END:variables

}