/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * RolEliminar.java
 *
 * Created on 14/07/2015, 04:07:09 PM
 */

package view;

import bean.AuditoriaSistema;
import bean.Rol;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Jorge
 */
public class RolEliminar extends javax.swing.JFrame {
    private int resp;

    /** Creates new form RolEliminar */
    public RolEliminar() {
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

        jPanel1 = new javax.swing.JPanel();
        tf_nombre = new javax.swing.JTextField();
        lbl_identi = new javax.swing.JLabel();
        tf_identi = new javax.swing.JTextField();
        lbl_nombre = new javax.swing.JLabel();
        btn_eliminar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        tf_nombre.setEditable(false);

        lbl_identi.setText("Identificación:");

        tf_identi.setEditable(false);

        lbl_nombre.setText("Nombre:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_identi)
                    .addComponent(lbl_nombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_identi, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                    .addComponent(tf_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_identi)
                    .addComponent(tf_identi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nombre)
                    .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        btn_eliminar.setText("Eliminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(btn_eliminar)
                .addGap(59, 59, 59)
                .addComponent(btn_cancelar)
                .addContainerGap(114, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_eliminar)
                    .addComponent(btn_cancelar))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        // TODO add your handling code here:
        resp=  JOptionPane.showConfirmDialog(null,"Esta seguro que desea eliminar?", "Confirmar Eliminación",JOptionPane.YES_NO_OPTION );
        if(resp==JOptionPane.YES_OPTION){
             EntityManagerFactory fact=Persistence.createEntityManagerFactory("proyectoPU");
         EntityManager ema= fact.createEntityManager();
         ema.getTransaction().begin();
         Rol rolFind=ema.find(Rol.class,Integer.parseInt(tf_identi.getText()) );
         ema.remove(rolFind);
          //registramos los datos necesarios para la auditoria
       /*  AuditoriaSistema as=new AuditoriaSistema();
          as.setAccion("Eliminación");
          as.setTabla("Rol");
             //trabajamos con la fecha
             Date fecha=new Date();
             DateFormat formato=new SimpleDateFormat("yyyy-MM-dd");
             DateFormat formato1=new SimpleDateFormat("HH:mm:ss");
             as.setFecha(formato.format(fecha));
             as.setHora(formato1.format(fecha));
             as.setUsuario(LoginView.nombreUsuario);
             ema.persist(as);*/
             ema.getTransaction().commit();
             ema.close();
         JOptionPane.showMessageDialog(null, "Eliminación Exitosa");
         this.setVisible(false);

        }else{
           this.setVisible(false);
        }
          
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btn_cancelarActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(final String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               JFrame frame= new RolBuscar();
                frame.pack();
               frame.setVisible(true);
               frame.setLocationRelativeTo(null);
               frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_identi;
    private javax.swing.JLabel lbl_nombre;
    public static javax.swing.JTextField tf_identi;
    public static javax.swing.JTextField tf_nombre;
    // End of variables declaration//GEN-END:variables

}
