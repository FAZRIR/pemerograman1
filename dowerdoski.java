class dowerdoski { //nama kelas
//deklarasi variabel
	String Nama; //mendeklarasikan variabel Nama yang bertipe data string
	String warnakulit; //mendeklarasikan variabel warnakulit yang bertipe data string
	String Umur; //mendeklarasikan variabel Umur yang bertipe data string
	String Berat; //mendeklarasikan variabel Berat yang bertipe data string
	String tinggi; //mendeklarasikan variabel tinggi yang bertipe data string
	
	public String getNama(){ //inisialisasi nilai Nama
		return Nama; //mengembalikan nilai Nama
	}
	public void setNama(String x){ //deklarasi set untuk atribut Nama
		this.Nama=x;
	}
	
	public String getwarnakulit(){ //inisialisasi nilai warnakulit
		return warnakulit; //mengembalikan nilai warnakulit
	}
	public void setwarnakulit(String y){ //deklarasi set untuk atribut warnakulit
		this.warnakulit=y;
	}
	
	public String getUmur(){ //inisialisasi nilai Umur
		return Umur; //mengembalikan nilai Umur
	}
	public void setUmur(String a){ //deklarasi set untuk atribut Umur
		this.Umur=a;
	}
	
	public String getBerat(){ //inisialisasi nilai Berat
		return Berat; //mengembalikan nilai Berat
	}
	public void setBerat(String b){ //deklarasi set untuk atribut Berat
		this.Berat=b;
	}
	
	public String gettinggi(){ //inisialisasi nilai tinggi
		return tinggi; //mengembalikan nilai tinggi
	}
	public void settinggi(String t){ //deklarasi set untuk atribut tinggi
		this.tinggi=t;
	}
	public static void main(String [] args){
		dowerdoski hammy = new dowerdoski();
		hammy.setNama("dower doski"); //mengisi nilai setter Nama 
		System.out.print("Nama orang : "); //output kalimat
		System.out.print(hammy.getNama()); //memanggil setter Nama dengan getter
		
		hammy.setwarnakulit("sawo mateng"); //mengisi nilai setter warnakulit
		System.out.print("\nwarna kulitnya adalah : "); //output kalimat
		System.out.print(hammy.getwarnakulit()); //memanggil setter warnakulit dengan getter
		
		hammy.setUmur("20tahun"); //mengisi nilai setter Umur
		System.out.print("\nUmurnya adalah : "); //output kalimat
		System.out.print(hammy.getUmur()); //memanggil setter Umur dengan getter
		
		hammy.setBerat("70 kg"); //mengisi nilai setter Berat
		System.out.print("\nBeratnya adalah : "); //output kalimat
		System.out.print(hammy.getBerat()); //memanggil setter Berat dengan getter
		
		hammy.settinggi("170 cm"); //mengisi nilai setter tinggi
		System.out.print("\ntingginya adalah : "); //output kalimat
		System.out.print(hammy.gettinggi()); //memanggil setter tinggi dengan getter
	}
}