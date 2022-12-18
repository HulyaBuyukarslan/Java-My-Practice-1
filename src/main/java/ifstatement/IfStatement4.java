package ifstatement;

import java.util.Scanner;

public class IfStatement4 {
    public static void main(String[] args) {

/*
4)  Aşağıdaki seçenekler doğrultusunda gereken kodu yazınız.

    a) Son basamak 5 ‘e eşit ve 5 den büyükse, yuvarlama işlemi: “Son basamağı bir üst ondalığa
    yuvarla”
    b) Son basamak 5 den küçükse, yuvarlama işlemi: “Son basamağı bir alt ondalığa yuvarla” */
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int sayi = input.nextInt();

   /* if(sayi%10>=5){
        System.out.println("Son basamağı bir üst ondalığa yuvarla");
   else if (sayi%10<5) {
    System.out.println("Son basamağı bir alt ondalığa yuvarla");  */

        if (sayi % 10 >= 5) {
            System.out.println("Son basamağı bir üst ondalığa yuvarla :" + (sayi / 10 + 1) * 10);
        } else {
            System.out.println("Son basamağı bir alt ondalığa yuvarla :" + (sayi / 10) * 10);
        }

    }

}