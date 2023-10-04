package hospital;

class Paciente extends Pessoa {
	private int prioridade;
    private boolean perigoVida;
    private boolean sangramento;
    private boolean batimentoCardiacoAnormal;
    private boolean consciente;
    private boolean fraturaExposta;
    private boolean pediuAtestado;

    public Paciente(String nome, String dataNascimento) {
        super(nome, dataNascimento);
    }

    public int calcularPrioridade() {
        int pontos = 0;
        if (perigoVida) pontos++;
        if (sangramento) pontos++;
        if (batimentoCardiacoAnormal) pontos++;
        if (consciente) pontos++;
        if (fraturaExposta) pontos++;
        return pontos;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    public boolean isPerigoVida() {
        return perigoVida;
    }

    public void setPerigoVida(boolean perigoVida) {
        this.perigoVida = perigoVida;
    }

    public boolean isSangramento() {
        return sangramento;
    }

    public void setSangramento(boolean sangramento) {
        this.sangramento = sangramento;
    }

    public boolean isBatimentoCardiacoAnormal() {
        return batimentoCardiacoAnormal;
    }

    public void setBatimentoCardiacoAnormal(boolean batimentoCardiacoAnormal) {
        this.batimentoCardiacoAnormal = batimentoCardiacoAnormal;
    }

    public boolean isConsciente() {
        return consciente;
    }

    public void setConsciente(boolean consciente) {
        this.consciente = consciente;
    }

    public boolean isFraturaExposta() {
        return fraturaExposta;
    }

    public void setFraturaExposta(boolean fraturaExposta) {
        this.fraturaExposta = fraturaExposta;
    }

    public boolean isPediuAtestado() {
        return pediuAtestado;
    }

    public void setPediuAtestado(boolean pediuAtestado) {
        this.pediuAtestado = pediuAtestado;
    }
}