package ggT;

public class GGT{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double f = fermat.FermatZahl.getFermatZahl(IO.readInt("Bitte Fermat-Zahl 1 angeben: F"));
		double g = fermat.FermatZahl.getFermatZahl(IO.readInt("Bitte Fermat-Zahl 1 angeben: F"));
		System.out.println(f);
		System.out.println(g);
		
//		double a = IO.readInt("Bitte a eingeben: ");
//		double b = IO.readInt("Bitte b eingeben: ");
		
		RekursiveAlgorithmus ggt = new RekursiveAlgorithmus();
		System.out.println("Der ggT von " + f + " und " + g + " ist: " + ggt.getGGT(f, g));
		
		
		
	}

}
