import java.util.Random;
import java.util.Scanner;

public class Soru2 {
	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		
		char secim;
		
		do {
			Random r=new Random();
			int birinciSayi = 2+r.nextInt(4);
			int ikinciSayi = 2+r.nextInt(3);
			
			double sonuc = Math.pow(birinciSayi,ikinciSayi);
			
			System.out.println(birinciSayi+" nin "+ikinciSayi+" kuvevti nedir "+"?");
			System.out.print("Cevap= ");
			int cevap = giris.nextInt();
			
			if(sonuc==cevap) {
				System.out.println("Tebrikler bildiniz.");
			}
			else {
				System.out.println("Üzgünüm bilemediniz.");
			}
			
			System.out.print("Tekrar oynamak istiyor musunuz(e/E)? ");
			secim=giris.next().charAt(0);
			
			
		} while(secim == 'e' || secim== 'E');
	}		
}
