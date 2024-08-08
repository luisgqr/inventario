package clases;
public class proveedor {
    int id;
    String nom;
    String direc;
    String telef;
    String correo;

    public proveedor() {
    }

    public proveedor(int id, String nom, String direc, String telef, String correo) {
        this.id = id;
        this.nom = nom;
        this.direc = direc;
        this.telef = telef;
        this.correo = correo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDirec() {
        return direc;
    }

    public void setDirec(String direc) {
        this.direc = direc;
    }

    public String getTelef() {
        return telef;
    }

    public void setTelef(String telef) {
        this.telef = telef;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    
}
