package javaoopsolutions.question1;

public class BasicCalculator implements Calculator{

	@Override
	public int addition(int x, int y) {
		return x+y;
		
	}

	@Override
	public int substraction(int x, int y) {
		return x-y;
		
	}

	@Override
	public int multiplication(int x, int y) {
		return x*y;
	}

	@Override
	public int division(int x, int y) {
		return x/y;
		
	}
    
    
}
