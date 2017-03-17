package oswalfuentes_lab8;

import javax.swing.JOptionPane;

public class Lamias extends Hadas {

    private int logitud_aleta, numero_branquias;

    public Lamias() {
    }

    public Lamias(int logitud_aleta, int numero_branquias, String nombre, int altura, int edad, int poder, float salud) {
        super(nombre, altura, edad, poder, salud);
        this.logitud_aleta = logitud_aleta;
        this.numero_branquias = numero_branquias;
    }

    public int getLogitud_aleta() {
        return logitud_aleta;
    }

    public void setLogitud_aleta(int logitud_aleta) {
        if (logitud_aleta <= 5) {
            this.logitud_aleta = logitud_aleta;
        } else {
            JOptionPane.showMessageDialog(null, "La longitud de la aleta debe ser menor o igual a 5");
        }
    }

    public int getNumero_branquias() {
        return numero_branquias;
    }

    public void setNumero_branquias(int numero_branquias) {
        if (numero_branquias <= 8) {
            this.numero_branquias = numero_branquias;
        } else {
            JOptionPane.showMessageDialog(null, "El numero de branquias debe ser menor o igual a 8");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public float getSalud() {
        return salud;
    }

    public void setSalud(float salud) {
        this.salud = salud;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
