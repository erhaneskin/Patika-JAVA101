//Java-ile-Taksimetre-Programı

public class MyClass {
    public static void main(String args[]) {
     
     double kmBasinaUcret, odenecekTutar, kilometre, MesafeyeGoreUcret,HesaplananTutar;
     int acilisUcreti;
     
     Scanner input = new Scanner(System.in);
     
     System.out.print("Kilometreyi giriniz : ");
     kilometre = input.nextDouble();
     
     acilisUcreti = 10;
     
     kmBasinaUcret = 2.20;
     
     MesafeyeGoreUcret = kmBasinaUcret * kilometre;
     
     HesaplananTutar = MesafeyeGoreUcret + acilisUcreti;
     
     odenecekTutar = (HesaplananTutar >= 20) ? HesaplananTutar : 20;
     
     System.out.println("Gidilen kilometre : " + kilometre);
     System.out.println("Acılıs ucreti : " + acilisUcreti);
     System.out.println("Mesafeye göre ucret : " + MesafeyeGoreUcret);
     System.out.println("Hesaplanan Tutar : " + HesaplananTutar);
     System.out.println("Odenecek Tutar : " + odenecekTutar);
    
    }
}
