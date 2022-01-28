//EBOB-EKOK-Bulan-Program

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
     int sayi1, sayi2, i, enBuyuk, enKucuk;
     
     Scanner input = new Scanner(System.in);
     
     System.out.println("Lutfen ilk sayiyi giriniz : ");
     sayi1 = input.nextInt();
     
     System.out.println("Lutfen ilk sayiyi giriniz : ");
     sayi2 = input.nextInt();     
     
     int k = 2;
     i = 2;
     enBuyuk = 1;
     while(sayi1 >= i){
         
         if((sayi1 % i == 0) && (sayi2 % i == 0)){
                 enBuyuk = i;
         }
         
         i++;
     }
     
     enKucuk = (sayi1 * sayi2) / enBuyuk;
     
     System.out.println("En buyuk ortak bolen : " + enBuyuk);
     System.out.println("En kucuk ortak bolen : " + enKucuk);
	}
}
