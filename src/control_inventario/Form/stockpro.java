package control_inventario.Form;

import clases.producto;
import clases.productodao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class stockpro extends javax.swing.JFrame {
    productodao prodao=new productodao();
    producto pro=new producto();
    DefaultTableModel modelo=new DefaultTableModel();
    int id; 
    public stockpro() {
        initComponents();
        this.setLocationRelativeTo(null);
        lista();
    }
    void lista(){
        List<producto> lista=prodao.listar();
        modelo=(DefaultTableModel)tablastock.getModel();
        Object[] ob=new Object[7];
        for(int i=0;i<lista.size();i++){
            ob[0]=lista.get(i).getId();
            ob[1]=lista.get(i).getNombre();
            ob[2]=lista.get(i).getPrecio();
            ob[3]=lista.get(i).getStock();
            ob[4]=lista.get(i).getCat();
            ob[5]=lista.get(i).getProv();
            ob[6]=lista.get(i).getAlm();
            modelo.addRow(ob);
        }
        tablastock.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablastock = new javax.swing.JTable();
        cbb = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbp = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(java.awt.Color.black);

        jPanel2.setBackground(java.awt.Color.lightGray);

        tablastock.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRE", "PRECIO", "STOCK", "CATEGORIA", "PROVEEDOR", "ALMACEN"
            }
        ));
        tablastock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablastockMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablastock);

        cbb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TODOS", "ANTIBIOTICOS", "SUMPLEMENTOS", "ANTIPARASITARIOS", "ANABOLICOS", "ANTIINFLAMATORIOS", "HORMONALES", "ANESTESICOS", "NUTRICIONALES" }));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Categoria");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Proveedor");

        cbp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TODOS", "CALICHIN", "TOMASA", "TOEI" }));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 738, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(cbb, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(cbp, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(cbp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablastockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablastockMouseClicked
        int fila=tablastock.getSelectedRow();
        if(fila==-1){
            JOptionPane.showMessageDialog(this, "Seleccione una fila");
        }else{
            
            id=Integer.parseInt(tablastock.getValueAt(fila, 0).toString());
            String nombre=tablastock.getValueAt(fila, 1).toString();
            String precio=tablastock.getValueAt(fila, 2).toString();
            String stock=tablastock.getValueAt(fila, 3).toString();
            /*txtnom.setText(nombre);
            txtpre.setText(precio);
            txtstock.setText(stock);*/
        }
    }//GEN-LAST:event_tablastockMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        try {
            modelo=(DefaultTableModel)tablastock.getModel();
            modelo.setRowCount(0);
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/sistema_ci","root", "");
            Statement stmt = con.createStatement();
            String buscar = cbb.getSelectedItem().toString();
            String sql;
            //String sql="SELECT id_prod,nombre,precio,stock,categoria ,proveedor,almacen FROM producto where categoria ='"+buscar+"' "; 
            if(buscar.compareTo("TODOS")==0){
                sql = "SELECT * FROM producto ";  
            }else{
                sql = "SELECT id_prod,nombre,precio,stock,categoria ,proveedor,almacen FROM producto where categoria ='"+buscar+"' ";  
            }
            ResultSet rs = stmt.executeQuery(sql);
            
            while(rs.next()){
                   Object [] fila= {rs.getInt(1),rs.getString(2),rs.getDouble(3),rs.getInt(4),rs.getString(5),rs.getString(6),rs.getString(7)};
                modelo.addRow(fila);
            }         
        } catch (SQLException ex) {
            Logger.getLogger(stockpro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        try {
            modelo=(DefaultTableModel)tablastock.getModel();
            modelo.setRowCount(0);
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/sistema_ci","root", "");
            Statement stmt = con.createStatement();
            String buscar = cbp.getSelectedItem().toString();
            String sql;
            //String sql="SELECT id_prod,nombre,precio,stock,categoria ,proveedor,almacen FROM producto where proveedor ='"+buscar+"' "; 
            if(buscar.compareTo("TODOS")==0){
                sql = "SELECT * FROM producto ";  
            }else{
                sql = "SELECT id_prod,nombre,precio,stock,categoria ,proveedor,almacen FROM producto where proveedor ='"+buscar+"' ";  
            }
            ResultSet rs = stmt.executeQuery(sql);
            
            while(rs.next()){
                   Object [] fila= {rs.getInt(1),rs.getString(2),rs.getDouble(3),rs.getInt(4),rs.getString(5),rs.getString(6),rs.getString(7)};
                modelo.addRow(fila);
            }         
        } catch (SQLException ex) {
            Logger.getLogger(stockpro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel5MouseClicked

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(stockpro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(stockpro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(stockpro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(stockpro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new stockpro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbb;
    private javax.swing.JComboBox<String> cbp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablastock;
    // End of variables declaration//GEN-END:variables
}
