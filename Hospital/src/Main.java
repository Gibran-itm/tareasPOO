import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int opcionMenu = 0;

        while (opcionMenu != 13) {
            System.out.println("---Sistema Hospital---");
            System.out.println("1.Registrar Paciente\n2.Registrar Medico\n3.Registrar Consultorio");
            System.out.println("4.Eliminar Paciente\n5.Eliminar Medico\n6.Eliminar Consultorio");
            System.out.println("7.Registrar Consulta\n8.Eliminar Consulta");
            System.out.println("9.Mostrar Medicos\n10.Mostrar Consultorios\n11.Mostrar Pacientes\n12.Mostrar consultas");
            System.out.println("13.Cerrar Sistema");

            opcionMenu = input.nextInt();
            input.nextLine();

            switch (opcionMenu) {
                case 1:
                    System.out.println("Registrar Paciente");
                    // Lógica para registrar paciente
                    break;
                case 2:
                    System.out.println("Registrar Medico");
                    // Lógica para registrar medico
                    break;
                case 3:
                    System.out.println("Registrar Consultorio");
                    // Lógica para registrar consultorio
                    break;
                case 4:
                    System.out.println("Eliminar Paciente");
                    // Lógica para eliminar paciente
                    break;
                case 5:
                    System.out.println("Eliminar Medico");
                    // Lógica para eliminar medico
                    break;
                case 6:
                    System.out.println("Eliminar Consultorio");
                    // Lógica para eliminar consultorio
                    break;
                case 7:
                    System.out.println("Registrar Consulta");
                    // Lógica para registrar consulta
                    break;
                case 8:
                    System.out.println("Eliminar Consulta");
                    // Lógica para eliminar consulta
                    break;
                case 9:
                    System.out.println("Mostrar Medicos");
                    // Lógica para mostrar medicos
                    break;
                case 10:
                    System.out.println("Mostrar Consultorios");
                    // Lógica para mostrar consultorios
                    break;
                case 11:
                    System.out.println("Mostrar Pacientes");
                    // Lógica para mostrar pacientes
                    break;
                case 12:
                    System.out.println("Mostrar Consultas");
                    // Lógica para mostrar consultas
                    break;
                case 13:
                    System.out.println("Cerrando sistema...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        }
    } // Fin main
}