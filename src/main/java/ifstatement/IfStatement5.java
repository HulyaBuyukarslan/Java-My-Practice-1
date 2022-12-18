package ifstatement;

public class IfStatement5 {
    public static void main(String[] args) {


 /* 5)Aşağıdaki seçenekler doğrultusunda gereken kodu yazınız.
    a) Bir üçgenin iki kenarının uzunluğu eşitse "İkizkenar Üçgen".
    b) Bir üçgenin tüm kenarlarının uzunluğu eşitse "Eşkenar Üçgen".
    c) a ve b koşulları sağlanmıyorsa "Çeşit Kenar Üçgen" */

        int kenar1 = 5;
        int kenar2 = 4;
        int kenar3 = 4;
        if (kenar1 == kenar2 && kenar1 != kenar3 ||
                kenar1 == kenar3 && kenar2 != kenar3 ||
                kenar2 == kenar3 && kenar2 != kenar1) {
            System.out.println("İkizkenar Üçgen");

        } else if (kenar1 == kenar2 && kenar1 == kenar3) {
            System.out.println("Eşkenar Üçgen");

        } else {
            System.out.println("Çeşitkenar Üçgen");

        }

    }
}