package arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayLists_10StringFiyatToplami {
    public static void main(String[] args) {

//        10) Bir String listesinde verilen en düşük ve en büyük fiyatın toplamını bulunuz.
//        Örnek: List<String> myList = new List<String>{'$12.99', '$8.25', '$23.60', '$54.45'}; ==> 62.70

        List<String> fiyatListesi = new ArrayList<>();
        fiyatListesi.add("$12.99");
        fiyatListesi.add("$8.25");
        fiyatListesi.add("$23.60");
        fiyatListesi.add("$54.45");

     List<Double>ondalikliListe=new ArrayList<>();

        for (String w : fiyatListesi){

        Double fiyat   =Double.valueOf( w.replace("$",""));

        ondalikliListe.add(fiyat);

     } Collections.sort(ondalikliListe);
        Double toplam = ondalikliListe.get(0)+ondalikliListe.size()-1;
        System.out.println(toplam);
    }
}
