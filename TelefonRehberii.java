
package telefonrehberii;

import java.util.Scanner;
import java.util.Vector;

public class TelefonRehberii {

    enum Secenek {YAPILMADI, EKLE, SIL, LISTELE, CIKIS}
	static Vector<Kisi> kisiler = null;

	static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        
        kisiler = new Vector<>();
		
		
		Secenek secim = Secenek.YAPILMADI;
		
		do {
			ekranaSecimListesiniGetir();
			secim = secimiAl();
			secimiCalistir(secim);
		}while(secim != Secenek.CIKIS);
    }
    private static Secenek secimiAl() {
		// TODO Auto-generated method stub
		
		Secenek secilen = Secenek.YAPILMADI; 
		int secim = input.nextInt();
		switch (secim) {
			case 1:
				secilen = Secenek.EKLE;
				break;
			case 2:
				secilen = Secenek.SIL;
				break;
			case 3:
				secilen = Secenek.LISTELE;
				break;
			case 4:
				secilen = Secenek.CIKIS;
				break;
			default:
				break;
		}
		return secilen;
	}


	private static void ekranaSecimListesiniGetir() {
		
		System.out.println("*************************");
		System.out.println("*                       *");
		System.out.println("* 1. Kişi Ekle          *");
		System.out.println("* 2. Kişi Sil           *");
		System.out.println("* 3. Kisileri Listele   *");
		System.out.println("* 4. Çıkış              *");
		System.out.println("*                       *");
		System.out.println("*************************");
		System.out.print("* Seçiminiz: ");
	}

	private static void secimiCalistir(Secenek secim) {
		// TODO Auto-generated method stub
		switch (secim) {
			case EKLE:
				kisiEkle();
				break;
			case SIL:
				kisiSil();
				break;
			case LISTELE:
				kisileriListele();
				break;
			default:
				break;
		}
		
	}


	private static void kisileriListele() {
		// TODO Auto-generated method stub
		int i = 1;
		System.out.println("\n--------KISILER-------\n\n");
		for (Kisi kisi : kisiler) {
			System.out.println(i+"->"+kisi);
			i++;
		}
		System.out.println("\n-------------------------\n\n");
	}


	private static void kisiSil() {
		// TODO Auto-generated method stub
		System.out.print("Silinecek kisinin indeksini giriniz: ");
		int index = input.nextInt();
		if(index > kisiler.size()) {
			System.out.println("Kayit silinemedi!");
		}else {
			Kisi k = kisiler.get(index-1);
			kisiler.remove(index-1);
			System.out.println(k+" --> Kaydı silindi \n\n\n");
		}
	}


	private static void kisiEkle() {
		
		Kisi k = new Kisi();
		
		System.out.println("Eklenecek kisinin bilgilerini giriniz: ");
		
		System.out.print("Adi Soyadi: ");
		String adi = input.next().trim();
		k.setAdi(adi);
		
		System.out.print("Telefon No: ");
		String telno = input.next().trim();
		k.setTelNo(telno);
		
		kisiler.add(k);
		
		System.out.println(" Kişi eklendi \n\n\n");
		
	}

}
