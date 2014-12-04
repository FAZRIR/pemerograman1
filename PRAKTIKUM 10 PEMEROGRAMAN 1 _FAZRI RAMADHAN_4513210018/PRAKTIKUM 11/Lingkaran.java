class lingkaran extends Bangun{		// membuat kelas turunan (subclass) dari
kelas Bangun dengan nama lingkaran	
	double hitungLuasLing(){		// membuat method untuk menghitung luas
lingkaran			
	double luas;					// deklarasi variabel luas dengan menghitung luas
	luas=phi*r*r;					// rumus luas lingkaran
	return luas;					// mengembalikan nilai
	
	}
	double hitungkelilingling(){	// membuat method untuk menghitung keliling
lingkaran
	double keliling;				// deklarasi variabel keliling dengan tipe
double 
	keliling=2*phi*r;				//rumus keliling lingkaran
	return keliling;				//mengembalikan nilai
	}
}