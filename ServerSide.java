package program1;

import java.io.*;  
import java.net.*;  

public class ServerSide {   
    public static void main(String[] args) {  
        try (ServerSocket ss = new ServerSocket(1234); 
             Socket s = ss.accept(); 
             DataInputStream dis = new DataInputStream(s.getInputStream())) {
            
            System.out.println("Client connected.");
            System.out.println("Message received: " + dis.readUTF());  
            
        } catch (Exception e) {  
            e.printStackTrace();
        }  
    } 
}
