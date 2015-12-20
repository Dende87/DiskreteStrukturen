package ggT;

public class GGT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = IO.readInt("Bitte a eingeben: ");
		int b = IO.readInt("Bitte b eingeben: ");
		
		RekursiveAlgorithmus ggt = new RekursiveAlgorithmus();
		System.out.print("Der ggT von " + a + " und " + b + " ist: " + ggt.getGGT(a, b));
	}

}
