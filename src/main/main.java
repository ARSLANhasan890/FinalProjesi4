package main;

import java.security.PublicKey;
import java.util.Scanner;

import Class.Ogrenci;

public class main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Scanner scanner1 = new Scanner(System.in);

		while (true) {
			System.out.print(" öğrencin<izin Adını Giriniz:");
			String ogrenciisim = scanner1.nextLine();
			System.out.print("Soyismini Giriniz:");
			String ogrencisoyisim = scanner1.nextLine();

			System.out.print("sistemde kayıtlı öğrencinizin numarasını giriniz: ");
			String numara = scanner1.nextLine();

			Ogrenci ogr1 = new Ogrenci("Ali", "Yılmaz", "903001");
			Ogrenci ogr2 = new Ogrenci("Bahtiyar", "Arslan", "903047");
			Ogrenci ogr3 = new Ogrenci("Ayşe", "Gündoğdu", "903011");

			System.out.println("---------------------------------------------");

			if (ogrenciisim.equals(ogr1.isim) && ogrencisoyisim.equals(ogr1.soyisim) && numara.equals(ogr1.numara)) {
				System.out.println("Sisteme Giriş Yapıldı");
				System.out.println("---------------------------------------------");
				NotHesapla(ogr1.isim, ogr1.soyisim);

				break;

			} else if (ogrenciisim.equals(ogr2.isim) && ogrencisoyisim.equals(ogr2.soyisim)
					&& numara.equals(ogr2.numara)) {
				System.out.println("Sisteme Giriş Yapıldı");
				System.out.println("---------------------------------------------");
				NotHesapla(ogr2.isim, ogr2.soyisim);
				break;

			} else if (ogrenciisim.equals(ogr3.isim) && ogrencisoyisim.equals(ogr3.soyisim)
					&& numara.equals(ogr3.numara)) {
				System.out.println("Sisteme Giriş Yapıldı");
				System.out.println("---------------------------------------------");
				NotHesapla(ogr3.isim, ogr3.soyisim);
				break;

			} else {
				System.out.println("Giriş başarısız. 3 saniye sonra tekrar deneyiniz...\n");
				Thread.sleep(3000); // 3 saniye bekletme
			}

		}

	}

	public static void NotHesapla(String ad, String soyad) {
		Scanner scanner1 = new Scanner(System.in);

		String[] dersler = { "Matematik", "Bilişim", "Algoritma ve Programlama" };

		while (true) {

			for (int i = 0; i < dersler.length; i++) {
				System.out.println((i + 1) + ". " + dersler[i]);
			}
			System.out.println("Lütfen bir ders seçiniz(1,2,3):");
			int secilenDers = scanner1.nextInt();
			if (secilenDers < 4 && secilenDers > 0) {
				System.out.print("vize1 notunuzu giriniz:");
				Double vize1 = scanner1.nextDouble();

				System.out.print("Final notunu giriniz:");
				Double finalNot = scanner1.nextDouble();

				double sonuc = (vize1 * 0.4) + (finalNot * 0.6);

				if (sonuc >= 50) {
					System.out.println(ad + " " + soyad + " adlı öğrenci " + dersler[secilenDers - 1] + " dersinden "
							+ sonuc + " ortalamayla geçmiştir:)");
					break;

				} else {
					System.out
							.println("ortalamanız " + sonuc + " " + dersler[secilenDers] + " Dersinden kaldınız :///");
					break;
				}

			}

			else {
				System.out.println("Verilen aralıkta bir ders seçiniz");
			}

		}

	}

}
