import model.Player;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();

        player.play();
        player.next();
        player.prev();
        player.stop();
        player.play();
        player.stop();
        player.stop();
    }
}