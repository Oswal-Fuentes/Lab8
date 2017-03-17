package oswalfuentes_lab8;

public class Hamadriades extends Hadas {

    private int arbol;

    public Hamadriades() {
    }

    public Hamadriades(int arbol, String nombre, int altura, int edad, int poder, float salud) {
        super(nombre, altura, edad, poder, salud);
        this.arbol = arbol;
    }

    public int getArbol() {
        return arbol;
    }

    public void setArbol(int arbol) {
        this.arbol = arbol;
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
