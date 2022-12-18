package arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists_01TumOgelerinToplami {

    public static void main(String[] args) {

    //    1) Bir tamsayı listesindeki tüm öğelerinin toplamını bulunuz.

        List<Integer>tamSayilar = new ArrayList<>();
        tamSayilar.add(12);
        tamSayilar.add(-5);
        tamSayilar.add(98);
        tamSayilar.add(0);
        tamSayilar.add(21);
        System.out.println(tamSayilar);   //[12, -5, 98, 0, 21]

    int toplam = 0;


        for (Integer w : tamSayilar){
        toplam = toplam + w;


        }System.out.println(toplam);

    }
}
