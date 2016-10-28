
public class Nokia3310 extends Phone {

    public Nokia3310(){

        touch=false;
        hasWiFi=false;
        screenSize=2;

    }

    @Override
    public void call(String number) {
        super.call(number);
        System.out.println("Nokia3310 class is a calling\t"+number);
    }

    @Override
    public void sendSMS(String number, String message) {
        System.out.println("Nokia3310 class is a calling\t"+message+"\tto\t"+number);
    }
}
