package arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists_09StringFiyatToplami {
    public static void main(String[] args) {
//        9) String bir listede verilen tüm fiyatların toplamını bulunuz.
//        Örnek: List<String> myList = new List<String>{'$12.99', '$23.60', '$54.45'}; ==> 91.04

        List<String> fiyatListesi = new ArrayList<>();
        fiyatListesi.add("$12.99");
        fiyatListesi.add("$23.60");
        fiyatListesi.add( "$54.45");
        System.out.println(fiyatListesi);   //  [$12.99, $23.60, $54.45]

        double toplam = 0;

        for (String w :fiyatListesi){
        Double fiyat = Double.valueOf(w.replace("$",""));

        toplam = toplam +fiyat;



    }
        System.out.println(toplam);











    }












}
