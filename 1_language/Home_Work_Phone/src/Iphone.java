
public class Iphone extends Phone {
    protected String imei;
    public Iphone() {

        touch=true;
        hasWiFi=true;
        screenSize=3;
    }

    @Override
    public void call(String number) {
        super.call(number);
        System.out.println("Iphone class is a calling "+number);
    }

    @Override
    public void sendSMS(String number, String message) {
        System.out.println("Iphone class is a calling"+message+"to"+number);
    }
}