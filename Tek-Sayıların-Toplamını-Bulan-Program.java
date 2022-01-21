//Tek-Sayıların-Toplamını-Bulan-Program

import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
     int deger, toplam;
     boolean sorgu;
     
     Scanner input = new Scanner(System.in);
     sorgu = true;
     toplam = 0;
     
     while(sorgu == true){
        System.out.print("Lutfen bir deger giriniz : ");
        deger = input.nextInt();
        if(deger % 2 == 0 || deger % 4 == 0){
            toplam = toplam + deger;
        }
        if(deger % 2 == 1){
            sorgu = false;
        }
     }
     System.out.println("Toplam : " + toplam);
    }
}
