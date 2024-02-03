import java.util.Scanner;

class Kitap {
    private String ad;
    private String yazar;
    private int yayinYili;

    public Kitap(String ad, String yazar, int yayinYili) {
        this.ad = ad;
        this.yazar = yazar;
        this.yayinYili = yayinYili;
    }

    public void bilgileriGoster() {
        System.out.println("Kitabın Adı: " + ad + "\nYazarı: " + yazar + "\nYayın Yılı:" + yayinYili);

    }
    public static void belirliYilinUstundekiKitaplariYazdir(Kitap[] kitaplar, int yil) {
        for (int i = 0; i < kitaplar.length; i++) {
            Kitap kitap = kitaplar[i];
            if (kitap.yayinYili > yil) {
                System.out.println("Ad: " + kitap.ad + ", Yazar: " + kitap.yazar + ", Yayın Yılı: " + kitap.yayinYili);
            }
        }
    }
    public static void belirliYazarinKitaplariniYazdir(Kitap[] kitaplar, String yazar) {
        for (int i = 0; i < kitaplar.length; i++) {
            Kitap kitap = kitaplar[i];
            if (kitap.yazar.equals(yazar)) {
                System.out.println("Ad: " + kitap.ad + ", Yazar: " + kitap.yazar + ", Yayın Yılı: " + kitap.yayinYili);
            }
        }

    }
}
    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Kitap kitap1 = new Kitap("Kitap1", "Yazar1", 2020);
            Kitap kitap2 = new Kitap("Kitap2", "Yazar1", 2021);
            Kitap kitap3 = new Kitap("Kitap3", "Yazar3", 2022);
            Kitap kitap4 = new Kitap("Kitap4", "Yazar3", 2023);
            Kitap kitap5 = new Kitap("Kitap5", "Yazar3", 2024);
            Kitap[] kitaplar = {kitap1, kitap2, kitap3,kitap4,kitap5};
            tumKitapBilgileri(kitaplar);
            System.out.println("Hangi yılın üzerindeki kitapları yazdırmak istiyorsunuz?");
            int yıl = scanner.nextInt();
            scanner.nextLine();
            Kitap.belirliYilinUstundekiKitaplariYazdir(kitaplar,yıl);;
            System.out.println("**********************************");
            System.out.println("Hangi yazarın kitaplarını  yazdırmak istiyorsunuz?");
            String yazar= scanner.nextLine();
            Kitap.belirliYazarinKitaplariniYazdir(kitaplar,yazar);
        }
        public static void tumKitapBilgileri(Kitap[] kitaplar) {
            for (int i = 0; i < kitaplar.length; i++) {
                kitaplar[i].bilgileriGoster();
                System.out.println("**********************************");
            }


        }
    }

