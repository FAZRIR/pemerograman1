public class mahasiswa{
	int nilai ;  
	public static void main(String[]args){
	mahasiswa orang = new mahasiswa();
	orang.setnilai(98);
	System.out.println("Nilaiku adalah="+orang.getnilai());
	}
	public void setnilai(int nilaiku){
	this.nilai=nilaiku;
	}
	public int getnilai(){
	return this.nilai;
	}
	}
	