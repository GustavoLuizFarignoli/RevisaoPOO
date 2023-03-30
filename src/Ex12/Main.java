package Ex12;

import java.util.*;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Quantos números você precisa organizar ?");
        int n = teclado.nextInt();
        ArrayList<Double> list = new ArrayList<Double>();
        append(n,list,teclado);
    }

    public static void append(int n, ArrayList<Double> list, Scanner teclado){
        for (int i = 0; i < n;i++){
            System.out.println("Digite o número");
            list.add(teclado.nextDouble());
        }
        list.sort(Comparator.naturalOrder());
        System.out.println(list);
    }

}
