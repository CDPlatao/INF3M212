package projeto;

import model.carro;

import java.util.ArrayList;
import java.util.Scanner;

public class POO {
    public static void main(String[] args) {
        // Todo code application logic here
        carro car1 = new carro(" manual", " hidraulica", " abcd1234", 54889, " fiat", " palio", 1.0f, 2009, 2010);
        System.out.println("Carro 1: " + car1);
        System.out.println("Marca: " + car1.getMarca());
        System.out.println("Placa: " + car1.getPlaca());

        System.out.println("---------------------------------------------------");
        Scanner leia = new Scanner(System.in);

        String tpcambio;
        String tpdirecao;
        String placa;
        int renavam;
        String marca;
        String modelo;
        float motorizacao;
        int anofabricacao;
        int anomodelo;

        System.out.print("Informe o tipo de Cambio: ");
        tpcambio = leia.next();
        System.out.print("Informe o tipo de Direção: ");
        tpdirecao = leia.next();
        System.out.print("Informe a placa: ");
        placa = leia.next();
        System.out.print("Informe o Renavam: ");
        renavam = leia.nextInt();
        System.out.print("Informe a Marca: ");
        marca = leia.next();
        System.out.print("Informe o Modelo: ");
        modelo = leia.next();
        System.out.print("Informe a Motorização: ");
        motorizacao = leia.nextFloat();
        System.out.print("Informe o Ano de Fabricação: ");
        anofabricacao = leia.nextInt();
        System.out.print("Informe o Ano do modelo: ");
        anomodelo = leia.nextInt();
        carro car2 = new carro(tpcambio, tpdirecao, placa, renavam, marca, modelo, motorizacao, anofabricacao,
                anomodelo);
        System.out.println("Carro 2: " + car2.toString());

        carro car3 = new carro();
        car3.setPlaca("yzy1998");
        car3.setRenavam(357);
        car3.setMarca("Peugeot");
        car3.setModelo("405 GR");
        car3.setAnofabricacao(1995);
        car3.setAnomodelo(1996);
        car3.setMotorizacao(1.8f);
        car3.setTpcambio("Manual");
        car3.setTpdirecao("Hidraulica");
        System.out.println("Carro 3: " + car3.toString());
        ArrayList<carro> listacarros = new ArrayList<>();
        listacarros.add(car1);
        listacarros.add(car2);
        listacarros.add(car3);
        for (carro car : listacarros) {
            System.out.println("Placa: " + car.getPlaca() + "| Modelo: " + car.getModelo());
        }
        listacarros.remove(car2);
System.out.println("-------------------------------------------------");
        for (carro car : listacarros) {
            System.out.println("\nPlaca: " + car.getPlaca() + "| Modelo: " + car.getModelo());
        }
    }// Main
}// POO
