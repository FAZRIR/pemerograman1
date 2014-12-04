class Segiempat extends Bangun{			// membuat kelas turunan (subclass) dari
kelas Bangun dengan nama Segiempat
	double hitungLuasSegiempat(){		// membuat method untuk menghitung luas
Segiempat
		double luas;					// deklarasi variabel luas dengan tipe double
		luas=p*l;						// rumus luas segiempat 
		return luas;					// mengembalikan nilai
		}
		double hitungkelilingSegiempat(){	// membuat method untuk menghitung keliling
Segiempat
		double keliling;				// deklarasi variabel keliling dengan tipe
double
		keliling=2*(p+l);				// rumus keliling segiempat
		return keliling;				// mengembalikan nilai
		}
	}