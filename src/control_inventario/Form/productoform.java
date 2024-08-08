package control_inventario.Form;

import clases.producto;
import clases.productodao;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.HeadlessException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class productoform extends javax.swing.JFrame {
    String user=LoginVet.txtuser.getText();
    productodao prodao=new productodao();
    producto pro=new producto();
    DefaultTableModel modelo=new DefaultTableModel();
    int id;        
    public productoform() {
        initComponents();
        lista();
    }
    void lista(){
        List<producto> lista=prodao.listar();
        modelo=(DefaultTableModel)tablapro.getModel();
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
        tablapro.setModel(modelo);
    }
    public static String fecha(){
        Date fec=new Date();
        SimpleDateFormat formatofe=new SimpleDateFormat("dd/MM/YYYY");
        return formatofe.format(fec);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtnom = new javax.swing.JTextField();
        txtpre = new javax.swing.JTextField();
        txtstock = new javax.swing.JTextField();
        btnag = new javax.swing.JButton();
        btnnue = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtprov = new javax.swing.JTextField();
        cbc = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtal = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablapro = new javax.swing.JTable();
        btneli = new javax.swing.JButton();
        btnmod = new javax.swing.JButton();
        btnreport = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));

        jLabel1.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setText("PRODUCTOS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(java.awt.Color.white);

        jPanel3.setBackground(java.awt.Color.lightGray);

        jLabel2.setText("Nombre");

        jLabel3.setText("Precio");

        jLabel4.setText("Stock");

        btnag.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.jpg"))); // NOI18N
        btnag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagActionPerformed(evt);
            }
        });

        btnnue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nuevo.jpg"))); // NOI18N
        btnnue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnueActionPerformed(evt);
            }
        });

        jLabel5.setText("Categoria");

        jLabel6.setText("Proveedor");

        cbc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ANTIBIOTICOS", "SUMPLEMENTOS", "ANTIPARASITARIOS", "ANABOLICOS", "ANTIINFLAMATORIOS", "HORMONALES", "ANESTESICOS", "NUTRICIONALES" }));

        jLabel7.setText("Almacen");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtnom, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtpre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtstock, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(55, 55, 55)
                                .addComponent(btnag, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbc, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtprov, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                .addComponent(txtal)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnnue, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(129, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtnom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtpre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtstock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtprov, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnag)
                .addGap(18, 18, 18)
                .addComponent(btnnue, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );

        jPanel4.setBackground(java.awt.Color.lightGray);

        tablapro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRE", "PRECIO", "STOCK", "CATEGORIA", "PROVEEDOR", "ALMACEN"
            }
        ));
        tablapro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaproMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablapro);

        btneli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar.jpg"))); // NOI18N
        btneli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliActionPerformed(evt);
            }
        });

        btnmod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modificar.jpg"))); // NOI18N
        btnmod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodActionPerformed(evt);
            }
        });

        btnreport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/reporte.jpg"))); // NOI18N
        btnreport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 721, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(btneli, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(btnmod, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(btnreport, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnmod, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btneli, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnreport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagActionPerformed
        agregar();
        limpiarta();
        lista();
        nuevo();
    }//GEN-LAST:event_btnagActionPerformed

    private void btnnueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnueActionPerformed
        nuevo();
    }//GEN-LAST:event_btnnueActionPerformed

    private void btneliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliActionPerformed
        eliminar();
        limpiarta();
        lista();
        nuevo();
    }//GEN-LAST:event_btneliActionPerformed

    private void btnmodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodActionPerformed
        actualizar();
        limpiarta();
        lista();
        nuevo();
    }//GEN-LAST:event_btnmodActionPerformed

    private void tablaproMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaproMouseClicked
        int fila=tablapro.getSelectedRow();
        if(fila==-1){
            JOptionPane.showMessageDialog(this, "Seleccione una fila");
        }else{
            id=Integer.parseInt(tablapro.getValueAt(fila, 0).toString());
            String nombre=tablapro.getValueAt(fila, 1).toString();
            String precio=tablapro.getValueAt(fila, 2).toString();
            String stock=tablapro.getValueAt(fila, 3).toString();
            String cat=tablapro.getValueAt(fila, 4).toString();
            String prov=tablapro.getValueAt(fila, 5).toString();
            String alm=tablapro.getValueAt(fila, 6).toString();
            txtnom.setText(nombre);
            txtpre.setText(precio);
            txtstock.setText(stock);
            cbc.setSelectedItem(cat);
            txtprov.setText(prov);
            txtal.setText(alm);
        }
    }//GEN-LAST:event_tablaproMouseClicked

    private void btnreportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreportActionPerformed
        Document documento=new Document(PageSize.A4.rotate());
        try {
            String ruta= System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream(ruta+ "/Desktop/Reporte Entradas.pdf"));
            documento.open();
            documento.addTitle("Productos Ingresados al sistemas");
            documento.add(new Paragraph("                                                                                       Reporte de Productos Ingresados"));
            documento.add(new Paragraph("                     "));
            documento.add(new Paragraph("Fecha: "+fecha()));
            documento.add(new Paragraph("                     "));
            documento.add(new Paragraph("Empleado: "+user));
            documento.add(new Paragraph("                     "));
            PdfPTable tabla=new PdfPTable(7);
            tabla.addCell("Código");
            tabla.addCell("Producto");
            tabla.addCell("Precio");
            tabla.addCell("Stock");
            tabla.addCell("Categoria");
            tabla.addCell("Proveedor");
            tabla.addCell("Almacen");
            try {
                Connection con= DriverManager.getConnection("jdbc:mysql://localhost/sistema_ci","root", "");
                PreparedStatement ps=con.prepareStatement("select * from producto");
                ResultSet rs=ps.executeQuery();
                if(rs.next()){
                    do{
                        tabla.addCell(rs.getString(1));
                        tabla.addCell(rs.getString(2));
                        tabla.addCell(rs.getString(3));
                        tabla.addCell(rs.getString(4));
                        tabla.addCell(rs.getString(5));
                        tabla.addCell(rs.getString(6));
                        tabla.addCell(rs.getString(7));
                    }while(rs.next());
                    documento.add(tabla);
                }
            } catch (DocumentException | SQLException e) {
            }
            documento.close();
            JOptionPane.showMessageDialog(null, "Reporte generado");
        } catch (DocumentException | HeadlessException | FileNotFoundException e) {
        }
    }//GEN-LAST:event_btnreportActionPerformed
    void agregar(){
        String nombre=txtnom.getText();
        Double precio=Double.parseDouble(txtpre.getText());
        int stock=Integer.parseInt(txtstock.getText());
        String cat=cbc.getSelectedItem().toString();
        String prov=txtprov.getText();
        String alm=txtal.getText();
        Object[] ob=new Object[6];
        ob[0]=nombre;
        ob[1]=precio;
        ob[2]=stock;
        ob[3]=cat;
        ob[4]=prov;
        ob[5]=alm;
        prodao.add(ob);
    }
    void actualizar(){
        int fila=tablapro.getSelectedRow();
        if(fila==-1){
            JOptionPane.showMessageDialog(this, "Seleccione una fila");
        }else{
        String nombre=txtnom.getText();
        Double precio=Double.parseDouble(txtpre.getText());
        int stock=Integer.parseInt(txtstock.getText());
        String cat=cbc.getSelectedItem().toString();
        String prov=txtprov.getText();
        String alm=txtal.getText();
        Object[] obj=new Object[7];
        obj[0]=nombre;
        obj[1]=precio;
        obj[2]=stock;
        obj[3]=cat;
        obj[4]=prov;
        obj[5]=alm;
        obj[6]=id;
        prodao.actualizar(obj);
        }
    }
    void nuevo(){
        txtnom.setText("");
        txtpre.setText("");
        txtstock.setText("");
        cbc.setSelectedItem(0);
        txtprov.setText("");
        txtal.setText("");
        txtnom.requestFocus();
    }
    void eliminar(){
        int fila=tablapro.getSelectedRow();
        if(fila==-1){
            JOptionPane.showMessageDialog(this, "Seleccione una fila");
        }else{
        prodao.eliminar(id);
        }
    }
    void limpiarta(){
        for(int i=0;i<modelo.getRowCount();i++){
            modelo.removeRow(i);
            i=i-1;
        }
    }
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
            java.util.logging.Logger.getLogger(productoform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(productoform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(productoform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(productoform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new productoform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnag;
    private javax.swing.JButton btneli;
    private javax.swing.JButton btnmod;
    private javax.swing.JButton btnnue;
    private javax.swing.JButton btnreport;
    private javax.swing.JComboBox<String> cbc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablapro;
    private javax.swing.JTextField txtal;
    private javax.swing.JTextField txtnom;
    private javax.swing.JTextField txtpre;
    private javax.swing.JTextField txtprov;
    private javax.swing.JTextField txtstock;
    // End of variables declaration//GEN-END:variables
}
