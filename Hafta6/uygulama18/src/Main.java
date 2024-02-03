// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Müşteri müşteri1 = new Müşteri("Yusuf","Kayapğlu","yusufkayaogluu@gmail.com","0000000000");
        Müşteri müşteri2 = new Müşteri("Mert","Özmen","mertozmen@gmail.com","1111111111");

        müşteri1.bilgileri_göster();
        System.out.println("*****************************");
        müşteri2.bilgileri_göster();
        Sipariş sipariş1 = new Sipariş(1,"ürün1",10,150);

        Sipariş sipariş2 = new Sipariş(2,"ürün2",4,400);





    }
}