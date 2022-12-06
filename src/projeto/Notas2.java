package projeto;

import java.util.Scanner;

public class Notas2 {

    public static void main(String[] args) {

        System.out.println("Notas Escolares");
        System.out.print("Qauntas notas a inserir? ");
        int nNotas = (int) leiaFloat();

        float nota[] = new float[nNotas + 1];

        for (int i = 0; i < nNotas; i++) {
            do {
                System.out.print("Informe a " + (i + 1) + "ª nota: ");
                nota[i] = leiaFloat();
                if (validaNota(nota[i])) {
                    System.out.println("Nota inválida, tente novamente!.");
                }
            } while (validaNota(nota[i]));
            nota[nNotas] += nota[i];
        } // For
        nota[nNotas] = nota[nNotas] / nNotas;

        System.out.printf("Sua média foi de %.2f", nota[nNotas]);
        if (nota[nNotas] >= 7) {
            System.out.print(" Parabéns você foi aprovado!");
        } else {
            System.out.print(" Infelizmente você foi reprovado!");
        }

    }// Main

    public static boolean validaNota(float nota) {
        return nota < 0 || nota > 10;

    }// boolean

    public static float leiaFloat() {
        Scanner leia = new Scanner(System.in);
        leia.close();
        try {
            return leia.nextFloat();
        } catch (Exception e) {
            System.out.print("Valor não é um número, tente novamente: ");
            return leiaFloat();
        }

    }
}// class
