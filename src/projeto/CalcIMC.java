package projeto;

import java.util.Scanner;

public class CalcIMC {

    public static void main(String[] args) {
        float massa, peso, altura;
        String status, nome;
        status = " ";
        nome = " ";
        Scanner leia = new Scanner(System.in);

        System.out.println("<Calculadora de IMC>\n");
        System.out.print("Informe seu nome: ");
        nome = leia.next();
        System.out.print("Informe sua altura: ");
        altura = leia.nextFloat();
        System.out.print("Informe seu peso: ");
        peso = leia.nextFloat();

        massa = peso / (altura * altura);

        if (massa <= 18.5) {
            status = "Abaixo do peso.";
        } else if (massa <= 24.9) {
            status = "Peso Normal.";
        } else if (massa <= 29.9) {
            status = "Sobrepeso.";
        } else if (massa <= 34.9) {
            status = "Obesidade tipo 1.";
        } else if (massa <= 39.9) {
            status = "Obesidade tipo 2.";
        } else {
            status = "Obesidade tipo 3.";
        }

        System.out.printf("A sua massa corporal de " + nome + " é de: %.2f", massa);
        System.out.println("\ne a sua classificação é: " + status);
        leia.close();
    }

}
