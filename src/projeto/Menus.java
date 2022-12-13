package projeto;

import java.util.ArrayList;
import java.util.Scanner;

public class Menus {
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
        String add;
        do {
            System.out.print("Informe o item aqui: ");
            listacompras.add(leia.nextLine());
            System.out.println("Deseja adicionar novos itens ? (S/N)");
            add = leia.next();
        } while (add.equalsIgnoreCase("s"));
    }// Adicionar

    public static void remover() {
        System.out.print("Informe o item aqui: ");
        listacompras.remove(leia.nextLine());
    }// Remover

    public static void imprimir() {
        System.out.println(listacompras.toString());
    }// Imprimir

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