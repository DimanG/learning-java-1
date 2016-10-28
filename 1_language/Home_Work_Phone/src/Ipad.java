
public class Ipad extends Tablet {

    public Ipad()

    {
        hasWiFi = true;
        screenSize = 12;
    }

    @Override
    public void internet(String inet) {
        super.internet(inet);
    }

    @Override
    public void games(String games, String program) {
        super.games(games, program);
    }
}
