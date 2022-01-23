//Girilen-Sayıdan-Küçük-4-ve-5-in-Kuvvetlerini-Bulan-Program

import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
      int deger;
      
      Scanner input = new Scanner(System.in);
      
      System.out.print("Lutfen bir deger giriniz :");
      deger = input.nextInt();
      
      System.out.println("Dordun katlari : ");
      
      for(int i = 1; i <= deger; i *= 4){
          
          System.out.println(i);
          
      }
      
     System.out.println("Besin katlari : ");

      for(int i = 1; i <= deger; i *= 5){
          
          System.out.println(i);
          
      }      
    }
}
