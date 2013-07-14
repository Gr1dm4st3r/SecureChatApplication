/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg_Client;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 *
 * @author Michael O Brien | T00150213
 */

//To create an instance of the Client write "new Client().go();"
public class Client {
    BufferedReader reader;
    PrintWriter writer;
    Socket sock;
    
    public void go(){
        //Could possibly put the GUI straight into the class
        setUpNetworking();
        
        Thread readerThread = new Thread(new IncomingReader());
        readerThread.start();
    }

    private void setUpNetworking() {
        //Set up the networking here
        //Socket, Reader, Writer
    }
    
    private void sendToServer(String message){
        //Get text from the outgoing textbox and flush it out
    }
    
    
    public class IncomingReader implements Runnable{
        @Override
        public void run(){
            //Put what the thread does in here...
            //Reads a line at a time from the server and adds it to the textbox for user to read
        }
    }
}
