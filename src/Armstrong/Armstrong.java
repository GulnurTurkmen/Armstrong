package Armstrong;
import java.util.Scanner;
public class Armstrong {
	public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);

     System.out.print("Bir sayı giriniz:");
     int sayi = scanner.nextInt();

     // Basamak değerlerini toplayalım
     int toplam = 0;
     while (sayi != 0) {
         int basamakDegeri = sayi % 10;
         toplam += basamakDegeri;
         sayi /= 10;
     }

     // Sonucu yazdıralım
     System.out.println("Basamak toplamı: " + toplam);
 }
}
