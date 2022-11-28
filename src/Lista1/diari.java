package Lista1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class diari {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input= new Scanner(new File("src/Lista1/diary"));
         //String line1= input.nextLine();
         while(input.hasNextLine()){
             System.out.println(input.nextLine());


         }
              input.close();

    }
}
