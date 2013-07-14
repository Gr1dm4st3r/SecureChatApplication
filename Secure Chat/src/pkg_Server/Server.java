/*
 * 
 * 
 */
package pkg_Server;

import java.io.BufferedReader;
import java.net.Socket;
import java.util.ArrayList;

/**
 *
 * @author Michael O Brien | T00150213
 */

//To create an instance of the server write "new Server().go();"
public class Server {
    
    ArrayList clientOutputStreams; //Where information about the clients are stored on the server
    
    public void run(){
        String Message; //Read the message in from the reader and send it out to the clients
    }
    
    public void go(){
        clientOutputStreams = new ArrayList();
        
        //Give the server a socket
        //Accept new clients output streams and add to the arraylist
        //Create a new thread for the client
    }
    
    public void sendToEveryone(String Message){
        //Iterate through the arraylist and flush the message out
    }
    
    //Class to handle the Clients
    public class ClientHandler implements Runnable{
        BufferedReader reader;
        Socket sock;
        
        public ClientHandler(Socket clientSocket){
            //Get the client socket and get the input stream and add as a new BufferedReader
        }
        
        @Override
        public void run(){
            String message;
            //While there is a message coming in send it out to everyone
        }
    }
    
}
