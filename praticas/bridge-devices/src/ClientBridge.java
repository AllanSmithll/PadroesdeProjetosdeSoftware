import model.*;

public class ClientBridge {
    public static void main(String[] args) {
        Device tv = new TV();
        Device radio = new DigitalRadio();

        AdvancedRemote advancedRemote = new AdvancedRemote(tv);
        BasicRemote basicRemote = new BasicRemote(radio);

        advancedRemote.mute();
        basicRemote.power();
    }
}