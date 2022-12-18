package ifstatement;

import java.util.Scanner;

public class IfStatement8 {
    public static void main(String[] args) {


/*  10) Verilen BMI değerleri için Vücut Kitle İndeksi (BMI) ile ilgili mesajları yazdırmak için kod
    yazınız.
    Geçersiz BMI değeri < 0
    Zayıf = <18.5
    Normal ağırlık = 18.5–24.9
    Fazla kilolu = 25–29.9
    Obezite = 30 veya daha büyük BMI */
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Vücut Kitle İndeksinizi giriniz");
        double bmi = input.nextDouble();


        if(bmi<0){
        System.out.println("Geçersiz BMI değeri");

        } else if (bmi<18.5) {
        System.out.println("Zayıf");

        }else if (bmi>18.5 && bmi<24.9) {
        System.out.println("Normal Ağırlık");

        }else if (bmi>25 && bmi<29.9 ) {
        System.out.println("Fazla Kilolu");

        }else if (bmi>30) {
        System.out.println("Obezite");
    }
    }
}
