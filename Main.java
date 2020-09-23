package com.test;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int n = (int)(Math.random() * 101);
        System.out.println(n);
        int nbplayer;

        do {
            Scanner myObj = new Scanner(System.in);
            System.out.println("Entrez un nombre: ");
            nbplayer = myObj.nextInt();

            if (nbplayer < n) {
                System.out.println("C'est plus!");
            }
            else if (nbplayer > n) {
                System.out.println("C'est moins!");

            }
        }
        while (nbplayer != n);

        System.out.println("Bravo! Vous avez trouvé!");
    }
}
