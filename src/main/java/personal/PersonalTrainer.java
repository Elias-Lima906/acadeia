package personal;

import common.Pessoa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PersonalTrainer extends Pessoa {

    private final Long id;

    private final List<AgendamentoAula> agendamentos = new ArrayList<>();

    private final List<Integer> horariosDisponiveis = IntStream.range(8, 18).boxed().collect(Collectors.toList());

    private final List<Aula> aulasAptas = Arrays.asList(Aula.MUSCULACAO, Aula.LUTA, Aula.NATACAO);

    public PersonalTrainer(Long id, String nome, String cpf) {
        super(nome, cpf);
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public List<AgendamentoAula> getAgendamentos() {
        return agendamentos;
    }

    public List<Integer> getHorariosDisponiveis() {
        return horariosDisponiveis;
    }

    public List<Aula> getAulasAptas() {
        return aulasAptas;
    }

    @Override
    public String toString() {
        return "--------------" + "\n"
                + "Identificação: " + id + "\n"
                + " nome: " + super.getNome() + "\n"
                + "--------------";
    }


}
