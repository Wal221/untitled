package SIprimeiroperiodo;

import java.util.Random;
import java.util.Scanner;

public class alternaNome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um nome ");
        String name = input.nextLine();
        magicaNasPalvras(name);

    }
     public static void magicaNasPalvras(String name){

        Random rand = new Random();
         for(int i =0 ; i<name.length(); i++){

             if( rand.nextBoolean()){
                 System.out.println(Character.toUpperCase(name.charAt(i)));

             } else{
                 System.out.println(Character.toLowerCase(name.charAt(i)));
             }
         }

     }
}
