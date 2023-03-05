package deneme;
import java.util.Scanner;
public class Not {
	




	    public static int rastgeleNumaraUret() {
	        int lotoNumber = 1 + (int) (Math.random() * 49); // 1 ile 49 aras� rastgele say� �retimi
	        
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
	                    if (j == 6) { // bir �stteki for d�ng�s�nde t�m elemanlar� kontrol etti�inden emin olduk
	                        /*
	                        e�er ayn� rakamlar �retilmi�se, j 6'ya e�it olmadan bir �stteki for d�ng�s�nden ��k�lm�� demektir
	                        bu y�zden ayniSayibuldu true olmayacakt�r ve i=0 i�in while d�ng�s� bir kez daha �al��acakt�r.
	                        */
	                        loto[i] = rastgeleNumber;
	                        ayniSayibuldu = true;
	                    }
	                }
	            }

	            //K���kten b�y��e s�ralama i�lemimizi yapal�m
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
	            System.out.println("Bu haftaki olas� sayisal loto sonuclari");
	            for (int k = 0; k < 6; k++) {

	                System.out.print(loto[k] + " ");

	            }

	            System.out.println("Tekrar rakam almak istermisiniz (evet/hayir)?");//"hayir" yazmal�y�z,"hay�r" yaz�nca do�ru cal��m�yor.
	            String yesOrno = giris.next();
	            if (yesOrno.equals("evet")) {
	                devamMi = false;

	            } else if (yesOrno.equals("hayir")) {
	                devamMi = true;
	                System.out.println("Oyunumuz burda bitmi�tir, te�ekk�rler.");
	            }
	        }
	    }
	}


