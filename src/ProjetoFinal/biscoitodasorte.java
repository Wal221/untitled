package ProjetoFinal;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;

public class biscoitodasorte {

    public static String biscSorte(String caminho) {
        String frases = null;
        Random ale = new Random();
        int aleatorio = ale.nextInt(5);
        try {
            FileReader fw = new FileReader(caminho);
            BufferedReader bufferedReader = new BufferedReader(fw);
            ale = new Random();
            frases = Files.readAllLines(Paths.get(caminho)).get(aleatorio);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);

        } catch (IOException e) {

        }


        return frases;
    }
}

