package basico;

import java.util.Scanner;

public class DownloadDePacotes {
    public static void main(String [] args){
        Scanner leitor = new Scanner(System.in);
        int tamanho = leitor.nextInt();

        for (int i = 1; i <= tamanho; i++) {
            System.out.print("/");
        }
    }
}