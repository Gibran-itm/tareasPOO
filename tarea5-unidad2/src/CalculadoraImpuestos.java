public class CalculadoraImpuestos {

    // Ingresos
    public static int calcularImpuestos (int ingresos) {
        return ingresos;
    }
    // Ventas y porcentajeImpuesto
    public static double calcularImpuestos (int ventas, double porcentajeImpuesto) {
        return ventas * (porcentajeImpuesto / 100);
    }
    // Ventas y porcentajeImpuesto
    public static double calcularImpuestos (double dividendos, double porcentajeImpuesto, double exencion) {
        double impuestos = dividendos * (porcentajeImpuesto / 100);
        if (impuestos > exencion) {
            return impuestos;
        } else {
            return 0;
        }


    }


}
