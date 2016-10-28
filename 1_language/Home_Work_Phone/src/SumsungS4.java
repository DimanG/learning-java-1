
public class SumsungS4 extends Phone {
    public SumsungS4(){

        touch=true;
        hasWiFi=true;
        screenSize=5;
    }

    @Override
    public void call(String number) {
        super.call(number);
        System.out.println("Sumsung S4 class is a calling \t"+number);
    }

    @Override
    public void sendSMS(String number, String message) {
        System.out.println("Sumsung S4 class is a calling\t"+message+"\tto\t "+number+"Hello ");
    }
}
