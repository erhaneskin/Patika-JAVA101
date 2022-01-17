//Java-ile-Hava-Sıcaklığına-Göre-Etkinlik-Önerme

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
          double sicaklik;
          
          Scanner input = new Scanner(System.in);
          
          System.out.print("Lutfen sicaklik degerini giriniz : ");
          sicaklik = input.nextDouble();
          
          if(sicaklik < 5){
              
              System.out.println("Kayak yapmanizi oneririz.");
              
          }
          if(sicaklik >= 5){
              
              if(sicaklik < 15){
                  System.out.println("Sinemaya gitmenizi oneririz");
              }
              
          }
          if(sicaklik >= 15){
              
              if(sicaklik < 25){
                  System.out.print("Piknik yapmanizi oneririz.");
              }
              
          }if(sicaklik >= 25){
              
              System.out.println("Yuzmeye gitmenizi oneririz.");
              
          } 
    }
}
