package uygulama14;

import java.util.Scanner;

public class Main {
	/*public static int   en_b�y�k(int a,int b,int c) {  //Soru1
		int max = a;
		if(b>max) {
			max =b;
		}
		if(c>max) {
			max = c;
		}
		
		
		return max;
	}*/
	/*public static double ortalama(int a,int b,int c) {  //Soru2
	double toplam = a+b+c;
	double ortalama = toplam/3;
	return ortalama;
	
	
    }*/
	public static String ortadaki_karakteri_d�nd�r(String yaz� ) { //Soru3
		int uzunluk = yaz�.length();
		if(uzunluk %2 ==0) {
			 int ortadaki_index = uzunluk/2;
			 

			 return yaz�.substring(ortadaki_index-1,ortadaki_index+1);
			
			
		}
		else {
			
			int ortadaki_index=(yaz�.length()/2);
			return yaz�.substring(ortadaki_index,ortadaki_index+1);
			
			
			
			
			
		}
		
		
		
	}
	
	/*public static int kelime_say�s�_d�nd�r(String metin) { //Soru4
		 if (metin == null || metin.isEmpty()) {
        return 0; 
    }

    String[] kelimeler = metin.split(" "); 

    return kelimeler.length;
		
		
		
		
		
	}*/
	/*public static int basamaklar�n_toplam�(int say�) { //Soru5
		int y�zler = say�/100;
		int onlar = (say� - (100*y�zler))/10;
		int birler=(say� - (100*y�zler)-(10*onlar));
		int toplam = y�zler+onlar+birler;
		return toplam;
		
		
		
		
		
		
	}*/
	public static boolean ikinci_de�er_ortalamam�(double a ,double b,double c) { //Soru6
		if(b==(a+c)/2) {
			return true;
		}
		else {
			return false;
		}
		
		
	}
	
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);  
		/*System.out.println("Say� giriniz:  "); //Soru1
		int say�1=scanner.nextInt();
		System.out.println("Say� giriniz:  ");
		int say�2=scanner.nextInt();
		System.out.println("Say� giriniz:  ");
		int say�3=scanner.nextInt();
		System.out.println("En b�y�k say�: "+en_b�y�k(say�1,say�2,say�3));*/
		
		/*System.out.println("Say� giriniz:  "); //Soru2
		int say�1=scanner.nextInt();
		System.out.println("Say� giriniz:  ");
		int say�2=scanner.nextInt();
		System.out.println("Say� giriniz:  ");
		int say�3=scanner.nextInt();
		System.out.println("ortalama: "+ortalama(say�1,say�2,say�3));*/
		
		System.out.println("Bir string giriniz : ");    //Soru3
		String s = scanner.nextLine();
		System.out.println(ortadaki_karakteri_d�nd�r(s));
		
		/*System.out.println("Bir String Giriniz: "); //Soru4
		String s = scanner.nextLine();
		System.out.println(kelime_say�s�_d�nd�r(s));
		
		
		/*System.out.println("Basamak say�s� giriniz : ");
		System.out.println("En fazla 3 basamakl� bir say� giriniz : "); //Soru5
		int a = scanner.nextInt();
		System.out.println(basamaklar�n_toplam�(a));*/
		
		/*
		System.out.println("Say� giriniz:  "); 
		int say�1=scanner.nextInt();
		System.out.println("Say� giriniz:  ");
		int say�2=scanner.nextInt();
		System.out.println("Say� giriniz:  ");
		int say�3=scanner.nextInt();
		System.out.println(ikinci_de�er_ortalamam�(say�1, say�2, say�3));
		
		*/
		
		
		
		
		
		
		
		

	}

}
