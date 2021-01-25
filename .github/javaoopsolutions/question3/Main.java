package javaoopsolutions.question3;

public class Main {
    public static void main(String[] args) {
        
        pair<Integer,String> firstPair = new pair<Integer,String>();
        pair<String,Double>  secondPair = new pair<String,Double>();

        firstPair.add(15, "Fifteen");
        System.out.println(firstPair.getT1() + " " + firstPair.getT2());
        secondPair.add("Fifteen", 15.0);
        System.out.println(secondPair.getT1() + " " + secondPair.getT2());

    }
    
}
