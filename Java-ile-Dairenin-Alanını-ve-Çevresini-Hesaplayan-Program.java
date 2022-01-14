//Java-ile-Dairenin-Alanını-ve-Çevresini-Hesaplayan-Program

//Alan 

public class MyClass {
    public static void main(String args[]) {
     
     double yaricap, Alan, Cevre;
     double pi = 3.14;
     
     Scanner input = new Scanner(System.in);
     
     System.out.print("Lütfen bir deger giriniz : ");
     yaricap = input.nextDouble();
     
     Alan = pi * yaricap * yaricap;
     
     Cevre = 2 * pi * yaricap;
     
     System.out.println("Alan : " + Alan);
     System.out.println("Cevre : " + Cevre);
    }
}

//Daire Dilimi Alanı

public class MyClass {
    public static void main(String args[]) {
     
     double yaricap, merkezAciOlcusu, daireDilimininAlani;
     double pi = 3.14;
     
     Scanner input = new Scanner(System.in);
     
     System.out.print("Lutfen yaricapi giriniz : ");
     yaricap = input.nextDouble();
     
     System.out.print("Lutfen Merkez aci olcusunu giriniz : ");
     merkezAciOlcusu = input.nextDouble();
     
     daireDilimininAlani = (pi * (yaricap * yaricap) * merkezAciOlcusu) / 360;
     
     System.out.println("Alan : " + daireDilimininAlani);

    }
}
