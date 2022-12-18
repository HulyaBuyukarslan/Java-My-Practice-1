package loops;

public class Loops10 {
    public static void main(String[] args) {
//        Verilen ondalık sayının sadece ondalık kısmındaki rakamlarını, kendisinden önce bir yıldız
//        işaretiyle yazdırmak için gereken kodu yazınız.
//        Örneğin; 75.4238 ´ *4*2*3*8
     double sayi = 75.4238;

    String yeniSayi =String.valueOf(sayi);
    String ondalik = yeniSayi.split("\\.")[01];
    for (int i = 0; i <ondalik.length() ; i++) {
          char ch = ondalik.charAt(i);

          System.out.print("*" +ch);

        }
    }
}
