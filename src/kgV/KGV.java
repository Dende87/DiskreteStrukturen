package kgV;

import ggT.GGTAlgorithmus;

public class KGV {

	public int getkgV(int a, int b) {

		GGTAlgorithmus ggt = new GGTAlgorithmus();

		int ggT = (int) ggt.getGGT(a, b);
		int kgV = (a * b) / ggT;
		return kgV;

	}
	
}
