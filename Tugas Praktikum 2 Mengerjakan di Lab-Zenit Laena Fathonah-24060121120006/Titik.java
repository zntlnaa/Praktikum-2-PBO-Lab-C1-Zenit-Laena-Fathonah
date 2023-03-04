/**
* File : Titik.java
* Tanggal pembuatan : 01/03/2023
* Nama : Zenit Laena Fathonah
* Deskripsi : Kelas Titik
**/
public class Titik{
	private double absis;
	private double ordinat;
	private static int counterTitik; 
	
	public Titik(){
		absis = 0;
		ordinat = 0;
		counterTitik++;
	}

	public Titik(double a, double o){
		absis = a;
		ordinat = o;
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

	int getCounterTitik(){
		return counterTitik;
	}
}


