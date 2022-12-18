package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Arrays_03EnKucukPozitifEnBuyukNegatif {

    public static void main(String[] args) {
//        3) Tamsayılardan oluşan bir arrayde en küçük pozitif elemanı ve en büyük negatif elemanı
//        bulunuz.
//                Örnek:(-12, 18, -5, 23, -2) ==> En küçük pozitif 18, en büyük negatif -2

        int sayilar[] = {-12, 18, -5, 23, -2};
        Arrays.sort(sayilar);
        System.out.println(Arrays.toString(sayilar));    //       [-12, -5, -2, 18, 23]
        int enBuyukNegatif = sayilar[0];
        int enKucukPozitif = sayilar[sayilar.length - 1];

        for (int w : sayilar) {
            if (w < 0) {

                enBuyukNegatif = Math.max(enBuyukNegatif, w);

            }
            if (w > 0) {
                enKucukPozitif = Math.min(enKucukPozitif, w);
            }


        }
                     System.out.println(enBuyukNegatif);
                    System.out.println(enKucukPozitif);

    }


    }
