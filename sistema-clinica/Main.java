public class Main {
    public static void main(String[] args) {

        Clinica clinica = new Clinica("Saúde+", "Avenida Brasil");

        Medico medico1 = new Medico("Ana", "32131313", "Fisioterapia");
        Medico medico2 = new Medico("Andressa", "43242422", "Nutricionista");
        
        Paciente paciente1 = new Paciente("Daniele", "123.123.123-12");
        Paciente paciente2 = new Paciente("Rebeca", "213.213.213-21");

        clinica.agendarConsulta(medico1, paciente1, "01/02/2025");
        clinica.agendarConsulta(medico2, paciente2, "03/02/2025");

        clinica.listarConsultas();

        clinica.cancelarConsulta(paciente2, "03/02/2025");

        clinica.listarConsultas();

    }
}