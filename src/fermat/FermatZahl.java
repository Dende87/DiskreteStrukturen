package fermat;

public class FermatZahl {

	public static double getFermatZahl(double a) {

		a = pow(a);

		return a = 2 * pow(a - 1) + 1;
	}

	private static double pow(double a) {

		if (a == 0) {
			return 1;
		}

		return a = 2 * pow(a - 1);
	}
}
