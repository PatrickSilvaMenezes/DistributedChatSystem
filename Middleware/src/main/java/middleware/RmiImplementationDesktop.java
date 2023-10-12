/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package middleware;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author patri
 */
public class RmiImplementationDesktop extends UnicastRemoteObject implements RmiInterfaceDesktop{

    public RmiImplementationDesktop() throws RemoteException{
        super();
    }
    
    @Override
    public boolean storeMsg(String msg) throws RemoteException {
        FileWriter writer;
        try {
            writer = new FileWriter("C:/8_periodo/SD/ChatSystem/Middleware/src/main/java/middleware/Repository/desktop_chat.txt", true);
            writer.write(msg);
            writer.close();
            
        } catch (IOException ex) {
            Logger.getLogger(RmiImplementationDesktop.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
      return true;
       
    }

    @Override
    public String recoverMsgs() throws RemoteException {
        FileReader reader;
        String msg = "";
        try {
            reader = new FileReader("C:/8_periodo/SD/ChatSystem/Middleware/src/main/java/middleware/Repository/desktop_chat.txt");
            BufferedReader bufferReader = new BufferedReader(reader);
           
            while(bufferReader.ready()){
                msg = bufferReader.readLine();
            }
           reader.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(RmiImplementationDesktop.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(RmiImplementationDesktop.class.getName()).log(Level.SEVERE, null, ex);
        }
        return msg;
      
    }
    
}
