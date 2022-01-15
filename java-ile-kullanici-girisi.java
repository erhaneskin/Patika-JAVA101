import java.util.Scanner;
public class PatikaDenemeler {
    public static void main(String[] args) {
      String userName, password, passwordGiris,yenilemeIstegi;

      Scanner input = new Scanner(System.in);

      System.out.print("Lütfen kullanıcı adınızı giriniz : ");
      userName = input.nextLine();

      System.out.print("Lütfen şifrenizi oluşturunuz : ");
      password = input.nextLine();

      System.out.print("Giriş yapmak için şifrenizi tekrar giriniz : ");
      passwordGiris = input.nextLine();

      if(passwordGiris.equals(password)){

          System.out.println("Giriş Başarılı, Hoşgeldiniz!");

      }else{

       System.out.print("Şifrenizi yanlış girdiniz! Şifrenizi yenilenemek ister misiniz? Eğer şifrenizi yenilemek istiyorsanız Evet ya da evet yazınız : ");
       yenilemeIstegi = input.nextLine();


       if((yenilemeIstegi.equals("Evet")) || (yenilemeIstegi.equals("evet"))){

           System.out.print("Lütfen yeni şifrenizi oluşturunuz : ");
           String password1 = input.nextLine();

           if(password1.equals((password))){

               System.out.print("Şifreniz önceki şifreniz ile aynı olamaz lütfen daha sonra başka şifre oluşturmayı deneyiniz!");
           }
           else{
               System.out.print("Şifre Oluşturuldu");
           }

       }else{
           System.out.print("Yanlış işlem yaptınız! Lütfen sonra tekrar deneyiniz!");
       }

      }





    }
}

