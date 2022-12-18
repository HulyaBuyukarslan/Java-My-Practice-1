package arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayLists_07EnYakinIkiTamSayi {
    public static void main(String[] args) {

//        7) Bir tamsayı listesinde en yakın 2 tamsayıyı bulunuz.
//        Örnek: (12, 31, 15, 13, 54) ==> Çıktı 12 ve 13'tür
        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(6);
        sayilar.add(31);
        sayilar.add(15);
        sayilar.add(13);
        sayilar.add(54);
        Collections.sort(sayilar);
//        System.out.println(sayilar);   //  [6, 13, 15, 31, 54]

        int minFark = sayilar.get(1) - sayilar.get(0);

        for (int i = 1; i < sayilar.size(); i++) {
        minFark = Math.min(minFark, sayilar.get(i) - sayilar.get(i - 1));


        }
        for (Integer i = 1; i < sayilar.size(); i++) {
            if (minFark ==  sayilar.get(i) - sayilar.get(i - 1) ) {
                System.out.println(sayilar.get(i) + "  and  " + sayilar.get(i - 1));

            }

        }


    }

}