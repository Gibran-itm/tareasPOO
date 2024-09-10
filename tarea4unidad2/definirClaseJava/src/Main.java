public class Main {
    public static void main(String[] args) {

        Coche carro1 = new Coche("Tesla", "Model S", 2012);
        Coche carro2 = new Coche("Ferrari", "SF90 Stradale", 2019);
        Coche carro3 = new Coche("BMW", "Serie 1", 2019);

        carro1.mostrarInformacion();
        carro2.mostrarInformacion();
        carro3.mostrarInformacion();

        System.out.println( carro1.calcularEdadDelCoche(2024) );
        System.out.println( carro2.calcularEdadDelCoche(2024) );
        System.out.println( carro3.calcularEdadDelCoche(2024) );

    }
}