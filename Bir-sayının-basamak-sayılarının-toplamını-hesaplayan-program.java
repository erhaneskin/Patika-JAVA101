//Bir-sayının-basamak-sayılarının-toplamını-hesaplayan-program

import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        int deger,toplam, basamak, deger1;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Sayi Giriniz : ");
        deger = input.nextInt();
        
        deger1 = deger;
        toplam = 0;
        
        while (deger1 != 0) {
            basamak = deger1 % 10;
            toplam += basamak;
            deger1 /= 10;
        }
        
        System.out.println("Basamaklar toplami : " + toplam);
    }
}
