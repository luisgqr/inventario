package clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class salidadao {
    PreparedStatement ps;
    ResultSet rs;
    
    conexion cn=new conexion();
    Connection con;
    int r=0;
    
    public String nsalida(){
        String nsa="";
        String sql="select max(nventa) from ventas";
        try {
            con=cn.conecta();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                nsa=rs.getString(1);
            }
        } catch (Exception e) {
        }
        return nsa;
    }
    
    public String idventa(){
        String idv="";
        String sql="select max(id_venta) from ventas";
        try {
            con=cn.conecta();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                idv=rs.getString(1);
            }
        } catch (Exception e) {
        }
        return idv;
    }
    public int guardarventa(salida v){
        salida sa=new salida();
        String sql="insert into ventas(id_cli,id_emp,nventa,fecha,total,estado)values(?,?,?,?,?,?)";
        try {
            con=cn.conecta();
            ps=con.prepareStatement(sql);
            ps.setInt(1, v.getIdcli());
            ps.setInt(2, v.getIdem());
            ps.setString(3, v.getNventa());
            ps.setString(4, v.getFecha());
            ps.setDouble(5, v.getTotal());
            ps.setString(6, v.getEstado()); 
            r=ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar");
        }
        return r;
    }
    public int guardardetalle(detallesalida ds){
        String sql="insert into detalle(id_venta,id_pro,cantidad,preciov)values(?,?,?,?)";
        try {
            con=cn.conecta();
            ps=con.prepareStatement(sql);
            ps.setInt(1, ds.getIdventa());
            ps.setInt(2, ds.getIdpro());
            ps.setInt(3, ds.getCantidad());
            ps.setDouble(4, ds.getPreven());
            r=ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }
}
