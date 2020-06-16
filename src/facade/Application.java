package facade;

import facade.components.Player;
import facade.components.Speaker;
import facade.components.Tv;

public class Application {
    public static void main(String ... args) {
        // Instantiating components used by facade here because the purpose of facade is to simplify interfaces,
        // not to create a wrapper.
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(new Player(), new Speaker(), new Tv());
        homeTheaterFacade.playMovie();
        homeTheaterFacade.stopMovie();
    }
}
