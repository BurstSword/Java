package Armario;

public class Armario {
    private int puertas, cajones, vecesAbierta;
    private String color;
    private boolean pinturaEstaEnBuenEstado, puertaEstaAbierta, cajonEstaAbierto;


    public Armario() {
        this.puertas = 0;
        this.cajones = 0;
        this.color = "";
        this.pinturaEstaEnBuenEstado = true;
        this.puertaEstaAbierta = false;
        this.cajonEstaAbierto = false;
        this.vecesAbierta = 0;
    }

    public Armario(int puertas, int cajones, String color, boolean pinturaEstaEnBuenEstado, boolean puertaEstaAbierta, boolean cajonEstaAbierto, int vecesAbierta) {
        this.puertas = puertas;
        this.cajones = cajones;
        this.color = color;
        this.pinturaEstaEnBuenEstado = pinturaEstaEnBuenEstado;
        this.puertaEstaAbierta = puertaEstaAbierta;
        this.cajonEstaAbierto = cajonEstaAbierto;
        this.vecesAbierta = vecesAbierta;
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
        return pinturaEstaEnBuenEstado;
    }

    public void setPinturaEstaEstropeada(boolean pinturaEstaEstropeada) {
        this.pinturaEstaEnBuenEstado = pinturaEstaEstropeada;
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
            this.vecesAbierta++;
            if (this.vecesAbierta == 100) {
                this.pinturaEstaEnBuenEstado = true;
            }
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
        if (this.pinturaEstaEnBuenEstado) {
            seHaPintado = true;
            this.color = color;
            this.pinturaEstaEnBuenEstado = false;
            this.vecesAbierta = 0;
        } else {
            seHaPintado = false;

        }
        return seHaPintado;
    }

    @Override
    public String toString() {
        return "Este armario de color " + this.color + (this.pinturaEstaEnBuenEstado ? " " : " dañado ")
                + "tiene " + this.puertas + " puertas que están " + (this.puertaEstaAbierta ?
                "abiertas" : "cerradas") + " y " + this.cajones + " cajones que están " + (this.cajonEstaAbierto
                ? "abiertos" : "cerrados");
    }
}
