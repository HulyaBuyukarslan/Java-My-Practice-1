package loops;

import java.util.Scanner;

public class Loops12 {
    public static void main(String[] args) {
//        Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.
//        A A A A A A A A
//        A X X X X X X A
//        A X X X X X X A
//        A X X X X X X A





        /*  Scanner input = new Scanner(System.in);
        System.out.println("Sutun satir sayisi giriniz...");
        int str = input.nextInt();
        System.out.println("Blok sayisi giriniz...");
        int blk = input.nextInt();

        int j, i;

        for ( i = 1; i <= str; i++) {

            for (j = 1; j <= blk; j++) {
                if (i==1 || i==str) {
                    System.out.print("A ");
                } else if ((j == 1 || j == blk)) {
                    System.out.print("A ");
                }else if (j != 1 || j != blk) {
                    System.out.print("X ");
                }
            }
            System.out.println(); //bitis
        }
                                                */


//        A A A A A A A A
//        A X X X X X X A
//        A X X X X X X A
//        A X X X X X X A

//        for (int i = 1; i <= 4; i++) {
//            String srt = "";
//            if (i == 1) {
//                srt = srt + 'A';
//                for (int k = 2; k < 8; k++) {
//                    srt = srt + 'A';
//                }
//                srt = srt + 'A';
//                System.out.println(srt+" ");
//            } else {
//                srt = srt + 'A';
//                for (int k = 2; k < 8; k++) {
//                    srt = srt + 'X';
//                }
//                srt = srt + 'A';
//                System.out.println(srt+" ");
//


        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 8; j++) {
                if (j >= 2 && j < 7 && i != 1 && i != 4) {
                    System.out.print("*");
                } else System.out.print("A");
            }
            System.out.println();
        }

    }


}

