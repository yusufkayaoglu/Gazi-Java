package uygulama5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ka�_ders=0; 
        int toplam_kredi = 0;
        double katsay�_kredi = 0; // katsay�*kredi �arp�mlar�n�n toplam�n� tutan de�i�ken...
        double agno = 0;

        while (true) {
            double katsay�;
         
            System.out.println("Ders girmek istiyor musun (e/h) ? ");
            String i�lem = scanner.nextLine();

            if (i�lem.equals("h")) {
                System.out.println("Programdan ��k�yor");
                break;
            } else if (i�lem.equals("e")) {
                System.out.println("Dersin harf notunu giriniz: ");
                String harf_notu = scanner.nextLine();
                
                switch (harf_notu) {
                    case "AA":
                        katsay� = 4.0;
                        ka�_ders++;
                        break;
                    case "BA":
                        katsay� = 3.50;
                        ka�_ders++;
                        break;
                    case "BB":
                        katsay� = 3.0;
                        ka�_ders++;
                        break;
                    case "CB":
                        katsay� = 2.50;
                        ka�_ders++;
                        break;
                    case "CC":
                        katsay� = 2.0;
                        ka�_ders++;
                        break;
                    case "DC":
                        katsay� = 1.50;
                        ka�_ders++;
                        break;
                    case "DD":
                        katsay� = 1.0;
                        ka�_ders++;
                        break;
                    case "FD":
                        katsay� = 0.50;
                        ka�_ders++;
                        break;
                    case "FF":
                        katsay� = 0.0;
                        ka�_ders++;
                        break;
                    default:
                        System.out.println("Ge�ersiz i�lem...");
                        continue;
                }

                System.out.println("Dersin kredisini giriniz: ");
                int kredi = scanner.nextInt();
                scanner.nextLine();
                toplam_kredi += kredi;
                katsay�_kredi += (katsay� * kredi);
                agno = katsay�_kredi / toplam_kredi;
                System.out.println("AGNO: " + agno);
                System.out.println(" "+ka�_ders+" tane ders ald�n�z...");
            } else {
                System.out.println("Yanl�� i�lem girdiniz...");
            }
        }

        if (agno >= 3 && agno <= 3.49) {
            System.out.println("Onur belgesi almaya hak kazand�n�z.");
        } else if (agno >= 3.50 && agno <= 4) {
            System.out.println("Y�ksek onur belgesi almaya hak kazand�n�z.");
        } else {
            System.out.println("Herhangi bir belge almaya hak kazanamad�n�z.");
        }
    }
}
