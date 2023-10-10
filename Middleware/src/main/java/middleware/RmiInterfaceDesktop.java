/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package middleware;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author patri
 */
public interface RmiInterfaceDesktop extends Remote {
    public boolean storeMsg(String msg) throws RemoteException;
    public String recoverMsgs() throws RemoteException;
    
}
