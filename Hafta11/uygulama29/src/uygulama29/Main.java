
package uygulama29;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

class Kitap {
    private String ad;
    private String yazar;
    private int yayinYili;
    private String ISBN;

    public Kitap(String ad, String yazar, int yayinYili, String ISBN) {
        this.ad = ad;
        this.yazar = yazar;
        this.yayinYili = yayinYili;
        this.ISBN = ISBN;
    }
    

    public String getYazar() {
		return yazar;
	}


	public void setYazar(String yazar) {
		this.yazar = yazar;
	}


	public void bilgiYazdir() {
        System.out.println("Ad: " + ad);
        System.out.println("Yazar: " + yazar);
        System.out.println("Yay�n Y�l�: " + yayinYili);
        System.out.println("ISBN: " + ISBN);
    }

    @Override
    public String toString() {
        return ad + "," + yazar + "," + yayinYili + "," + ISBN;
    }
}

class Kutuphane {
    private List<Kitap> kitapListesi = new ArrayList<>();

    public void kitapEkle(Kitap kitap) throws CustomException {
        if (kitap == null || kitapListesi.contains(kitap)) {
            throw new IllegalArgumentException("Ge�ersiz kitap veya kitap zaten k�t�phanede bulunuyor.");
        }
        if (kitap.getYazar().matches(".*\\d.*")) {
            throw new CustomException("Yazar isminde say� bulunamaz.");
        }

        kitapListesi.add(kitap);
    }

    public void kitapListele() {
        if (kitapListesi.isEmpty()) {
            System.out.println("K�t�phane bo�.");
            return;
        }

        System.out.println("K�t�phanedeki Kitaplar:");
        for (int i = 0; i < kitapListesi.size(); i++) {
            System.out.println((i + 1) + ". " + kitapListesi.get(i).toString());
        }
    }

    public void kitapYazdir() {
        try (PrintWriter writer = new PrintWriter(new FileWriter("kutuphane_kitaplar.txt"))) {
            for (Kitap kitap : kitapListesi) {
                writer.println(kitap.toString());
            }
            System.out.println("Kitaplar dosyaya ba�ar�yla yaz�ld�.");
        } catch (IOException e) {
            System.out.println("Dosyaya yazma hatas�: " + e.getMessage());
        }
    }

    public void kitapGetir() {
        try (BufferedReader reader = new BufferedReader(new FileReader("kutuphane_kitaplar.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] kitapInfo = line.split(",");
                if (kitapInfo.length == 4) {
                    String ad = kitapInfo[0];
                    String yazar = kitapInfo[1];
                    int yayinYili = Integer.parseInt(kitapInfo[2]);
                    String ISBN = kitapInfo[3];
                    Kitap kitap = new Kitap(ad, yazar, yayinYili, ISBN);
                    System.out.println(line);
                }
            }
            System.out.println("Kitaplar dosyadan ba�ar�yla okundu.");
        } catch (IOException e) {
            System.out.println("Dosyadan kitaplar� okuma hatas�: " + e.getMessage());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Kutuphane kutuphane = new Kutuphane();

        while (true) {
            System.out.println("\nMen�:");
            System.out.println("1. Kitap Ekle");
            System.out.println("2. Kitaplar� Listele");
            System.out.println("3. Kitaplar� Dosyaya Yaz");
            System.out.println("4. Dosyadan Kitaplar� Oku");
            System.out.println("0. ��k��");

            System.out.print("Yapmak istedi�iniz i�lemi se�in: ");
            int secim = scanner.nextInt();
            scanner.nextLine();

            switch (secim) {
                case 1:
                    try {
                        System.out.print("Kitap ad�n� girin: ");
                        String ad = scanner.nextLine();
                        System.out.print("Yazar ad�n� girin: ");
                        String yazar = scanner.nextLine();
                        System.out.print("Yay�n y�l�n� girin: ");
                        int yayinYili = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("ISBN'yi girin: ");
                        String ISBN = scanner.nextLine();

                        Kitap yeniKitap = new Kitap(ad, yazar, yayinYili, ISBN);
                        kutuphane.kitapEkle(yeniKitap);
                        System.out.println("Kitap ba�ar�yla eklendi.");
                    } catch (IllegalArgumentException e) {
                        System.out.println("Hata: " + e.getMessage());
                    }
                     catch (CustomException e ) {
                        System.out.println("Hata: " + e.getMessage());
                    }
                    break;
                case 2:
                    kutuphane.kitapListele();
                    break;
                case 3:
                    kutuphane.kitapYazdir();
                    break;
                case 4:
                    kutuphane.kitapGetir();
                    break;
                case 0:
                    System.out.println("Programdan ��k�l�yor.");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Ge�ersiz se�enek. L�tfen ge�erli bir se�enek girin.");
            }
        }
    }
}
