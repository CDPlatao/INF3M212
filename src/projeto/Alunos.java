package projeto;

import java.util.Scanner;

import model.Aluno;

public class Alunos {
    public static void main(String[] args) {
        Aluno aln1 = new Aluno("Chrigor", 22, "03382954028", "5122313041", "981362087", "Porto Alegre", "181810029");
        System.out.println("Aluno 1 " + aln1.toString());
        System.out.println("----------------------------------------------------");

        String nome;
        int idade;
        String cpf;
        String rg;
        String telefone;
        String cidade;
        String matricula;
        Scanner leia = new Scanner(System.in);

        System.out.print("Informe o nome do aluno: ");
        nome = leia.next();
        System.out.print("Informe a idade: ");
        idade = leia.nextInt();
        System.out.print("Informe o CPF: ");
        cpf = leia.next();
        System.out.print("Informe o RG: ");
        rg = leia.next();
        System.out.print("Informe um Telefone: ");
        telefone = leia.next();
        System.out.print("Informe a cidade: ");
        cidade = leia.next();
        System.out.print("Informe a matricula: ");
        matricula = leia.next();
        Aluno aln2 = new Aluno(nome, idade, cpf, rg, telefone, cidade, matricula);
        System.out.println("----------------------------------------------------");
        System.out.println("Aluno 2 " + aln2.toString());
    }// Main
}// Class
