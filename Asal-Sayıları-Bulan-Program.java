//1-ile-100-arasindaki-Asal-Sayıları-Bulan-Program

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
     
     boolean sorgu = true;
     
     for(int i = 2; i <= 100; i++){
         
         for(int k = 2; k < i; k++){
             
             if(i %k == 0){
                 sorgu = false;
             }
         }
         if(sorgu == true){
             System.out.print(" " + i);
         }
         sorgu = true;
     }
	}
}
