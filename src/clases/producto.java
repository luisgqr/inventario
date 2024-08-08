package clases;
public class producto {
    int id;
    String nombre;
    Double precio;
    int stock;
    String cat;
    String prov;
    String alm;

    public producto() {
    }

    public producto(int id, String nombre, Double precio, int stock, String cat, String prov, String alm) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.cat = cat;
        this.prov = prov;
        this.alm = alm;
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }

    public String getProv() {
        return prov;
    }

    public void setProv(String prov) {
        this.prov = prov;
    }

    public String getAlm() {
        return alm;
    }

    public void setAlm(String alm) {
        this.alm = alm;
    }
    
    
}
