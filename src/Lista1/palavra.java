package Lista1;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class palavra {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input= new Scanner(new File("src/Lista1/diary"));
        while(input.hasNext()){
            System.out.println(input.next());
        }
        input.close();

    }

}
