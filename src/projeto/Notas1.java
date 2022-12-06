package projeto;

import java.util.Scanner;

public class Notas1 {

    public static void main(String[] args) {// start incio
        float nota1, nota2, nota3, nota4, media;
        Scanner leia = new Scanner(System.in);

        System.out.println("Notas Escolares");
        System.out.print("Informe a 1ª nota: ");
        nota1 = leia.nextFloat();
        System.out.print("Informe a 2ª nota: ");
        nota2 = leia.nextFloat();
        System.out.print("Informe a 3ª nota: ");
        nota3 = leia.nextFloat();
        System.out.print("Informe a 4ª nota: ");
        nota4 = leia.nextFloat();
        media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.print("Sua média foi de " + media + ".");

        if (media <= 7) {
            System.out.println(" Você foi aprovado!.");
        } else {
            System.out.println(" Você foi reprovado!.");
        }
        leia.close();
    }// end start

}
