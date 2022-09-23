public class Main {

    public static void main(String[] args){

        DortIslem dortIslem = new DortIslem();
        int toplam = dortIslem.topla(3,4);
        System.out.println("Ikili toplama islemi: " +toplam);
        int toplam2 = dortIslem.topla(3,4,5);
        System.out.println("Uclu toplama islemi: " +toplam2);
    }
}