package intermediario;

import java.util.Scanner;

public class ImoveisDisponiveis {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String frase = leitor.next();
        String array[] = new String[3];

        array = frase.split("/");

        String exit = "Imovel: " + array[0] + " R$" + array[1] + " " + array[2];
        System.out.println(exit);

    }
}
