//Program to calculate the Binomial Coefficient
package core.advanceinterviewquestion;

public class BinomialCoefficient {
	
	public static int fact(int a) {
		if(a<=1)
			return 1;
		else {
			int ans = 1;
			for(int i=2; i<=a; i++) {
				ans*=i;
			}
			return ans;
		}
	}
	
	public static float binCoeff(int n, int r) {
		int fact_n = fact(n);
		int fact_r = fact(r);
		int fact_nmr = fact(n-r);
		return fact_n/(fact_r*fact_nmr);
	}

	public static void main(String[] args) {
		float ans = binCoeff(5,2);
		System.out.println("Binomial Coefficient: "+ans);
	}

}
