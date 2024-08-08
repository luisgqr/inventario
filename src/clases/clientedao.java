package clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class clientedao implements CRUD{
    PreparedStatement ps;
    ResultSet rs;
    
    conexion cn=new conexion();
    Connection con;

    public cliente listarid(String dni){
        cliente cli=new cliente();
        String sql="select * from cliente where dni=?";
        try {
            con=cn.conecta();
            ps=con.prepareStatement(sql);
            ps.setString(1, dni);
            rs=ps.executeQuery();
            while(rs.next()){
                cli.setId(rs.getInt(1));
                cli.setDni(rs.getString(2));
                cli.setNombre(rs.getString(3));
                cli.setDireccion(rs.getString(4));
            }
        } catch (Exception e) {
        }
        return cli;
    }
    
    @Override
    public List listar() {
        List<cliente> lista=new ArrayList<>();
        String sql="select * from cliente";
        try {
            con=cn.conecta();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                cliente cli=new cliente();
                cli.setId(rs.getInt(1));
                cli.setDni(rs.getString(2));
                cli.setNombre(rs.getString(3));
                cli.setDireccion(rs.getString(4));
                lista.add(cli);
            }
        } catch (Exception e) {
        }
        return lista;
    }

    @Override
    public int add(Object[] o) {
        int r=0;
        String sql="insert into cliente(dni,nombre,direccion)values(?,?,?)";
        try {
            con=cn.conecta();
            ps=con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            r=ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }

    @Override
    public int actualizar(Object[] o) {
        int r=0;
        String sql="update cliente set dni=?,nombre=?,direccion=? where id_cli=?";
        try {
            con=cn.conecta();
            ps=con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            r=ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }

    @Override
    public void eliminar(int id) {
        String sql="delete from cliente where id_cli=?";
        try {
            con=cn.conecta();
            ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
}
