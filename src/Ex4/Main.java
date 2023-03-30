package Ex4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o dia do seu aniversário");
        int dia = teclado.nextInt();
        System.out.println("Digite o mes do seu aniversário");
        int mes = teclado.nextInt();
        System.out.println("Digite o ano do seu aniversário");
        int ano = teclado.nextInt();
        Pessoa pessoa = new Pessoa(dia,mes,ano);
        System.out.println(pessoa.idade());
    }
}
