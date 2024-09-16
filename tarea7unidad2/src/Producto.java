public class Producto {

    public String nombre;
    public int precio;
    public int stock;

    // Constructores
    public Producto(String nombre, int precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
    public Producto(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    // Setters
    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Metodos
    public void aumentarStock(int cantidad) {
        this.stock = cantidad;
    }
    public void disminuirStock(int cantidad) {
        this.stock = cantidad;
    }



} // Fin Producto
