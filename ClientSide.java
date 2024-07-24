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
public class ClientSide 
{
    public static void main(String []args){
        try{
            Socket s = new Socket("localhost",3306);
            DataOutputStream dout=new DataOutputStream(s.getOutputStream());
            dout.writeUTF("Hello Server");
            dout.flush();
            dout.close();
            s.close();
            }
        catch(Exception e){
            System.out.println(e);
        }
        
    }

}
 
