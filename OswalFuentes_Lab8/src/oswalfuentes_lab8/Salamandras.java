package oswalfuentes_lab8;

import javax.swing.JOptionPane;

public class Salamandras extends Hadas {

    private int cant_alas;

    public Salamandras() {
    }

    public Salamandras(int cant_alas, String nombre, int altura, int edad, int poder, float salud) {
        super(nombre, altura, edad, poder, salud);
        this.cant_alas = cant_alas;
    }

    public int getCant_alas() {
        return cant_alas;
    }

    public void setCant_alas(int cant_alas) {
        if (cant_alas >= 16) {
            this.cant_alas = cant_alas;
        } else {
            JOptionPane.showMessageDialog(null, "La cantidad de alas debe ser mayor o igual a 16");
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
