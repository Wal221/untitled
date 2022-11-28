package recursao;

public class hanoi {
    public static void main(String[] args) {
        hanoi(2,1,2,3);
    }


    private static void mover(int O, int D) {
        System.out.println(O + " -> " + D);
    }

    // Método que implementa a recursão
// n = número de discos a serem movimentados
// O = atual pino origem
// D = atual pino destino
// T = atual pino de trabalho
    static void hanoi(int n, int O, int D, int T) {

        if (n > 0) {

            hanoi(n - 1, O, T, D);    //executa hanoi para mover n-1 discos
            //da origem para o trabalho

            mover(O, D);        //mover disco do "pino O" (origem atual)
            //para o "pino D" (destino atual)

            hanoi(n - 1, T, D, O);    //executa hanoi para mover n-1 discos
            //do trabalho para destino
        }
    }
}
