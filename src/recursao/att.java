package recursao;

import java.util.Scanner;

public class att {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
          int x = 3;
          int y = 2;
        System.out.println(power(x,y));

        
    }
   public static int power (int x , int y){
        if(y==0){

            return 1;
        }else{

            return  x * power(x, y-1);
        }

    }




}
