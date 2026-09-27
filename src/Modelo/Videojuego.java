package Modelo;
public class Videojuego {

    private String titulo;
    private String genero;
    private double precio;

    // Constructor vacío
    public Videojuego() {
    }

    // Constructor con parámetros
    public Videojuego(String titulo, String genero, double precio) {
        this.titulo = titulo;
        this.genero = genero;
        this.precio = precio;
    }

    // Getter y Setter del título
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // Getter y Setter del género
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    // Getter y Setter del precio
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // Datos para la JTable
    public Object[] registrarDatos() {

        return new Object[]{
            titulo,
            genero,
            precio
        };
    }
}