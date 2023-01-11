package intermediario;

import java.util.Scanner;

public class CamaroteDoBlueColdIceCubes {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int tamanhoDaFila = leitor.nextInt();
        int pessaosNoCamarote = 0;

        for (int i = 0; i <= tamanhoDaFila; i++) if (i % 2 == 1) pessaosNoCamarote++;

        System.out.println(pessaosNoCamarote + " pessoas no camarote");
    }
}
