//Fibonacci-Serisi

import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ilkSayi = 0, ikinciSayi = 1, toplam,deger;
        System.out.print("N Sayısını Girin:");
        deger = input.nextInt();
        System.out.print(ilkSayi+" "+ikinciSayi);
  
        for(int i = 2 ; i < deger + 1; ++i){  
            toplam = ilkSayi + ikinciSayi;  
            System.out.print(" "+toplam);  
            ilkSayi = ikinciSayi;  
            ikinciSayi = toplam;  
            
        }
           System.out.println();
    }
    
}
