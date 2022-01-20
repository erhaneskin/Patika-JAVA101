//Java-ile-Artik-Yil-Hesaplama


import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
     int tarih;
     
     Scanner input = new Scanner(System.in);
     
     System.out.print("Lutfen tarih giriniz : ");
     tarih = input.nextInt();
     
        
     boolean artik = false;
 
     if(tarih % 4 == 0){
        if( tarih % 100 == 0){
            if ( tarih % 400 == 0){
                    artik = true;
                }else{
                    artik = false;
            }
        }else{
                artik = true;
        }
        }else{
            artik = false;
 
        }if(artik){
            System.out.println(tarih + " artik yildir.");
        }else{
            System.out.println(tarih + " artik yil degildir.");
        }
    }
}
