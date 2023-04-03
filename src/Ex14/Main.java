package Ex14;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Quantos números inteiros você precisa contar ?");
        int n = teclado.nextInt();
        ArrayList<Integer> list = preencher(n, teclado);
        System.out.println("A soma é " + sum(list));
        avarage(list);
        maxmin(list);
    }

    public static ArrayList<Integer> preencher(int n, Scanner teclado){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++){
            System.out.println("Digite o " + (i+1) + " número");
            list.add(teclado.nextInt());
        }
        return list;
    }

    public static int sum(ArrayList<Integer> list){
        int sum = 0;
        for (int i = 0; i < list.size(); i++){
            sum += list.get(i);
        }
        return sum;
    }

    public static void avarage(ArrayList<Integer> list){
        double sum = sum(list);
        double avarage = (sum / list.size());
        System.out.println("A média é " + avarage);
    }

    public static void maxmin(ArrayList<Integer> list){
        int max = -100;
        int min = 100;
        for (int i = 0; i < list.size(); i++){
            if (list.get(i) > max){
                max = list.get(i);
            }
            if (min > list.get(i)){
                min = list.get(i);
            }
        }
        System.out.println("O maior valor é "+ max);
        System.out.println("O menor valor é "+ min);
    }
}
