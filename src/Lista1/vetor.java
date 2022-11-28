package Lista1;

import java.util.Arrays;
import java.util.Scanner;

public class vetor {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String [] vect= {"A", "b"};

      for(int i =0; i<1;i++){
          System.out.print(i+"=="+vect[0]);

      }
        System.out.println();
        System.out.println("Diga qual elemento deseja retira ");
      int i= ler.nextInt();
      vetoNull(vect,i);
        System.out.println( i +"=="+vect[i]);

    }
    public static void vetoNull(String vetor[],int i){
        if(vetor[i]!=null){
            vetor[i]=null;

        }

    }

}
