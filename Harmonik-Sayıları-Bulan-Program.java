//Harmonik-Sayıları-Bulan-Program

import java.util.Scanner;

class Patika_Java_101 {
    public static void main(String[] args) {
    int nBitis;
    double toplam;
    
    Scanner input = new Scanner(System.in);
   
    System.out.print("Lutfen n sayisinin bitis degerini yaziniz : ");
    nBitis = input.nextInt();    
    
    toplam = 0;
    
    for(double i = 1; i <= nBitis; i++){
         toplam += (1/i);
    }
    
    System.out.println("Harmonik Toplam : " + toplam);
    
    }
}
