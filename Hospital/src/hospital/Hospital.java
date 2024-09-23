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
    public ValidarHospital validador = new ValidarHospital();

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
        //Consulta consulta = new Consulta();
        this.listaPacientes.add(paciente);
    }

    //if ( validador.validarDisponibilidadMedico( Consulta.getFechaHora(), Consulta.getMedito().getId(), this.listaConsultas() ) ) {

    //}






}
