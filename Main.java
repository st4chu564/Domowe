package Pliki;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        int min, max;
        Scanner read = new Scanner(System.in);
        System.out.println("Podaj wielkosc tablicy: ");
        int size = read.nextInt();
        int tab[] = new int[size];
        System.out.println("Podaj minimalna wartosc: ");
        min = read.nextInt();
        System.out.println("Podaj maksymalna wartosc: ");
        max = read.nextInt();
        for(int i = 0; i < tab.length; i++){
            tab[i] = ThreadLocalRandom.current().nextInt(min - 5, max + 5);
        }
        List<Integer> wyniki = new ArrayList<>();
        for(int value: tab){
            //System.out.println(value);
            if(value <= max && value >= min)
                wyniki.add(value);
        }

        System.out.println("Znaleziono " + wyniki.size() + " liczby w podanym zakresie, te liczby to: ");
        for(int value: wyniki)
            System.out.println(value);
    }

}
