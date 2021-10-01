package personal;

import aluno.Aluno;
import expetion.BusinessException;

import java.util.ArrayList;
import java.util.List;

public class PersonalService {

    List<PersonalTrainer> personalTrainers = new ArrayList<>();

    public void popularPersonalTrainers() {
        personalTrainers.add(new PersonalTrainer(1L, "adriano", "84685463528"));
        personalTrainers.add(new PersonalTrainer(2L, "Mariana", "56456486486"));
        personalTrainers.add(new PersonalTrainer(3L, "Pedro", "12436578964"));
        personalTrainers.add(new PersonalTrainer(4L, "Liza", "98646751236"));
        personalTrainers.add(new PersonalTrainer(5L, "Roberto", "78946523917"));
        personalTrainers.add(new PersonalTrainer(6L, "João", "55436978452"));
        personalTrainers.add(new PersonalTrainer(7L, "Alice", "66467536452"));
        personalTrainers.add(new PersonalTrainer(8L, "Fernanda", "25243679856"));
        personalTrainers.add(new PersonalTrainer(9L, "Bianca", "46958534215"));
        personalTrainers.add(new PersonalTrainer(10L, "Fabio", "64312058964"));
    }

    public void listarPersonaisTrainers() {
        for (PersonalTrainer personalTrainer : personalTrainers) {
            System.out.println(personalTrainer);
        }
    }

    public PersonalTrainer buscarPorId(long id) throws BusinessException {

        if (id > personalTrainers.size()) {
            throw new BusinessException("Não existe profissional com o id: " + id);
        }
        PersonalTrainer personalTrainer = null;

        for (PersonalTrainer personalTrainerNaLista : personalTrainers) {
            if (personalTrainerNaLista.getId() == id) {
                personalTrainer = personalTrainerNaLista;
            }
        }

        return personalTrainer;
    }

    public void listarAulasPersonal(PersonalTrainer personalTrainer) {
        for (Aula aula : personalTrainer.getAulasAptas()) {
            System.out.println(aula);
        }
    }

    public void listarHorariosDisponiveis(PersonalTrainer personalTrainer) {
        for (Integer horario : personalTrainer.getHorariosDisponiveis()) {
            System.out.println(horario + " Horas");
        }
    }

    public void agendar(PersonalTrainer personalTrainer, int aulaEscolhida, int horario, Aluno aluno) throws BusinessException {

        if (personalTrainer.getAgendamentos().size() > 10) {
            throw new BusinessException("Agenda do profissional cheia!");
        }

        if (horario < 8 || horario > 18) {
            throw new BusinessException("Horário escolhido antes ou após horário de serviço!");
        }

        if (aulaEscolhida < 1 || aulaEscolhida > 3) {
            throw new BusinessException("Número escolhido não coincide com nenhuma aula!");
        }

        if (!personalTrainer.getHorariosDisponiveis().contains(horario)) {
            throw new BusinessException("Horário escolhido já agendado!");
        }

        AgendamentoAula agendamentoAula = switch (aulaEscolhida) {
            case 1 -> new AgendamentoAula(horario, personalTrainer, Aula.MUSCULACAO, aluno);
            case 2 -> new AgendamentoAula(horario, personalTrainer, Aula.LUTA, aluno);
            case 3 -> new AgendamentoAula(horario, personalTrainer, Aula.NATACAO, aluno);
            default -> throw new BusinessException("Erro desconhecido ao agendar!");
        };

        personalTrainer.getAgendamentos().add(agendamentoAula);
        personalTrainer.getHorariosDisponiveis().remove(Integer.valueOf(horario));

        System.out.println("Agendamento marcado!");
        System.out.println();
        System.out.println(agendamentoAula);
    }
}
