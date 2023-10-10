package pacote;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import javax.swing.JOptionPane;

public class Server {
    private Registry reg;
    public Server(){
    }
    
    public void startServer(){
        try{
            this.reg = LocateRegistry.createRegistry(7777);
            RmiInterfaceWeb objRmi = new RmiImplementationWeb();
            reg.rebind("ChatServer", objRmi);
        }
        catch(RemoteException e){
            JOptionPane.showMessageDialog(null, "Server Error: "+ e.getMessage());
        }
    }
}