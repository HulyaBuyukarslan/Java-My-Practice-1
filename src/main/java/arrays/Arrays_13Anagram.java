package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_13Anagram {

    public static void main(String[] args) {

//        13) Kullanıcıdan 2 String girmesini isteyiniz. Stringlerin karakterleri ve karakter sayıları aynıysa
//        konsola "Anagramdır" yazdırın. Aksi takdirde, konsolda "Anagram Değil" yazdırınız.
//                Örneğin; "Mary" ve "army" ve "RAMY" Anagramlardır.


        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen iki kelime giriniz");
        String kelime1 = input.nextLine();
        String kelime2 = input.nextLine();

    String a1 [] = kelime1.toLowerCase().split("");
        Arrays.sort(a1);

    String a2 []= kelime2.toLowerCase().split("");
    Arrays.sort(a2);

if(kelime1.length()!=kelime2.length()){
    System.out.println("Anagram degil");
}else if (kelime1.isEmpty()||kelime2.isEmpty()){
    System.out.println("Anagram degil");
}else if(Arrays.equals(a1,a2)){
    System.out.println( "Anagramdir");
}else {
    System.out.println("Anagram degil");
}






    }






}
