package com.company;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int chislo = in.nextInt();
        int mnozhitel = in.nextInt();
        int n = chislo;
        for (int i = 1; i < mnozhitel; i++) {
            chislo += n;
        }
        System.out.print(chislo);
    }
}
