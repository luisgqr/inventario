package control_inventario.Form;

import clases.cliente;
import clases.clientedao;
import clases.detallesalida;
import clases.producto;
import clases.productodao;
import clases.salida;
import clases.salidadao;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.HeadlessException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
//import java.sql.Types;
import javax.swing.table.DefaultTableModel;
//import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

public class salidas extends javax.swing.JFrame {
    String user=LoginVet.txtuser.getText();
    
    salida sal=new salida();
    salidadao saldao=new salidadao();
    detallesalida ds=new detallesalida();
    clientedao clidao=new clientedao();
    cliente cl=new cliente();
    productodao prodao=new productodao();
    producto prod=new producto();
    DefaultTableModel modelo=new DefaultTableModel();
    int idpro;
    double pre;
    int item;
    int cant;
    double pagototal;
    public salidas() {
        initComponents();
        this.setLocationRelativeTo(null);
        fecha();
        txtem.setText("       "+user);
        generarnventa();//''''
        //txtfecha.setText(" "+fechaactual());
    }
    void fecha(){
        Calendar cal=new GregorianCalendar();
        txtfecha.setText("   "+cal.get(Calendar.YEAR)+"-"+cal.get(Calendar.MONTH)+"-"+cal.get(Calendar.DAY_OF_MONTH));
        //"+cal.get(Calendar.HOUR_OF_DAY)+":"+cal.get(Calendar.MINUTE)+":"+cal.get(Calendar.SECOND);
    }
    public static String fechaactual(){
        Date fec=new Date();
        SimpleDateFormat formatofe=new SimpleDateFormat("dd/MM/YYYY");
        return formatofe.format(fec);
    }
    void generarnventa(){
        String nsa=saldao.nsalida();
        if(nsa==null){
            txtnventa.setText("0000001");
        }else{
            txtnventa.setText("0000001");//----
            int increment=Integer.parseInt(nsa);//''''
            increment = increment + 1;
            txtnventa.setText("000000"+increment);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtccliente = new javax.swing.JTextField();
        btnbc = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtcproducto = new javax.swing.JTextField();
        btnbp = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtncliente = new javax.swing.JTextField();
        txtnproducto = new javax.swing.JTextField();
        txtprecio = new javax.swing.JTextField();
        btnagregar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtstock = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtem = new javax.swing.JTextField();
        scant = new javax.swing.JSpinner();
        cancelardetalle = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaventa = new javax.swing.JTable();
        btngenerar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txttotal = new javax.swing.JTextField();
        btncancelar = new javax.swing.JButton();
        btnreporte = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtnventa = new javax.swing.JTextField();
        txtfecha = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));

