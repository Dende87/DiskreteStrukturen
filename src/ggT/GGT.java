package ggT;

import fermat.FermatZahl;
import kgV.KGV;

public class GGT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a = FermatZahl.getFermatZahl(IO.readInt("Bitte Fermat-Zahl 1 angeben: F"));
		double b = FermatZahl.getFermatZahl(IO.readInt("Bitte Fermat-Zahl 2 angeben: F"));
		double c = FermatZahl.getFermatZahl(IO.readInt("Bitte Fermat-Zahl 3 angeben: F"));
		double d = FermatZahl.getFermatZahl(IO.readInt("Bitte Fermat-Zahl 4 angeben: F"));
		double e = FermatZahl.getFermatZahl(IO.readInt("Bitte Fermat-Zahl 5 angeben: F"));

		System.out.println(a);
		System.out.println(b);

		double x = a - (b * c * d * e);

		System.out.println(x);

		double aK = IO.readInt("Bitte a eingeben: ");
		double bK = IO.readInt("Bitte b eingeben: ");

		KGV kgV = new KGV();
		IO.println("kgV: " + kgV.getkgV((int) aK, (int) bK));

		for (int xK = 1; xK <= 798; xK++) {

			if (kgV.getkgV(xK, 798 - xK) == 10780) {
				System.out.println("eine Zahl ist: " + xK);
				break;
			}
		}

		GGTAlgorithmus ggt = new GGTAlgorithmus();
		System.out.println("Der ggT von " + aK + " und " + bK + " ist: " + ggt.getGGT(aK, bK));

	}

}
