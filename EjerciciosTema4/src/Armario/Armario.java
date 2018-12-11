package Armario;

public class Armario {
    private int puertas, cajones;
    private String color;
    private boolean pinturaEstaEstropeada, puertaEstaAbierta, cajonEstaAbierto;


    public Armario() {
        this.puertas = 0;
        this.cajones = 0;
        this.color = "";
        this.pinturaEstaEstropeada = false;
        this.puertaEstaAbierta = false;
        this.cajonEstaAbierto = false;
    }

    public Armario(int puertas, int cajones, String color, boolean pinturaEstaEstropeada, boolean puertaEstaAbierta, boolean cajonEstaAbierto) {
        this.puertas = puertas;
        this.cajones = cajones;
        this.color = color;
        this.pinturaEstaEstropeada = pinturaEstaEstropeada;
        this.puertaEstaAbierta = puertaEstaAbierta;
        this.cajonEstaAbierto = cajonEstaAbierto;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public int getCajones() {
        return cajones;
    }

    public void setCajones(int cajones) {
        this.cajones = cajones;
    }

    public String getColor() {
        return color;
    }

    public boolean isPinturaEstaEstropeada() {
        return pinturaEstaEstropeada;
    }

    public void setPinturaEstaEstropeada(boolean pinturaEstaEstropeada) {
        this.pinturaEstaEstropeada = pinturaEstaEstropeada;
    }

    public boolean isPuertaEstaAbierta() {
        return puertaEstaAbierta;
    }

    public void setPuertaEstaAbierta(boolean puertaEstaAbierta) {
        this.puertaEstaAbierta = puertaEstaAbierta;
    }

    public boolean isCajonEstaAbierto() {
        return cajonEstaAbierto;
    }

    public void setCajonEstaAbierto(boolean cajonEstaAbierto) {
        this.cajonEstaAbierto = cajonEstaAbierto;
    }

    public boolean abrirPuerta() {
        boolean seHaAbierto;
        if (this.puertaEstaAbierta) {
            seHaAbierto = false;
        } else {
            seHaAbierto = true;
            this.puertaEstaAbierta = true;
        }
        return seHaAbierto;
    }

    public boolean cerrarPuerta() {
        boolean seHaCerrado;
        if (!this.puertaEstaAbierta) {
            seHaCerrado = false;
        } else {
            seHaCerrado = true;
            this.puertaEstaAbierta = false;
        }
        return seHaCerrado;
    }

    public boolean abrirCajon() {
        boolean seHaAbierto;
        if (this.cajonEstaAbierto) {
            seHaAbierto = false;
        } else {
            seHaAbierto = true;
            this.cajonEstaAbierto = true;
        }
        return seHaAbierto;
    }

    public boolean cerrarCajon() {
        boolean seHaCerrado;
        if (!this.cajonEstaAbierto) {
            seHaCerrado = false;
        } else {
            seHaCerrado = true;
            this.cajonEstaAbierto = false;
        }
        return seHaCerrado;
    }

    public boolean pintarArmario(String color) {
        boolean seHaPintado;
        if (this.pinturaEstaEstropeada) {
            seHaPintado = true;
            this.color = color;
            this.pinturaEstaEstropeada = false;
        } else {
            seHaPintado = false;

        }
        return seHaPintado;
    }

    @Override
    public String toString() {
        return "Este armario de color "+this.color+(this.pinturaEstaEstropeada ? " dañado ":" ")+"tiene "+this.puertas+" puertas que están "+(this.puertaEstaAbierta ? "abiertas":"cerradas")+ ", "+ this.cajones+" cajones que están "+(this.cajonEstaAbierto ? "abiertos":"cerrados");
    }
}