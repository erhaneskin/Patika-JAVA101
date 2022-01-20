// girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan program

import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
    double deger, sayi, toplam;
    double ortalama;
    
    Scanner input = new Scanner(System.in);
    
    toplam = 0;
    sayi = 0;
    
    System.out.print("Lutfen bir deger giriniz : ");
    deger = input.nextInt();
    
    for (int i = 0; i <= deger; i++){
        
        if(i % 3 == 0 || i % 4 == 0) {
            toplam = toplam + i;
            sayi = sayi +  1 ; 
            System.out.println(i);
        }
        
    }
    System.out.println("Toplam : " + toplam);
    System.out.println("Sayi : " + sayi);
    ortalama = toplam / sayi;
    System.out.println("Ortalama : " + ortalama);
    
    }
}
