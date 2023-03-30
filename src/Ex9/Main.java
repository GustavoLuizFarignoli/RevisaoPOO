package Ex9;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Object> lista = new ArrayList<>();

        for (int i = 1000; i < 2000; i++){
            if ((i % 11) == 5){
                lista.add(i);
            }
        }

        System.out.println(lista);
    }
}
