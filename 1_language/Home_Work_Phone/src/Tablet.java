

public abstract class Tablet extends Phone{
    protected int memory;
    protected String OS;
    protected boolean threeG=true;

    public Tablet(){
        hasWiFi=true;
        screenSize=3;
        System.out.println("Tablet constructor \n");
    }

    public int isMemory(){
        return memory;
    }


    public String isOS(){
        return OS;
    }

    public boolean isThreeG(){
        return threeG;
    }

    public void internet(String inet){
        System.out.println("\n" + "Internet entrance "+inet);
    }

    public void games(String games,String program){

        System.out.println("Количество игор\t"+games.length());
        System.out.println("Количество програм\t"+program.length());
    }
}
