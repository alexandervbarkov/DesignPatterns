package templatemethod.conversation;

public abstract class Conversation {
    /**
     * Template method.
     */
    public final void converse() {
        greet();
        talk();
        listen();
        sayGoodbye();
    }

    private void greet() {
        System.out.println("Hi!");
    }

    private void sayGoodbye() {
        System.out.println("Bye!");
    }

    protected abstract void talk();

    /**
     * Hook method.
     */
    protected void listen() {}
}
