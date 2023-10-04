package hospital;

class Medico extends Pessoa {
	private String especialidade;

    public Medico(String nome, String dataNascimento, String especialidade) {
        super(nome, dataNascimento);
        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}