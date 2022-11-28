package Lista1;

import java.util.Scanner;

public class Ws {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String a = ler.next();
        int b = 3;
        char convert= 'a';

        try{
            int d = Integer.parseInt(a);
            int c = d + b;
            System.out.print("Sucesso");

    } catch (Exception e){
            System.out.print("Que pena não foi dessa vez ");


        }
        finally {
            System.out.print(" em Amigão");
        }
    }
}
