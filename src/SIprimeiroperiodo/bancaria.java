package SIprimeiroperiodo;

import Lista1.agencia;

import java.util.Random;
import java.util.Scanner;

public class bancaria {
    public static void main(String[] args) {
        Random ale = new Random();
        Scanner input = new Scanner(System.in);
        agencia banco = new agencia();

        System.out.println("Digite o nome do titular");
         banco.setName(input.next());

        System.out.println("Digite seu cpf");
       // banco.setCpf(input.nextInt());
        
        System.out.println("ok estamos gerando o seu numero da conta , esse e ele");
        System.out.println( banco.getNumcont());

    }
}
