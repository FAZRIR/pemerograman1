//Perintah Class & Object - Dosen
importjava.util.*;

public class Dosen
{
	String nama;
	String email;
	
	publicDosen(String nama, String email)
	{
		this.nama = nama;
		this.email = email;
	}
	
	publicDosen() {}
	
	//Method
	public void info()
	{
		System.out.println("Nama Dosen  : " + nama);
		System.out.println("Email Dosen : " + email);
		System.out.println();
		System.out.println();
	}
}
