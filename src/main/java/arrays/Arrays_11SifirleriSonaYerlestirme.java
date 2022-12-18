package arrays;

import java.util.Arrays;

public class Arrays_11SifirleriSonaYerlestirme {

    public static void main(String[] args) {

        //      11) Tamsayılardan oluşan arrayde bulunan sıfırları, array sonuna yerleştiren kod yazınız.
        //          Örnek: (5, 0, 2, 0, 3) ==>
        int sayilar []= {5, 0, 2, 0, 3};
        int yeniSayilar [] =new int[sayilar.length];

        int index= 0;


        for (int i = 0; i < sayilar.length; i++) {

       if(sayilar[i]!=0){
           yeniSayilar[index]=sayilar[i];
            index++;
       }
            }
        System.out.println(Arrays.toString(yeniSayilar));

    }
}




