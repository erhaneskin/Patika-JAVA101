//Üslü-Sayı-Hesaplayan-Program

import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        int deger, us, sonuc;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Lutfen bir deger giriniz : ");
        deger = input.nextInt();
        
        System.out.print("Lutfen bir us degeri giriniz : ");
        us = input.nextInt();      
        
        sonuc = 1;
        
        for(int i = 0; i < us; i++){
            
        sonuc *= deger;
            
        }
        
     System.out.println("Sonuc : " + sonuc);
        
    }
}
