package ifstatement;

import java.util.Scanner;

public class IfStatement2 {
    public static void main(String[] args) {


/*
    2)
    Aşağıdaki seçenekler doğrultusunda gereken kodu yazınız.
    a) Şifre boşluk karakterinden farklı en az 8 karakter içeriyorsa "Geçerli Şifre"
    b) Herhangi bir pozisyonda şifrede boşluk karakteri varsa "Şifrede boşluk karakteri kullanmayınız"
    c) a ve b koşullarının sağlanmaması durumunda "Geçersiz Şifre"
    Not: Çözümdeki koşulların sıralarına dikkat ediniz.*/

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sifre giriniz");
        String sifre = input.next();


       /* boolean  birinci= sifre.contains("\\s");
        boolean ikinci = sifre.replace("\\s", "").length()>7;

        if(birinci){
            System.out.println("Şifrede boşluk karakteri kullanmayınız");
        } else if (ikinci) {
        System.out.println("Geçerli Şifre");
        }  else {
        System.out.println("Geçersiz Şifre");           */




        if(sifre.replaceAll("\\S", "").length()>0){
            System.out.println("Sifrede bosluk karakteri kullanmayiniz");
        }else if(sifre.replaceAll(" ", "").length()>=8){
            System.out.println("Gecerli Sifre");
        }else{
            System.out.println("Gecersiz Sifre ");


        }
    }

    }


