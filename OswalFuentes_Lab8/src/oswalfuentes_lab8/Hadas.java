package oswalfuentes_lab8;

import java.io.Serializable;
import javax.swing.JOptionPane;

public class Hadas implements Serializable {
    
    private static final long SerialVersionUID = 777L;

    protected String nombre;
    protected int altura, edad, poder;
    protected float salud;

    public Hadas() {
    }

    public Hadas(String nombre, int altura, int edad, int poder, float salud) {
        this.nombre = nombre;
        this.altura = altura;
        this.edad = edad;
        this.poder = poder;
        this.salud = salud;
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
        if (altura <= 15) {
            this.altura = altura;
        } else {
            JOptionPane.showMessageDialog(null, "La altura debe de ser menor o igual a 15");
        }
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
