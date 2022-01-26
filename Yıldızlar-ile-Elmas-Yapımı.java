//Yıldızlar-ile-Elmas-Yapımı


import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Bir Sayi Giriniz :");
        int n = klavye.nextInt();

        for (int i = 0; i <= n ; i++) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int i = n-1; 0 < i ; i--) {
            for (int j = (n - i); j > 0; j--) {
                System.out.print(" ");
            }            
            for (int k = (2 * i) - 1 ; k > 0 ; k = k-1) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
	}
}
