package adapter.adapter;

import adapter.client.ClientsInterface;
import adapter.target.Target;

/**
 * Allows client's interface to work with target interface
 */
public class Adapter implements ClientsInterface {
    private Target target;

    public Adapter() {
        target = new Target();
    }

    public void display(String s) {
        // Client's interface provides a String but the target interface expects an int
        target.display(Integer.valueOf(s));
    }
}