package mediatorPattern.chatroom;

public class ChatUser implements User {
    private String name;


    public ChatUser(String name) {
        this.name = name;
    }

    @Override
    public void send(String message) {
        System.out.println(name + " sends: " + message);
    }

    @Override
    public void receive(String message) {
        System.out.println(name + " receives: " + message);
    }

}
