package aluno;

import common.Pessoa;

public class Aluno extends Pessoa {

    private final String peso;
    private final String altura;
    private Long id;

    public Aluno(Long id, String nome, String cpf, String peso, String altura) {
        super(nome, cpf);
        this.id = id;
        this.peso = peso;
        this.altura = altura;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "--------------" + "\n"
                + " Identificação: " + id + "\n"
                + " nome: " + super.getNome() + "\n"
                + " cpf: " + super.getCpf() + "\n"
                + " altura: " + altura + "\n"
                + " Peso: " + peso + "\n"
                + " --------------";
    }
}