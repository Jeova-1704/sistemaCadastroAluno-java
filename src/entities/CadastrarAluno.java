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
        if (!alunos.isEmpty()) {
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
        } else {
            System.out.println("Nenhum aluno cadastrado no sistema para ser removido.");
        }
    }

    public void buscarAluno(int matricula) {
        if (!alunos.isEmpty()) {
            boolean alunoSelecionado = false;
            for (Aluno aluno : alunos) {
                if (aluno.getMatricula() == matricula) {
                    System.out.println("aluno encontrado: " + aluno);
                    alunoSelecionado = true;
                    break;
                }
            }
            if (!alunoSelecionado) {
                System.out.println("Aluno com matricula " + matricula + " não encontrado no sistema. Por favor, verifique o número da matrícula informada.");
            }
        } else {
            System.out.println("Nenhum aluno cadastrado no sistema.");
        }
    }

    public void atualizarAluno(int matricula, String novoNome, int novaIdade) {
        if (!alunos.isEmpty()) {
            for (Aluno aluno : alunos) {
                if (aluno.getMatricula() == matricula) {
                    aluno.setNome(novoNome);
                    aluno.setIdade(novaIdade);
                    System.out.println("Aluno com a matrícula " + matricula + " atualizado com sucesso");
                    return;
                }
            }
            System.out.println("Aluno com a matricula " + matricula + " não cadastrado no sistema.");
        } else {
            System.out.println("Nenhum aluno cadastrado no sistema para ser atualizado");
        }
    }

    public void listarTodosAlunos() {
        if (!alunos.isEmpty()) {
            for (Aluno aluno : alunos) {
                System.out.println(aluno);
            }
        } else {
            System.out.println("Nenhum aluno cadastrado no sistema");
        }
}
}


