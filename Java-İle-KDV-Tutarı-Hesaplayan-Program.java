import java.util.Scanner;
public class PatikaDenemeler {
    public static void main(String[] args) {
        double paraMiktari,kdvOrani ,kdvTutari, kdvDahilMiktar;

        Scanner input = new Scanner(System.in);

        System.out.print("Lutfen para miktarini giriniz : ");

        paraMiktari = input.nextDouble();

        kdvOrani = (paraMiktari >= 1000) ? 0.08 : 0.18;

        kdvTutari = paraMiktari * kdvOrani;

        kdvDahilMiktar = paraMiktari + kdvTutari;


        System.out.println("KDV'siz Miktar : "  + paraMiktari);

        System.out.println("KDV Orani : "  + kdvOrani);

        System.out.println("KDV Tutarı : "  + kdvTutari);

        System.out.println("KDV'li Miktar : "  + kdvDahilMiktar);
    }
}

