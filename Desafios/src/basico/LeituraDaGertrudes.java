package basico;

import java.util.Scanner;

public class LeituraDaGertrudes {
    public static void main(String [] args) {
        Scanner leitor = new Scanner(System.in);
        int paginas = leitor.nextInt();
        int paginasLidas = 3;
        int cont = 0;

        for (int i = 1; i <= paginas; i += paginasLidas) {
            cont ++;
        }
        System.out.println(cont + " dias");
    }
}
