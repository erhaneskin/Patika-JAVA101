
public class MyClass {
    public static void main(String args[]) {
         
       double paraMiktari, kdvTutari, kdvDahilMiktar; 
 
       Scanner input = new Scanner(System.in);
        
        System.out.print("Lutfen para miktarini giriniz : ");
        
        paraMiktari = input.nextDouble();
        
        kdvTutari = (paraMiktari >= 1000) ? 0.08 : 0.18;
         
        kdvDahilMiktar = (paraMiktari + (paraMiktari * kdvTutari));
        
        
        System.out.print("KDV'siz Miktar : "  + paraMiktari);
        
        System.out.print("KDV Miktari : "  + kdvTutari); 
        
        System.out.print("KDV'li Miktar : "  + kdvDahilMiktar); 
    }
}
