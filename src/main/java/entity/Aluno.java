package entity;

public class Aluno extends Pessoa {

    private Integer peso;
    private Float altura;

    public Aluno(String nome, String cpf, Integer peso, Float altura) {
        super(nome, cpf);
        this.peso = peso;
        this.altura = altura;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public Float getAltura() {
        return altura;
    }

    public void setAltura(Float altura) {
        this.altura = altura;
    }
}
