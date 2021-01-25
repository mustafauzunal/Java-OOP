package javaoopsolutions.question1;

public class App{ 
    public static void main(String [] args) throws Exception {
    int x = 10;
    int y = 5;
    AdvancedCalculator calc = new AdvancedCalculator();
    System.out.println(calc.multiplication(x, y));
    System.out.println(calc.division(x, y));
    System.out.println(calc.squarecalc(x));
    System.out.println(calc.cubecalc(x));
          
    }
    
}
