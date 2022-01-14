//Java-ile-Dik-Üçgende-Hipotenüs-Bulan-Program

public class MyClass {
    public static void main(String args[]) {
        
        int kenar1, kenar2, kenar3;
        double u, cevre, alaninKaresi, alan;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Lutfen ilk degeri giriniz : ");
        
        kenar1 = input.nextInt();
        

        System.out.println("Lutfen ikinci degeri giriniz : ");
        
        kenar2 = input.nextInt();
        
        
        System.out.println("Lutfen ucuncu degeri giriniz : ");
        
        kenar3 = input.nextInt();
        
        u = (kenar1 + kenar2 + kenar3) / 2;
        
        cevre = 2 * u;
        
        alaninKaresi = u * (u - kenar1) * (u - kenar2) * (u - kenar3);
        
        alan = Math.sqrt(alaninKaresi);
        
        System.out.println("Ucgenin alani : " + alan);
        
    }
}
