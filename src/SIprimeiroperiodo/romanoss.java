package SIprimeiroperiodo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class romanoss {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("src/Lista1/diary"));
        while(input.hasNextLine()){
            System.out.println(input.nextLine());

        }
        algarismo(input);

    }
    public static void algarismo( Scanner input  ){
        int[] vaNum = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        String[] vaRom = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        while (true) {
            int numero = input.nextInt();
            if (numero == 0) break;

            System.out.printf("%-4d ", numero);
            int i = 0;
            while (numero > 0) {
                if (numero >= vaNum[i]) {
                    System.out.print(vaRom[i]);
                    numero -= vaNum[i];
                } else {
                    i++;
                }
            }
            System.out.println();
        }

    }
}
