import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Soru2 {
	public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        Random rnd = new Random();

        System.out.println("Kaç Kolon Oynayacaksınız?(1/8):");
        int kolonsayisi = giris.nextInt();
        
        int[] butunrakamlar = new int[kolonsayisi * 6];
        int[] kolon = new int[6];
        
        for (int k = 0; k < kolonsayisi; k++) {
            System.out.println("");
            System.out.println((k + 1) + ".KOLON");

            int s = 0,sayac10 = 0,sayac20 = 0,sayac30 = 0,sayac40 = 0,sayac50 = 0;
            
            
            while (s < 6) {
                int sayi = rnd.nextInt(49) + 1;
                
                while (!Arrays.stream(butunrakamlar).anyMatch(x -> x == sayi)) {
                	
                    if (sayi < 10 && sayac10 < 2) {
                        sayac10++;
                        kolon[s] = sayi;
                        butunrakamlar[k*6+s] = sayi;
                        s++;
                    } else if (10 <= sayi && sayi < 20 && sayac20 < 2) {
                        sayac20++;
                        kolon[s] = sayi;
                        butunrakamlar[k*6+s] = sayi;
                        s++;
                    } else if (20 <= sayi && sayi < 30 && sayac30 < 2) {
                        sayac30++;
                        kolon[s] = sayi;
                        butunrakamlar[k*6+s] = sayi;
                        s++;
                    } else if (30 <= sayi && sayi < 40 && sayac40 < 2) {
                        sayac40++;
                        kolon[s] = sayi;
                        butunrakamlar[k*6+s] = sayi;
                        s++;
                    } else if (40 <= sayi && sayi < 50 && sayac50 < 2) {
                        sayac50++;
                        kolon[s] = sayi;
                        butunrakamlar[k*6+s] = sayi;
                        s++;
                    } else {
                    	continue;
                    }
                }               
            }
            Arrays.sort(kolon);
            System.out.println(Arrays.toString(kolon));
        }
    }
}
