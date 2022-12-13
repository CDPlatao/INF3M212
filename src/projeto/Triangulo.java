package projeto;

import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int opM;
        System.out.println("\n_______________________________");
        System.out.println("|                             |");
        System.out.println("| Identificação de Triângulos |");
        System.out.println("|_____________________________|");
        do {
            menu();
            opM = leiaInt();
            switch (opM) {
                case 1:
                    Verificacao();
                    break;
                case 2:
                    System.out.println("______________________________________");
                    System.out.println("|                                    |");
                    System.out.println("| Aplicação encerrada pelo usuário!. |");
                    System.out.println("|____________________________________|");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente!.");
                    break;
            }
        } while (opM != 2);

    }// Main

    public static void menu() {

        System.out.println("_______________________________");
        System.out.println("|                             |");
        System.out.println("| 1 - Verificar triângulo.    |");
        System.out.println("| 2 - Sair.                   |");
        System.out.println("|_____________________________|");
        System.out.print("      Escolha a opção: ");
    }// Menu

    public static void Verificacao() {
        Scanner leia = new Scanner(System.in);
        int A = 0, B = 0, C = 0;

        System.out.print("\n*Informe o primeiro lado do triângulo: ");
        A = leiaInt();
        System.out.print("\n*Informe o segundo lado do triângulo: ");
        B = leiaInt();
        System.out.print("\n*Informe o terceiro lado do triângulo: ");
        C = leiaInt();

        if ((A < B + C) && (B < A + C) && (C < B + A)) {
            if ((A == B) && (B == C)) {
                System.out.println("\nTodos os lados são iguais. O triângulo é do tipo Equilátero!.");
            } else {
                if ((A == B) || (A == C) || (B == C)) {
                    System.out.println("\nO triângulo possui dois lados iguais. O triângulo e do tipo Isóceles!.");
                } else {
                    System.out.println(
                            "\nTodos os lados do triângulos são irregulares. O triângulo e do tipo Escaleno!.");
                } // If escaleno
            } // If equilátero
        } else {
            System.out.println("Estes valores não formam um triângulo!.");
        }
    }// Verificacao

    public static int leiaInt() {
        Scanner leia = new Scanner(System.in);
        try {
            return leia.nextInt();
        } catch (Exception e) {
            System.out.print("Valor não é um número, tente novamente: ");
            return leiaInt();
        }
    }// Leia
}// Class