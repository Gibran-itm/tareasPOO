public class Coche {

    String marca, modelo;
    int anio;

    // Constructor
    public Coche(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    // Metodo 1
    public void mostrarInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Anio: " + anio);
        System.out.println("////////////////");
    }

    // Metodo 2
    public int calcularEdadDelCoche(int anioActual) {
        return (anioActual - anio);
    }

}
