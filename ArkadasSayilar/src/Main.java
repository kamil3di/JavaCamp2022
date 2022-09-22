public class Main {
    public static void main(String[] args) {
        int arkadas1 = 220;
        int arkadas2 = 284;
        int toplam1 = 0;
        int toplam2 = 0;

        for (int i = 1; i < arkadas1; i++){
            if (arkadas1%i==0){
                toplam1 += i;
            }
        }

        for (int i = 1; i < arkadas2; i++){
            if (arkadas2%i==0){
                toplam2 += i;
            }
        }

        if (arkadas1==toplam2 && arkadas2==toplam1){
            System.out.println("Bu sayilar arkadastir.");
        }
        else{
            System.out.println("Bu sayilar arkadas degildir.");
        }
    }
}