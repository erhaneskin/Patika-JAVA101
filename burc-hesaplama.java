

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        
     int ay, gun;
     
     Scanner input = new Scanner(System.in);
      
     System.out.print("Lutfen dogdugunuz ayi sayi cinsinden yaziniz : ");
     ay = input.nextInt();
     
     System.out.print("Lutfen dogdugunuz gunu yaziniz : ");
     gun = input.nextInt(); 
     
     if(ay == 1){
         if(gun > 21){
             System.out.println("Kova Burcu");
         }else{
             System.out.println("Oglak Burcu");
         }
     }
     
     else if(ay == 2){
         if(gun > 19){
            System.out.println("Balik Burcu"); 
         }else{
             System.out.println("Kova Burcu"); 
         }
     }
     
     else if(ay == 3){
         if(gun > 20){
            System.out.println("Koc Burcu"); 
         }else{
             System.out.println("Balik Burcu"); 
         }
     }
     
     else if(ay == 4){
         if(gun > 20){
            System.out.println("Boga Burcu"); 
         }else{
             System.out.println("Koc Burcu"); 
         }
     }
     
     else if(ay == 5){
         if(gun > 21){
            System.out.println("Ikizler Burcu"); 
         }else{
             System.out.println("Boga Burcu"); 
         }
     }    
    
     else if(ay == 6){
         if(gun > 22){
            System.out.println("Yengec Burcu"); 
         }else{
             System.out.println("Ikizler Burcu"); 
         }
     }    
    
     else if(ay == 7){
         if(gun > 22){
            System.out.println("Aslan Burcu"); 
         }else{
             System.out.println("Yengec Burcuu"); 
         }
     }    
    
     else if(ay == 8){
         if(gun > 22){
            System.out.println("Basak Burcu"); 
         }else{
             System.out.println("Aslan Burcu"); 
         }
     }    
    
     else if(ay == 9){
         if(gun > 22){
            System.out.println("Terazi Burcu"); 
         }else{
             System.out.println("Basak Burcu"); 
         }
     }    
    
     else if(ay == 10){
         if(gun > 22){
            System.out.println("Akrep Burcu"); 
         }else{
             System.out.println("Terazi Burcu"); 
         }
     }    
    
     else if(ay == 11){
         if(gun > 21){
            System.out.println("Yay Burcu"); 
         }else{
             System.out.println("Akrep Burcu"); 
         }
     }    
    
     else if(ay == 12){
         if(gun > 21){
            System.out.println("Oglak Burcu"); 
         }else{
             System.out.println("Yay Burcu"); 
         }
     } 
     
     if((ay > 12) || (gun > 31)){
         
         System.out.println("HATA! Ay ya da gun degerlerini uygun bicimde giriniz. (Ay 12'den ve Gun 31'den kucuk veya esit olmalidir.)");
     }
     
    }
}
