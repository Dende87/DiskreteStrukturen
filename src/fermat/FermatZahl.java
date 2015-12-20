package fermat;

public class FermatZahl {

	public static double getFermatZahl(double a){
		
		a = Math.pow(2, Math.pow(2, a))+1;
		return a;
	}
}
