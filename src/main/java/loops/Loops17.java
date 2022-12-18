package loops;

public class Loops17 {

    public static void main(String[] args) {

     //   Bir tamsayıdaki rakamların toplamını bulmak için kodu yazınız.

int tamsayi = 45698;
int toplam = 0;

        for (int i = tamsayi; i >0; i=i/10) {

       toplam =toplam+ (i%10);

        }
        System.out.println(toplam);


    }



}
