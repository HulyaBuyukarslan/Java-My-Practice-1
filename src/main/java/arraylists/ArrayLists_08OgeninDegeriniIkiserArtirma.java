package arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists_08OgeninDegeriniIkiserArtirma {
    public static void main(String[] args) {
//        8) Listedeki 7 ve 10 dışındaki her öğenin değerini 2'şer artırınız.
//        Örnek: (12, 31, 7, 13, 10) ==> Çıktı (14, 33, 7, 15, 10)

        List<Integer> numaralar = new ArrayList<>();
        numaralar.add(12);
        numaralar.add(31);
        numaralar.add(7);
        numaralar.add(13);
        numaralar.add(10);
        System.out.println(numaralar);   //   [12, 31, 7, 13, 10]


        for (Integer w : numaralar ){
        if(w == 7 || w ==10){
            continue;
        }numaralar.set(numaralar.indexOf(w),w+2);

    }
        System.out.println(numaralar);   //       [14, 33, 7, 15, 10]
    }


}



