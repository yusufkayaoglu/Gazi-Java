package uygulama5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kaç_ders=0; 
        int toplam_kredi = 0;
        double katsayý_kredi = 0; // katsayý*kredi çarpýmlarýnýn toplamýný tutan deðiþken...
        double agno = 0;

        while (true) {
            double katsayý;
         
            System.out.println("Ders girmek istiyor musun (e/h) ? ");
            String iþlem = scanner.nextLine();

            if (iþlem.equals("h")) {
                System.out.println("Programdan çýkýyor");
                break;
            } else if (iþlem.equals("e")) {
                System.out.println("Dersin harf notunu giriniz: ");
                String harf_notu = scanner.nextLine();
                
                switch (harf_notu) {
                    case "AA":
                        katsayý = 4.0;
                        kaç_ders++;
                        break;
                    case "BA":
                        katsayý = 3.50;
                        kaç_ders++;
                        break;
                    case "BB":
                        katsayý = 3.0;
                        kaç_ders++;
                        break;
                    case "CB":
                        katsayý = 2.50;
                        kaç_ders++;
                        break;
                    case "CC":
                        katsayý = 2.0;
                        kaç_ders++;
                        break;
                    case "DC":
                        katsayý = 1.50;
                        kaç_ders++;
                        break;
                    case "DD":
                        katsayý = 1.0;
                        kaç_ders++;
                        break;
                    case "FD":
                        katsayý = 0.50;
                        kaç_ders++;
                        break;
                    case "FF":
                        katsayý = 0.0;
                        kaç_ders++;
                        break;
                    default:
                        System.out.println("Geçersiz iþlem...");
                        continue;
                }

                System.out.println("Dersin kredisini giriniz: ");
                int kredi = scanner.nextInt();
                scanner.nextLine();
                toplam_kredi += kredi;
                katsayý_kredi += (katsayý * kredi);
                agno = katsayý_kredi / toplam_kredi;
                System.out.println("AGNO: " + agno);
                System.out.println(" "+kaç_ders+" tane ders aldýnýz...");
            } else {
                System.out.println("Yanlýþ iþlem girdiniz...");
            }
        }

        if (agno >= 3 && agno <= 3.49) {
            System.out.println("Onur belgesi almaya hak kazandýnýz.");
        } else if (agno >= 3.50 && agno <= 4) {
            System.out.println("Yüksek onur belgesi almaya hak kazandýnýz.");
        } else {
            System.out.println("Herhangi bir belge almaya hak kazanamadýnýz.");
        }
    }
}
