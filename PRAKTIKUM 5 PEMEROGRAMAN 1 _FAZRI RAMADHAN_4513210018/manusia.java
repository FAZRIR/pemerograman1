public class manusia{
	String nama;
	public static void main(String[]args){
	manusia orang = new manusia();
	orang.setNama("Fazri");
	System.out.println("Namaku adalah="+orang.getNama());
	}
	public void setNama(String namaku ){
	this.nama=namaku;
	}
	public String getNama(){
	return this.nama;
	}
	}
	