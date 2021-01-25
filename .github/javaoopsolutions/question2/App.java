package javaoopsolutions.question2;

public class App {
    public static void main(String[] args) throws Exception {
        Television tv = new Television();
        tv.setVolume(10);
        System.out.println(tv.increaseVolume(tv.getVolume(), 5));
        tv.decreaseVolume(tv.getVolume(), 9);
        tv.setPower(true);
        
    }
    
}
