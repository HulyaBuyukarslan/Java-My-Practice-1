package arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists_11OgelerinTekrarsizOlupOlmamaDurumu {
    public static void main(String[] args) {
//        11) Döngüleri kullanarak tamsayılardan oluşan bir listenin tüm öğelerinin benzersiz (tekrarsız)
//        olup olmadığını kontrol ediniz.

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(12);
        sayilar.add(-9);
        sayilar.add(7);
        sayilar.add(10);
        sayilar.add(8);
        sayilar.add(6);
        sayilar.add(25);

        List<Integer> yeniSayilar = new ArrayList<>();

        for (Integer w : sayilar) {
            if (sayilar.indexOf(w) == sayilar.lastIndexOf(w)) {
                yeniSayilar.add(w);

            }


        }
        if (sayilar.size() == yeniSayilar.size()) {
            System.out.println("Tekrarlayan oge yoktur");
        } else {
            System.out.println("En az bir tane tekrarlayan oge vardir.");


        }

    }


}