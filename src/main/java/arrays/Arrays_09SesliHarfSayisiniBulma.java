package arrays;

import java.util.Arrays;

public class Arrays_09SesliHarfSayisiniBulma {

    public static void main(String[] args) {
//        7) Verilen bir String'deki sesli harf sayısını bulunuz.
//        String s = "Apex is an object oriented programming language";


        String str = "Apex is an object oriented programming language";
        int counter = 0;


        String yeniStr[] = str.toLowerCase().split(""); //[a, p, e, x,  , i, s,  , a, n,  , o, b, j, e, c, t,  , o, r, i, e, n, t, e, d,  , p, r, o, g, r, a, m, m, i, n, g,  , l, a, n, g, u, a, g, e]

        System.out.println(Arrays.toString(yeniStr));

        for (String w : yeniStr) {
            switch (w) {
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    counter++;


            }

        } System.out.print("Cumledeki sesli harflerin sayisi: " + counter);
    }
}
