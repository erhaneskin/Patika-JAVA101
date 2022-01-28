//Girilen-Sayılardan-Min-ve-Max-Değerleri-Bulma

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
  
     
     Scanner input = new Scanner(System.in);
     
     System.out.print("Lutfen kac sayi girilecek? : ");
     int n = input.nextInt();
     
     System.out.print("Lutfen deger giriniz : ");
     int ilkDeger = input.nextInt();
     
     int enKucuk = ilkDeger;
     int enBuyuk = ilkDeger;
     for(int i = 0; i < n-1; i++){
         
       System.out.print("Lutfen deger giriniz : ");
       int deger = input.nextInt();
        
        if(deger > enBuyuk){
            enBuyuk = deger;
        }
        if(deger < enKucuk){
            enKucuk = deger;
        }
     }
     System.out.println("En buyuk deger : " + enBuyuk);
     System.out.println("En kucuk deger : " + enKucuk);
	}
}
