
public class Soru3 {
	
	static void dortIslemHesapla(String islem) {
		String[] sayilar;
		String operator;
		
		if(islem.contains("+")) {
			sayilar=islem.split("\\+");
			
			int sayi1=Integer.parseInt(sayilar[0]);
			int sayi2=Integer.parseInt(sayilar[1]);
			int sonuc=sayi1+sayi2;
			System.out.println(sayi1+"+"+sayi2+"="+sonuc);
		}
		else if(islem.contains("-")) {
			sayilar=islem.split("-");
			int sayi1=Integer.parseInt(sayilar[0]);
			int sayi2=Integer.parseInt(sayilar[1]);
			int sonuc=sayi1-sayi2;
			System.out.println(sayi1+"-"+sayi2+"="+sonuc);
		}
		else if(islem.contains("*")) {
			sayilar=islem.split("\\*");
			int sayi1=Integer.parseInt(sayilar[0]);
			int sayi2=Integer.parseInt(sayilar[1]);
			int sonuc=sayi1*sayi2;
			System.out.println(sayi1+"*"+sayi2+"="+sonuc);
		}
		else if(islem.contains("/")) {
			sayilar=islem.split("/");
			int sayi1=Integer.parseInt(sayilar[0]);
			int sayi2=Integer.parseInt(sayilar[1]);
			int sonuc=sayi1/sayi2;
			System.out.println(sayi1+"/"+sayi2+"="+sonuc);
		}	
	}
	
	public static void main(String[] args) {
		
		dortIslemHesapla("100/20");
		dortIslemHesapla("100-20");
		dortIslemHesapla("100+20");
		dortIslemHesapla("100*20");
	}
}

