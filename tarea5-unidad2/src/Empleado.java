public class Empleado {

    // Solo salario
    public static double calcularSalario(double salario) {
        return salario;
    }

    // Sueldo y bonificacion
    public static double calcularSalario(double salario, double bonificacion) {
        return salario + bonificacion;
    }
    // Sueldo, bonificacion y horas extra
    public static double calcularSalario(double salario, double bonificacion, double horasExtra) {
        return salario + bonificacion + (horasExtra*20);
    }


}
