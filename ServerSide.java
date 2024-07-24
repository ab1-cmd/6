/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package anilkali;
import java.io.*;
import java.net.*;

/**
 *
 * @author anilk
 */
public class ServerSide {
    public static void main(String[]args)
    {
        try
        {
            ServerSocket ss=new ServerSocket(3306); 
            Socket s=ss.accept();//establishes connection
            DataInputStream dis=new DataInputStream(s.getInputStream()); 
            String str=(String)dis.readUTF();
            System.out.println("message= "+str); 
            ss.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }   
}
