package personal;

import entity.AgendamentoAula;
import entity.Aula;
import entity.Pessoa;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PersonalTrainer extends Pessoa {

    private Long id;

    private List<AgendamentoAula> agendamentos;

    private List<Integer> horariosDisponiveis = IntStream.range(8, 18).boxed().collect(Collectors.toList());

    private List<Aula> aulasAptas = Arrays.asList(Aula.MUSCULACAO, Aula.LUTA);

    public PersonalTrainer(Long id, String nome, String cpf) {
        super(nome, cpf);
        this.id = id;
    }

    @Override
    public String toString() {
        return "PersonalTrainer{"
                + " id: " + id
                + " nome: " + super.getNome()
                + " cpf: " + super.getCpf()
                + "}";
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
}
