package facade;

import facade.components.Player;
import facade.components.Speaker;
import facade.components.Tv;

public class HomeTheaterFacade {
    private Player player;
    private Speaker speaker;
    private Tv tv;

    public HomeTheaterFacade(Player player, Speaker speaker, Tv tv) {
        this.player = player;
        this.speaker = speaker;
        this.tv = tv;
    }

    public void playMovie() {
        tv.on();
        speaker.on();
        player.on();
        player.play();
    }

    public void stopMovie() {
        player.stop();
        player.off();
        speaker.off();
        tv.off();
    }
}
