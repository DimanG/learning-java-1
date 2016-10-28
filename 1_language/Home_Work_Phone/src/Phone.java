
public abstract class Phone {
    protected boolean touch;
    protected boolean hasWiFi;
    protected int screenSize;



    public boolean isTouch(){
        return touch;
    }

    public boolean isHasWiFi(){
        return hasWiFi;
    }

    public int getScreenSize(){
        return screenSize;
    }

    public void call(String number){
        System.out.println("Phone class is calling "+number);
        System.out.println("Количество звонков \t"+number.length());
           }
    public void sendSMS(String number,String message){

        System.out.println("Количество SMS\t"+message.length());
    }
}
