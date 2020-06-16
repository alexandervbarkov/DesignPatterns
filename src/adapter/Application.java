package adapter;

import adapter.adapter.Adapter;
import adapter.client.Client;

public class Application {
    public static void main(String ... args) {
        Client client = new Client(new Adapter());
        client.display("1");
    }
}
