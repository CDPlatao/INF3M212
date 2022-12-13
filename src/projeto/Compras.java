package projeto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Compras {
    static ArrayList<String> listacompras = new ArrayList<>();
    static Scanner leia = new Scanner(System.in);

    public static void main(String[] args) {
        int opM;

        do {
            menu();
            opM = leiaInt();
            switch (opM) {
                case 1:
                    adicionar();
                    break;
                case 2:
                    remover();
                    break;
                case 3:
                    imprimir();
                    break;
                case 0:
                    System.out.println("------------------------------------");
                    System.out.println("                                    ");
                    System.out.println(" Aplicação encerrada pelo usuário!. ");
                    System.out.println("                                    ");
                    System.out.println("------------------------------------");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente!.");
                    break;
            }
        } while (opM != 0);

    }// Main

    public static void menu() {
        System.out.println("--- Lista de compras --- ");
        System.out.println("                         ");
        System.out.println(" 1 - Adicionar item ");
        System.out.println(" 2 - Remover   item ");
        System.out.println(" 3 - Imprimir lista ");
        System.out.println(" 0 - Sair ");
        System.out.println("                         ");
        System.out.println("-------------------------");
        System.out.print(" Informe a opção desejada: ");
    }// Menu

    public static void adicionar() {
        Scanner ler = new Scanner(System.in);
        String add, item;
        do {
            System.out.println("\n --- Adicionar itens --- ");
            System.out.print("Informe o item aqui: ");
            item = ler.nextLine();
            if (!veritem(item)) {
                listacompras.add(item);
            } else {
                System.out.println("O item ja existente!. ");
            }
            System.out.println("Deseja adicionar novos itens ? (S/N)");
            add = leia.next();
        } while (add.equalsIgnoreCase("s"));
    }// Adicionar

    public static void remover() {
        Scanner ler = new Scanner(System.in);
        String remove, item;
        do {
            System.out.println("\n --- Remover itens --- ");
            System.out.print("Informe o item aqui: ");
            item = ler.nextLine();
            if (veritem(item)) {
                listacompras.remove(item);
            } else {
                System.out.println(" Você não possui este item no carrinho!. ");
            }
            System.out.println("Deseja remover novos itens ? (S/N)");
            remove = leia.next();
        } while (remove.equalsIgnoreCase("s"));
    }// Remover

    public static void imprimir() {
        System.out.println("\n --- Itens no carrinho ---");
        if (listacompras.isEmpty()) {
            System.out.println(" O carrinho está vazio!.");
        } // If

        Collections.sort(listacompras);
        for (String listacompra : listacompras) {
            System.out.println(" " + listacompra);
        } // For
    }// Imprimir

    public static boolean veritem(String item) {
        for (String itemlista : listacompras) {
            if (itemlista.equalsIgnoreCase(item)) {
                return true;
            }
        }
        return false;
    }// VerItem

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