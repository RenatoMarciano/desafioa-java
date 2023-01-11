package basico;

import java.util.Scanner;

public class MesadaDoSobrinho {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        //System.out.println("Informa o Mês:");
        int entrada = leitor.nextInt();
        int mesada = 50;
        int soma = (entrada * mesada);

        //System.out.println("Voce tera " + (entrada * mesada) + " reais");
        System.out.println(soma);
    }
}
