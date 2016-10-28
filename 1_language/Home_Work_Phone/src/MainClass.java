public class MainClass {

    public static void main(String[] args) {

        Nokia3310 nokia=new Nokia3310();
        System.out.println("Nokia3310 screen size"+nokia.getScreenSize());
        nokia.call("123-45-67");
        nokia.sendSMS("567-23-56","text massage");

        System.out.println("------------------------------------");

        Iphone iphone=new Iphone();
        System.out.println("Iphone screen size"+iphone.getScreenSize());
        iphone.call("123-45-67");
        iphone.sendSMS("567-23-56","text massage");

        System.out.println("------------------------------------");

        Iphone5 iphone5=new Iphone5();
        System.out.println("Iphone 5 screen size\t"+iphone5.getScreenSize());
        iphone5.call("123-45-67");
        iphone5.sendSMS("567-23-56","text massage");

        System.out.println("------------------------------------");

        SumsungS4 sumsung=new SumsungS4();
        System.out.println("Sumsung S4 screen size "+sumsung.getScreenSize());
        sumsung.call("123-45-67");
        sumsung.sendSMS("567-23-56 ","text massage");

        System.out.println("------------------------------------");

        Asus nexus=new Asus();
        System.out.println("Sumsung S4 screen size "+nexus.getScreenSize());
        nexus.internet("3G");
        nexus.games("GTA","VK");

        System.out.println("------------------------------------");

        Ipad ipad=new Ipad();
        System.out.println("Sumsung S4 screen size "+ipad.getScreenSize());
        ipad.internet("4G");
        ipad.games("FIFA15","Facebok");

        System.out.println("------------------------------------");

        IpadPro ipadPro=new IpadPro();
        System.out.println("Sumsung S4 screen size "+ipadPro.getScreenSize());
        ipadPro.internet("4G");
        ipadPro.games("FIFA15","Facebok");

            }

}

