package entities;

import java.util.ArrayList;
import java.util.List;

public class CadastrarAluno {
    private List<Aluno> alunos = new ArrayList<>();

    public void adicionarAluno(Aluno aluno) {
        int matricula = aluno.getMatricula();
        if (!alunos.contains(aluno)){
            alunos.add(aluno);
        } else {
            System.out.println("Aluno com com a matricula " + matricula + " já cadastrado no sistema.");
        }
    }

    public void removerALuno (int matricula){
        boolean alunoParaRemocao = false;
        for (Aluno aluno : alunos){
            if (aluno.getMatricula() == matricula){
                alunos.remove(aluno);
                alunoParaRemocao = true;
                break;
            }
        }
        if (!alunoParaRemocao) {
            System.out.println("Aluno com com a matricula " + matricula + " não cadastrado no sistema.");
        }
    }

    public void buscarAluno(int matricula) {
        boolean alunoSelecionado = false;
        for (Aluno aluno : alunos) {
            if (aluno.getMatricula() == matricula) {
                System.out.println("aluno encontrado: " + aluno);
                alunoSelecionado = true;
                break;
            }
        }
        if (!alunoSelecionado) {
            System.out.println("Aluno com matricula " + matricula + " não encontrado no sistema. Por favor, adicione-o ao sistema ou verifique a matrícula.");
        }
    }


    public void atualizarAluno(int matricula, String novoNome, int novaIdade) {
        for (Aluno aluno : alunos) {
            if (aluno.getMatricula() == matricula){
                aluno.setNome(novoNome);
                aluno.setIdade(novaIdade);
                System.out.println("Aluno com a matrícula " + matricula + " atualizado com sucesso");
                return;
                }
            }
        System.out.println("Aluno com a matricula " + matricula + " não cadastrado no sistema.");
        }

    public void listarTodosAlunos() {
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
    }
}
}


