package clases;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class provedao implements CRUD{
    
    PreparedStatement ps;
    ResultSet rs;
    
    conexion cn=new conexion();
    Connection con;
    
    @Override
    public List listar() {
        List<proveedor> lista=new ArrayList<>();
        String sql="select * from proveedor";
        try {
            con=cn.conecta();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                proveedor pro=new proveedor();
                pro.setId(rs.getInt(1));
                pro.setNom(rs.getString(2));
                pro.setDirec(rs.getString(3));
                pro.setTelef(rs.getString(4));
                pro.setCorreo(rs.getString(5));
                lista.add(pro);
            }
        } catch (Exception e) {
        }
        return lista;
    }

    @Override
    public int add(Object[] o) {
        int r=0;
        String sql="insert into proveedor(nombre,direccion,telefono,correo)values(?,?,?,?)";
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
    public int actualizar(Object[] o) {
        int r=0;
        String sql="update proveedor set nombre=?,direccion=?,telefono=?,correo=? where id_prov=?";
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
    public void eliminar(int id) {
        String sql="delete from proveedor where id_prov=?";
        try {
            con=cn.conecta();
            ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
}
