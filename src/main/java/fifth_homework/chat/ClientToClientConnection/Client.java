package fifth_homework.chat.ClientToClientConnection;

import java.io.IOException;

public class Client {
private static String host = "localhost";
private static int port = 8090;

    public static void main(String[] args) throws IOException {
        new ClientInstance(host, port);
    }
}
