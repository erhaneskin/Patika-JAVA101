import java.util.Scanner;
public class PatikaDenemeler {
    public static void main(String[] args) {
        int mat, fiz, kim, turk, tarih, muzik;

        String sonuc;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuzu giriniz : ");
        mat = input.nextInt();

        System.out.print("Fizik Notunuzu giriniz : ");
        fiz = input.nextInt();

        System.out.print("Kimya Notunuzu giriniz : ");
        kim = input.nextInt();

        System.out.print("Turkce Notunuzu giriniz : ");
        turk = input.nextInt();

        System.out.print("Tarih Notunuzu giriniz : ");
        tarih = input.nextInt();

        System.out.print("Muzik Notunuzu giriniz : ");
        muzik = input.nextInt();

        double genelOrtalama = (mat + fiz + kim + turk + tarih + muzik) / 6;

        sonuc = (genelOrtalama >= 60) ? "Gecti" : "Kaldi";

        System.out.println("Genel Ortalama : " + genelOrtalama);

        System.out.println("Sonuç : " + sonuc);

    }
}

