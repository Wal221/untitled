package SIprimeiroperiodo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class cadastro {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\w");
        Matcher matcher = pattern.matcher("Walmir*");

        boolean found = matcher.find();
        System.out.printf("Padrão encontrado?  -> %s",
                (found ? "SIM": "NÃO"));
    }
}
