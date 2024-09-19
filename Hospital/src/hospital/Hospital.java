package hospital;

import consultas.Consulta;
import consultorios.Consultorio;
import medicos.Medico;
import pacientes.Paciente;

import java.util.ArrayList;

public class Hospital {
    // Atributos (listas)
    public ArrayList<Paciente> listaPacientes = new ArrayList<>();
    public ArrayList<Medico> listaMedicos = new ArrayList<>();
    public ArrayList<Consulta> listaConsultas = new ArrayList<>();
    public ArrayList<Consultorio> listaConsultorios = new ArrayList<>();

    // Metodos registrar
    public void registrarPaciente(Paciente paciente) {
        this.listaPacientes.add(paciente);
    }
    public void registrarMedico(Paciente paciente) {
        this.listaPacientes.add(paciente);
    }
    public void registrarConsultorio(Paciente paciente) {
        this.listaPacientes.add(paciente);
    }
    public void registrarConsulta(Paciente paciente) {
        Consulta consulta = new Consulta(1, "2024-08-10", Pac1, Med1, Cons1);
        this.listaPacientes.add(paciente);
    }

    // Metodos validar consulta
    public boolean validarDisponibilidadFechaConsulta(int idPaciente, String fechaDeseada, int numeroConsultorio) {
        for (Consulta consulta : this.listaConsultas) {
            // No exista una consulta en la fecha y consultorio deseado
            if (!consulta.getFechaHora().equals(fechaDeseada) && numeroConsultorio == consulta.getConsultorio().numeroConsultorio) {
                System.out.println("Ya existe una consulta registrada");
                return false;
            }
        }
        return true;
    }




}
