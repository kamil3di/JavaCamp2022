public class Main {
    public static void main(String[] args) {

        int sayi = 61;
        boolean isPrime = true;

        if (sayi == 1){
            System.out.println("Sayi asal degildir!");
            return;
        }

        if (sayi < 1){
            System.out.println("Sayi negatiftir!");
            return;
        }

        for (int i = 2; i < sayi; i++){
            if ( (sayi % i) == 0 ){
                isPrime = false;
            }
        }

        if (isPrime){
            System.out.println("Sayi asaldir!");
        }
        else{
            System.out.println("Sayi asal degildir!");
        }
    }
}