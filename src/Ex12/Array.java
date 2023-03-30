package Ex12;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Quantos números você precisa organizar ?");
        int n = teclado.nextInt();
        double[] list = new double[n];
        list = append(n,list,teclado);
        System.out.println(list); //Falta o metodo integral

    }

    public static double[] append(int n, double[] list, Scanner teclado){
        for (int i = 0; i < n;i++){
            System.out.println("Digite o número");
            list[i] = teclado.nextDouble();
        }
        return sort(list);
    }

    public static double[] sort(double[] list){
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++){
                if (list[i] > list[j]){
                    list[j] = list[i];
                    break;
                }
            }
        }
        return list;
    }
}
