package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // paprasyti tekso
        System.out.println("Iveskite zodi");
        //susikurti skaneri
        Scanner sc = new Scanner(System.in);
        // is skanerio pasiimti nauja teksto eilute
        String zodis = sc.nextLine();

        dirbkSuZodziu(zodis);


    }

    // pasirasyti method
    public static void dirbkSuZodziu(String zodis) {
        // method per parametrus duoti zodi
        // patikrinti ar zodis yra skaicius(panaudoti try catch)
        boolean arZodis = true;
        try {
            Float.parseFloat(zodis);
            arZodis = false;
        } catch (Exception klaida) {
            System.out.println("Ne zodis");
        }
        // Try catch viduje naudoti Float.parseFloat
        // jeigu zodis yra ne skaicius suskaiciuoti a raidziu kieki
        if (arZodis == true) {
            int kiekis = 0;
            for (int i = 0; i < zodis.length(); i++){
                char simbolis = zodis.charAt(i);
                if (simbolis == 'a' || simbolis == 'A'){
                    if (i+1 < zodis.length()){
                        simbolis = zodis.charAt(i+1);
                        if(simbolis == 'b' || simbolis == 'B'){
                            kiekis++;
                    }
                }
                 }
            }
            System.out.println("A raidziu kiekis yra: " + kiekis);
        }
        // per zodi pereiti su for ciklu
        // zodzio raide pasiimti per zodis.charAt(i)

    }
}
