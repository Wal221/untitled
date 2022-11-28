package SIprimeiroperiodo;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class senha {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(new File("src/SIprimeiroperiodo/nomes"));
        Scanner ler = new Scanner(System.in);
       String texto = ler.next();

        BufferedWriter arq = new BufferedWriter(
                new FileWriter("src/SIprimeiroperiodo/nomes")
        );
        arq.write(texto);

    }
    public static  void senha(String cadastro){
        Pattern pattern = Pattern.compile("\\w");
        Matcher matcher = pattern.matcher("Walmir*");
        boolean found = matcher.find();
        System.out.printf("Padrão encontrado?  -> %s",
                (found ? "SIM": "NÃO"));
    }



}
