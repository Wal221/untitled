package Lista1;

public class agencia {
    public String name;
    private int cpf;
    private int numcont = 4587551;
    private double money;

    public String getName() {
        return name;
    }


    public void setName(String name) {

        this.name = name;
    }

    public int getNumcont() {

        return numcont;
    }


    public double getMoney() {

        return money;
    }


    public int getCpf() {

        return cpf;
    }


     public double insertValue(double money){
         return this.money + money;

     }
     public double remove_a_value(double money){
        return this.money- money;
     }


}
