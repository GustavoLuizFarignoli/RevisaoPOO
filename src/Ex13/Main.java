package Ex13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Quantos números inteiros você precisa contar ?");
        int n = teclado.nextInt();
        int[] list = preencher(n, teclado);
        System.out.println("A soma é " + sum(list));
        avarage(list);
        maxmin(list);
    }

    public static int[] preencher(int n, Scanner teclado){
        int[] list = new int[n];
        for (int i = 0; i < list.length; i++){
            System.out.println("Digite o " + (i+1) + " número");
            list[i] = teclado.nextInt();
        }
        return list;
    }

    public static int sum(int[] list){
        int sum = 0;
        for (int i = 0; i < list.length; i++){
            sum += list[i];
        }
        return sum;
    }

    public static void avarage(int[] list){
        double sum = sum(list);
        double avarage = (sum / list.length);
        System.out.println("A média é " + avarage);
    }

    public static void maxmin(int[] list){
        int max = -100;
        int min = 100;
        for (int i = 0; i < list.length; i++){
            if (list[i] > max){
                max = list[i];
            }
            if (min > list[i]){
                min = list[i];
            }
        }
        System.out.println("O maior valor é "+ max);
        System.out.println("O menor valor é "+ min);
    }
}
