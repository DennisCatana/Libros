public class Libros {
    String nombre;
    String autor;
    int edicion;
    int fecha_P;
    int valor;

    //Setter y getters
    public String getNombre() {
        return getNombre();
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getEdicion() {
        return edicion;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    public int getFecha_P() {
        return fecha_P;
    }

    public void setFecha_P(int fecha_P) {
        this.fecha_P = fecha_P;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
public void imprimir(){

}
//Constructor
    public Libros(String nombre, String autor, int edicion, int fecha_P, int valor) {
        this.nombre = nombre;
        this.autor = autor;
        this.edicion = edicion;
        this.fecha_P = fecha_P;
        this.valor = valor;

    }

}








