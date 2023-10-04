package hospital;

class Atendimento {
	private Paciente paciente;
    private Medico medico;
    private String dataHoraInicio;
    private String dataHoraFim;

    public Atendimento(Paciente paciente, Medico medico, String dataHoraInicio, String dataHoraFim) {
        this.paciente = paciente;
        this.medico = medico;
        this.dataHoraInicio = dataHoraInicio;
        this.dataHoraFim = dataHoraFim;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public String getDataHoraInicio() {
        return dataHoraInicio;
    }

    public String getDataHoraFim() {
        return dataHoraFim;
    }
}