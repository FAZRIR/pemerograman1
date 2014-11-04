import java.util.Scanner;
public class nilai2{
	public static void main(String[]args){
		int nilai;
		Scanner masuk = new Scanner(System.in);
		System.out.println("Masukkan Nilai :");
		nilai = masuk.nextInt();
		if(nilai<50){
			System.out.println("jelek");
			}
			else if(nilai==100){
			System.out.println("luar biasa");
			}
		else if(nilai==50){
			System.out.println("hampir");
			}
		else if(nilai>50){
			System.out.println("lulus");
			}
		
		else if(nilai>100){
			System.out.println("salah nilai bro");
			}
		else
			System.out.println("Maaf Anda Tidak Lulus");
	}
}