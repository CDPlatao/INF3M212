package projeto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Arraial {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();

        System.out.println("ArrayList Vazio ?");
        System.out.println(nomes.isEmpty());

        System.out.println("Tamanho do Array " + nomes.size());

        nomes.add("Chrigor");

        System.out.println("Tamanho do Array " + nomes.size());
        System.out.println("ArrayList Vazio");
        System.out.println(nomes.isEmpty());

        System.out.print("Digite um nome: ");
        nomes.add(leia.next());

        System.out.println("Tamanho do Array " + nomes.size());

        System.out.println(nomes.toString());

        nomes.add(0, "Irineu");

        System.out.println("Tamanho do Array " + nomes.size());

        System.out.println(nomes.toString());

        System.out.println("Informe o nome para remove-lo: ");
        nomes.remove(leia.next());

        System.out.println("Informe um nome: ");

        System.out.println("Tamanho do Array " + nomes.size());

        System.out.println(nomes.toString());
        for (String nome : nomes) {
            System.out.println("Posição: " + nome);
        } // For
        System.out.println("ArrayList Vazio ?");
        System.out.println(nomes.isEmpty());

        System.out.println("Posição do Chrigor é: " + nomes.indexOf("Chrigor"));

        System.out.println("Ordenação de Array");
        nomes.add("Girafales");
        nomes.add("Madruga");
        nomes.add("Barriga");
        nomes.add("Chaves");
        nomes.add("Suriname");

        System.out.println("X Ordenação: " + nomes.toString());
        Collections.sort(nomes);
        System.out.println("O Ordenação: " + nomes.toString());
        Collections.reverse(nomes);
        System.out.println("O Ordenação Inversa: " + nomes.toString());

        leia.close();
    }// Main
}// classe
