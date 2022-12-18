package arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists_02BirOgedenOncekiTumOgelerinToplami {

    public static void main(String[] args) {


        // Bir tamsayı listesinde 13 öğesinden önceki tüm liste öğelerinin toplamını bulunuz.

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(12);
        sayilar.add(4);
        sayilar.add(-6);
        sayilar.add(10);
        sayilar.add(13);
        sayilar.add(-45);
       int toplam = 0;


        for (Integer w : sayilar){

            if(w == 13){
                break;
                  }
            toplam+= w;
        }System.out.println(toplam);

    }
}