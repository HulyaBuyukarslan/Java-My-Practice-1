package arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayLists_04AzalanSıradaOlmaDurumu$ {
    public static void main(String[] args) {

//        4) Bir listedeki öğelerin azalan sırada olup olmadığını kontrol ediniz.
//                Örnek: (Yellow, Blue, Red, Green) ==> Çıktı: Azalan sırada değil
//                (Yellow, Red, Green, Blue) ==> Çıktı: Azalan sıradadır


        List<String> renkler1 = new ArrayList<>();
        renkler1.add("Yellow");
        renkler1.add("Blue");
        renkler1.add("Red");
        renkler1.add("Green");

        List<String> renkler2 = new ArrayList<>();
        renkler2.addAll(renkler1);

        Collections.sort(renkler2);

        System.out.println(renkler1);           // [Yellow, Blue, Red, Green]
        System.out.println(renkler2);           //  [Blue, Green, Red, Yellow]

    int size = renkler1.size();
    int counter = 0;
        for (int i = 0; i < size ; i++) {
        if( renkler2.get(i).equals(renkler1.get(size-1-i))){
            counter++;



        }

            }if(counter==size){
            System.out.println("Azalan siradadir");
        }else{
            System.out.println("Azalan sirada degil");
        }
    }

}














