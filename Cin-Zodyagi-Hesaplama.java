//Cin-Zodyagi-Hesaplama

import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
     int dogumTarihi;
     
     Scanner input = new Scanner(System.in);
     
     System.out.print("Lutfen dogum tarihinizi giriniz : ");
     dogumTarihi = input.nextInt();
     
     if(dogumTarihi % 12 == 0){
       System.out.print("Cin Zodyagi Burcunuz : Maymun ");  
     }

     if(dogumTarihi % 12 == 1){
       System.out.print("Cin Zodyagi Burcunuz :Horoz ");  
     }
     
     if(dogumTarihi % 12 == 2){
       System.out.print("Cin Zodyagi Burcunuz : Kopek ");  
     }    
     
     if(dogumTarihi % 12 == 3){
        System.out.print("Cin Zodyagi Burcunuz = Domuz");  
     } 
     
     if(dogumTarihi % 12 == 4){
       System.out.print("Cin Zodyagi Burcunuz : Fare ");  
     }         
     
     if(dogumTarihi % 12 == 5){
       System.out.print("Cin Zodyagi Burcunuz : Okuz ");  
     }         
     
     if(dogumTarihi % 12 == 6){
       System.out.print("Cin Zodyagi Burcunuz : Kaplan ");  
     }    
     
     if(dogumTarihi % 12 == 7){
       System.out.print("Cin Zodyagi Burcunuz : Tavsan ");  
     } 
     
     if(dogumTarihi % 12 == 8){
       System.out.print("Cin Zodyagi Burcunuz : Ejderha ");  
     }         
     
     if(dogumTarihi % 12 == 9){
       System.out.print("Cin Zodyagi Burcunuz : Yilan ");  
     }         
    
     if(dogumTarihi % 12 == 10){
       System.out.print("Cin Zodyagi Burcunuz : At ");  
     }    
     
     if(dogumTarihi % 12 == 11){
       System.out.print("Cin Zodyagi Burcunuz : Koyun ");  
     }         
    }
}
