package Exercise;

import java.util.Scanner;

public class Kvadrat {

public Kvadrat (){}


    public void makeKvadrat() {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {


        for (int j = 0; j < size; j++) {
            System.out.print(" * ");

        }
            System.out.println();
    }
    }
}
