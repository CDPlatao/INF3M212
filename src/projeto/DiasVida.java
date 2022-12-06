package projeto;

import java.util.Scanner;

public class DiasVida {

    public static void main(String[] args) {
        int idade, DV;
        Scanner leia = new Scanner(System.in);
        String nome;

        System.out.println("<Calculadora de Dias de vida>");
        System.out.print("Informe seu nome: ");
        nome = leia.next();
        System.out.print("Informe sua idade: ");
        idade = leia.nextInt();

        DV = idade * 365;

        System.out.print(nome + " sua idade é: " + idade);
        System.out.print(", e você ja viveu " + DV + " dias.");
        leia.close();
    }
}