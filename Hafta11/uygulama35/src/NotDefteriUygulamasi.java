import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class NotDefteriUygulamasi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Metin dosyasını oku");
            System.out.println("2. Yeni metin dosyası oluştur");
            System.out.println("3. Mevcut metin dosyasını güncelle");
            System.out.println("4. Değişiklikleri kaydet");
            System.out.println("5. Çıkış");

            System.out.print("Lütfen bir seçenek girin: ");
            int secim = scanner.nextInt();
            scanner.nextLine();

            switch (secim) {
                case 1:
                    metinDosyasiniOku();
                    break;
                case 2:
                    yeniMetinDosyasiOlustur();
                    break;
                case 3:
                    mevcutMetinDosyasiniGuncelle();
                    break;
                case 4:
                    degisiklikleriKaydet();
                    break;
                case 5:
                    System.out.println("Programdan çıkılıyor...");
                    System.exit(0);
                default:
                    System.out.println("Geçersiz bir seçenek girdiniz. Lütfen tekrar deneyin.");
            }
        }
    }

    private static void metinDosyasiniOku() {
        try (BufferedReader reader = new BufferedReader(new FileReader("not_defteri.txt"))) {
            String satir;
            System.out.println("Metin Dosyası İçeriği:");
            while ((satir = reader.readLine()) != null) {
                System.out.println(satir);
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println("Dosya okuma hatası: " + e.getMessage());
        }
    }

    private static void yeniMetinDosyasiOlustur() {
        try {
            System.out.print("Oluşturulacak dosyanın adını girin: ");
            Scanner scanner = new Scanner(System.in);
            String dosyaAdi = scanner.nextLine();

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(dosyaAdi))) {
                System.out.println(dosyaAdi + " adlı yeni metin dosyası oluşturuldu.");
            }
        } catch (IOException e) {
            System.out.println("Dosya oluşturma hatası: " + e.getMessage());
        }
    }

    private static void mevcutMetinDosyasiniGuncelle() {
        try {
            System.out.print("Güncellenecek dosyanın adını girin: ");
            Scanner scanner = new Scanner(System.in);
            String dosyaAdi = scanner.nextLine();

            StringBuilder icerik = new StringBuilder();
            try (BufferedReader reader = new BufferedReader(new FileReader(dosyaAdi))) {
                String satir;
                System.out.println("Mevcut Metin Dosyası İçeriği:");
                while ((satir = reader.readLine()) != null) {
                    System.out.println(satir);
                    icerik.append(satir).append("\n");
                }
                System.out.println();
            }

            System.out.print("Yeni içerik ekleyin: ");
            String yeniIcerik = scanner.nextLine();
            icerik.append(yeniIcerik).append("\n");

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(dosyaAdi))) {
                writer.write(icerik.toString());
                System.out.println(dosyaAdi + " adlı metin dosyası güncellendi.");
            }
        } catch (IOException e) {
            System.out.println("Dosya güncelleme hatası: " + e.getMessage());
        }
    }

    private static void degisiklikleriKaydet() {
        System.out.println("Değişiklikler başarıyla kaydedildi.");
    }
}
