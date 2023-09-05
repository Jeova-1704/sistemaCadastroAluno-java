package entities;

public class Aluno {
    private String name;
    private Integer idade;
    private Integer matricula;

    public Aluno (String name, Integer idade, Integer matricula) {
        this.name = name;
        this.idade = idade;
        this.matricula = matricula;
    }

    public String getNome() {
        return name;
    }

    public void setNome(String name) {
        this.name = name;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Aluno cadastrado: '" +
                "nome: " + name + '\'' +
                ", idade: " + idade +
                ", matricula: " + matricula;
    }
}
