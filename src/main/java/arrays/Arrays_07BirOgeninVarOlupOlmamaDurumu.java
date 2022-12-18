package arrays;

public class Arrays_07BirOgeninVarOlupOlmamaDurumu {

    public static void main(String[] args) {

//        9) Verilen bir String arraydeki belirli bir öğenin var olup olmadığını bulmak için kod yazınız.

        String str = "Apex is an object oriented programming language";

        String kelimeler[] = str.split(" ");
        String arananKelime = "language";

        int counter = 0;
        for (String w : kelimeler) {
            if (w.contains("language")) {
                counter++;
            }


        }
        if (counter == 0) {
            System.out.println(arananKelime + " Arrayde Yoktur");
        } else {
            System.out.println(arananKelime + " Arrayde " + counter + " kere vardir");


        }

        }
    }