        jLabel1.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 255, 255));
        jLabel1.setText("GENERAR VENTAS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(294, 294, 294)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(java.awt.Color.white);

        jPanel3.setBackground(java.awt.Color.lightGray);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setText("DNI del Cliente");

        btnbc.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnbc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.jpg"))); // NOI18N
        btnbc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbcActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setText("Código Producto");

        btnbp.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnbp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.jpg"))); // NOI18N
        btnbp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbpActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setText("Nombre del Cliente");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setText("Nombre del Producto");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel6.setText("Precio");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel7.setText("Cantidad");

        txtncliente.setEditable(false);

        txtnproducto.setEditable(false);

        txtprecio.setEditable(false);
        txtprecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprecioActionPerformed(evt);
            }
        });

        btnagregar.setBackground(new java.awt.Color(255, 255, 255));
        btnagregar.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnagregar.setForeground(new java.awt.Color(255, 255, 255));
        btnagregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agcarrito.jpg"))); // NOI18N
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel9.setText("Stock");

        txtstock.setEditable(false);
        txtstock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtstockActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel10.setText("Empleado");

        txtem.setEditable(false);

        cancelardetalle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/candetalle.jpg"))); // NOI18N
        cancelardetalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelardetalleActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/reporte.jpg"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel9))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2)
                                    .addComponent(cancelardetalle, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(txtccliente, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnbc, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtem, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtncliente, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(23, 23, 23)
                                        .addComponent(btnagregar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtcproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnbp, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtnproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtprecio, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(scant, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtstock, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtccliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)))
                            .addComponent(btnbc))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtncliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtprecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtstock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(scant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnagregar)
                                    .addComponent(cancelardetalle)
                                    .addComponent(jButton1))))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnbp)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(txtcproducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(9, 9, 9)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtnproducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanel4.setBackground(java.awt.Color.lightGray);

        tablaventa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nro Venta", "COD PRODUCTO", "PRODUCTO", "CANTIDAD", "PRECIO", "TOTAL"
            }
        ));
        jScrollPane1.setViewportView(tablaventa);

        btngenerar.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btngenerar.setText("GENERAR VENTA");
        btngenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngenerarActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel11.setText("PAGO TOTAL");

        txttotal.setEditable(false);

        btncancelar.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btncancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cancelar.jpg"))); // NOI18N
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });

        btnreporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/reporte.jpg"))); // NOI18N
        btnreporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreporteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 791, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(btncancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btnreporte, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btngenerar)
                        .addGap(105, 105, 105)
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btngenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11)
                                .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btncancelar, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(btnreporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel5.setBackground(java.awt.Color.lightGray);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel8.setText("N° Venta");

        txtnventa.setEditable(false);

        txtfecha.setEditable(false);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logovet.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(jLabel12))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(txtnventa, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(43, 43, 43)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtnventa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel12))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
    
    private void btnbcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbcActionPerformed
        buscarcliente();
    }//GEN-LAST:event_btnbcActionPerformed

    private void btnbpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbpActionPerformed
        buscarproducto();        
    }//GEN-LAST:event_btnbpActionPerformed

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
        agregarproducto();        
    }//GEN-LAST:event_btnagregarActionPerformed

    private void btngenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngenerarActionPerformed
        if(txttotal.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Ingrese datos para la venta");
        }else{
            guardarventa();
            guardardetalle();
            actualizarstock();
            JOptionPane.showMessageDialog(this, "La venta se realizó con exito");
            nuevo();
            generarnventa();
        }
    }//GEN-LAST:event_btngenerarActionPerformed

    private void txtprecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtprecioActionPerformed

    private void txtstockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtstockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtstockActionPerformed

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        nuevo();
    }//GEN-LAST:event_btncancelarActionPerformed

    private void btnreporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreporteActionPerformed
        Document documento=new Document(PageSize.A4.rotate());
        try {
            String ruta= System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream(ruta+ "/Desktop/Reporte Ventas.pdf"));
            documento.open();
            documento.addTitle("Ventas Ingresadas al sistema");
            documento.add(new Paragraph("                                                                                           Reporte de Ventas"));
            documento.add(new Paragraph("                     "));
            documento.add(new Paragraph("Fecha: "+fechaactual()));
            documento.add(new Paragraph("                     "));
            documento.add(new Paragraph("Empleado: "+user));
            documento.add(new Paragraph("                     "));
            PdfPTable tabla=new PdfPTable(7);
            tabla.addCell("ID_Venta");
            tabla.addCell("ID_Cliente");
            tabla.addCell("ID_Empleado");
            tabla.addCell("N° Venta");
            tabla.addCell("Fecha");
            tabla.addCell("Total");
            tabla.addCell("Estado");
            try {
                Connection con= DriverManager.getConnection("jdbc:mysql://localhost/sistema_ci","root", "");
                PreparedStatement ps=con.prepareStatement("select * from ventas");
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
    }//GEN-LAST:event_btnreporteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Document documento=new Document(PageSize.A4.rotate());
        try {
            String ruta= System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream(ruta+ "/Desktop/Reporte Detalle_venta.pdf"));
            documento.open();
            documento.addTitle("Venta Ingresada al sistema");
            documento.add(new Paragraph("                                                                                             Reporte de la Venta"));
            documento.add(new Paragraph("                     "));
            documento.add(new Paragraph("Fecha: "+fechaactual()));
            documento.add(new Paragraph("                     "));
            documento.add(new Paragraph("DNI del cliente: "+cl.getDni()));
            documento.add(new Paragraph("                     "));
            documento.add(new Paragraph("Empleado: "+user));
            documento.add(new Paragraph("                     "));
            PdfPTable tabla=new PdfPTable(6);
            tabla.addCell("Item");
            tabla.addCell("ID_Producto");
            tabla.addCell("Nombre_Producto");
            tabla.addCell("Cantidad");
            tabla.addCell("Precio");
            tabla.addCell("Total");
            
        double total;
        item=0;
        item=item+1;
        idpro=prod.getId();
        String nom=txtnproducto.getText();
        pre=Double.parseDouble(txtprecio.getText());
        cant=Integer.parseInt(scant.getValue().toString());
        int stock=Integer.parseInt(txtstock.getText());
        total=cant*pre;
        ArrayList lista=new ArrayList();
        if(stock>0){
            lista.add(item);
            lista.add(idpro);
            lista.add(nom);
            lista.add(cant);
            lista.add(pre);
            lista.add(total);
            
            tabla.addCell(""+item);
            tabla.addCell(""+idpro);
            tabla.addCell(nom);
            tabla.addCell(""+cant);
            tabla.addCell(""+pre);
            tabla.addCell(""+total);                     
            documento.add(tabla);
         }   
           /* try {
                Connection con= DriverManager.getConnection("jdbc:mysql://localhost/sistema_ci","root", "");
                PreparedStatement ps=con.prepareStatement("select * from detalle");
                ResultSet rs=ps.executeQuery();
                if(rs.next()){
                    do{
                        tabla.addCell(rs.getString(1));
                        tabla.addCell(rs.getString(2));
                        tabla.addCell(rs.getString(3));
                        tabla.addCell(rs.getString(4));
                        tabla.addCell(rs.getString(5));
                    }while(rs.next());
                    documento.add(tabla);
                }
            } catch (DocumentException | SQLException e) {
            }*/
            documento.add(new Paragraph("                     "));
            documento.add(new Paragraph("Total a Pagar: "+pagototal));
            documento.add(new Paragraph("                     "));
            documento.close();
            JOptionPane.showMessageDialog(null, "Reporte generado");
        } catch (DocumentException | HeadlessException | FileNotFoundException e) {
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cancelardetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelardetalleActionPerformed
        limpiartabla();
        txtcproducto.setText("");
        txtnproducto.setText("");
        txtprecio.setText("");
        txtstock.setText("");
        scant.setValue(1);
        txttotal.setText("");
        txtcproducto.requestFocus();
    }//GEN-LAST:event_cancelardetalleActionPerformed
    void buscarcliente(){
        int r;
        String cod=txtccliente.getText();
        if(txtccliente.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Ingrese el dni del cliente");
        }else{
            cl=clidao.listarid(cod);
            if(cl.getDni() !=null){
                txtncliente.setText(cl.getNombre());
                txtccliente.requestFocus();
            }else{
                r=JOptionPane.showConfirmDialog(this, "Cliente no registrado, registrar cliente?");
                if(r==0){
                    clienteform cf=new clienteform();
                    cf.setVisible(true);
                }
            }
        }
    }
    public int Real(String cadena){
        try{
            return Integer.parseInt(cadena);
        }catch(Exception ex){
            return 0;
        }
    }
    void buscarproducto(){  
        int r;
        int id=Real(txtcproducto.getText().trim());
        if(txtcproducto.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Ingrese el codigo del producto");
        }else{
            prod=prodao.listarid(id);
            if(prod.getId()!=0){
                txtnproducto.setText(prod.getNombre());
                txtprecio.setText(""+prod.getPrecio());
                txtstock.setText(""+prod.getStock());
            }else{
                r=JOptionPane.showConfirmDialog(this, "Producto no registrado, ver tabla de lista?");
                if(r==0){
                    stockpro st=new stockpro();
                    st.setVisible(true);  
                }
                txtcproducto.requestFocus();               
            }
        }
    }
    void agregarproducto(){
        double total;
        item=0;
        modelo=(DefaultTableModel)tablaventa.getModel();
        item=item+1;
        idpro=prod.getId();
        String nom=txtnproducto.getText();
        pre=Double.parseDouble(txtprecio.getText());
        cant=Integer.parseInt(scant.getValue().toString());
        int stock=Integer.parseInt(txtstock.getText());
        total=cant*pre;
        ArrayList lista=new ArrayList();
        if(stock>0){
            lista.add(item);
            lista.add(idpro);
            lista.add(nom);
            lista.add(cant);
            lista.add(pre);
            lista.add(total);
            Object[] ob=new Object[6];
            ob[0]=lista.get(0);
            ob[1]=lista.get(1);
            ob[2]=lista.get(2);
            ob[3]=lista.get(3);
            ob[4]=lista.get(4);
            ob[5]=lista.get(5);
            modelo.addRow(ob);
            tablaventa.setModel(modelo);
            calculartotal();
        }else{
            JOptionPane.showMessageDialog(this, "Stock del producto vacio");
        }            
    }
    void calculartotal(){
        pagototal=0;
        for(int i=0;i<tablaventa.getRowCount();i++){
            cant=Integer.parseInt(tablaventa.getValueAt(i, 3).toString().trim());
            pre=Double.parseDouble(tablaventa.getValueAt(i, 4).toString().trim());
            pagototal=pagototal+(cant*pre);
        }
        txttotal.setText(""+pagototal);
    }
    void guardarventa(){
        int ide=1;
        int idc=cl.getId();
        String nventa=txtnventa.getText();
        String fecha=txtfecha.getText();
        double totalt=pagototal;
        String estado="1";
        
        sal.setIdcli(idc);
        sal.setIdem(ide);
        sal.setNventa(nventa);
        sal.setFecha(fecha);
        sal.setTotal(totalt);
        sal.setEstado(estado);
        saldao.guardarventa(sal);
    }
    void guardardetalle(){
        String ids=saldao.idventa();
        int idsa=Integer.parseInt(ids);
        for(int i=0;i<tablaventa.getRowCount();i++){
            int idpro=Integer.parseInt(tablaventa.getValueAt(i, 1).toString());
            int cant=Integer.parseInt(tablaventa.getValueAt(i, 3).toString());
            double pre=Double.parseDouble(tablaventa.getValueAt(i, 4).toString());
            ds.setIdventa(idsa);
            ds.setIdpro(idpro);
            ds.setCantidad(cant);
            ds.setPreven(pre);
            saldao.guardardetalle(ds);
        }
    }
    void actualizarstock(){
        for(int i=0;i<modelo.getRowCount();i++){
            producto pr=new producto();
            idpro=Integer.parseInt(tablaventa.getValueAt(i, 1).toString());
            cant=Integer.parseInt(tablaventa.getValueAt(i, 3).toString());
            pr=prodao.listarid(idpro);
            int sa=pr.getStock()-cant;
            prodao.actualizarstock(sa, idpro);
        }
    }
    void limpiartabla(){
        for(int i=0;i<modelo.getRowCount();i++){
            modelo.removeRow(i);
            i=i-1;
        }
    }
    void nuevo(){
        limpiartabla();
        txtccliente.setText("");
        txtncliente.setText("");
        txtcproducto.setText("");
        txtnproducto.setText("");
        txtprecio.setText("");
        txtstock.setText("");
        scant.setValue(1);
        txttotal.setText("");
        txtccliente.requestFocus();
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
            java.util.logging.Logger.getLogger(salidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(salidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(salidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(salidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new salidas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnagregar;
    private javax.swing.JButton btnbc;
    private javax.swing.JButton btnbp;
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btngenerar;
    private javax.swing.JButton btnreporte;
    private javax.swing.JButton cancelardetalle;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner scant;
    private javax.swing.JTable tablaventa;
    private javax.swing.JTextField txtccliente;
    private javax.swing.JTextField txtcproducto;
    private javax.swing.JTextField txtem;
    private javax.swing.JTextField txtfecha;
    private javax.swing.JTextField txtncliente;
    private javax.swing.JTextField txtnproducto;
    private javax.swing.JTextField txtnventa;
    private javax.swing.JTextField txtprecio;
    private javax.swing.JTextField txtstock;
    private javax.swing.JTextField txttotal;
    // End of variables declaration//GEN-END:variables
}


