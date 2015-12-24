package ggT;

import kgV.KGV;

public class GGT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// FermatZahl f = new FermatZahl();
		// FermatZahl g = new FermatZahl();
		// double a = f.getFermatZahl(IO.readInt("Bitte Fermat-Zahl 1 angeben:
		// F"));
		// double b = g.getFermatZahl(IO.readInt("Bitte Fermat-Zahl 1 angeben:
		// F"));
		// System.out.println(a);
		// System.out.println(b);

		double a = IO.readInt("Bitte a eingeben: ");
		double b = IO.readInt("Bitte b eingeben: ");

		KGV kgV = new KGV();
		IO.println("kgV: " + kgV.getkgV((int)a, (int)b));
		
		for(int x =1;x <= 798; x++){
			
			if(kgV.getkgV(x, 798 - x) == 10780){
				System.out.println("eine Zahl ist: " + x);
				break;
			}
		}
		
		GGTAlgorithmus ggt = new GGTAlgorithmus();
		System.out.println("Der ggT von " + a + " und " + b + " ist: " + ggt.getGGT(a, b));

	}

}
