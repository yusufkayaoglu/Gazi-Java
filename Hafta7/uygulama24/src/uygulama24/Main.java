package uygulama24;

public class Main {

	public static void main(String[] args) {
		System.out.println("**************************************************");
		Hesap hesap = new Hesap("12345","Yusuf Kayaoglu",10000);
		hesap.bilgileri_goster();
		hesap.paracek(1000);
		hesap.paraYatır(5000);
		System.out.println("**************************************************");
		Hesap hesap1 = new Hesap("67891","Ali Burak Kayaoglu",20000);
		hesap1.bilgileri_goster();
		hesap1.paraYatır(2000.5);
		hesap1.paracek(3000.0);
		Hesap.hesapSayacı();
	}

}
