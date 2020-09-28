package Class73;

import java.io.*;
import java.net.*;

public class Server {
    
    public Server(){
        try{
            //creating server socket binding at port #3000
            ServerSocket server = new ServerSocket(3000);
            System.out.println("Server binded at " + ((server.getInetAddress()).getLocalHost()).getHostAddress() + ":3000");
            System.out.println("Run the client");
            //ready to accept client request
            Socket socket = server.accept();
            //oepning the input stream to read data from client connection
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            System.out.println(in.readLine());
            //using output stream responsing data
            PrintStream out = new PrintStream(socket.getOutputStream());
            out.print("Welcome by server\n");
            out.flush();
            //closing the in and out streams
            out.close();
            in.close();
        } catch (Exception e){
            System.err.println("* err" + e);
        }
    }
    
    public static void main(String[] args) {
        new Server();
    }
}
