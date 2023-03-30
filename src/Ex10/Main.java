package Ex10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual fatorial deseja realizar");
        System.out.println(fatorial(teclado.nextInt()));
    }

    public static int fatorial (int num){
        int result = 1;
        for (int i = 1; i < num+1; i++){
                result *= i;
        }
        return result;
    }
}
