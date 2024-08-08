package clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class productodao implements CRUD{
    PreparedStatement ps;
    ResultSet rs;
    
    conexion cn=new conexion();
    Connection con;
    int r;
    
    public int actualizarstock(int cant, int idpro){
        String sql="update producto set stock=? where id_prod=?";
        try {
            con=cn.conecta();
            ps=con.prepareStatement(sql);
            ps.setInt(1, cant);
            ps.setInt(2, idpro);
            ps.executeUpdate();
            while(rs.next()){
                
            }
        } catch (Exception e) {
        }
        return r;
    }
    
    public producto listarid(int id){
        producto pro=new producto();
        String sql="select * from producto where id_prod=?";
        try {
            con=cn.conecta();
            ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            rs=ps.executeQuery();
            while(rs.next()){
                pro.setId(rs.getInt(1));
                pro.setNombre(rs.getString(2));
                pro.setPrecio(rs.getDouble(3));
                pro.setStock(rs.getInt(4));
            }
        } catch (Exception e) {
        }
        return pro;
    }
    
    @Override
    public List listar() {
        List<producto> lista=new ArrayList<>();
        String sql="select * from producto";
        try {
            con=cn.conecta();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                producto pro=new producto();
                pro.setId(rs.getInt(1));
                pro.setNombre(rs.getString(2));
                pro.setPrecio(rs.getDouble(3));
                pro.setStock(rs.getInt(4));
                pro.setCat(rs.getString(5));
                pro.setProv(rs.getString(6));
                pro.setAlm(rs.getString(7));
                lista.add(pro);
            }
        } catch (Exception e) {
        }
        return lista;
    }

    @Override
    public int add(Object[] o) {
        int r=0;
        String sql="insert into producto(nombre,precio,stock,categoria,proveedor,almacen)values(?,?,?,?,?,?)";
        try {
            con=cn.conecta();
            ps=con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            ps.setObject(6, o[5]);
            r=ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }

    @Override
    public int actualizar(Object[] o) {
        int r=0;
        String sql="update producto set nombre=?,precio=?,stock=?,categoria=?,proveedor=?,almacen=? where id_prod=?";
        try {
            con=cn.conecta();
            ps=con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            ps.setObject(6, o[5]);
            ps.setObject(7, o[6]);
            r=ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }

    @Override
    public void eliminar(int id) {
        String sql="delete from producto where id_prod=?";
        try {
            con=cn.conecta();
            ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
}
