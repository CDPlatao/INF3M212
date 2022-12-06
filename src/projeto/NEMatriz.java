package projeto;

import java.util.Scanner;

public class NEMatriz {
    static String alunos[];
    static float notas[][];
    static int nAlunos, nNotas, contAlunos;

    public static void main(String[] args) {
        int opM;
        System.out.println("--- NOTAS ESCOLARES MATRIZ ---");
        System.out.print("Número de alunos: ");
        nAlunos = (int) leiaFloat();
        System.out.print("Quantas notas ? ");
        nNotas = (int) leiaFloat();

        alunos = new String[nAlunos];
        notas = new float[nAlunos][nNotas + 1];
        do {
            menu();
            opM = (int) leiaFloat();
            switch (opM) {
                case 1:
                    inserirAlunoNotas();
                    break;
                case 2:
                    ImprimirNotas();
                    break;
                case 0:
                    System.out.println("Aplicação encerrada pelo usuário!.");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente!.");
                    break;
            }
        } while (opM != 0);
    

    }// Main

    public static boolean validaNota(float nota) {
        return nota < 0 || nota > 10;
    }// Boolean

    public static float leiaFloat() {
        Scanner leia = new Scanner(System.in);
        try {
            return leia.nextFloat();
        } catch (Exception e) {
            System.out.print("Valor não é um número, tente novamente: ");
            return leiaFloat();
        }        
    }// Float

    public static void menu() {

        System.out.println("Menu de opções ");
        System.out.println("1- Inserir notas.");
        System.out.println("2- Imprimir notas.");
        System.out.println("0 - Sair");
        System.out.print("Informe a opção desejada: ");

    }// Menu

    public static void inserirAlunoNotas() {
        Scanner leia = new Scanner(System.in);
        if (contAlunos < nAlunos) {
            System.out.print("Nome do aluno: ");
            alunos[contAlunos] = leia.next();
            for (int j = 0; j < nNotas; j++) {
                do {
                    System.out.print("\tDigite a " + (j + 1) + "ª nota: ");
                    notas[contAlunos][j] = leiaFloat();
                    if (validaNota(notas[contAlunos][j])) {
                        System.out.println("Nota Inválida, por favor, tente novamente!");
                    }
                } while (validaNota(notas[contAlunos][j]));
                notas[contAlunos][nNotas] += notas[contAlunos][j];
            } // For nota
            notas[contAlunos][nNotas] = notas[contAlunos][nNotas] / nNotas;
            contAlunos++;
        } // if contAlunos
        else {
            System.out.println("Não é mais possível lançar notas!." + "\nTodas posições ocupadas.");
        }
        //leia.close();
    }// AlunoNotas

    public static void ImprimirNotas() {
        System.out.println("--- RESULTADO ---");
        for (int i = 0; i < contAlunos; i++) {
            System.out.printf(alunos[i] + "sua média foi de %.2f", notas[i][nNotas]);
            if (notas[i][nNotas] >= 7) {
                System.out.println(" e você foi aprovado!");
            } else {
                System.out.println(" e infelizmente você foi reprovado!");
            }
        } // For
    }
}// Class
