package mediatorPattern.chatroom;

public class App {
    public static void main(String[] args) {
        ChatMediator chat = new ChatRoom();

        User user1 = new ChatUser("user1");
        User user2 = new ChatUser("user2");

        chat.addUser(user1);
        chat.addUser(user2);

        chat.sendMessage("hello", user1);
        chat.sendMessage("hi", user2);
    }
}
