import java.util.Scanner;

public class Main {

    public static double ortalamabul(double[] array) {
        int toplam = 0;
        for (int i = 0; i < array.length; i++) {
            toplam += array[i];
        }
        return ((double) toplam / array.length);
    }
    public static void enBuyukEnKucukBul(double[] notlar) {
        double enBuyuk = notlar[0];
        double enKucuk = notlar[0];

        for (int i = 1; i < notlar.length; i++) {
            if (notlar[i] > enBuyuk) {
                enBuyuk = notlar[i];
            } else if (notlar[i] < enKucuk) {
                enKucuk = notlar[i];
            }
        }

        System.out.println("En Büyük Not: " + enBuyuk);
        System.out.println("En Küçük Not: " + enKucuk);
    }
    public static void notlariYazdir(double[] notlar) {
        System.out.println("Notlar (Sıralanmamış): ");
        for (int i =0;i<15;i++) {
            System.out.println((i+1)+" . not:  "+notlar[i]);
        }
        System.out.println();
    }
    public static void notlariSiralaKucuktenBuyuge(double[] notlar) {
        for (int i = 0; i < notlar.length - 1; i++) {
            for (int j = 0; j < notlar.length - i - 1; j++) {
                if (notlar[j] > notlar[j + 1]) {
                    double temp = notlar[j];
                    notlar[j] = notlar[j + 1];
                    notlar[j + 1] = temp;
                }
            }
        }

        System.out.println("Sıralanmış Notlar: ");
        for (double not : notlar) {
            System.out.print(not + " ");
        }
        System.out.println();
    }
    public static void notlariSiralaBuyuktenKucuge(double[] notlar) {
        for (int i = 0; i < notlar.length - 1; i++) {
            for (int j = 0; j < notlar.length - i - 1; j++) {
                if (notlar[j] < notlar[j + 1]) {

                    double temp = notlar[j];
                    notlar[j] = notlar[j + 1];
                    notlar[j + 1] = temp;
                }
            }
        }

        System.out.println("Büyükten Küçüğe Sıralanmış Notlar: ");
        for (double not : notlar) {
            System.out.print(not + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] notlar1 = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + ".Notu Giriniz:");
            notlar1[i] = scanner.nextDouble();
        }
        System.out.println("1.Ogrencinin notlarının ortalaması: " + ortalamabul(notlar1));

        System.out.println("*********************************************************");
        double[] notlar2 = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + ".Notu Giriniz:");
            notlar2[i] = scanner.nextDouble();
        }
        System.out.println("2.Ogrencinin notlarının ortalaması: " + ortalamabul(notlar2));

        System.out.println("*********************************************************");
        double[] notlar3 = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + ".Notu Giriniz:");
            notlar3[i] = scanner.nextDouble();
        }
        System.out.println("3.Ogrencinin notlarının ortalaması: " + ortalamabul(notlar3));

        System.out.println("*********************************************************");
        double[] notlar4 = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + ".Notu Giriniz:");
            notlar4[i] = scanner.nextDouble();
        }
        System.out.println("4.Ogrencinin notlarının ortalaması: " + ortalamabul(notlar4));
        System.out.println();
        System.out.println("*********************************************************");
        double[] notlar5 = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + ".Notu Giriniz:");
            notlar5[i] = scanner.nextDouble();
        }
        System.out.println("5.Ogrencinin notlarının ortalaması: " + ortalamabul(notlar5));

        System.out.println("*********************************************************");
        double[] tumNotlar = new double[15];
        int index = 0;
        for (int i = 0; i < notlar1.length; i++) {
            tumNotlar[index] = notlar1[i];
            index++;
        }
        for (int i = 0; i < notlar2.length; i++) {
            tumNotlar[index] = notlar2[i];
            index++;
        }
        for (int i = 0; i < notlar3.length; i++) {
            tumNotlar[index] = notlar3[i];
            index++;
        }
        for (int i = 0; i < notlar4.length; i++) {
            tumNotlar[index] = notlar4[i];
            index++;
        }
        for (int i = 0; i < notlar5.length; i++) {
            tumNotlar[index] = notlar5[i];
            index++;
        }
        notlariYazdir(tumNotlar);
        enBuyukEnKucukBul(tumNotlar);
        System.out.println();
        notlariSiralaKucuktenBuyuge(tumNotlar);
        System.out.println();
        notlariSiralaBuyuktenKucuge(tumNotlar);
    }
}