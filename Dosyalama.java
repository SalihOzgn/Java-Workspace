import java.util.Scanner;
import java.awt.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;



public class Soru1 {
	public static void main(String[] args) throws IOException {
		Scanner giris = new Scanner(System.in);
		
		System.out.print("Öðrenci numarasý giriniz: ");
		String num=giris.nextLine();
		
		String dosyaAdi="C:\\ogrenciler.txt";
				
		BufferedReader oku=new BufferedReader(new FileReader (dosyaAdi));
		String satir;
		boolean bulundu=false;
		
		while((satir=oku.readLine())!=null) {
			 
			String[] satirbol = satir.split(";");	
			
			if(satirbol[1].equals(num)) 
			{
				System.out.println("Sözel puan= "+satirbol[3]);
				bulundu=true;
			}		
		}
		
		if(!bulundu) 
		{
			System.out.println("Bu öðrenci bulunamadý.");
		}	
		
		oku.close();
	}
}