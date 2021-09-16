package fifth_homework.chat.ClientToClientConnection;


import java.io.*;
import java.net.Socket;

public class ClientInstance {
    private String host;
    private int port;
    private Socket socket;
    private BufferedReader reader;
    private BufferedReader in;
    private BufferedWriter out;
    private String nickname;

    public ClientInstance(String host, int port) throws IOException {
        this.host = host;
        this.port = port;
        try {
            this.socket = new Socket(host, port);
            System.out.println("Client is log in");
        } catch (IOException e) {
            System.err.println("Socket failed");
        }
        try {

            System.out.print("Enter your nickname: ");
            // Enter user Email
            nickname = new BufferedReader(new InputStreamReader(System.in)).readLine();
            // read user's input
            reader = new BufferedReader(new InputStreamReader(System.in));
            //variable for read information from server.
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            //variable for writ information to server.
            out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            new WriteMessage().start();
            new ReadMessage().start();
        } catch (IOException e) {
            ClientInstance.this.shutDownClient();
        }
    }

    public void shutDownClient() {
        try {
            if (!socket.isClosed()) {
                this.socket.close();
                this.out.close();
                this.reader.close();
                this.in.close();
            }
        }catch(IOException e){
            e.printStackTrace();
        }


    }
    private class WriteMessage extends Thread{
        @Override
        public void run(){
            String message;
            try {
                while (true){
                    message = reader.readLine();
                    if(message.equals("exit")){
                        ClientInstance.this.shutDownClient();
                    }
                    out.write(String.format("%s (%s) %s\n", ExtraFeature.getTime(), nickname, message));
                    out.flush();

                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    private class ReadMessage extends Thread {
        @Override
        public void run() {
            String message;
            try {
                while (true) {
                    System.out.print(": ");
                    message = in.readLine();
                    if (message.equals("exit")) {
                        ClientInstance.this.shutDownClient();
                        break;
                    }
                    System.out.println(message);
                }
            } catch (IOException e) {
                ClientInstance.this.shutDownClient();
            }
        }
    }
}
