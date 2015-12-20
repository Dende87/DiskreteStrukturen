package fermat;

public class FermatZahl {

	private double x = 0;

	public double getFermatZahl(double a) {

		if (x == 0) {
			x = pow(a);
			a = x;
		}

		return a = 2 * pow(a - 1) + 1;
	}

	private double pow(double a) {

		if (a == 0) {
			return 1;
		}

		return a = 2 * pow(a - 1);
	}
}
