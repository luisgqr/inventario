package clases;
public class emplea2 {
    int id;
    String dni;
    String nombre;
    String telef;
    String tipo;
    String user;
    String tsesion;

    public emplea2() {
    }

    public emplea2(int id, String dni, String nombre, String telef, String tipo, String user, String tsesion) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.telef = telef;
        this.tipo = tipo;
        this.user = user;
        this.tsesion = tsesion;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getTelef() {
        return telef;
    }
    public void setTelef(String telef) {
        this.telef = telef;
    }
    public String getTsesion() {
        return tsesion;
    }
    public void setTsesion(String tsesion) {
        this.tsesion = tsesion;
    }
    public String getUser() {
        return user;
    }
    public void setUser(String user) {
        this.user = user;
    }    
}
