// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        
        double a,b,c;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Lutfen ilk sayiyi giriniz (a): ");
        a = input.nextDouble();
        
        System.out.print("Lutfen ikinci sayiyi giriniz (b) : ");
        b = input.nextDouble();   
        
        System.out.print("Lutfen ucuncu sayiyi giriniz (c) : ");
        c = input.nextDouble();
        
        if(((a < b) && (c < b)) && (c < a)){
            
            System.out.println("c < a < b");
            
        }
        
        if(((a < b) && (c < b)) && (a < c)){
            
            System.out.println("a < c < b");
            
        }
        
        if(((b < a) && (c < a)) && (c < b)){
            
            System.out.println("c < b < a");
            
        }
        
        if(((b < a) && (c < a)) && (b < c)){
            
            System.out.println("b < c < a");
            
        }
        if(((b < c) && (a < c)) && (b < a)){
            
            System.out.println("b < a < c");
            
        }
        if(((b < c) && (a < c)) && (a < b)){
            
            System.out.println("a < b < c");
            
        }
    }
}
