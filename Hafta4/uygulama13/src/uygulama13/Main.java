package uygulama13;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        String islem = "1.toplama\n"
                      +"2.cikarma\n"
                      +"3.bolme\n"
                      +"4.carpma\n"
                      +"cikmak icin 0 'a basiniz";
        System.out.println(islem);
        islem = scanner.nextLine();
        int sayi = 1;
        double  toplam = 0;
        switch (islem){
            case"1":
                while(sayi != 0){
                    System.out.println("sayi giriniz");
                    sayi = scanner.nextInt();
                    if(sayi < 0 ){
                        System.out.println("negatif sayi ile islem yapmak istediginizden emin misiniz?");
                        System.out.println("'e' veya 'h' giriniz");
                        String devamToplama = scanner.nextLine();
                        if(devamToplama.equalsIgnoreCase("h")) {
                            sayi = Math.abs(sayi);
                        }
                    }
                    if (sayi == 0)
                        break;
                    toplam += sayi;
                    System.out.println(toplam);

                }
                break;
            case"2":
                System.out.println("sayý giriniz");
                toplam = scanner.nextDouble();
                while(sayi != 0){
                    System.out.println("sayi giriniz");
                    sayi = scanner.nextInt();
                    if(sayi < 0 ){
                        System.out.println("negatif sayi ile islem yapmak istediginizden emin misiniz?");
                        System.out.println("'e' veya 'h' giriniz");
                        String devamToplama = scanner.nextLine();
                        if(devamToplama.equalsIgnoreCase("h")) {
                            sayi = Math.abs(sayi);
                        }
                    }
                    if (sayi == 0)
                        break;
                    toplam -= sayi;
                    System.out.println(toplam);
                }
                break;
            case"3":
                System.out.println("sayý giriniz");
                toplam = scanner.nextDouble();
                while(sayi != 0){
                    System.out.println("sayý giriniz");
                    sayi = scanner.nextInt();
                    if(sayi < 0 ){
                        System.out.println("negatif sayi ile islem yapmak istediginizden emin misiniz?");
                        System.out.println("'e' veya 'h' giriniz");
                        String devamToplama = scanner.nextLine();
                        if(devamToplama.equalsIgnoreCase("h")) {
                            sayi = Math.abs(sayi);
                        }
                    }
                    if (sayi == 0)
                        break;
                    toplam /= sayi;
                    System.out.println(toplam);
                }
                break;
            case"4":
                System.out.println("sayý giriniz");
                toplam = scanner.nextDouble();
                while(sayi != 0){
                    System.out.println("sayi giriniz");
                    sayi = scanner.nextInt();
                    if(sayi < 0 ){
                        System.out.println("negatif sayi ile islem yapmak istediginizden emin misiniz?");
                        System.out.println("'e' veya 'h' giriniz");
                        String devamToplama = scanner.nextLine();
                        if(devamToplama.equalsIgnoreCase("h")) {
                            sayi = Math.abs(sayi);
                        }
                    }
                    if (sayi == 0)
                        break;
                    toplam *= sayi;
                    System.out.println(toplam);

        }
                break;
        }
}
		
		
		
		
		
		
		
		
		
		
		
		

	}



