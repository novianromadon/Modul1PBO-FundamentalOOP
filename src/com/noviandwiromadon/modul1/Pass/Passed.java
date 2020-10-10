package com.noviandwiromadon.modul1.Pass;

public class Passed {
    public static void main(String[] args) {
        int nomer1, nomer2;
        TestPass pass = new TestPass(50, 100); // Deklarasi Object
        nomer1 = 10;
        nomer2 = 20;

        //Passed by value
        System.out.println("Nilai sebelum passed by value\t: ");
        System.out.println("nomer1 = " + nomer1);
        System.out.println("nomer2 = " + nomer2);

        pass.calculate(nomer1, nomer2);
        System.out.println("Nilai sesudah passed by value: ");
        System.out.println("nomer1 = " + nomer1);
        System.out.println("nomer2 = " + nomer2);

        System.out.println();

        //Passed by reference
        pass.calculate(nomer1, nomer2);
        System.out.println("Nilai sebelum passed by reference");
        System.out.println("pass.nomer1 = " + pass.nomer1);
        System.out.println("pass.nomer2 = " + pass.nomer2);

        pass.calculate(pass);
        System.out.println("Nilai sesudah passed by reference");
        System.out.println("pass.nomer1 = " + pass.nomer1);
        System.out.println("pass.nomer2 = " + pass.nomer2);
    }
}
