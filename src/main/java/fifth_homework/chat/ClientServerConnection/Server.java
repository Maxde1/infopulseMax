package fifth_homework.chat.ClientServerConnection;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    private static Socket clientSocket;
    private static ServerSocket server;
    private static BufferedReader in;
    private static BufferedWriter out;

    public static void main(String[] args) {
        try {
            try {
                server = new ServerSocket(8008);
                System.out.println("Server is working");
                clientSocket = server.accept();
                try {
                   while (true){
                       in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                       out = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
                       String answer = in.readLine();
                       out.write("Yeah, it's server. Just got you message: "+answer+"\n");
                       out.flush();
                       if (answer.equals("exit")){
                           break;
                       }
                   }

                }finally {
                    clientSocket.close();
                    in.close();
                    out.close();
                }
            }finally {
                System.out.println("server close");
                server.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
