
package agendapoo;

public class Contactos {
    private String nombre;
    private int num;
    
    //Constructor
    public Contactos(String nombre, int num) {
        this.nombre= nombre;
    }
    
    // Getter & Setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNum() {
        return (int) num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Contactos{" + "nombre=" + nombre + ", num=" + num + '}';
    }

    }
    

