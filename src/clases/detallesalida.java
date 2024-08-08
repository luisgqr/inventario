package clases;
public class detallesalida {
    int id;
    int idventa;
    int idpro;
    int cantidad;
    double preven;

    public detallesalida() {
    }

    public detallesalida(int id, int idventa, int idpro, int cantidad, double preven) {
        this.id = id;
        this.idventa = idventa;
        this.idpro = idpro;
        this.cantidad = cantidad;
        this.preven = preven;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdventa() {
        return idventa;
    }

    public void setIdventa(int idventa) {
        this.idventa = idventa;
    }

    public int getIdpro() {
        return idpro;
    }

    public void setIdpro(int idpro) {
        this.idpro = idpro;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPreven() {
        return preven;
    }

    public void setPreven(double preven) {
        this.preven = preven;
    }
    
}
