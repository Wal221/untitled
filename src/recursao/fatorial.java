package recursao;

public class fatorial {
    public static void main(String[] args) {
        int n = 5;
        int som=1;
        for (int i =n; i>1; i--){
              som *= i;
        }
        System.out.println(som);
    }








    public static int fatorial(int num){
        if(num==0){
            return 1;

        } return num * fatorial(num-1);

    }
}
