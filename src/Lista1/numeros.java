package Lista1;

public class numeros {
    public static void main(String[] args) {
        int x = 13;
        System.out.printf("Iniciando... \n " + x);
        while (x != 1){
            if (x % 2 == 0 ){
                x = x /2;
            }else{
                x= x *3 + 1;
            }
            System.out.println(x);

        }
    }
}
