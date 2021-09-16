package fifth_homework.chat.ClientToClientConnection;


import java.io.*;
import java.net.Socket;

public class ServerInstance extends Thread{
    private static int count =0;
    private Socket socket;
    private BufferedReader in;
    private BufferedWriter out;


    public ServerInstance(Socket socket) throws IOException {
        this.socket = socket;
        in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        start();
    }
    @Override
    public void run(){
        String message;
        try {
            try {
                while (true) {
                    message = in.readLine();
                    if(message.equals("exit")) {
                        this.shutDown();
                        break;
                    }
                    count++;
                    System.out.println("Id "+count +": "+ message);
                    for (ServerInstance serverInstance : Server.getServerList()) {
                        serverInstance.sendToAll(message, serverInstance);
                    }
                }
            } catch (NullPointerException ignored) {}
        }catch (IOException e){

        }
    }
    public void shutDown(){
        try {
            if(!socket.isClosed()){
                socket.close();
                in.close();
                out.close();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public void sendToAll(String message, ServerInstance serverInstance){
        try {
            out.write(message+"\n");
            out.flush();
        }catch (IOException e){
            deleteClientFromList(serverInstance);
        }
    }
    private void deleteClientFromList(ServerInstance serverInstance){
        Server.getServerList().remove(serverInstance);
    }

}
