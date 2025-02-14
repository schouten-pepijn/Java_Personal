package mediatorPattern.chatroom;

public interface User {
    void send(String message);
    void receive(String message);
}
