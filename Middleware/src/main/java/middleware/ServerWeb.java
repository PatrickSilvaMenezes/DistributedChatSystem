package middleware;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import javax.swing.JOptionPane;

public class ServerWeb {
    private Registry reg;
    public ServerWeb(){
    }
    
    public void startServer(){
        try{
            this.reg = LocateRegistry.createRegistry(6666);
            RmiInterfaceWeb objRmi = new RmiImplementationWeb();
            reg.rebind("ChatServerWeb", objRmi);
        }
        catch(RemoteException e){
            JOptionPane.showMessageDialog(null, "Server Error: "+ e.getMessage());
        }
    }
}