import java.util.Scanner;
public class program4{
	public static void main (String[]args){
		int pilih;
		Scanner input = new Scanner (System.in);
		System.out.print ("sehari hari...\n");
		System.out.print ("\n1. Makan");
		System.out.print ("\n2. Mandi");
		System.out.print ("\n3. Tidur");
		System.out.print ("\n4. Jalan-jalan");
		System.out.print ("\n5. Dota");
		System.out.print ("\n6. Pacaran");
		System.out.print ("\n7. BERAQZ");
		System.out.print ("\n\nMasukkan pilihan anda : ");
		
		pilih = input.nextInt();
		
		switch(pilih){
		case 1 :
			System.out.println ("Saya suka makan");
		break;
		case 2 :
			System.out.println ("Saya suka Mandi");
		break;
		case 3 :
			System.out.println ("Saya suka Tidur");
		break;
		case 4 :
			System.out.println ("Saya suka Jalan-jalan");
		break;
		case 5 :
			System.out.println ("Saya suka Dota");
		break;
		case 6 :
			System.out.println ("Saya suka Pacaran :')");
		break;
		case 7 :
			System.out.println ("Saya suka BERAQZ");
		break;
		
		default : System.out.println ("Hanya sendiri (Ngelanjutin lagu)");
		}		
	}
}