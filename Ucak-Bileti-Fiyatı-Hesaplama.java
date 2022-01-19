//Ucak-Bileti-Fiyatı-Hesaplama

import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
      double mesafe, yas, yolculukTipi, mesafeBasinaUcret, araFiyat, totalFiyat, indirimTutari, ekstraIndirim;
      
      Scanner input = new Scanner(System.in);
      
      System.out.print("Lutfen mesafeyi giriniz : ");
      mesafe = input.nextDouble();
      
      System.out.print("Lutfen yas giriniz : ");
      yas = input.nextDouble();      
      
      System.out.print("Lutfen yolculuk tipini giriniz (1 => Tek yon, 2 => Gidis Donus) : ");
      yolculukTipi = input.nextDouble();        
        
      mesafeBasinaUcret = 0.10;
      
      araFiyat = mesafe * mesafeBasinaUcret;
      
      if(((mesafe >= 0) && (yas >= 0)) && (yolculukTipi == 1  || yolculukTipi == 2)){
          if(yas < 12){
              indirimTutari = araFiyat * 0.5;
              totalFiyat = araFiyat - indirimTutari;
              System.out.println("12 yasindan kucuk oldugu icin indirim tutari : " + indirimTutari);
              if(yolculukTipi == 2){
                ekstraIndirim = totalFiyat * 0.2;
                totalFiyat =  totalFiyat - ekstraIndirim;
                System.out.println("Toplam Fiyat : " + (totalFiyat*2));
              }else{
                 System.out.println("Toplam Fiyat : " + totalFiyat); 
              }
          }else if(yas >= 12 && yas <= 24){
              indirimTutari = araFiyat * 0.1;
              totalFiyat = araFiyat - indirimTutari;
              System.out.println("12-24 yas arasinda oldugu icin indirim tutari : " + indirimTutari);
              if(yolculukTipi == 2){
                ekstraIndirim = totalFiyat * 0.2;
                totalFiyat =  totalFiyat - ekstraIndirim;
                System.out.println("Toplam Fiyat : " + (totalFiyat*2));
              }else{
                 System.out.println("Toplam Fiyat : " + totalFiyat); 
              }            
          }else if(yas >= 65){
              indirimTutari = araFiyat * 0.3;
              totalFiyat = araFiyat - indirimTutari;
              System.out.println("65 yas ustu oldugu icin indirim tutari : " + indirimTutari);
              if(yolculukTipi == 2){
                ekstraIndirim = totalFiyat * 0.2;
                totalFiyat =  totalFiyat - ekstraIndirim;
                System.out.println("Toplam Fiyat : " + (totalFiyat*2));                  
                System.out.println("Toplam Fiyat : " + (totalFiyat*2));
              }else{
                 System.out.println("Toplam Fiyat : " + totalFiyat); 
              }            
              
          }else{
              if(yolculukTipi == 2){
                ekstraIndirim = araFiyat * 0.2;
                totalFiyat =  araFiyat - ekstraIndirim;
                System.out.println("Toplam Fiyat : " + (totalFiyat*2));                  
              }else{
                 System.out.println("Toplam Fiyat : " + araFiyat); 
              }                    
              
          }
          
      }else{
          System.out.println("Yanlis degerler girdiniz! Lutfen girdiginiz degerleri kontrol ederek tekrar deneyiniz.");
          
      }
      
         
    }
}
