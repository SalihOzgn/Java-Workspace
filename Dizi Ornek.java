package deneme;
import java.util.Random;
import java.util.Scanner;

public class DiziOrnek2 {
	public static void main(String[] args) {
		Scanner giris=new Scanner(System.in);
		
		int[][] sayilar;
		int satir=0,sutun=0;
		
		System.out.print("Satýr adedi:");
		satir=giris.nextInt();
		System.out.print("Sutun adedi:");
	    sutun=giris.nextInt();
		
	    sayilar=new int[satir][sutun];
	    
	    Random rnd=new Random();
	    
	    for (int i=0; i < sayilar.length; i++) {
	    	
			for(int j=0; j < sayilar[i].length; i++) {
				
				sayilar[i][j]=rnd.nextInt(50)+50;
				
				System.out.print(sayilar[i][j]+"  ");
				
			}
			System.out.println("");
	    }
	}
}
