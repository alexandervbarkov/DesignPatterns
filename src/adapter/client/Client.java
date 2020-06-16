package adapter.client;

public class Client {
    private ClientsInterface clientsInterface;

    public Client(ClientsInterface clientsInterface) {
        this.clientsInterface = clientsInterface;
    }

    public void display(String s) {
        clientsInterface.display(s);
    }
}
