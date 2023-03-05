package deneme;
import java.util.Random;
import java.util.Scanner;

public class Denemee {
	public static void main(String[] args) {
		Scanner giris=new Scanner(System.in);		
		Random rnd = new Random();
		
		
		int sayilar[],kolon;
		boolean kontrol;
		
		sayilar=new int[6];
		
		System.out.println("Kolon sayisi giriniz ?:");
		kolon=giris.nextInt();
		
		if(kolon<=8) 
		for(int z = 0; z < kolon; z++) {
			
			for(int i = 0; i < 6; i++) {
				sayilar[i]=0;
			}
			int j=0;
			while(j < 6) {
				int yedek = rnd.nextInt(49)+1;
				kontrol = true;
				for(int i = 0; i < 6; i++) {
					
					if(sayilar[i] == yedek) {
						kontrol = false;
					}						
				}
				if(kontrol) {
					sayilar[j] = yedek;
					j++;
				}
			}			
			for(int k = 1; k < 6; k++) {
				for(int i = 0; i < 6-k; i++) {
					if(sayilar[i] > sayilar[i+1]) {
						int yedek = sayilar[i];
						sayilar[i] = sayilar[i+1];
						sayilar[i+1] = yedek;
					}
				}
			}
			System.out.println("");
			System.out.println(z+1+". KOLON");
			
			for(int i = 0; i < 6; i++) {
				System.out.print(sayilar[i]+"  ");
			} 
			System.out.println("");
		}		
	}
}
