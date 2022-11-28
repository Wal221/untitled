package ProjetoFinal;



import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;

public class nomeAleatorio {
    public static void main(String[] args) throws IOException {
        String caminho = "src/ProjetoFinal/names";
        //System.out.println( biscoitodasorte.biscSorte(caminho));
        String a = biscoitodasorte.biscSorte(caminho);

        JOptionPane.showMessageDialog(null,a ,"Frases",0);


    }

}

