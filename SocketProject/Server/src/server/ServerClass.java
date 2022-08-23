/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
public class ServerClass {
    private String IP;
    private int Port;
    private ServerSocket listener;
    ServerClass(int _Port) throws IOException{
        this.Port = _Port;
        this.listener = new ServerSocket(this.Port);
    }
    public Socket Listen(){
        try {
          
           Socket socket = listener.accept();
           return socket;
       } catch (IOException e) {
           System.out.println(e);
           System.exit(1);
           return null;
       }
    }
    
    public void Close(){
        
    }
}
