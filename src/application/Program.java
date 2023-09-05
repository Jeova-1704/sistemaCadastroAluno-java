package application;

import entities.Aluno;
import entities.CadastrarAluno;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CadastrarAluno cadastrarAluno = new CadastrarAluno();

        while(true) {
            System.out.println("########## Sistema de cadastro de alunos ##########");
            System.out.println();
            System.out.println("1) Adicionar aluno");
            System.out.println("2) Remover aluno");
            System.out.println("3) buscar aluno");
            System.out.println("4) Atualizar aluno");
            System.out.println("5) Listar todos os alunos cadastrados");
            System.out.println("6) Sair do programa");
            System.out.println("Escolha uma seleção:");

            int escolha = sc.nextInt();

            if (escolha == 1){
                System.out.println("Informe os dados dos alunos abaixo:");

                System.out.println("Nome:");
                String name = sc.nextLine();
                sc.nextLine();
                System.out.println("Idade:");
                int idade = sc.nextInt();
                System.out.println("Matricula:");
                int matricula = sc.nextInt();
                Aluno aluno = new Aluno(name, idade, matricula);

                cadastrarAluno.adicionarAluno(aluno);

            } else if (escolha == 2) {
                System.out.println("==========================================================================");
                System.out.println("Por favor infome a matricula do aluno para podermos deletar ele do nosso sistama:");
                int matricula = sc.nextInt();
                cadastrarAluno.removerALuno(matricula);
                System.out.println("==========================================================================");

            } else if (escolha == 3) {
                System.out.println("==========================================================================");
                System.out.println("Informe a matricula do aluno que deseja buscar no sistema:");
                int matricula = sc.nextInt();
                cadastrarAluno.buscarAluno(matricula);
                System.out.println("==========================================================================");

            } else if (escolha == 4) {
                System.out.println("==========================================================================");
                System.out.println("Informe os dados pedidos do aluno para que possa atualizar ele no sistema:");
                System.out.println("Matricula:");
                int matricula = sc.nextInt();
                System.out.println("Nome:");
                String name = sc.next();
                System.out.println("Idade:");
                int idade = sc.nextInt();
                cadastrarAluno.atualizarAluno(matricula, name, idade);
                System.out.println("==========================================================================");

            } else if (escolha == 5) {
                System.out.println("==========================================================================");
                System.out.println("Listando todos os alunos cadastrados no sistema:");
                cadastrarAluno.listarTodosAlunos();
                System.out.println("==========================================================================");

            } else if (escolha == 6) {
                System.out.println("Programa encerrado.");
                break;

            } else {
                System.out.println("Por favor faça uma escolha válida.");
            }
            System.out.println();

        }


    }
}
