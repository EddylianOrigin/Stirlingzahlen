package com.company;

import java.util.Scanner;

/**
 * Implementieren Sie in einem System Ihrer Wahl ein rekursives Verfahren zur Bestimmung aller
 * Partitionen einer n-elementigen Menge in m Teile.
 */
class Stirlingzahlen {
public static int S(int n, int m){
        int s = 0;
        if (n<0 || m<0) {
            s = 0;
        }
        else if (n-1 < m-1) {
            s = 0;
        }
        else if (n == 0 && m ==0) {
            s = 1;
        }
        else if (m == 0) {
            s = 0;
        }

        else s = S(n-1, m-1) + m * S(n-1, m);

        return s;
    }
    public static void main(String[] args) {
        System.out.println(S(5,3));
        System.out.println(S(7,3));
        System.out.println(S(3,2));
        System.out.println(S(-3,2));
        System.out.println("Geben Sie n ein: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("Geben Sie m ein: ");
        int m = scan.nextInt();
        int s = S(n,m);
        System.out.println("Die Stirlingzahl von " + n + " und " + m + " ist " + s);
    // write your code here
 }
}
