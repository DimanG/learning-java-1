

public class IpadPro extends Ipad {

    public IpadPro() {
        hasWiFi = true;
        screenSize = 14;
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
