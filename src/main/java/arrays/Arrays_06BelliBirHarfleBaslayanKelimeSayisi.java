package arrays;

public class Arrays_06BelliBirHarfleBaslayanKelimeSayisi {
    public static void main(String[] args) {
      //  6) Verilen bir String'de 'a' veya 'A' ile başlayan kelimeyi sayısını bulunuz.

        String str  = "Apex is an object oriented programming language";
    String kelime[] =str.split(" ");
    int counter = 0;
for (String w : kelime){

if(w.startsWith("a") || w.startsWith("A")){
        counter++;
}
}
        System.out.println(counter);

    }





}
