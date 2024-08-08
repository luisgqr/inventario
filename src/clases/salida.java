package clases;
public class salida {
    int idventa;
    int idcli;
    int idem;
    String nventa;
    String fecha;
    double total;
    String estado;

    public salida() {
    }

    public salida(int idventa, int idcli, int idem, String nventa, String fecha, double total, String estado) {
        this.idventa = idventa;
        this.idcli = idcli;
        this.idem = idem;
        this.nventa = nventa;
        this.fecha = fecha;
        this.total = total;
        this.estado = estado;
    }

    public int getIdventa() {
        return idventa;
    }

    public void setIdventa(int idventa) {
        this.idventa = idventa;
    }

    public int getIdcli() {
        return idcli;
    }

    public void setIdcli(int idcli) {
        this.idcli = idcli;
    }

    public int getIdem() {
        return idem;
    }

    public void setIdem(int idem) {
        this.idem = idem;
    }

    public String getNventa() {
        return nventa;
    }

    public void setNventa(String nventa) {
        this.nventa = nventa;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
