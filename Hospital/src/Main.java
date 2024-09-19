import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int opcionMenu = 0;

        while (opcionMenu != 9) {
            System.out.println("---Sistema Hospital---");
            System.out.println("1.Registrar Paciente\n2.Registrar Medico\n3.Registrar Consultorio");
            System.out.println("4.Eliminar Paciente\n5.Eliminar Medico\n6.Eliminar Consultorio");
            System.out.println("7.Registrar Consulta\n8.Eliminar Consulta");
            System.out.println("9.Cerrar Sistema");

            opcionMenu = input.nextInt();
            input.nextLine();

            switch (opcionMenu) {
                case 1:
                    System.out.println("Registrando Paciente...");
                    // Lógica para registrar un paciente
                    break;
                case 2:
                    System.out.println("Registrando Medico...");
                    // Lógica para registrar un medico
                    break;
                case 3:
                    System.out.println("Registrando Consultorio...");
                    // Lógica para registrar un consultorio
                    break;
                case 4:
                    System.out.println("Eliminando Paciente...");
                    // Lógica para eliminar un paciente
                    break;
                case 5:
                    System.out.println("Eliminando Medico...");
                    // Lógica para eliminar un medico
                    break;
                case 6:
                    System.out.println("Eliminando Consultorio...");
                    // Lógica para eliminar un consultorio
                    break;
                case 7:
                    System.out.println("Registrando Consulta...");
                    // Lógica para registrar una consulta
                    break;
                case 8:
                    System.out.println("Eliminando Consulta...");
                    // Lógica para eliminar una consulta
                    break;
                case 9:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        }
    } // Fin main
}