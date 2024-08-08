package clases;

import clases.emplea2;
import clases.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class empdao implements CRUD{
    PreparedStatement ps;
    ResultSet rs;
    
    conexion cn=new conexion();
    Connection con;
    
    @Override
    public List listar() {
        List<emplea2> lista=new ArrayList<>();
        String sql="select * from empleados";
        try {
            con=cn.conecta();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                emplea2 em=new emplea2();
                em.setId(rs.getInt(1));
                em.setDni(rs.getString(2));
                em.setNombre(rs.getString(3));
                em.setTelef(rs.getString(4));
                em.setTipo(rs.getString(5));
                em.setUser(rs.getString(6));
                //em.setTsesion(rs.getString(7));
                lista.add(em);
            }
        } catch (Exception e) {
        }
        return lista;
    }

    @Override
    public int add(Object[] o) {
        int r=0;
        String sql="insert into empleados(dni,nombre,telefono,tipo,user)values(?,?,?,?,?)";
        try {
            con=cn.conecta();
            ps=con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            r=ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }

    @Override
    public int actualizar(Object[] o) {
        int r=0;
        String sql="update empleados set dni=?,nombre=?,telefono=?,tipo=?,user=? where id_emp=?";
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
    public void eliminar(int id) {
        String sql="delete from empleados where id_emp=?";
        try {
            con=cn.conecta();
            ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
}
