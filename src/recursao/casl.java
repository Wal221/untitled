package recursao;

import java.util.Scanner;

public class casl {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int vetor[] =  {2,4,1,6};

        switch (ler.nextInt()){
            case 1 :
                numberPar(vetor);
                break;
        }

    }
    public static void numberPar(int[] vetor){
      for(int i =0 ; i<vetor.length; i++){
          if(vetor[i] % 2 ==0){
              System.out.println(vetor[i]);
          }

      }

    }
}
