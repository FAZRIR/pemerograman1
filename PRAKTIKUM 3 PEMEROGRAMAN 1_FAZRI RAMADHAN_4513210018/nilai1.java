import java.util.Scanner;
public class nilai1{
	public static void main(String[]args){
		int nilai;
		Scanner masuk = new Scanner(System.in);
		System.out.println("Masukkan Nilai :");
		nilai = masuk.nextInt();
		if(nilai>=50){
			System.out.println("Selamat Anda Lulus");
			}
		else
			System.out.println("Maaf Anda Tidak Lulus");
	}
}