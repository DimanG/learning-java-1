


public class Iphone5 extends Iphone {

    public Iphone5() {

        screenSize = 4;
        imei="111111";
    }

    @Override
    public void sendSMS(String number, String message) {
        super.sendSMS(number, message);
        System.out.println("Iphone5 class is a calling\t"+message+"\tto\t"+number);

    }
}
