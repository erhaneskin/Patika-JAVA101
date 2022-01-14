import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      System.out.print("Luften islme operatorunu giriniz : ");
      String isaret = input.nextLine();
      
      System.out.print("Luften ilk sayiyi giriniz : ");
      double a = input.nextDouble();
      
      System.out.print("Luften ikinci sayiyi giriniz : ");
      double b = input.nextDouble();   
      
      switch(isaret){
        case "+":
            double toplam = a + b;
            System.out.println("Sonuc : " + toplam);
            break;
 
        case "-":
            double cikarma = a - b;
            System.out.println("Sonuc : " + cikarma);
            break;
        case "*":
            double carpma = a * b;
            System.out.println("Sonuc : " + carpma);            
            break;
        case "/":
            double bolme = a / b;
            System.out.println("Sonuc : " + bolme);
            break;
      }
    }
}
