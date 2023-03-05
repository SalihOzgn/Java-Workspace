package deneme;

import java.util.Random;

public class Dizi2 {
	public static void main(String[] args) {
		int[] sayilar=new int[10];
		Random rnd=new Random();
		
		for (int i=0; i<sayilar.length; i++) {
			sayilar[i]=rnd.nextInt(50); //0-49
		}
		System.out.println("************");
		//ekrana yazdýrma
		for (int i=0; i<sayilar.length; i++) {
			System.out.println((i+1)+".Eleman="+sayilar[i]);
		}
		System.out.println("*********");
		//elemanlardan deðeri tek olanlarý ekrana yazdýrma
		
		for (int i=0; i<sayilar.length; i++) {
			int kalan=sayilar[i]%2;
			if (kalan==1)
				System.out.println((i+1)+".Eleman="+sayilar[i]);
		}
		System.out.println("******** 7'e  tam bölünenlerin adedi *********");
		//elemanlardan deðeri 7'e tam bölünebilenlerin adeti
		int adet=0;
		for (int i=0; i<sayilar.length; i++) {
			int kalan=sayilar[i]%7;
			if(kalan==0)
				adet++;
		}
		System.out.println(adet);
	}
}





