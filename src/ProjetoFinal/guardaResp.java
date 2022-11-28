package ProjetoFinal;

import javax.swing.*;
import java.util.Scanner;

public class guardaResp {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int b=0;
        String a;
       //for (int i=0;i<3;i++){
         //  System.out.println("Diga algo");
          /// String a = ler.nextLine();

           //b+=respota(a);
           //System.out.println(b);

      // }
        System.out.println("Diga algo");
        a= ler.nextLine();
        respota(a);


    }
    public  static int respota(String a ){
        int sim=0;
        int nao = 3;
        if (a.equals("sim")&& nao >0 ){
               sim = sim+1;
        } else{
            return nao--;
        }

     return sim+ respota(a);
}
}
