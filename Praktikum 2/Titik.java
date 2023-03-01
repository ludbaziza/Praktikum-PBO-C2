/*
	Muhammad Abdul Aziz
	24060121140150
	LAB PBO C2
	01/03/2023
*/

class Titik{
	private double absis;
	private double ordinat;
	private static int counterTitik;
	
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
	
	public void setAbsis(double a){
		absis = a;
	}
	
	public void setOrdinat(double o){
		ordinat = o;
	}
	
	public double getAbsis(){
		return absis;
	}
	
	public double getOrdinat(){
		return ordinat;
	}
	
	public int getCounterTitik(){
		return counterTitik;
	}
}
