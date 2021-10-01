package Academia;

import aluno.Aluno;
import aluno.AlunoService;
import exception.BusinessException;
import personal.PersonalService;
import personal.PersonalTrainer;

public class AcademiaService {

    PersonalService personalService = new PersonalService();
    AlunoService alunoService = new AlunoService();

    public void popularPersonalTrainers() {
        personalService.popularPersonalTrainers();
    }

    public void listarPersonaisTrainers() {
        personalService.listarPersonaisTrainers();
    }

    public PersonalTrainer buscarPersonalPorId(long id) throws BusinessException {
        return personalService.buscarPorId(id);
    }

    public void listarAulasPersonal(PersonalTrainer personalTrainer) {
        personalService.listarAulasPersonal(personalTrainer);
    }

    public void listarHorariosDisponiveis(PersonalTrainer personalTrainer) {
        personalService.listarHorariosDisponiveis(personalTrainer);
    }

    public void popularBaseDeDadosAlunos() {
        alunoService.popularBaseDeDadosAlunos();
    }

    public void salvarAluno(Aluno aluno) {
        alunoService.salvarAluno(aluno);
    }

    public void agendar(PersonalTrainer personalTrainer, int aulaEscolhida, int horario, Aluno aluno) throws BusinessException {
        personalService.agendar(personalTrainer, aulaEscolhida, horario, aluno);
    }
}
