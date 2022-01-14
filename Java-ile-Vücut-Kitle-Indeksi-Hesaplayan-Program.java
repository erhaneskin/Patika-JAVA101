//Java-ile-Vücut-Kitle-Indeksi-Hesaplayan-Program

public class MyClass {
    public static void main(String args[]) {
     
     double boy, kilo, kitleIndeksi;
     
     //Boy metre(m) cinsinden kilo kilogram(kg) cinsinden yazılmalıdır.
     
     Scanner input = new Scanner(System.in);
     
     System.out.print("Lütfen boyunuzu giriniz : ");
     boy = input.nextDouble();
     
     System.out.print("Lütfen kilonuzu giriniz : ");
     kilo = input.nextDouble();     
     
     kitleIndeksi = kilo / (boy * boy);
     
     System.out.println("Boy : " + boy);
     System.out.println("Kilo : " + kilo);
     System.out.println("Vucut kitle Indeksi : " + kitleIndeksi);

    }
}
