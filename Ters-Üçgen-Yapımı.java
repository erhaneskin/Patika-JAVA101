//Ters-Üçgen-Yapımı

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Bir Sayi Giriniz :");
        int n = klavye.nextInt();
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
