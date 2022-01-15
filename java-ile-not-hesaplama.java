import java.util.Scanner;
public class PatikaDenemeler {
    public static void main(String[] args) {
        //Matematik, Fizik, Türkçe, Kimya, Müzik
        int matematikNotu, fizikNotu, turkceNotu, kimyaNotu, muzikNotu, dersToplami,dersSayisi ,ortalama;

        dersToplami = 0;
        dersSayisi = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen Matematik notunu giriniz :  ");
        matematikNotu = input.nextInt();

        System.out.print("Lütfen Fizik notunu giriniz :  ");
        fizikNotu = input.nextInt();

        System.out.print("Lütfen Türkçe notunu giriniz :  ");
        turkceNotu = input.nextInt();

        System.out.print("Lütfen Kimya notunu giriniz :  ");
        kimyaNotu = input.nextInt();

        System.out.print("Lütfen Müzik notunu giriniz :  ");
        muzikNotu = input.nextInt();

        if((matematikNotu >= 0) || (matematikNotu <= 100)){

            dersToplami = dersToplami + matematikNotu;
            dersSayisi += 1;

        }

        if((fizikNotu >= 0) && (fizikNotu <= 100)){

            dersToplami = dersToplami + fizikNotu;
            dersSayisi += 1;

        }

        if((turkceNotu >= 0) && (turkceNotu <= 100)){

            dersToplami = dersToplami + turkceNotu;
            dersSayisi += 1;

        }

        if((kimyaNotu >= 0) && (kimyaNotu <= 100)){

            dersToplami = dersToplami + kimyaNotu;
            dersSayisi += 1;

        }

        if((muzikNotu >= 0) && (muzikNotu <= 100)){

            dersToplami = dersToplami + matematikNotu;
            dersSayisi += 1;

        }

        ortalama = dersToplami / dersSayisi;

        System.out.println("Genel Ortalama : " + ortalama);
        if(ortalama >= 55){

            System.out.println("Sonuç : Geçti");
        }else{

            System.out.println("Sonuç : Kaldı");

        }

        System.out.println("Derslerin Notları Toplami : " + dersToplami);
        System.out.println("Ders Sayisi : " + dersSayisi);
    }
}

