import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;

public class Server extends UnicastRemoteObject implements IHolaFecha{

    public Server() throws RemoteException {
        super();
    }

    public String sayHello() throws RemoteException {
        return "Hola";
    }

    public Date getDate() throws RemoteException{
        return new Date();
    }

    public static void main (String [] args){
        try {
            IHolaFecha objeto = new Server();
            Naming.rebind("rmi://localhost/HelloServer", objeto);
        } catch (Exception e) {
            System.out.println("HelloImpl exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
