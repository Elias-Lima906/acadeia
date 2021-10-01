import Academia.AcademiaService;
import aluno.Aluno;
import exception.BusinessException;
import personal.PersonalTrainer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws BusinessException {

        AcademiaService academiaService = new AcademiaService();
        academiaService.popularPersonalTrainers();
        academiaService.popularBaseDeDadosAlunos();
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem Vindo a academia");

        pulaLinha();

        System.out.println("Para se cadastrar digite seu suas informações abaixo: ");

        pulaLinha();

        Aluno aluno = pegarInformacoesCadastroAluno(sc);

        academiaService.salvarAluno(aluno);

        pulaLinha();

        System.out.println("Cadastro realizado!");

        pulaLinha();

        System.out.println("Lista de Personais Trainers, escolha um pelo número: ");

        academiaService.listarPersonaisTrainers();

        pulaLinha();

        System.out.print("Número: ");
        long idPersonal = sc.nextLong();

        PersonalTrainer personalTrainer = academiaService.buscarPersonalPorId(idPersonal);
        int opcao;
        do {
            pulaLinha();

            System.out.println("Escolha uma das opções: ");

            pulaLinha();

            System.out.println("(1) - Listar aulas;");
            System.out.println("(2) - Ver horários disponíveis;");
            System.out.println("(3) - Agendar;");
            System.out.println("(0) - Sair;");

            pulaLinha();

            System.out.print("Opção: ");
            opcao = sc.nextInt();

            pulaLinha();

            switch (opcao) {
                case 1 -> academiaService.listarAulasPersonal(personalTrainer);

                case 2 -> academiaService.listarHorariosDisponiveis(personalTrainer);

                case 3 -> {
                    agendar(academiaService, sc, aluno, personalTrainer);
                    pulaLinha();
                }

                case 0 -> System.out.println("Obrigado e volte sempre!");
                default -> {
                    pulaLinha();
                    System.out.println("Opação invalida, tente outra vez!");
                    pulaLinha();
                }
            }

        } while (opcao != 0);

    }

    private static void agendar(AcademiaService academiaService, Scanner sc, Aluno aluno, PersonalTrainer personalTrainer) throws BusinessException {
        System.out.println("Para qual aula deseja agendar horário: ");
        System.out.println("(1) - Musculaçao");
        System.out.println("(2) - Luta");
        System.out.println("(3) - Natação");
        pulaLinha();
        System.out.print("Número da aula: ");
        int aulaEscolhida = sc.nextInt();
        pulaLinha();
        System.out.println("Escolha um horário, os horários são: ");
        pulaLinha();
        academiaService.listarHorariosDisponiveis(personalTrainer);
        pulaLinha();
        System.out.print("Horário: ");
        int horario = sc.nextInt();
        pulaLinha();
        academiaService.agendar(personalTrainer, aulaEscolhida, horario, aluno);
    }

    private static Aluno pegarInformacoesCadastroAluno(Scanner sc) {
        System.out.print("Nome: ");
        String nome = sc.next();

        pulaLinha();

        System.out.print("Cpf: ");
        String cpf = sc.next();

        pulaLinha();

        System.out.print("Peso: ");
        String peso = sc.next();

        pulaLinha();

        System.out.print("Altura: ");
        String altura = sc.next();

        return new Aluno(null, nome, cpf, peso, altura);
    }

    private static void pulaLinha() {
        System.out.println();
        System.out.println();
    }
}

