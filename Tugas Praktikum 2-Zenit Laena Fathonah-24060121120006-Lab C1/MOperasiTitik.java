/**
* File : MOperasiTitik.java
* Tanggal : 01/03/2023
* Nama : Zenit Laena Fathonah
* Deskripsi : Kelas yang berisi main dari OperasiTitik
**/
public class MOperasiTitik{
	public static void main(String[] args){
		Titik t = new Titik(4, 4);
		OperasiTitik o = new OperasiTitik();
		System.out.println("Titik : ("+t.getAbsis()+", "+t.getOrdinat()+")");
		o.refleksiX(t);
		System.out.println("Titik : ("+t.getAbsis()+", "+t.getOrdinat()+")");
		o.refleksiY(t);
		System.out.println("Titik : ("+t.getAbsis()+", "+t.getOrdinat()+")");
	}
}