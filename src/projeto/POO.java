package projeto;

import model.carro;
import java.util.Scanner;

public class POO {
    public static void main(String[] args) {
        // Todo code application logic here
        carro car1 = new carro(" manual", " hidraulica", " abcd1234", " 54889", " fiat", " palio", 1.0f, 2009, 2010);
        System.out.println("Carro 1: " + car1);
        System.out.println("Marca: " + car1.getMarca());
        System.out.println("Placa: " + car1.getPlaca());

        System.out.println("---------------------------------------------------");
        Scanner leia = new Scanner(System.in);

        String tpcambio;
        String tpdirecao;
        String placa;
        String renavam;
        String marca;
        String modelo;
        float motorizacao;
        int anofabricacao;
        int anomodelo;

        

    }// Main
}// POO
