package templatemethod.conversation;

public class AskWeather extends Conversation {
    @Override
    protected void talk() {
        System.out.println("What will the weather tomorrow be?");
    }

    @Override
    protected void listen() {
        System.out.println("75 degrees and sunny.");
    }
}
