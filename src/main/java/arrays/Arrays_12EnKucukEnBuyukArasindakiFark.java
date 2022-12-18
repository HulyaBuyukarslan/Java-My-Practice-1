package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Arrays_12EnKucukEnBuyukArasindakiFark {

    public static void main(String[] args) {

//        12) Kullanıcıdan aldığınız tamsayılar ile bir array oluşturunuz ve bu arraydeki en küçük ve en
//        büyük öğeler arasındaki farkı konsolda yazdırınız.

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen array uzunlugunu giriniz");

        int uzunluk=input.nextInt();
        int tamSayilar [] = new int[uzunluk];
        System.out.println("Girilen array elemanlari:" +uzunluk);
        for (int i = 0; i < uzunluk; i++) {
            tamSayilar[i]=input.nextInt();

        }
        System.out.println(Arrays.toString(tamSayilar));

        Arrays.sort(tamSayilar);
        System.out.println(Arrays.toString(tamSayilar));
        int enBuyukEnKucukFark = tamSayilar[tamSayilar.length-1]-tamSayilar[0];
        System.out.println(enBuyukEnKucukFark);




    }


}
