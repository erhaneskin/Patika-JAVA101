//Faktoriyel-hesaplama

import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
    int deger; 
    long sonuc;
    
    Scanner input = new Scanner(System.in);
    
    System.out.print("Deger giriniz : ");
    deger = input.nextInt();
    
    sonuc = 1;
    
    for(int i = deger; i > 0; i-=1){
        sonuc *= i; 
    }
    
    System.out.println("faktoriyel sonucu : " + sonuc);
    
    }
}


//KombinasyonHesaplama

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
    long N, r, nFaktoriyelSonucu, rFaktoriyelSonucu, n_r, n_rFaktoriyelSonucu, kombinasyonSonucu;
     
    Scanner input = new Scanner(System.in);
    
    System.out.print("Lutfen N degerini giriniz : ");
    N = input.nextLong();
    
    System.out.print("Lutfen r degerini giriniz : ");
    r = input.nextLong(); 
    
    nFaktoriyelSonucu = 1;
    rFaktoriyelSonucu = 1;
    n_rFaktoriyelSonucu = 1;
    
    n_r = N - r;
    
    for(long i = N; i > 0; i-=1){
        nFaktoriyelSonucu *= i; 
    }    
    
    
    for(long k = r; k > 0; k-=1){
        rFaktoriyelSonucu *= k; 
    }  
    
    for(long l = n_r; l > 0; l-=1){
        n_rFaktoriyelSonucu *= l; 
    }     
    
    kombinasyonSonucu  = (nFaktoriyelSonucu) / (rFaktoriyelSonucu * n_rFaktoriyelSonucu);
    
    System.out.println("Kombinasyon Sonucu : " + kombinasyonSonucu);
    
    }
}
