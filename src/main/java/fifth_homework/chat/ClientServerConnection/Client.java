package fifth_homework.chat.ClientServerConnection;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
    private static Socket clientSocket;
    private static BufferedReader reader;
    private static BufferedReader in;
    private static BufferedWriter out;

    public static void main(String[] args) {
        try {
            try {
                clientSocket = new Socket("localhost", 8008);
                //Read message from server
                reader = new BufferedReader(new InputStreamReader(System.in));
                in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                out = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
                while (true){
                    System.out.println("Enter you message: ");
                    String message = reader.readLine();
                    out.write(message+"\n");
                    out.flush();
                    String serverAnswer = in.readLine();
                    out.flush();
                    System.out.println(serverAnswer);
                    if (message.equals("exit")){
                        break;
                    }
                }
            }finally {
                System.out.println("Server is closed");
                clientSocket.close();
                in.close();
                out.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
