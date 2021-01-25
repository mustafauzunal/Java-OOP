package javaoopsolutions.question2;

public class Television {
    private double width;
    private double height;
    private double screenSize;
    private int maxVolume;
    private int volume;
    private boolean power = true;
 
    public double getWidth(){
        return width;
    }
    public void setWidth(double newWidth){
        this.width = newWidth;
    }
    public double getHeight(){
        return height;
    }
    public void setHeight(double newHeight){
        this.height = newHeight;
    }
    public double getScreenSize(){
        return screenSize;
    }
    public void setScreenSize(double newScreenSize){
        this.screenSize = newScreenSize;
    }
    public int getMaxVolume() {
		return maxVolume;
	}
	public void setMaxVolume(int newVolume) {
		this.maxVolume = newVolume;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int newVolume) {
		this.volume = newVolume;
	}
	public boolean isPower() {
		return power;
	}
	
    public void setPower(boolean newPower){
        this.power = newPower;
        if(isPower() == true){
            System.out.println("Power is on. Television is working");
        }else if(isPower()==false){
            System.out.println("Power is off. Television is not working");
        }else{
            System.out.println("Lütfen true ya da false değeri giriniz.");
        }
    }

    public double increaseVolume(double oldVolume, double increaseNumber){
        return oldVolume + increaseNumber;
    }

    public void decreaseVolume(double oldVolume, double decreaseNumber){
        if(oldVolume - decreaseNumber >= 0){
             System.out.println("Yeni ses değeriniz : " + (oldVolume - decreaseNumber)); 
        }else{
            System.out.println("Lütfen " + decreaseNumber + " dan daha küçük bir ses azaltma değeri giriniz"); 
        }
        
    }
	

}
