package templatemethod;

import templatemethod.conversation.AskWeather;
import templatemethod.conversation.Complement;

public class Application {
    public static void main(String... args) {
        new Complement().converse();
        new AskWeather().converse();
    }
}
