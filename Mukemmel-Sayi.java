

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
     int sayi1, toplam;
     
     Scanner input = new Scanner(System.in);
     
     System.out.print("Lutfen sayiyi giriniz : ");
     sayi1 = input.nextInt();
     
     toplam = 0;
     
     for(int i = 1; i < sayi1; i++){
         
         if(sayi1 % i == 0){
             toplam += i;
         }
     }
     System.out.println("Toplam : " + toplam);
     if(toplam == sayi1){
         System.out.println("Girdiginiz sayi mukemmel sayidir.");
     }else{
         System.out.println("Girdiginiz sayi mukemmel sayi degildir.");
     }
	}
}
