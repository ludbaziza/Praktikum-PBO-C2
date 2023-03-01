/*
	Muhammad Abdul Aziz
	24060121140150
	LAB PBO C2
	01/03/2023
*/

class Titik{
	double absis;
	double ordinat;
	static int counterTitik;
	
	//Constructor 2
	Titik(double a, double o){
		counterTitik++;
		absis = a;
		ordinat = o;
	}
	
	//Construktor 1
	Titik(){
		absis = 0;
		ordinat = 0;
		counterTitik++;
	}
	
	void setAbsis(double a){
		absis = a;
	}
	
	void setOrdinat(double o){
		ordinat = o;
	}
	
	double getAbsis(){
		return absis;
	}
	
	double getOrdinat(){
		return ordinat;
	}
	
	int getCounterTitik(){
		return counterTitik;
	}
}
