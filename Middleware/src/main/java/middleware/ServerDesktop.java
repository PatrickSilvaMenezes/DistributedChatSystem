package middleware;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import javax.swing.JOptionPane;

public class ServerDesktop {
    private Registry reg;
    public ServerDesktop(){
    }
    
    public void startServer(){
        try{
            this.reg = LocateRegistry.createRegistry(7777);
            RmiInterfaceDesktop objRmi = new RmiImplementationDesktop();
            reg.rebind("ChatServer", objRmi);
        }
        catch(RemoteException e){
            JOptionPane.showMessageDialog(null, "Server Error: "+ e.getMessage());
        }
    }
}