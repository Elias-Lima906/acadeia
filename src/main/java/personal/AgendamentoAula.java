package personal;

import aluno.Aluno;

import java.time.LocalDate;

public class AgendamentoAula {
    private final int horario;
    private final PersonalTrainer personalTrainer;
    private final Aula aula;
    private final Aluno aluno;

    public AgendamentoAula(int horario, PersonalTrainer personalTrainer, Aula aula, Aluno aluno) {
        this.horario = horario;
        this.personalTrainer = personalTrainer;
        this.aula = aula;
        this.aluno = aluno;
    }

    public int getHorario() {
        return horario;
    }

    public Aula getAula() {
        return aula;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public PersonalTrainer getPersonalTrainer() {
        return personalTrainer;
    }

    @Override
    public String toString() {
        return "Agendamento: " + "\n"
                + "data: " + LocalDate.now() + "\n"
                + "Horário: " + horario + " Horas \n"
                + "aula: " + aula + "\n"
                + "nome do aluno: " + aluno.getNome() + "\n"
                + "nome do instrutor: " + personalTrainer.getNome();
    }
}
