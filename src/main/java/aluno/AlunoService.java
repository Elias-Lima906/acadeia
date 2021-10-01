package aluno;

import exception.BusinessException;

import java.util.ArrayList;
import java.util.List;

public class AlunoService {

    List<Aluno> alunos = new ArrayList<>();

    public void popularBaseDeDadosAlunos() {
        alunos.add(new Aluno(1L, "José", "84685463528", "89", "1.72f"));
        alunos.add(new Aluno(2L, "Juan", "56456486486", "80", "1.80f"));
        alunos.add(new Aluno(3L, "alicia", "12436578964", "75", "1.73f"));
        alunos.add(new Aluno(4L, "Beatriz", "98646751236", "73", "1.65f"));
        alunos.add(new Aluno(5L, "Roberta", "78946523917", "68", "1.68f"));
        alunos.add(new Aluno(6L, "Joana", "55436978452", "92", "1.78f"));
        alunos.add(new Aluno(7L, "Alicia", "66467536452", "70", "1.72f"));
        alunos.add(new Aluno(8L, "Fernando", "25243679856", "95", "1.88f"));
        alunos.add(new Aluno(9L, "Mario", "46958534215", "92", "1.83f"));
        alunos.add(new Aluno(10L, "Fabiola", "64312058964", "78", "1.76f"));
    }

    public void salvarAluno(Aluno aluno) {
        aluno.setId((long) (alunos.size() + 1));
        alunos.add(aluno);
    }

    public Aluno buscarPorId(long id) throws BusinessException {

        if (id > alunos.size()) {
            throw new BusinessException("Não existe profissional com o id: " + id);
        }
        Aluno aluno = null;

        for (Aluno alunoNaLista : alunos) {
            if (alunoNaLista.getId() == id) {
                aluno = alunoNaLista;
            }
        }

        return aluno;
    }

}
