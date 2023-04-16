import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) throws Exception{
        ServerSocket serverSocket = new ServerSocket(1111);
        System.out.println("Server is waiting for client");

        Socket socket = serverSocket.accept();
        System.out.println("Server connected");

        InputStream is = socket.getInputStream();
        DataInputStream dis = new DataInputStream(is);
        String str = dis.readUTF();
        System.out.println("Message from client : " + str);
    }
}
