import java.util.Scanner;
public class CustomerManager {
        BaseCalculator baseCalculator;
        Scanner scanner = new Scanner(System.in);
        void doTheShopping(){
            System.out.println("Telefon Fiyatı Hesaplama");
            System.out.print("-> Kaç Adet Telefon Alacaksınız: ");
            int x = scanner.nextInt();
            System.out.println("-> Ekmek Fiyatı: "+baseCalculator.phoneBuy(x)/x+" TL");
            System.out.println("-> Almış Olduğunuz "+ x +" Telefon İçin Ödeyeceğiniz Fiyat: "+baseCalculator.phoneBuy(x)+" TL");

        }
    }
