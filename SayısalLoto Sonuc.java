package deneme;
import java.util.Scanner;
public class Not {
	




	    public static int rastgeleNumaraUret() {
	        int lotoNumber = 1 + (int) (Math.random() * 49); // 1 ile 49 arası rastgele sayı üretimi
	        
	        return lotoNumber;
	    }

	    public static void main(String[] args) {
	        Scanner giris = new Scanner(System.in);
	        int j=0, t, p, temp, maxloc, rastgeleNumber;
	        boolean devamMi = false;
	        boolean ayniSayibuldu = false;
	        int[] loto = new int[6];

	        while (!devamMi) {

	            for (int i = 0; i < 6; i++) {
	                ayniSayibuldu = false;
	                while (ayniSayibuldu == false) {
	                    rastgeleNumber = rastgeleNumaraUret();
	                    for (j = 0; j < 6; j++) {
	                        if (loto[j] == rastgeleNumber) {
	                            break;
	                        }
	                    }
	                    if (j == 6) { // bir üstteki for döngüsünde tüm elemanları kontrol ettiğinden emin olduk
	                        /*
	                        eğer aynı rakamlar üretilmişse, j 6'ya eşit olmadan bir üstteki for döngüsünden çıkılmış demektir
	                        bu yüzden ayniSayibuldu true olmayacaktır ve i=0 için while döngüsü bir kez daha çalışacaktır.
	                        */
	                        loto[i] = rastgeleNumber;
	                        ayniSayibuldu = true;
	                    }
	                }
	            }

	            //Küçükten büyüğe sıralama işlemimizi yapalım
	            for (t = 6; t >= 1; t--) {
	                maxloc = 0;
	                for (p = 1; p < 6; p++) {
	                    if (loto[p] > loto[maxloc]) {
	                        maxloc = p;
	                    }
	                    if (maxloc != p) {
	                        temp = loto[maxloc];
	                        loto[maxloc] = loto[p];
	                        loto[p] = temp;
	                    }
	                }

	            }
	            System.out.println("Bu haftaki olası sayisal loto sonuclari");
	            for (int k = 0; k < 6; k++) {

	                System.out.print(loto[k] + " ");

	            }

	            System.out.println("Tekrar rakam almak istermisiniz (evet/hayir)?");//"hayir" yazmalıyız,"hayır" yazınca doğru calışmıyor.
	            String yesOrno = giris.next();
	            if (yesOrno.equals("evet")) {
	                devamMi = false;

	            } else if (yesOrno.equals("hayir")) {
	                devamMi = true;
	                System.out.println("Oyunumuz burda bitmiştir, teşekkürler.");
	            }
	        }
	    }
	}


