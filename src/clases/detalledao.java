package clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class detalledao {
    PreparedStatement ps;
    ResultSet rs;
    
    conexion cn=new conexion();
    Connection con;
    
    public List listar() {
        List<detallesalida> lista=new ArrayList<>();
        String sql="select * from detalle";
        try {
            con=cn.conecta();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                detallesalida dets=new detallesalida();
                dets.setId(rs.getInt(1));
                dets.setIdventa(rs.getInt(2));
                dets.setIdpro(rs.getInt(3));
                dets.setCantidad(rs.getInt(4));
                dets.setPreven(rs.getDouble(5));
                lista.add(dets);
            }
        } catch (Exception e) {
        }
        return lista;
    }
}
