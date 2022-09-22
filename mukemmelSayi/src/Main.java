public class Main {
    public static void main(String[] args) {
        int number = 496;
        int total = 0;

        for(int i = 1; i < number; i++){
            if ( number % i == 0 ){
                total += i;
            }
        }
        if (number == total){
            System.out.println("Sayi mukemmeldir!");
        }
        else{
            System.out.println("Sayi mukemmel degildir!");
        }
    }
}