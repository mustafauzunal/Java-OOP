package javaoopsolutions.question1;

public class AdvancedCalculator extends BasicCalculator implements Scientific {

	@Override
	public int squarecalc(int x) {
		return x*x;
		
	}

	@Override
	public int cubecalc(int x) {
		return x*x*x;
		
	}
    
}
