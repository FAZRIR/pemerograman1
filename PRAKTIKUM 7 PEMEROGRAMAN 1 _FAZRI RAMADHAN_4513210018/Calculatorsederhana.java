import java.util.Scanner;
public class Calculatorsederhana{
	public static void main(String [] args){
		int pilih;
		Scanner input = new Scanner(System.in);

		System.out.println("\n1.Penjumlahan");
		System.out.println("2.Pengurangan");
		System.out.println("3.Perkalian");
		System.out.println("4.Pembagian");
		System.out.println("5.Mod");
		System.out.print("Masukkan Pilihan : ");
		pilih = input.nextInt();

		System.out.print("\nMasukkan angka pertama : ");
		int a = input.nextInt();
		System.out.print("Masukkan angka kedua :");
		int b = input.nextInt();
			 
			switch(pilih){
			case 1:
					int tambah = a + b ;
					System.out.println("\nhasil penjumlahan =" +tambah);
				break;
			case 2:
					int kurang = a - b ;
					System.out.println("\nhasil Pengurangan =" +kurang);
				break;
			case 3:
					int kali = a * b ;
					System.out.println("\nhasil Perkalian =" +kali);
				break;
			case 4:
					float bagi = (float) a / b ;
					System.out.println("\nhasil Pembagian =" +bagi);
				break;
			case 5:
					int n = a%b ;
					System.out.println("\nhasil Mod =" +n);
				break;
			default : System.out.println("Maaf Pilihan yang Anda Masukkan Salah");
			}
	}
}