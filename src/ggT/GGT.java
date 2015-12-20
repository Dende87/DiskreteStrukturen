package ggT;

import fermat.FermatZahl;

public class GGT{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FermatZahl f = new FermatZahl();
		FermatZahl g = new FermatZahl();
		double a = f.getFermatZahl(IO.readInt("Bitte Fermat-Zahl 1 angeben: F"));
		double b = g.getFermatZahl(IO.readInt("Bitte Fermat-Zahl 1 angeben: F"));
		System.out.println(a);
		System.out.println(b);
		
//		double a = IO.readInt("Bitte a eingeben: ");
//		double b = IO.readInt("Bitte b eingeben: ");
		
		RekursiveAlgorithmus ggt = new RekursiveAlgorithmus();
		System.out.println("Der ggT von " + a + " und " + b + " ist: " + ggt.getGGT(a, b));
		
		
		
	}

}
