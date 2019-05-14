public class Usuario {
    private int ID;
    private String nombre;
    private String contrasena;

    public Usuario(int ID, String nombre, String contrasena) {
        this.ID = ID;
        this.nombre = nombre;
        this.contrasena = contrasena;
    }


    public Usuario() {
        this.ID = 0;
        this.nombre = "";
        this.contrasena = "";
    }
}
