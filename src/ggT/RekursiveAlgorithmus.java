package ggT;

/**
 * Klasse für die Rekursive Berechnung eines größten gemeinsamen Teilers
 * 
 * 				|a,				wenn a = b,
 * 				|2*ggT(a/2,b/2),wenn a und b gerade,
 * ggT(a,b)--->	|ggT(a/2,b),	wenn a gerade und b ungerade,
 * 				|ggT(a-b,b),	wenn a > b und a,b ungerade,
 * 				|ggT(b,a),		gegebenenfalls.
 * 
 * @author Dende
 *
 */
public class RekursiveAlgorithmus {

	int counter;

	double getGGT(double a, double b) {

		if (a == b) {
			System.out.print("da a = b und Schritt 2 " + counter + " mal aufgerufen wurde => ");
			logText(a, b);
			IO.println();
			if (counter != 0) {
				IO.println(" => " + a * 2 * 2 + " = " + a + " * 2 * " + counter);
			}

			return a;
		} else if (a % 2 == 0 && b % 2 == 0) {
			counter++;
			logText(a, b);
			a = a / 2;
			b = b / 2;
			System.out.print("da a und b gerade => 2*");
			logText(a, b);
			IO.println();
			return 2 * getGGT(a, b);
		} else if (a % 2 == 0 && b % 2 != 0) {
			logText(a, b);
			a = a / 2;
			System.out.print("da a gerade und b ungerade => ");
			logText(a, b);
			IO.println();
			return getGGT(a, b);
		} else if (a > b && a % 2 != 0 && b % 2 != 0) {
			logText(a, b);
			a = a - b;
			System.out.print("da a > b und a,b ungerade => ");
			logText(a, b);
			IO.println();
			return getGGT(a, b);
		} else {
			logText(a, b);
			System.out.print("ansonsten a und b tauschen => ");
			logText(a, b);
			IO.println();
			return getGGT(b, a);
		}
	}

	void logText(double a, double b) {
		System.out.print("ggT(" + a + ", " + b + ")");
	}
}
