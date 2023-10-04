package hospital;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Main {
	public static void main(String[] args) {
        Medico medico1 = new Medico("Roberto", "01/01/1970", "Cardiologia");
        Medico medico2 = new Medico("Mauro", "15/03/1985", "Ortopedia");

        Paciente paciente1 = new Paciente("Rafael", "15/02/2002");
        paciente1.setPerigoVida(true);
        paciente1.setSangramento(true);
        paciente1.setBatimentoCardiacoAnormal(false);
        paciente1.setConsciente(true);
        paciente1.setFraturaExposta(false);
        paciente1.setPediuAtestado(true);
        paciente1.setPrioridade(paciente1.calcularPrioridade());

        Paciente paciente2 = new Paciente("Valdeci", "07/01/1970");
        paciente2.setPerigoVida(true);
        paciente2.setSangramento(true);
        paciente2.setBatimentoCardiacoAnormal(true);
        paciente2.setConsciente(true);
        paciente2.setFraturaExposta(true);
        paciente2.setPediuAtestado(true);
        paciente2.setPrioridade(paciente2.calcularPrioridade());

        List<Medico> listaMedicos = new ArrayList<>();
        listaMedicos.add(medico1);
        listaMedicos.add(medico2);

        Random random = new Random();
        for (Paciente paciente : List.of(paciente1, paciente2)) {
            int indexMedico = random.nextInt(listaMedicos.size());
            Medico medicoAtendimento = listaMedicos.get(indexMedico);
            Atendimento atendimento = new Atendimento(paciente, medicoAtendimento, "04/10/2023 10:00", "04/10/2023 11:30");
            System.out.println("Nome do Paciente: " + atendimento.getPaciente().getNome());
            System.out.println("Data de Nascimento: " + atendimento.getPaciente().getDataNascimento());
            System.out.println("Prioridade: " + atendimento.getPaciente().getPrioridade());
            System.out.println("Médico que Atendeu: " + atendimento.getMedico().getNome());
            System.out.println("Especialidade do Médico: " + atendimento.getMedico().getEspecialidade());
            System.out.println("Pediu Atestado: " + atendimento.getPaciente().isPediuAtestado());
            System.out.println("Data e Hora de Início: " + atendimento.getDataHoraInicio());
            System.out.println("Data e Hora de Fim: " + atendimento.getDataHoraFim());
            System.out.println();
        }
    }
}