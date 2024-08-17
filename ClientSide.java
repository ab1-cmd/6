package program1;

import java.io.*;  
import java.net.*;  

public class ClientSide {  
    public static void main(String[] args) {   
        try (Socket s = new Socket("localhost", 1234); 
             DataOutputStream dout = new DataOutputStream(s.getOutputStream())) {
            
            dout.writeUTF("Hello Server");  
            dout.flush();   
            
        } catch (Exception e) {  
            e.printStackTrace();
        }  
    }  
}
